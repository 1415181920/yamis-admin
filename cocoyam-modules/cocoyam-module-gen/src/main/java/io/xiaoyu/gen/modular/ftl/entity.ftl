package io.xiaoyu.${module}.modular.${childModule}.entity;

import lombok.Data;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import io.xiaoyu.common.basic.pojo.CommonEntity;
<#list typeSet as type>
    <#if type=='Date'>
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
    </#if>
    <#if type=='BigDecimal'>
import java.math.BigDecimal;
    </#if>
</#list>

@Data
@TableName("${tableName}")
public class ${Domain}Entity extends CommonEntity {

<#list fieldList as field>
    /**
    * ${field.comment}
    */
    <#if field.javaType=='Date'>
    <#if field.type=='time'>
    @JsonFormat(pattern = "HH:mm:ss",timezone = "GMT+8")
    <#elseif field.type=='date'>
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    <#else>
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    </#if>
    </#if>
    <#if field.nameHump=='id'>
    @TableId(type=IdType.AUTO)
    </#if>
    <#if field.nameHump=='createdAt'>
    @TableField(fill = FieldFill.INSERT)
    </#if>
    <#if field.nameHump=='updatedAt'>
    @TableField(fill = FieldFill.INSERT_UPDATE)
    </#if>
    private ${field.javaType} ${field.nameHump};
</#list>


}
