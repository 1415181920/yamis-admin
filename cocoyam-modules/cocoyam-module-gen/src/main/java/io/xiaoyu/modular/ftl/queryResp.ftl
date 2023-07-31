package com.jiawa.train.${module}.resp;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
<#list typeSet as type>
<#if type=='Date'>
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
</#if>
<#if type=='BigDecimal'>
import java.math.BigDecimal;
</#if>
</#list>

public class ${Domain}QueryResp {

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
    <#if field.name=='id' || field.name?ends_with('_id')>
    @JsonSerialize(using= ToStringSerializer.class)
    </#if>
    private ${field.javaType} ${field.nameHump};

    </#list>
    <#list fieldList as field>
    public ${field.javaType} get${field.nameBigHump}() {
        return ${field.nameHump};
    }

    public void set${field.nameBigHump}(${field.javaType} ${field.nameHump}) {
        this.${field.nameHump} = ${field.nameHump};
    }

    </#list>
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        <#list fieldList as field>
        sb.append(", ${field.nameHump}=").append(${field.nameHump});
        </#list>
        sb.append("]");
        return sb.toString();
    }
}
