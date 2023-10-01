package io.xiaoyu.sys.modular.menu.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.xiaoyu.common.basic.service.BaseService;
import io.xiaoyu.sys.modular.menu.entity.AdminMenusEntity;
import io.xiaoyu.sys.modular.menu.mapper.AdminMenusMapper;
import io.xiaoyu.sys.modular.menu.req.AdminMenusQueryReq;
import io.xiaoyu.sys.modular.menu.resp.AdminMenusQueryResp;
import io.xiaoyu.sys.modular.menu.service.AdminMenusService;
import io.xiaoyu.common.resp.PageResp;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class AdminMenusServiceImpl extends BaseService<AdminMenusMapper,AdminMenusEntity> implements AdminMenusService{

    @Resource
    private AdminMenusMapper adminMenusMapper;

    public PageResp<AdminMenusQueryResp> queryList(AdminMenusQueryReq req) {

        Page<AdminMenusEntity> userPage = new Page<>(req.getPage(), req.getPerPage());
        QueryWrapper<AdminMenusEntity> wrapper = new QueryWrapper<>();

        IPage<AdminMenusEntity> pageList = adminMenusMapper.selectPage(userPage, wrapper);
        long total = pageList.getTotal();
        List<AdminMenusEntity> records = pageList.getRecords();
        List<AdminMenusQueryResp> list = BeanUtil.copyToList(records, AdminMenusQueryResp.class);

        PageResp<AdminMenusQueryResp> pageResp = new PageResp<>();
        pageResp.setPageNum(req.getPage());
        pageResp.setPerPage(req.getPerPage());
        pageResp.setTotal(total);
        pageResp.setItems(list);
        return pageResp;
    }

    public AdminMenusQueryResp queryById(Long id) {
        AdminMenusEntity adminMenusEntity = adminMenusMapper.selectById(id);
        AdminMenusQueryResp adminMenusQueryResp = BeanUtil.copyProperties(adminMenusEntity, AdminMenusQueryResp.class);
        return adminMenusQueryResp;
    }
}
