package io.xiaoyu.${module}.modular.${childModule}.mapper;

import io.xiaoyu.common.basic.mapper.BaseMapperX;
import io.xiaoyu.${module}.modular.${childModule}.entity.${Domain}Entity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("${module}${Domain}Mapper")
public interface ${Domain}Mapper extends BaseMapperX<${Domain}Entity> {


}