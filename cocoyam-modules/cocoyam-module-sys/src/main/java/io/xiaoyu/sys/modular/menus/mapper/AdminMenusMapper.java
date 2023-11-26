package io.xiaoyu.sys.modular.menus.mapper;

import io.xiaoyu.common.basic.mapper.BaseMapperX;
import io.xiaoyu.sys.modular.menus.entity.AdminMenusEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("sysAdminMenusMapper")
public interface AdminMenusMapper extends BaseMapperX<AdminMenusEntity> {


}