package io.xiaoyu.${module}.modular.${childModule}.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.xiaoyu.common.basic.service.BaseService;
import io.xiaoyu.${module}.modular.${childModule}.entity.${Domain}Entity;
import io.xiaoyu.${module}.modular.${childModule}.mapper.${Domain}Mapper;
import io.xiaoyu.${module}.modular.${childModule}.req.${Domain}QueryReq;
import io.xiaoyu.${module}.modular.${childModule}.resp.${Domain}QueryResp;
import io.xiaoyu.${module}.modular.${childModule}.service.${Domain}Service;
import io.xiaoyu.common.resp.PageResp;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class ${Domain}ServiceImpl extends BaseService<${Domain}Mapper,${Domain}Entity> implements ${Domain}Service{

    @Resource
    private ${Domain}Mapper ${domain}Mapper;

    public PageResp<${Domain}QueryResp> queryList(${Domain}QueryReq req) {

        Page<${Domain}Entity> userPage = new Page<>(req.getPage(), req.getPerPage());
        QueryWrapper<${Domain}Entity> wrapper = new QueryWrapper<>();

        IPage<${Domain}Entity> pageList = ${domain}Mapper.selectPage(userPage, wrapper);
        long total = pageList.getTotal();
        List<${Domain}Entity> records = pageList.getRecords();
        List<${Domain}QueryResp> list = BeanUtil.copyToList(records, ${Domain}QueryResp.class);

        PageResp<${Domain}QueryResp> pageResp = new PageResp<>();
        pageResp.setPageNum(req.getPage());
        pageResp.setPerPage(req.getPerPage());
        pageResp.setTotal(total);
        pageResp.setItems(list);
        return pageResp;
    }

    public ${Domain}QueryResp queryById(Long id) {
        ${Domain}Entity ${domain}Entity = ${domain}Mapper.selectById(id);
        ${Domain}QueryResp ${domain}QueryResp = BeanUtil.copyProperties(${domain}Entity, ${Domain}QueryResp.class);
        return ${domain}QueryResp;
    }
}