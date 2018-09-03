package com.tuyou.common;

import java.util.List;

/**
 * request search some data  response.
 *
 * Created by y_qiw on 2015/12/7.
 */
public class SearchListResponse<T> extends BaseModel {

    private Integer total;

    private List<T> list;

    private Integer pageSize;

    private Integer currentPage;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
    public Integer getPageSize() {

        return pageSize == null || pageSize < 0 ? 0 : pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getCurrentPage() {

        return currentPage == null || currentPage < 0 ? 0 : currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }
}
