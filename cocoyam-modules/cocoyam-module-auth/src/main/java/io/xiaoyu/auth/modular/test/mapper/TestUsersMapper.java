package io.xiaoyu.auth.modular.test.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.xiaoyu.auth.modular.test.entity.TestUsersEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestUsersMapper extends BaseMapper<TestUsersEntity> {


}