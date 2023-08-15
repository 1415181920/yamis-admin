package io.xiaoyu.common.resp;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PageResp<T> implements Serializable {


    /**
     * 总条数
     */
    private Long total;

    /**
     * 当前页的列表
     */
    private List<T> items;
    /**
     * 当前页码
     */
    private Integer pageNum;

    /**
     * 每页条数
     */
    private Integer perPage;

}
