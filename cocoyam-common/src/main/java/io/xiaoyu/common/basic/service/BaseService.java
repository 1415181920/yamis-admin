package io.xiaoyu.common.basic.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.xiaoyu.common.basic.mapper.BaseMapperX;

public class BaseService<M extends BaseMapperX<T>,T> extends ServiceImpl<M, T> implements IBaseService<T>{

}
