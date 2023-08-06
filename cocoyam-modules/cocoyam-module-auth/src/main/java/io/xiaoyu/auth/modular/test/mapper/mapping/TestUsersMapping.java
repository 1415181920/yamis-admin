<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="io.xiaoyu.auth.modular.test.mapper.TestUsersMapper">

    <!-- 通用查询映射结果 -->
    <resultMap id="BaseResultMap" type="io.xiaoyu.auth.modular.test.entity.TestUsersEntity">
        <id column="id" property="id" />
                <result column="username" property="username" />
                <result column="password" property="password" />
                <result column="nickname" property="nickname" />
                <result column="remark" property="remark" />
                <result column="dept_id" property="deptId" />
                <result column="post_ids" property="postIds" />
                <result column="email" property="email" />
                <result column="mobile" property="mobile" />
                <result column="sex" property="sex" />
                <result column="avatar" property="avatar" />
                <result column="status" property="status" />
                <result column="login_ip" property="loginIp" />
                <result column="login_date" property="loginDate" />
                <result column="creator" property="creator" />
                <result column="create_time" property="createTime" />
                <result column="updater" property="updater" />
                <result column="update_time" property="updateTime" />
                <result column="deleted" property="deleted" />
                <result column="tenant_id" property="tenantId" />
    </resultMap>

</mapper>
