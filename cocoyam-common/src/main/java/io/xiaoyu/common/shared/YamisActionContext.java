package io.xiaoyu.common.shared;

public class YamisActionContext {
    private static final ThreadLocal<Boolean> yamisActionCreate = new ThreadLocal<>();
    private static final ThreadLocal<Boolean> yamisActionEdit = new ThreadLocal<>();

    public static void setYamisActionCreate() {
        yamisActionCreate.set(true);
        yamisActionEdit.set(false);
    }

    public static void setYamisActionEdit() {
        yamisActionEdit.set(true);
        yamisActionCreate.set(false);
    }

    public static Boolean isYamisActionCreate() {
        return (yamisActionCreate.get() != null) ? yamisActionCreate.get() : false;
    }

    public static Boolean isYamisActionEdit() {
        return (yamisActionEdit.get() != null) ? yamisActionEdit.get() : false;
    }

    public static void clear() {
        yamisActionCreate.remove();
        yamisActionEdit.remove();
    }
}