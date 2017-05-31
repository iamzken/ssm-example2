package com.bill99.coe.service;

import java.util.List;

import com.bill99.coe.dto.BusinessOpportunityDTO;
import com.bill99.coe.exception.BusinessException;
import com.bill99.coe.model.BusinessOpportunity;

public interface BusinessOpportunityService {

	List<BusinessOpportunity> selectBusinessOpportunityList(BusinessOpportunityDTO dto) throws BusinessException;
}