package com.tuyou.common;

import java.io.Serializable;

/**
 * Created by luyy on 2018/09/8.
 */
public class PageParameter implements Serializable {

    private static final long serialVersionUID = -186351179962041696L;

    private Integer pageSize;

    private Integer currentPage;

    private String userId;

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

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
