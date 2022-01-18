package com.liuwei.yeb.api.entity.response;

public class PageInfo {

    /**
     * 当前页
     */
    long currentPage;

    /**
     * 第几页
     */
    long pages;

    /**
     * 每页展示数量
     */
    long pageSize;

    /**
     * 总量
     */
    long count;

    public PageInfo(long pages, long pageSize, long count) {
        this.currentPage = pages;
        this.pages = pages;
        this.pageSize = pageSize;
        this.count = count;
    }

    public long getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(long currentPage) {
        this.currentPage = currentPage;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public long getPageSize() {
        return pageSize;
    }

    public void setPageSize(long pageSize) {
        this.pageSize = pageSize;
    }

    public long getPages() {
        return pages;
    }

    public void setPages(long pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "PageInfo{" +
                "count=" + count +
                ", pageSize=" + pageSize +
                ", pages=" + pages +
                '}';
    }
}
