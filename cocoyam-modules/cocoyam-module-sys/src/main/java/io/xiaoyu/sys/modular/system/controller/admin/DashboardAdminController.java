package io.xiaoyu.sys.modular.system.controller.admin;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DashboardAdminController {


    public String getDashboard() {
        return "Hello World";
    }


}
