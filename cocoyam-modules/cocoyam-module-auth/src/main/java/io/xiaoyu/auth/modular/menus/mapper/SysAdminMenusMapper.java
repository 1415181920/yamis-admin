package io.xiaoyu.auth.modular.menus.mapper;

import io.xiaoyu.auth.modular.menus.entity.SysAdminMenusEntity;
import io.xiaoyu.common.basic.mapper.BaseMapperX;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("authAdminMenusMapper")
public interface SysAdminMenusMapper  extends BaseMapperX<SysAdminMenusEntity> {


}
