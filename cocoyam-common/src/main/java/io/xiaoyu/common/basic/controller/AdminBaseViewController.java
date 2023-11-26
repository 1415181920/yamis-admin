package io.xiaoyu.common.basic.controller;

import io.xiaoyu.common.shared.YamisActionContext;
import io.xiaoyu.common.yaims.AmisFactory;
import io.xiaoyu.common.yaims.Dialog;
import io.xiaoyu.common.yaims.DrawerAction;
import java.util.ArrayList;
import java.util.HashMap;

public class AdminBaseViewController implements AdminBaseViewInterface{

    protected HashMap<Object, Object> createButton(AdminBaseViewController viewController, String title, String size) {
        YamisActionContext.setYamisActionCreate();
        Dialog dialog = AmisFactory.Dialog().title(title).body(viewController.formView());
        if (size != null && !size.isEmpty()) {
            dialog = dialog.size(size);
        }
        return createButtonWithDrawer(AmisFactory.DrawerAction().drawer(dialog.render()),title);
    }

    private HashMap<Object, Object> createButtonWithDrawer(DrawerAction drawerAction, String title) {
        return drawerAction
                .label(title)
                .level("primary")
                .icon("fa fa-add")
                .render();
    }


    protected <T extends AdminBaseViewController>HashMap<Object, Object> rowEditButton(AdminBaseViewController viewController, String title, String size) {
        YamisActionContext.setYamisActionEdit();
        Dialog dialog = AmisFactory.Dialog().title(title).body(viewController.formView());
        if (size != null && !size.isEmpty()) {
            dialog = dialog.size(size);
        }
        return editButtonWithDrawer(AmisFactory.DrawerAction().drawer(dialog.render()),title);
    }

    private HashMap<Object, Object> editButtonWithDrawer(DrawerAction drawerAction, String title) {
        return drawerAction
                .label(title)
                .level("link")
                .icon("fa fa-edit")
                .render();
    }


    protected HashMap<Object, Object> rowDeleteButton(String requestApi) {
        return AmisFactory.Button()
                .actionType("ajax")
                .api(new HashMap<String, Object>() {{
                    put("url", requestApi);
                    put("method", "post");
                    put("data", new HashMap<String, String>() {{
                        put("id", "${id}");
                    }});
                }})
                .set("data",new HashMap<String,String>(){{put("id","${id}");}})
                .label("删除")
                .icon("fa-regular fa-trash-can")
                .level("link")
                .confirmText("确定删除选中项？").render();
    }

    public ArrayList<HashMap<Object,Object>> baseHeaderToolBar() {
        ArrayList<HashMap<Object,Object>> toolBarItems = new ArrayList<>();
        toolBarItems.add(AmisFactory.Amis().set("type", "bulkActions").set("align", "right").render());
        toolBarItems.add(AmisFactory.Amis().set("type", "reload").set("align", "right").render());
        toolBarItems.add(AmisFactory.Amis().set("type", "filter-toggler").set("align", "right").render());
        return toolBarItems;
    }

    protected io.xiaoyu.common.yaims.Form baseForm(String api,String title){
       return AmisFactory.Form().panelClassName("px-48 m:px-0").
                mode("horizontal").api(api).title(title);
    }

    protected boolean isCreate(){
       return  YamisActionContext.isYamisActionCreate();
    }

    protected boolean isEdit(){
        return YamisActionContext.isYamisActionEdit();
    }

}
