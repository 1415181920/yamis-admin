package io.xiaoyu.auth.modular.menus.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.lang.Console;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.xiaoyu.common.basic.service.BaseService;
import io.xiaoyu.auth.modular.menus.entity.SysAdminMenusEntity;
import io.xiaoyu.auth.modular.menus.mapper.SysAdminMenusMapper;
import io.xiaoyu.auth.modular.menus.req.AdminMenusQueryReq;
import io.xiaoyu.auth.modular.menus.resp.AdminMenusQueryResp;
import io.xiaoyu.auth.modular.menus.service.SysAdminMenusService;
import io.xiaoyu.common.enums.ActionEnum;
import io.xiaoyu.common.resp.PageResp;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.*;
import java.util.function.Function;


@Service
public class SysAdminMenusServiceImpl extends BaseService<SysAdminMenusMapper, SysAdminMenusEntity> implements SysAdminMenusService {

    @Resource
    private SysAdminMenusMapper sysAdminMenusMapper;


    //获取菜单
    public  List<Map<String, Object>>  getMenus(){
        //获取用户菜单
        List<SysAdminMenusEntity> userMenus = getUserMenus();
//        List<Menu> formattedMenus = userMenus.stream()
//                .map(this::formatItem)
//                .sorted(Comparator.comparing(Menu::getOrder))
//                .collect(Collectors.toList());
//
//        List<Menu> result = new ArrayList<>();
//        result.addAll(list2Menu(formattedMenus));
//        result.addAll(extra());
//
//        return result;
//        $this->list2Menu($menus), $this->extra()
        List<Map<String, Object>> mapList = list2Menu(userMenus, 0, "");
        return mapList;
    }

    private List<Map<String, Object>> list2Menu(List<SysAdminMenusEntity> list, Integer parentId, String parentName) {
//        parentId = (parentId != null) ? parentId : 0;
//        parentName = (parentName != null) ? parentName : "";

        List<Map<String, Object>> data = new ArrayList<>();
        for (SysAdminMenusEntity item : list) {
//            if(item.getUrl().equals("/tpe")){
//                Console.log("tpe");
//            }
            if (item.getParentId().equals(parentId)) {
                Map<String, Object> temp = new HashMap<>();
                String idStr = "[" + item.getId() + "]";
                temp.put("name", StringUtils.hasText(parentName) ? parentName + idStr : idStr);
                temp.put("path", item.getUrl());
                temp.put("component", "amis");
                temp.put("is_home", item.getIsHome());
                temp.put("is_full", 0);
                temp.put("is_link", item.getUrlType() == 2);//TYPE_ROUTE = 1;const TYPE_LINK  = 2;

                Map<String, Object> meta = new HashMap<>();
                meta.put("title", item.getTitle());
                meta.put("icon", item.getIcon() != null ? item.getIcon() : "-");
                meta.put("hide", item.getVisible() == 0);
                meta.put("order", item.getOrder());

                temp.put("meta", meta);

                List<Map<String, Object>> children = list2Menu(list, item.getId(), (String) temp.get("name"));

                if (!children.isEmpty()) {
                    temp.put("component", "amis");
                    temp.put("children", children);
                }

                data.add(temp);
//                if (!AdminConfig.getRoutesToExclude().contains(temp.getPath())) {
                data.addAll(generateRoute(temp));
//                }
            }
        }
        return data;
    }

    private List<Map<String, Object>> generateRoute(Map<String, Object> item) {
        String url = (String) item.get("path");
        url = (url != null) ? url : "";

        // Remove query parameters
        url = url.replaceAll("\\?.*", "");

        if (url.isEmpty() || item.containsKey("children")) {
            return new ArrayList<>();
        }

        String finalUrl = url;
        Function<String,Map<String, Object>> menu = (action) -> {
            Map<String, Object> menuMap = new HashMap<>();
            menuMap.put("name", item.get("name") + "-" + action);
            menuMap.put("path", finalUrl + getPathForAction(action));
            menuMap.put("component", "amis");

            Map<String, Object> meta = new HashMap<>();
//            Console.log();
            HashMap<String, String> metaObj = (HashMap<String, String>) item.get("meta");

            meta.put("hide", true);
            meta.put("icon", metaObj.get("icon"));
//            meta.put("title", metaObj.get("title") + " - " + "admin." + ActionEnum.get(action));
            meta.put("title", metaObj.get("title") + " - " + ActionEnum.get(action));
            menuMap.put("meta", meta);
            return menuMap;
        };

        List<Map<String, Object>> routeList = new ArrayList<>();
        routeList.add(menu.apply("create"));
        routeList.add(menu.apply("show"));
        routeList.add(menu.apply("edit"));

        return routeList;
    }

