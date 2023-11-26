package io.xiaoyu.sys.modular.admin.req;

import lombok.Getter;
import lombok.Setter;
import javax.validation.constraints.NotNull;


@Getter
@Setter
public class AdminRolesDetailReq{


    @NotNull(message = "id不能为空")
    private Integer id;

}
