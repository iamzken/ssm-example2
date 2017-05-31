package com.bill99.coe.service.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bill99.coe.dao.BusinessOpportunityMapper;
import com.bill99.coe.dto.BusinessOpportunityDTO;
import com.bill99.coe.exception.BusinessException;
import com.bill99.coe.model.BusinessOpportunity;
import com.bill99.coe.model.BusinessOpportunityExample;
import com.bill99.coe.page.Page;
import com.bill99.coe.service.BusinessOpportunityService;

@Service
public class BusinessOpportunityServiceImpl implements BusinessOpportunityService{
	
	@Autowired
	private BusinessOpportunityMapper businessOpportunityMapper;

	@Override
	public List<BusinessOpportunity> selectBusinessOpportunityList(BusinessOpportunityDTO dto) throws BusinessException {
		
		//此处加入业务逻辑，比如对dto的成员属性值的业务判断等
		if(StringUtils.isEmpty(dto.getRowId())){
			throw new BusinessException("rowId不能为空");
		}
		BusinessOpportunityExample example = new BusinessOpportunityExample();
		//分页数据设置
		Page page = new Page();
		page.setBegin(dto.getBegin());
		page.setEnd(dto.getEnd());
		example.setPage(page);
		List<BusinessOpportunity> businessOpportunities = businessOpportunityMapper.selectByExample(example);
		return businessOpportunities;
		
	}

}