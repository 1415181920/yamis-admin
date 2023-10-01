package io.xiaoyu.auth.modular.menus.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.lang.Console;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.xiaoyu.common.basic.service.BaseService;
import io.xiaoyu.auth.modular.menus.entity.AdminMenusEntity;
import io.xiaoyu.auth.modular.menus.mapper.SysAdminMenusMapper;
import io.xiaoyu.auth.modular.menus.req.AdminMenusQueryReq;
import io.xiaoyu.auth.modular.menus.resp.AdminMenusQueryResp;
import io.xiaoyu.auth.modular.menus.service.SysAdminMenusService;
import io.xiaoyu.common.resp.PageResp;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


@Service
public class SysAdminMenusServiceImpl extends BaseService<SysAdminMenusMapper,AdminMenusEntity> implements SysAdminMenusService {

    @Resource
    private SysAdminMenusMapper sysAdminMenusMapper;

    public PageResp<AdminMenusQueryResp> queryList(AdminMenusQueryReq req) {

        Page<AdminMenusEntity> userPage = new Page<>(req.getPage(), req.getPerPage());
        QueryWrapper<AdminMenusEntity> wrapper = new QueryWrapper<>();

        IPage<AdminMenusEntity> pageList = sysAdminMenusMapper.selectPage(userPage, wrapper);
        long total = pageList.getTotal();
        List<AdminMenusEntity> records = pageList.getRecords();

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
        AdminMenusEntity adminMenusEntity = sysAdminMenusMapper.selectById(id);
        return BeanUtil.copyProperties(adminMenusEntity, AdminMenusQueryResp.class);
    }
}
