<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="io.xiaoyu.${module}.modular.${childModule}.mapper.${Domain}Mapper">

    <!-- 通用查询映射结果 -->
    <resultMap id="BaseResultMap" type="io.xiaoyu.${module}.modular.${childModule}.entity.${Domain}Entity">
        <id column="id" property="id" />
        <#list fieldList as field>
            <#if field.name != "id">
        <result column="${field.name}" property="${field.nameHump}" />
            </#if>
        </#list>
    </resultMap>

</mapper>
