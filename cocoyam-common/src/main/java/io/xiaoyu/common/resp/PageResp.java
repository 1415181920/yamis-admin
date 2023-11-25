package io.xiaoyu.common.resp;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import java.util.List;


/**
 * 通用分页返回参数 二次重写Page类的
 * @param <T>
 */
@Getter
@Setter
public class PageResp<T> extends Page<T>{

    /**
     * 当前页的列表
     */
    private List<T> items;
    /**
     * 当前页码
     */
    private long pageNum;
    /**
     * 每页条数
     */
    private long perPage;


    public PageResp(){
        super();
    }

    public PageResp(long page,long perPage,long total){
        super(page,perPage,total);
        this.pageNum = page;
        this.perPage = perPage;
        this.total = total;
    }

    public PageResp(long page,long perPage,long total,List<T> items){
        super(page,perPage,total);
        this.pageNum = page;
        this.perPage = perPage;
        this.total = total;
        this.items = items;
    }

    public PageResp(IPage<T> page){
        super(page.getCurrent(), page.getSize(), page.getTotal());
        this.items = page.getRecords();
        this.pageNum = page.getCurrent();
        this.perPage = page.getSize();
        this.total = page.getTotal();
    }

    public PageResp(long page,long perPage){
        super(page,perPage);
        this.pageNum = page;
        this.perPage = perPage;
    }

    @Override
    @JsonIgnore
    public long getSize() {
        return this.perPage;
    }

    @Override
    public PageResp<T> setSize(long size) {
        this.size = size;
        this.perPage = size;
        return this;
    }


    @Override
    @JsonIgnore
    public long getCurrent() {
        return this.pageNum;
    }

    @Override
    public PageResp<T> setCurrent(long current) {
        this.current = current;
        this.pageNum = current;
        return this;
    }

    @Override
    @JsonIgnore
    public List<T> getRecords() {
        return this.records;
    }

    @Override
    public PageResp<T> setRecords(List<T> records) {
        this.records = records;
        this.items = records;
        return this;
    }

}
