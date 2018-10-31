package org.springrain.nybusiness.ergency.entity;

import java.text.ParseException;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import org.springrain.frame.annotation.WhereSQL;
import org.springrain.frame.entity.BaseEntity;
/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-10-31 10:32:07
 * @see org.springrain.nybusiness.ergency.entity.TsEmePlanFilingMod
 */
@Table(name="ts_eme_plan_filing_mod")
public class TsEmePlanFilingMod  extends BaseEntity {
	
	private static final long serialVersionUID = 1L;

	//alias
	/*
	public static final String TABLE_ALIAS = "环境应急预案变更备案表";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_COMPANY_NAME = "公司名称";
	public static final String ALIAS_CONTACT = "联系";
	public static final String ALIAS_CONTACT_TEL = "联系电话";
	public static final String ALIAS_BEIAN_NUMBER = "备案编号";
	public static final String ALIAS_ADJUSTMENT_ID = "补充调整内容 关联到补充调整表";
	public static final String ALIAS_ADJUSTMENT_REASON = "申请调整或补充理由";
	public static final String ALIAS_APPLY_DATE = "申请日期";
	public static final String ALIAS_COMPANY_SEAL = "单位公章";
	public static final String ALIAS_COMPANY_ID = "公司id";
    */
	//date formats
	//public static final String FORMAT_APPLY_DATE = DateUtils.DATETIME_FORMAT;
	
	//columns START
	/**
	 * id
	 */
	private java.lang.String id;
	/**
	 * 公司名称
	 */
	private java.lang.String company_name;
	/**
	 * 联系
	 */
	private java.lang.String contact;
	/**
	 * 联系电话
	 */
	private java.lang.String contact_tel;
	/**
	 * 备案编号
	 */
	private java.lang.String beian_number;
	/**
	 * 补充调整内容 关联到补充调整表
	 */
	private java.lang.String adjustment_id;
	/**
	 * 申请调整或补充理由
	 */
	private java.lang.String adjustment_reason;
	/**
	 * 申请日期
	 */
	private java.util.Date apply_date;
	/**
	 * 单位公章
	 */
	private java.lang.String company_seal;
	/**
	 * 公司id
	 */
	private java.lang.String company_id;
	//columns END 数据库字段结束
	
	//concstructor

	public TsEmePlanFilingMod(){
	}

	public TsEmePlanFilingMod(
		java.lang.String id
	){
		this.id = id;
	}

	//get and set
		/**
		 * id
		 */
	public void setId(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.id = value;
	}
	
	
	
	/**
	 * id
	 */
	@Id
     @WhereSQL(sql="id=:TsEmePlanFilingMod_id")
	public java.lang.String getId() {
		return this.id;
	}
		/**
		 * 公司名称
		 */
	public void setCompany_name(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.company_name = value;
	}
	
	
	
	/**
	 * 公司名称
	 */
     @WhereSQL(sql="company_name=:TsEmePlanFilingMod_company_name")
	public java.lang.String getCompany_name() {
		return this.company_name;
	}
		/**
		 * 联系
		 */
	public void setContact(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.contact = value;
	}
	
	
	
	/**
	 * 联系
	 */
     @WhereSQL(sql="contact=:TsEmePlanFilingMod_contact")
	public java.lang.String getContact() {
		return this.contact;
	}
		/**
		 * 联系电话
		 */
	public void setContact_tel(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.contact_tel = value;
	}
	
	
	
	/**
	 * 联系电话
	 */
     @WhereSQL(sql="contact_tel=:TsEmePlanFilingMod_contact_tel")
	public java.lang.String getContact_tel() {
		return this.contact_tel;
	}
		/**
		 * 备案编号
		 */
	public void setBeian_number(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.beian_number = value;
	}
	
	
	
	/**
	 * 备案编号
	 */
     @WhereSQL(sql="beian_number=:TsEmePlanFilingMod_beian_number")
	public java.lang.String getBeian_number() {
		return this.beian_number;
	}
		/**
		 * 补充调整内容 关联到补充调整表
		 */
	public void setAdjustment_id(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.adjustment_id = value;
	}
	
	
	
	/**
	 * 补充调整内容 关联到补充调整表
	 */
     @WhereSQL(sql="adjustment_id=:TsEmePlanFilingMod_adjustment_id")
	public java.lang.String getAdjustment_id() {
		return this.adjustment_id;
	}
		/**
		 * 申请调整或补充理由
		 */
	public void setAdjustment_reason(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.adjustment_reason = value;
	}
	
	
	
	/**
	 * 申请调整或补充理由
	 */
     @WhereSQL(sql="adjustment_reason=:TsEmePlanFilingMod_adjustment_reason")
	public java.lang.String getAdjustment_reason() {
		return this.adjustment_reason;
	}
		/*
	public String getapply_dateString() {
		return DateUtils.convertDate2String(FORMAT_APPLY_DATE, getapply_date());
	}
	public void setapply_dateString(String value) throws ParseException{
		setapply_date(DateUtils.convertString2Date(FORMAT_APPLY_DATE,value));
	}*/
	
		/**
		 * 申请日期
		 */
	public void setApply_date(java.util.Date value) {
		this.apply_date = value;
	}
	
	
	
	/**
	 * 申请日期
	 */
     @WhereSQL(sql="apply_date=:TsEmePlanFilingMod_apply_date")
	public java.util.Date getApply_date() {
		return this.apply_date;
	}
		/**
		 * 单位公章
		 */
	public void setCompany_seal(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.company_seal = value;
	}
	
	
	
	/**
	 * 单位公章
	 */
     @WhereSQL(sql="company_seal=:TsEmePlanFilingMod_company_seal")
	public java.lang.String getCompany_seal() {
		return this.company_seal;
	}
		/**
		 * 公司id
		 */
	public void setCompany_id(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.company_id = value;
	}
	
	
	
	/**
	 * 公司id
	 */
     @WhereSQL(sql="company_id=:TsEmePlanFilingMod_company_id")
	public java.lang.String getCompany_id() {
		return this.company_id;
	}
	@Override
	public String toString() {
		return new StringBuilder()
			.append("id[").append(getId()).append("],")
			.append("公司名称[").append(getCompany_name()).append("],")
			.append("联系[").append(getContact()).append("],")
			.append("联系电话[").append(getContact_tel()).append("],")
			.append("备案编号[").append(getBeian_number()).append("],")
			.append("补充调整内容 关联到补充调整表[").append(getAdjustment_id()).append("],")
			.append("申请调整或补充理由[").append(getAdjustment_reason()).append("],")
			.append("申请日期[").append(getApply_date()).append("],")
			.append("单位公章[").append(getCompany_seal()).append("],")
			.append("公司id[").append(getCompany_id()).append("],")
			.toString();
	}
	@Override
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof TsEmePlanFilingMod == false){
			return false;
		}
			
		if(this == obj){
			return true;
		}
		
		TsEmePlanFilingMod other = (TsEmePlanFilingMod)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

	
