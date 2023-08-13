package io.xiaoyu.auth.modular.test.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.xiaoyu.common.basic.service.BaseService;
import io.xiaoyu.auth.modular.test.entity.TestUsersEntity;
import io.xiaoyu.auth.modular.test.mapper.TestUsersMapper;
import io.xiaoyu.auth.modular.test.req.TestUsersQueryReq;
import io.xiaoyu.auth.modular.test.resp.TestUsersQueryResp;
import io.xiaoyu.auth.modular.test.service.TestUsersService;
import io.xiaoyu.common.resp.PageResp;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class TestUsersServiceImpl extends BaseService<TestUsersMapper,TestUsersEntity> implements TestUsersService{

    @Resource
    private TestUsersMapper testUsersMapper;

    public PageResp<TestUsersQueryResp> queryList(TestUsersQueryReq req) {

        Page<TestUsersEntity> userPage = new Page<>(req.getPage(), req.getSize());
        QueryWrapper<TestUsersEntity> wrapper = new QueryWrapper<>();

        IPage<TestUsersEntity> pageList = testUsersMapper.selectPage(userPage, wrapper);
        long total = pageList.getTotal();
        List<TestUsersEntity> records = pageList.getRecords();
        List<TestUsersQueryResp> list = BeanUtil.copyToList(records, TestUsersQueryResp.class);

        PageResp<TestUsersQueryResp> pageResp = new PageResp<>();
        pageResp.setPageNum(req.getPage());
        pageResp.setPageSize(req.getSize());
        pageResp.setTotal(total);
        pageResp.setList(list);
        return pageResp;
    }

    public TestUsersQueryResp queryById(Long id) {
        TestUsersEntity testUsersEntity = testUsersMapper.selectById(id);
        TestUsersQueryResp testUsersQueryResp = BeanUtil.copyProperties(testUsersEntity, TestUsersQueryResp.class);
        return testUsersQueryResp;
    }
}
