package io.xiaoyu.${module}.modular.${childModule}.req;

import lombok.Getter;
import lombok.Setter;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class ${Domain}DetailReq{


    @NotBlank(message = "id不能为空")
    private String id;

}
