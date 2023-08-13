package io.xiaoyu.${module}.modular.${childModule}.service;

import io.xiaoyu.common.basic.service.IBaseService;
import io.xiaoyu.${module}.modular.${childModule}.entity.${Domain}Entity;
import io.xiaoyu.${module}.modular.${childModule}.req.${Domain}QueryReq;
import io.xiaoyu.${module}.modular.${childModule}.resp.${Domain}QueryResp;
import io.xiaoyu.common.resp.PageResp;

public interface ${Domain}Service extends IBaseService<${Domain}Entity> {

    PageResp<${Domain}QueryResp> queryList(${Domain}QueryReq req);

}
