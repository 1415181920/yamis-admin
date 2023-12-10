package io.xiaoyu.sys.modular.menus.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import io.xiaoyu.common.req.CommonPageRequest;
import io.xiaoyu.common.basic.service.BaseService;
import org.springframework.transaction.annotation.Transactional;
import cn.hutool.core.util.ObjectUtil;
import io.xiaoyu.common.exception.CommonException;
import io.xiaoyu.sys.modular.menus.entity.AdminMenusEntity;
import io.xiaoyu.sys.modular.menus.mapper.AdminMenusMapper;
import io.xiaoyu.sys.modular.menus.req.AdminMenusQueryReq;
import io.xiaoyu.sys.modular.menus.resp.AdminMenusQueryResp;
import io.xiaoyu.sys.modular.menus.service.AdminMenusService;
import io.xiaoyu.sys.modular.menus.req.AdminMenusAddReq;
import io.xiaoyu.sys.modular.menus.req.AdminMenusEditReq;
import io.xiaoyu.sys.modular.menus.req.AdminMenusDetailReq;
import io.xiaoyu.common.resp.PageResp;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Service
public class AdminMenusServiceImpl extends BaseService<AdminMenusMapper,AdminMenusEntity> implements AdminMenusService{


    public List<AdminMenusQueryResp> queryList(AdminMenusQueryReq req) {
        QueryWrapper<AdminMenusEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().orderByAsc(AdminMenusEntity::getOrder);
        List<AdminMenusEntity> list = this.list(queryWrapper);
        List<AdminMenusQueryResp> adminMenusQueryResps = BeanUtil.copyToList(list, AdminMenusQueryResp.class);
        List<AdminMenusQueryResp> resultList = listGetStree(adminMenusQueryResps);
        resultList.forEach(System.out::println);
        return resultList;
    }


    private static List<AdminMenusQueryResp> listGetStree(List<AdminMenusQueryResp> adminMenusQueryResps) {
        List<AdminMenusQueryResp> addresses = adminMenusQueryResps;
        // 通过Collectors.groupingBy(Address::getPid)方法对addresses按照Pid进行分组，也就是将pid相同的放在一起
        Map<Integer, List<AdminMenusQueryResp>> addressMap = adminMenusQueryResps.stream().collect(Collectors.groupingBy(AdminMenusQueryResp::getParentId));
        // 循环addresses,给它设置children属性
        addresses.forEach(address -> {
            address.setChildren(addressMap.get(address.getId()));
        });
        // 现在已经形成了多棵树，最后我们再通过filter()方法挑选出根节点的那颗树即可。 这里我的根节点的pid为0
        List<AdminMenusQueryResp> resultList = addresses.stream().filter(item -> item.getParentId().equals(0))
                .collect(Collectors.toList());
        return resultList;
    }


    public AdminMenusQueryResp queryDetail(AdminMenusDetailReq adminMenusDetailReq) {
        AdminMenusEntity  adminMenusEntity = queryEntity(adminMenusDetailReq.getId());
        AdminMenusQueryResp adminMenusQueryResp = BeanUtil.copyProperties(adminMenusEntity, AdminMenusQueryResp.class);
        return adminMenusQueryResp;
    }

    @Transactional(rollbackFor = Exception.class)
    public void add(AdminMenusAddReq adminMenusAddReq) {
        AdminMenusEntity adminMenusEntity = BeanUtil.toBean(adminMenusAddReq, AdminMenusEntity.class);
        this.save(adminMenusEntity);
    }

    @Transactional(rollbackFor = Exception.class)
    public void edit(AdminMenusEditReq adminMenusEditReq) {
        AdminMenusEntity adminMenusEntity = this.queryEntity(adminMenusEditReq.getId());
        BeanUtil.copyProperties(adminMenusEditReq,adminMenusEntity);

        if (ObjectUtil.isEmpty(adminMenusEditReq.getParentId())){
            adminMenusEntity.setParentId(0);
        }

        //如果本次的修改字段为 isHome 为1 则将其他的isHome字段设置为0
        if (adminMenusEditReq.getIsHome() == 1){
            this.update(new UpdateWrapper<AdminMenusEntity>().set("is_home",0));
        }

        this.updateById(adminMenusEntity);
    }

    public AdminMenusEntity queryEntity(int id){
        AdminMenusEntity adminMenusEntity = this.getById(id);
        if(ObjectUtil.isEmpty(adminMenusEntity)) {
             throw new CommonException("值不存在，id值为：{}", id);
        }
        return adminMenusEntity;
    }


    @Transactional(rollbackFor = Exception.class)
    public void delete(AdminMenusDetailReq adminMenusReq) {
        if (!this.removeById(adminMenusReq.getId())){
            throw new CommonException("删除失败，id值为：{}", adminMenusReq.getId());
        }
    }



}
