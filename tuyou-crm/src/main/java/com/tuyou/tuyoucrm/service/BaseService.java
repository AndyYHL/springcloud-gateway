package com.tuyou.tuyoucrm.service;


public interface BaseService<T> {
	int insert(T bean);

	int deleteById(Integer id);

	int update(T bean);

	T getById(Integer id);
}
