package io.xiaoyu.common.basic.controller;

import io.xiaoyu.common.yaims.AmisFactory;

import java.util.HashMap;

public class AdminBaseViewController {

    protected  HashMap<Object, Object> DialogButton(HashMap<Object, Object> render,String label,String icon){
        System.err.println(render);
       return AmisFactory.DialogAction().dialog(
                AmisFactory.Dialog().title(label).body(render).render()
        ).label(label).icon(icon).render();
    }

    protected io.xiaoyu.common.yaims.Form baseForm(String api,String title){
       return AmisFactory.Form().panelClassName("px-48 m:px-0").
                mode("horizontal").api(api).title(title);
    }

}
