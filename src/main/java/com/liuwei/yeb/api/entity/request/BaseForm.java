package com.liuwei.yeb.api.entity.request;

public class BaseForm {
    /** 当前页 */
    private Integer currentPage;
    /** 每页记录数*/
    private Integer pageSize;

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
