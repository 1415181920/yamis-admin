package io.xiaoyu.${module}.modular.${childModule}.entity;

import lombok.Data;
import com.baomidou.mybatisplus.annotation.TableName;
<#list typeSet as type>
    <#if type=='Date'>
import java.util.Date;
    </#if>
    <#if type=='BigDecimal'>
import java.math.BigDecimal;
    </#if>
</#list>

@Data
@TableName("${tableName}")
public class ${Domain}Entity {

<#list fieldList as field>
    /**
    * ${field.comment}
    */
    <#if field.javaType=='Date'>
<#--        <#if field.type=='time'>-->
<#--            @JsonFormat(pattern = "HH:mm:ss",timezone = "GMT+8")-->
<#--        <#elseif field.type=='date'>-->
<#--            @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")-->
<#--        <#else>-->
<#--            @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")-->
<#--        </#if>-->
    </#if>
<#--    <#if field.name=='id' || field.name?ends_with('_id')>-->
<#--        @TableId(value = "${field.annotationColumnName}", type = IdType.AUTO)-->
<#--    </#if>-->
    private ${field.javaType} ${field.nameHump};

</#list>


}
