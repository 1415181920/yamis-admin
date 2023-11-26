package io.xiaoyu.sys.modular.menus.req;

import lombok.Getter;
import lombok.Setter;
import javax.validation.constraints.NotNull;


@Getter
@Setter
public class AdminMenusDetailReq{


    @NotNull(message = "id不能为空")
    private Integer id;

}
