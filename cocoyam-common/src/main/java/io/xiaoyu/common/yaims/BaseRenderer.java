package io.xiaoyu.common.yaims;

import java.util.HashMap;

public abstract  class BaseRenderer {

    public String type;
    public HashMap<Object, Object> amisSchema = new HashMap<>();


    public BaseRenderer setType(String type) {
        this.type = type;
        amisSchema.put("type", type);
        return this;
    }

    public BaseRenderer set(Object name, Object value) {
        amisSchema.put(name, value);
        return this;
    }

    public Object get(String name) {
        return amisSchema.get(name);
    }

    //渲染
    public HashMap<Object, Object> toArray(){
        return amisSchema;
    }


    //渲染
    public HashMap<Object, Object> render(){
        return amisSchema;
    }



}







