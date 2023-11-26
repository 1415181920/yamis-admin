package io.xiaoyu.sys.modular.admin.req;

import io.xiaoyu.common.req.PageReq;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AdminRolesQueryReq extends PageReq {

    @Override
    public String toString() {
        return "AdminRolesQueryReq{" +
                "} " + super.toString();
    }
}
