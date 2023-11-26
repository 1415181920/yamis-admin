package io.xiaoyu.core.config;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.util.ObjectUtil;
import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.ReflectionException;
import org.springframework.stereotype.Component;

/**
 * 自定义公共字段自动注入
 *
 */
@Component
public class CustomMetaObjectHandler implements MetaObjectHandler {

        /** 创建时间 */
        private static final String CREATED_AT = "createdAt";

        /** 更新时间 */
        private static final String UPDATED_AT = "updatedAt";



        @Override
        public void updateFill(MetaObject metaObject) {
            try {
                setFieldValByName(UPDATED_AT, DateTime.now(), metaObject);
            } catch (ReflectionException ignored) {
                System.err.println("自动注入创建时间失败");
                System.err.println(ignored.getMessage());
            }
        }

        @Override
        public void insertFill(MetaObject metaObject) {
            try {
                //为空则设置createTime
                Object createTime = metaObject.getValue(CREATED_AT);
                if (ObjectUtil.isNull(createTime)) {
                    setFieldValByName(CREATED_AT, DateTime.now(), metaObject);
                }
                if (ObjectUtil.isNull(metaObject.getValue(UPDATED_AT))) {
                    setFieldValByName(UPDATED_AT, DateTime.now(), metaObject);
                }
            } catch (ReflectionException ignored) {
                System.err.println("自动注入创建时间失败");
                System.err.println(ignored.getMessage());
            }
        }
}
