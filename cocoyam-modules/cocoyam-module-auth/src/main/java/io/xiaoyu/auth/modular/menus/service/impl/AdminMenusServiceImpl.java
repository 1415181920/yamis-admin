package io.xiaoyu.auth.modular.menus.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.lang.Console;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.xiaoyu.common.basic.service.BaseService;
import io.xiaoyu.auth.modular.menus.entity.AdminMenusEntity;
import io.xiaoyu.auth.modular.menus.mapper.AdminMenusMapper;
import io.xiaoyu.auth.modular.menus.req.AdminMenusQueryReq;
import io.xiaoyu.auth.modular.menus.resp.AdminMenusQueryResp;
import io.xiaoyu.auth.modular.menus.service.AdminMenusService;
import io.xiaoyu.common.resp.PageResp;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


@Service
public class AdminMenusServiceImpl extends BaseService<AdminMenusMapper,AdminMenusEntity> implements AdminMenusService{

    @Resource
    private AdminMenusMapper adminMenusMapper;

    public PageResp<AdminMenusQueryResp> queryList(AdminMenusQueryReq req) {

        Page<AdminMenusEntity> userPage = new Page<>(req.getPage(), req.getSize());
        QueryWrapper<AdminMenusEntity> wrapper = new QueryWrapper<>();

        IPage<AdminMenusEntity> pageList = adminMenusMapper.selectPage(userPage, wrapper);
        long total = pageList.getTotal();
        List<AdminMenusEntity> records = pageList.getRecords();

        Console.log(records);
        List<AdminMenusQueryResp> list = BeanUtil.copyToList(records, AdminMenusQueryResp.class);

        PageResp<AdminMenusQueryResp> pageResp = new PageResp<>();
        pageResp.setPageNum(req.getPage());
        pageResp.setPageSize(req.getSize());
        pageResp.setTotal(total);
        pageResp.setList(list);
        return pageResp;
    }

    @Override
    public ArrayList<Object> getAdminMenus() {
        ArrayList<Object> objects = new ArrayList<>();
        HashMap<String,Object> map = new HashMap<>();

            map.put("component","amis");
            map.put("is_full", "0");
            map.put("is_home", "0");
            map.put("is_link",false);
            map.put("name","[1]");
            map.put("meta",new HashMap<String,Object>(){{
                put("title","控制台");
                put("icon","fa fa-dashboard");
                put("hide",false);
                put("order",0);
            }});
            map.put("path","/admin/admin-menus/menus");
            objects.add(map);

        return objects;
    }

    public AdminMenusQueryResp queryById(Long id) {
        AdminMenusEntity adminMenusEntity = adminMenusMapper.selectById(id);
        AdminMenusQueryResp adminMenusQueryResp = BeanUtil.copyProperties(adminMenusEntity, AdminMenusQueryResp.class);
        return adminMenusQueryResp;
    }
}
