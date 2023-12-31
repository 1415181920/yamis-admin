package io.xiaoyu.auth.modular.login.mapper;

import io.xiaoyu.auth.modular.login.entity.AdminUsersEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author xiaoyu
 * @since 2023-07-27
 */
@Mapper
@Repository("loginAdminUsersMapper")
public interface AdminUsersMapper extends BaseMapper<AdminUsersEntity> {
//    selectOne

}
