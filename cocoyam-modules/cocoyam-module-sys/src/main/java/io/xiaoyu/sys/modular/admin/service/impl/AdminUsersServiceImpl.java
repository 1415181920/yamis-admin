package io.xiaoyu.sys.modular.admin.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.xiaoyu.common.basic.service.BaseService;
import io.xiaoyu.sys.modular.admin.entity.AdminUsersEntity;
import io.xiaoyu.sys.modular.admin.mapper.AdminUsersMapper;
import io.xiaoyu.sys.modular.admin.req.AdminUsersQueryReq;
import io.xiaoyu.sys.modular.admin.resp.AdminUsersQueryResp;
import io.xiaoyu.sys.modular.admin.service.AdminUsersService;
import io.xiaoyu.common.resp.PageResp;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class AdminUsersServiceImpl extends BaseService<AdminUsersMapper,AdminUsersEntity> implements AdminUsersService{

    @Resource
    private AdminUsersMapper adminUsersMapper;

    public PageResp<AdminUsersQueryResp> queryList(AdminUsersQueryReq req) {

        Page<AdminUsersEntity> userPage = new Page<>(req.getPage(), req.getPerPage());
        QueryWrapper<AdminUsersEntity> wrapper = new QueryWrapper<>();

        IPage<AdminUsersEntity> pageList = adminUsersMapper.selectPage(userPage, wrapper);
        long total = pageList.getTotal();
        List<AdminUsersEntity> records = pageList.getRecords();
        List<AdminUsersQueryResp> list = BeanUtil.copyToList(records, AdminUsersQueryResp.class);

        PageResp<AdminUsersQueryResp> pageResp = new PageResp<>();
        pageResp.setPageNum(req.getPage());
        pageResp.setPerPage(req.getPerPage());
        pageResp.setTotal(total);
        pageResp.setItems(list);
        return pageResp;
    }

    public AdminUsersQueryResp queryById(Long id) {
        AdminUsersEntity adminUsersEntity = adminUsersMapper.selectById(id);
        AdminUsersQueryResp adminUsersQueryResp = BeanUtil.copyProperties(adminUsersEntity, AdminUsersQueryResp.class);
        return adminUsersQueryResp;
    }
}
