package io.xiaoyu.${module}.modular.${childModule}.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.xiaoyu.common.req.CommonPageRequest;
import io.xiaoyu.common.basic.service.BaseService;
import org.springframework.transaction.annotation.Transactional;
import cn.hutool.core.util.ObjectUtil;
import io.xiaoyu.common.exception.CommonException;
import io.xiaoyu.${module}.modular.${childModule}.entity.${Domain}Entity;
import io.xiaoyu.${module}.modular.${childModule}.mapper.${Domain}Mapper;
import io.xiaoyu.${module}.modular.${childModule}.req.${Domain}QueryReq;
import io.xiaoyu.${module}.modular.${childModule}.resp.${Domain}QueryResp;
import io.xiaoyu.${module}.modular.${childModule}.service.${Domain}Service;
import io.xiaoyu.${module}.modular.${childModule}.req.${Domain}AddReq;
import io.xiaoyu.${module}.modular.${childModule}.req.${Domain}EditReq;
import io.xiaoyu.${module}.modular.${childModule}.req.${Domain}DetailReq;
import io.xiaoyu.common.resp.PageResp;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class ${Domain}ServiceImpl extends BaseService<${Domain}Mapper,${Domain}Entity> implements ${Domain}Service{

    @Resource
    private ${Domain}Mapper ${domain}Mapper;

    public PageResp<${Domain}Entity> queryList(${Domain}QueryReq req) {
        QueryWrapper<${Domain}Entity> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().orderByDesc(${Domain}Entity::getId);
        return this.page(CommonPageRequest.defaultPage(), queryWrapper);
    }

    public ${Domain}QueryResp queryDetail(${Domain}DetailReq ${domain}DetailReq) {
        ${Domain}Entity  ${domain}Entity = queryEntity(${domain}DetailReq.getId());
        ${Domain}QueryResp ${domain}QueryResp = BeanUtil.copyProperties(${domain}Entity, ${Domain}QueryResp.class);
        return ${domain}QueryResp;
    }

    @Transactional(rollbackFor = Exception.class)
    public void add(${Domain}AddReq ${domain}AddReq) {
        ${Domain}Entity ${domain}Entity = BeanUtil.toBean(${domain}AddReq, ${Domain}Entity.class);
        this.save(${domain}Entity);
    }

    @Transactional(rollbackFor = Exception.class)
    public void edit(${Domain}EditReq ${domain}EditReq) {
        ${Domain}Entity ${domain}Entity = this.queryEntity(${domain}EditReq.getId());
        BeanUtil.copyProperties(${domain}EditReq,${domain}Entity);
        this.updateById(${domain}Entity);
    }

    public ${Domain}Entity queryEntity(int id){
        ${Domain}Entity ${domain}Entity = this.getById(id);
        if(ObjectUtil.isEmpty(${domain}Entity)) {
             throw new CommonException("值不存在，id值为：{}", id);
        }
        return ${domain}Entity;
    }


    @Transactional(rollbackFor = Exception.class)
    public void delete(${Domain}DetailReq ${domain}Req) {
        if (!this.removeById(${domain}Req.getId())){
            throw new CommonException("删除失败，id值为：{}", ${domain}Req.getId());
        }
    }



}
