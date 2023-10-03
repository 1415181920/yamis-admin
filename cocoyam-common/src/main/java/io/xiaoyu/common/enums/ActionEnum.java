package io.xiaoyu.common.enums;

public enum ActionEnum {
    ACTIONS("操作"),
    CREATE("新增"),
    EDIT("编辑"),
    SHOW("查看"),
    DELETE("删除");

    private final String chinese;

    ActionEnum(String chinese) {
        this.chinese = chinese;
    }

    public String getChinese() {
        return chinese;
    }

    public static String get(String actionName) {
        for (ActionEnum action : ActionEnum.values()) {
            if (action.name().equalsIgnoreCase(actionName)) {
                return action.getChinese();
            }
        }
        return null;
    }
}