    private String getPathForAction(String action) {
        if ("create".equals(action)) {
            return "/create";
        } else if ("show".equals(action)) {
            return "/:id";
        } else if ("edit".equals(action)) {
            return "/:id/edit";
        } else {
            return "";
        }
    }

    private Map<String, Object> createRoute(Map<String, Object> item, String action, String path) {
        String name = item.get("name") + "-" + action;
        String url = (String) item.get("path");
        if (url == null) {
            url = "";
        }
        url += path;

        Map<String, Object> route = new HashMap<>();
        route.put("name", name);
        route.put("path", url);
        route.put("component", "amis");

        Map<String, Object> meta = new HashMap<>();
        meta.put("hide", true);
        meta.put("icon", item.get("meta.icon"));
        meta.put("title", item.get("meta.title") + " - " + action);
        route.put("meta", meta);

        return route;
    }


    private List<SysAdminMenusEntity> getUserMenus() {
//        User user = Admin.getCurrentUser();
//        if (user.isAdministrator() || !AdminConfig.isAuthEnabled()) {
//            return adminMenuService.listMenusOrderedByOrder();
//        } else {
//            List<Menu> menus = user.getRoles().stream()
//                    .flatMap(role -> role.getPermissions().stream())
//                    .flatMap(permission -> permission.getMenus().stream())
//                    .distinct()
//                    .sorted(Comparator.comparing(Menu::getOrder))
//                    .collect(Collectors.toList());
//            return menus;
//        }

        return sysAdminMenusMapper.selectList(null);

    }

    public PageResp<AdminMenusQueryResp> queryList(AdminMenusQueryReq req) {

        Page<SysAdminMenusEntity> userPage = new Page<>(req.getPage(), req.getPerPage());
        QueryWrapper<SysAdminMenusEntity> wrapper = new QueryWrapper<>();

        IPage<SysAdminMenusEntity> pageList = sysAdminMenusMapper.selectPage(userPage, wrapper);
        long total = pageList.getTotal();
        List<SysAdminMenusEntity> records = pageList.getRecords();

        Console.log(records);
        List<AdminMenusQueryResp> list = BeanUtil.copyToList(records, AdminMenusQueryResp.class);

        PageResp<AdminMenusQueryResp> pageResp = new PageResp<>();
        pageResp.setPageNum(req.getPage());
        pageResp.setPerPage(req.getPerPage());
        pageResp.setTotal(total);
        pageResp.setItems(list);
        return pageResp;
    }

    @Override
    public ArrayList<Object> getAdminMenus() {
        ArrayList<Object> objects = new ArrayList<>();
        HashMap<String,Object> map = new HashMap<>();

            map.put("component","amis");
            map.put("is_full", 0);
            map.put("is_home", 0);
            map.put("is_link",false);
            map.put("name","[1-2]");
            map.put("meta",new HashMap<String,Object>(){{
                put("title","测试1");
                put("icon","fa fa-dashboard");
                put("hide",false);
                put("order",0);
            }});
            map.put("path","/admin-menus/menus/view/query");
            objects.add(map);
        HashMap<String,Object> map2 = new HashMap<>();
        map2.put("component","amis");
        map2.put("is_full", 0);
        map2.put("is_home", 0);
        map2.put("is_link",false);
        map2.put("name","[1-3]");
        map2.put("meta",new HashMap<String,Object>(){{
            put("title","测试2");
            put("icon","fa fa-dashboard");
            put("hide",false);
            put("order",0);
        }});
        map2.put("path","/admin-menus/menus/view/query2");
        objects.add(map2);
        HashMap<String,Object> map3 = new HashMap<>();

        map3.put("component","amis");
        map3.put("is_full", 0);
        map3.put("is_home", 0);
        map3.put("is_link",false);
        map3.put("name","[1-3]");
        map3.put("meta",new HashMap<String,Object>(){{
            put("title","测试3");
            put("icon","fa fa-dashboard");
            put("hide",false);
            put("order",0);
        }});
        map3.put("path","/admin-menus/menus/view/query3");
        objects.add(map3);

        return objects;
    }

    public AdminMenusQueryResp queryById(Long id) {
        SysAdminMenusEntity adminMenusEntity = sysAdminMenusMapper.selectById(id);
        return BeanUtil.copyProperties(adminMenusEntity, AdminMenusQueryResp.class);
    }
}
