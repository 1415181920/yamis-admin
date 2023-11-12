package io.xiaoyu.common.shared;

public class YamisActionContext {
    private static final ThreadLocal<Boolean> YamisActionCreate = new ThreadLocal<>();
    private static final ThreadLocal<Boolean> YamisActionEdit = new ThreadLocal<>();

    public static void setYamisActionCreate() {
        YamisActionCreate.set(true);
    }

    public static void setYamisActionEdit() {
        YamisActionEdit.set(true);
    }

    public static Boolean isYamisActionCreate() {
        return (YamisActionCreate.get() != null) ? YamisActionCreate.get() : false;
    }

    public static Boolean isYamisActionEdit() {
        return (YamisActionEdit.get() != null) ? YamisActionEdit.get() : false;
    }

    public static void clear() {
        YamisActionCreate.remove();
        YamisActionEdit.remove();
    }
}