package io.xiaoyu.sys.modular.admin.mapper;

import io.xiaoyu.common.basic.mapper.BaseMapperX;
import io.xiaoyu.sys.modular.admin.entity.AdminUsersEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("sysAdminUsersMapper")
public interface AdminUsersMapper extends BaseMapperX<AdminUsersEntity> {


}