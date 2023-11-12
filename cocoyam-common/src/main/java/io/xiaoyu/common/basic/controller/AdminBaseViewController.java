package io.xiaoyu.common.basic.controller;

import io.xiaoyu.common.shared.YamisActionContext;
import io.xiaoyu.common.yaims.AmisFactory;

import java.util.HashMap;

public class AdminBaseViewController {

    protected  <T extends AdminBaseViewController> HashMap<Object, Object> createButton(T t){
        YamisActionContext.setYamisActionCreate();
       return AmisFactory.DialogAction().dialog(
                AmisFactory.Dialog().title("新增").body(t.formView()).render()
        ).label("新增").icon("fa fa-add").render();
    }



    protected <T extends AdminBaseViewController>HashMap<Object, Object> rowEditButton(T t) {
        YamisActionContext.setYamisActionEdit();
        return AmisFactory.DialogAction().dialog(
                AmisFactory.Dialog().title("编辑").body(t.formView()).render()
        ).label("编辑").icon("fa fa-edit").level("link").render();
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


    protected HashMap<Object,Object> formView(){
        return null;
    }

}
