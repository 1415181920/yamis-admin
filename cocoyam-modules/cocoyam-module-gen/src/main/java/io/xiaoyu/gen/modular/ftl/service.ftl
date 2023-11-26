package io.xiaoyu.${module}.modular.${childModule}.service;

import io.xiaoyu.common.basic.service.IBaseService;
import io.xiaoyu.${module}.modular.${childModule}.entity.${Domain}Entity;
import io.xiaoyu.${module}.modular.${childModule}.req.${Domain}QueryReq;
import io.xiaoyu.${module}.modular.${childModule}.resp.${Domain}QueryResp;
import io.xiaoyu.common.resp.PageResp;
import io.xiaoyu.${module}.modular.${childModule}.req.${Domain}AddReq;
import io.xiaoyu.${module}.modular.${childModule}.req.${Domain}EditReq;
import io.xiaoyu.${module}.modular.${childModule}.req.${Domain}DetailReq;


public interface ${Domain}Service extends IBaseService<${Domain}Entity> {

    PageResp<${Domain}Entity> queryList(${Domain}QueryReq req);

    void add(${Domain}AddReq ${domain}AddReq);

    void edit(${Domain}EditReq ${domain}EditReq);

    ${Domain}QueryResp queryDetail(${Domain}DetailReq ${domain}DetailReq);

    void delete(${Domain}DetailReq ${domain}DetailReq);

    ${Domain}Entity queryEntity(int id);


}
