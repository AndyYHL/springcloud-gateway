package com.tuyou.tuyoucrm.controller;

import com.tuyou.common.response.ResponseModel;
import org.springframework.http.HttpStatus;

/**
 * @author wudi
 */
public abstract class BaseController {

    protected ResponseModel getSuccess() {
        ResponseModel response = new ResponseModel();

        response.setMessage(HttpStatus.OK.getReasonPhrase());
        response.setStatus(HttpStatus.OK.value());

        return response;
    }



}
