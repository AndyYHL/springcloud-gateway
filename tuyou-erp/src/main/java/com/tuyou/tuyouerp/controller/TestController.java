package com.tuyou.tuyouerp.controller;

import com.tuyou.common.PageParameter;
import com.tuyou.common.SearchListResponse;
import com.tuyou.tuyouerp.service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.xdjk.model.erp.Enterprise;
import java.util.Collections;
import java.util.List;

/**
 * @Author: luyy
 * @Date: 2018/9/01  13:28
 * @Version 1.0
 */
@RestController
@RequestMapping(value = "/test")
public class TestController extends BaseController{
    @Autowired
    private EnterpriseService enterpriseService;
    @RequestMapping("/hello")
    private String index(){

        return "Hello World!";
    }

    @RequestMapping("/enterprise")
    private SearchListResponse enterprise(Enterprise bean, PageParameter page){
        SearchListResponse response = new SearchListResponse();

        int count = enterpriseService.count(bean);
        if (count > 0) {
            List<Enterprise> beans = enterpriseService.search(bean, page.getCurrentPage(), page.getPageSize(), null);
            //List<MstFeedbackModel> models = Convertor.copyDataList(beans, MstFeedbackModel.class);
            response.setList(beans);

        }else{
            response.setList(Collections.emptyList());
        }
        response.setTotal(count);
        response.setCurrentPage(page.getCurrentPage());
        response.setPageSize(page.getPageSize());
        response.setResponse(getSuccess());
        return  response;

    }

}
