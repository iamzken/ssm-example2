package com.bill99.coe.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bill99.coe.dto.BusinessOpportunityDTO;
import com.bill99.coe.enums.ResultEnum;
import com.bill99.coe.exception.BusinessException;
import com.bill99.coe.model.BusinessOpportunity;
import com.bill99.coe.service.BusinessOpportunityService;
import com.bill99.coe.utils.BeanCopyUtils;
import com.bill99.coe.vo.BusinessOpportunityVO;
import com.bill99.coe.vo.common.Result;

@Controller
@RequestMapping("/businessOpportunity")
public class BusinessOpportunityController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private BusinessOpportunityService businessOpportunityService;

	@RequestMapping(value = "/list")
	@ResponseBody
	private Result<List<BusinessOpportunityVO>> list(BusinessOpportunityDTO dto) {
		
		logger.info("com.bill99.coe.controller.BusinessOpportunityController.list()入参为:"+dto);
		List<BusinessOpportunity> list;
		Result<List<BusinessOpportunityVO>> result = new Result<List<BusinessOpportunityVO>>();
		try {
			list = businessOpportunityService.selectBusinessOpportunityList(dto);
			//此处使用BeanListCopyUtils工具类进行两个list之间的集合复制,目的是为了给前端返回符合要求的对象,包括属性名称及大小写规范等
			List<BusinessOpportunityVO> listVO = new ArrayList<BusinessOpportunityVO>(list.size());
			BeanCopyUtils.copyList(listVO, list);
			result.setStatus(ResultEnum.SUCCESS.getStatus());
			result.setMsg(ResultEnum.SUCCESS.getMsg());
			result.setData(listVO);
			logger.info("com.bill99.coe.controller.list()出参为:"+listVO);
		} catch (BusinessException e) {
			result.setStatus(ResultEnum.FAIL.getStatus());
			result.setMsg(ResultEnum.FAIL.getMsg());
			result.setData(null);
			logger.info("com.bill99.coe.controller.BusinessOpportunityController.list()出参为:null");
			logger.info("com.bill99.coe.controller.BusinessOpportunityController.list()发生异常,异常信息为:"+e.getMessage());
			e.printStackTrace();
		}
		return result;
		
	}

}
