package com.tuyou.tuyouerp.service;

import java.util.List;

import  com.tuyou.tuyouerp.service.BaseService;
import com.xdjk.model.erp.Enterprise;

public interface EnterpriseService extends BaseService<Enterprise> {

	List<Enterprise> search(Enterprise entity, int pageIndex, int pageSize, String sort);

	int count(Enterprise bean);

	


}
