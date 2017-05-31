package com.bill99.coe.dao;

import com.bill99.coe.model.BusinessOpportunity;
import com.bill99.coe.model.BusinessOpportunityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BusinessOpportunityMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table SIEBEL.S_OPTY
	 * @mbggenerated
	 */
	int countByExample(BusinessOpportunityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table SIEBEL.S_OPTY
	 * @mbggenerated
	 */
	int deleteByExample(BusinessOpportunityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table SIEBEL.S_OPTY
	 * @mbggenerated
	 */
	int insert(BusinessOpportunity record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table SIEBEL.S_OPTY
	 * @mbggenerated
	 */
	int insertSelective(BusinessOpportunity record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table SIEBEL.S_OPTY
	 * @mbggenerated
	 */
	List<BusinessOpportunity> selectByExample(BusinessOpportunityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table SIEBEL.S_OPTY
	 * @mbggenerated
	 */
	int updateByExampleSelective(@Param("record") BusinessOpportunity record,
			@Param("example") BusinessOpportunityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table SIEBEL.S_OPTY
	 * @mbggenerated
	 */
	int updateByExample(@Param("record") BusinessOpportunity record,
			@Param("example") BusinessOpportunityExample example);
}