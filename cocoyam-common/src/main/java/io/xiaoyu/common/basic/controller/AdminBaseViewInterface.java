package io.xiaoyu.common.basic.controller;

public interface AdminBaseViewInterface {


    /**
     * 新增视图
     * @return
     */
    default  Object formView(){
        return null;
    }


    /**
     * 列表视图
     * @return
     */
    default  Object listView(){
        return null;
    }

}
