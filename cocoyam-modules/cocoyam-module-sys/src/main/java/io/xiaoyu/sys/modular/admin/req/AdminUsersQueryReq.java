package io.xiaoyu.sys.modular.admin.req;

import io.xiaoyu.common.req.PageReq;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AdminUsersQueryReq extends PageReq {

    @Override
    public String toString() {
        return "AdminUsersQueryReq{" +
                "} " + super.toString();
    }
}
