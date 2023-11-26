package io.xiaoyu.${module}.modular.${childModule}.req;

import lombok.Getter;
import lombok.Setter;
import javax.validation.constraints.NotNull;


@Getter
@Setter
public class ${Domain}DetailReq{


    @NotNull(message = "id不能为空")
    private Integer id;

}
