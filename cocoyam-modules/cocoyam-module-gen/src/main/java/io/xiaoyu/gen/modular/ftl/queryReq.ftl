package io.xiaoyu.${module}.modular.${childModule}.req;

import io.xiaoyu.common.req.PageReq;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ${Domain}QueryReq extends PageReq {

    @Override
    public String toString() {
        return "${Domain}QueryReq{" +
                "} " + super.toString();
    }
}
