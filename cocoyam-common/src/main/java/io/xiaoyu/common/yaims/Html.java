package io.xiaoyu.common.yaims;

public class Html extends Tpl {

    public Html() {
        set("type", "html");
    }

    public Html set(String key, Object value) {
        super.set(key, value);
        return this;
    }
}
