package io.xiaoyu.auth.modular.test.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.xiaoyu.auth.modular.test.entity.TestUsersEntity;
import io.xiaoyu.auth.modular.test.req.TestUsersQueryReq;
import io.xiaoyu.auth.modular.test.resp.TestUsersQueryResp;
import io.xiaoyu.common.resp.PageResp;

public interface TestUsersService extends IService<TestUsersEntity> {

    PageResp<TestUsersQueryResp> queryList(TestUsersQueryReq req);

}
