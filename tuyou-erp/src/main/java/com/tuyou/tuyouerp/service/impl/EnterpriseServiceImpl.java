package com.tuyou.tuyouerp.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import com.tuyou.tuyouerp.dao.EnterpriseMapper;
import com.tuyou.tuyouerp.service.EnterpriseService;
import com.xdjk.model.erp.Enterprise;
import com.xdjk.model.erp.EnterpriseExample;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.session.RowBounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("EnterpriseService")
public class EnterpriseServiceImpl implements EnterpriseService {
	private transient final Logger log = LoggerFactory.getLogger(getClass());

	@Resource
	private EnterpriseMapper enterpriseMapper;


	public List<Enterprise> search(Enterprise entity, int pageIndex, int pageSize, String sort){
		EnterpriseExample example = new EnterpriseExample();
		EnterpriseExample.Criteria condition = example.createCriteria();

		// TODO TblBreatheLogicImpl 添加查询条件
		if(StringUtils.isNotBlank(entity.getEnterpriseName())){
			condition.andEnterpriseNameLike(entity.getEnterpriseName());
		}
		if(null == example) {
			return new ArrayList<>();
		}

		int offset = pageIndex <= 0 ? 0 : (pageIndex - 1) * pageSize;
		int limit = pageIndex <= 0 ? 9999 : pageSize;
		RowBounds bounds = new RowBounds(offset, limit);

		// TODO TblBreatheLogicImpl 修改排序方式
		sort = StringUtils.isBlank(sort) ? " created_time desc " : sort;

		example.setOrderByClause( sort);

		List<Enterprise> entityList = enterpriseMapper.selectByExampleWithRowbounds(example, bounds);

		return  entityList;
	}

	/**
	 * 查询总数
	 * @param bean
	 * @return
	 */
	@Override
	public int count(Enterprise bean){
		EnterpriseExample example = new EnterpriseExample();
		if (null == example) {
			return 0;
		}

		Long total = enterpriseMapper.countByExample(example);

		return total.intValue();
	}

	/**
	 * 插入
	 * @param bean
	 * @return
	 */
	@Override
	@Transactional
	public int insert(Enterprise bean){
		Enterprise entity = new Enterprise();

		Date now = new Date();
		entity.setCreatedTime(now);
		return enterpriseMapper.insert(entity);
	}
	@Override
	public Enterprise getById(Integer id){
		Enterprise entity = enterpriseMapper.selectByPrimaryKey(id);
		return entity;
	}

	/**
	 *
	 * @param bean
	 * @return
	 */
	@Override
	public int update(Enterprise bean){

		Enterprise entity = new Enterprise();

		Date currentDate = new Date();
		int updateCount = enterpriseMapper.updateByPrimaryKeySelective(entity);
		return updateCount;
	}

	/**
	 *
	 * @param id
	 * @return
	 */
	@Override
	public int deleteById(Integer id){
		Enterprise bean = getById(id);

		return update(bean);
	}

}
