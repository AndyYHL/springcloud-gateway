package com.tuyou.tuyoucrm.service;

import java.util.List;

import com.tuyou.tuyoucrm.vo.Enterprise;


public interface EnterpriseService extends BaseService<Enterprise> {

	List<Enterprise> search(Enterprise entity, int pageIndex, int pageSize, String sort);

	int count(Enterprise bean);

	


}
