package io.xiaoyu.common.yaims;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public abstract  class BaseRenderer {

    public String type;
    public Map<Object, Object> amisSchema = new HashMap<>();



    public BaseRenderer set(Object name, Object value) {
        amisSchema.put(name, value);
        return this;
    }

    public Object get(String name) {
        return amisSchema.get(name);
    }

//    public Map<String, Object> getAmisSchema() {
//        return amisSchema;
//    }

    public String toJson() {
//        Gson gson = new Gson();
//        return gson.toJson(amisSchema);
        return "111";
    }



    public Map<Object, Object> toArray() {
        return amisSchema;
    }
}







