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
}
