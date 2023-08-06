package io.xiaoyu.auth.modular.login.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.xiaoyu.auth.modular.login.entity.SystemUsersEntity;
import io.xiaoyu.auth.modular.login.mapper.SystemUsersMapper;
import io.xiaoyu.auth.modular.login.req.SystemUsersQueryReq;
import io.xiaoyu.auth.modular.login.resp.SystemUsersQueryResp;
import io.xiaoyu.auth.modular.login.service.AdminUsersService;
import io.xiaoyu.common.resp.PageResp;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SystemUsersServiceImpl extends ServiceImpl<SystemUsersMapper, SystemUsersEntity> implements AdminUsersService.SystemUsersService {

    @Resource
    private  SystemUsersMapper systemUsersMapper;


    public PageResp<SystemUsersQueryResp> queryList(SystemUsersQueryReq req) {

        Page<SystemUsersEntity> userPage = new Page<>(req.getPage(), req.getSize());
        QueryWrapper<SystemUsersEntity> wrapper = new QueryWrapper<>();

        IPage<SystemUsersEntity> pageList = systemUsersMapper.selectPage(userPage, wrapper);
        long total = pageList.getTotal();

        List<SystemUsersEntity> records = pageList.getRecords();

        List<SystemUsersQueryResp> list = BeanUtil.copyToList(records, SystemUsersQueryResp.class);

        PageResp<SystemUsersQueryResp> pageResp = new PageResp<>();
        pageResp.setPageNum(req.getPage());
        pageResp.setPageSize(req.getSize());
        pageResp.setTotal(total);
        pageResp.setList(list);

        return pageResp;

    }

}
