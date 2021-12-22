package com.liuwei.yeb.api.entity.response;

import java.util.List;

/**
 * 前端模型，用于分页查询
 *
 * @author liuwei
 */
public class PageResponse<T> {
    /**
     * 分页信息
     */
    PageInfo pageInfo;

    /**
     * 分页数据
     */
    private List<T> list;

    public PageResponse(PageInfo pageInfo, List<T> list) {
        this.pageInfo = pageInfo;
        this.list =list;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
