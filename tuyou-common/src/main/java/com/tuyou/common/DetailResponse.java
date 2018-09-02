package com.tuyou.common;

/**
 * request update some data response.
 *
 * Created by luyy on 2018/9/1.
 */
public class DetailResponse<T> extends BaseModel {

    private T detail;

    public T getDetail() {
        return detail;
    }

    public void setDetail(T detail) {
        this.detail = detail;
    }
}
