package org.springrain.nybusiness.ergency.entity;

import java.text.ParseException;
import java.util.List;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import org.springrain.frame.annotation.WhereSQL;
import org.springrain.frame.entity.BaseEntity;
/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-11-08 21:32:38
 * @see org.springrain.nybusiness.ergency.entity.TsEmePlanFilingMod
 */
@Table(name="ts_eme_plan_filing_mod")
public class TsEmePlanFilingMod  extends BaseEntity {
	
	private static final long serialVersionUID = 1L;

	//alias
	/*
	public static final String TABLE_ALIAS = "环境应急预案变更备案表";
	public static final String ALIAS_ID = "主键id";
	public static final String ALIAS_COMPANY_NAME = "公司名称";
	public static final String ALIAS_CONTACT = "联系";
	public static final String ALIAS_CONTACT_TEL = "联系电话";
	public static final String ALIAS_BEIAN_NUMBER = "备案编号";
	public static final String ALIAS_ADJUSTMENT_ID = "补充调整内容 关联到补充调整表";
	public static final String ALIAS_ADJUSTMENT_REASON = "申请调整或补充理由";
	public static final String ALIAS_APPLY_DATE = "申请日期";
	public static final String ALIAS_COMPANY_SEAL = "单位公章";
	public static final String ALIAS_COMPANY_ID = "公司id";
	public static final String ALIAS_CREATE_USER = "创建人";
	public static final String ALIAS_CREATE_TIME = "创建时间";
	public static final String ALIAS_BAK1 = "bak1";
	public static final String ALIAS_BAK2 = "bak2";
	public static final String ALIAS_BAK3 = "bak3";
    */
	//date formats
	//public static final String FORMAT_APPLY_DATE = DateUtils.DATETIME_FORMAT;
	
	//columns START
	@Transient
	private List<TsEmePlanFilAdjustment> filadjustment;
	
	/**
	 * 主键id
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
	/**
	 * 创建人
	 */
	private java.lang.String create_user;
	/**
	 * 创建时间
	 */
	private java.lang.String create_time;
	/**
	 * bak1
	 */
	private java.lang.String bak1;
	/**
	 * bak2
	 */
	private java.lang.String bak2;
	/**
	 * bak3
	 */
	private java.lang.String bak3;
	//columns END 数据库字段结束
	
	//concstructor
	@Transient
	public List<TsEmePlanFilAdjustment> getFiladjustment() {
		return filadjustment;
	}
	@Transient
	public void setFiladjustment(List<TsEmePlanFilAdjustment> filadjustment) {
		this.filadjustment = filadjustment;
	}
	public TsEmePlanFilingMod(){
	}

	public TsEmePlanFilingMod(
		java.lang.String id
	){
		this.id = id;
	}

	//get and set
		/**
		 * 主键id
		 */
	public void setId(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.id = value;
	}
	
	
	
	/**
	 * 主键id
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
		/**
		 * 创建人
		 */
	public void setCreate_user(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.create_user = value;
	}
	
	
	
	/**
	 * 创建人
	 */
     @WhereSQL(sql="create_user=:TsEmePlanFilingMod_create_user")
	public java.lang.String getCreate_user() {
		return this.create_user;
	}
		/**
		 * 创建时间
		 */
	public void setCreate_time(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.create_time = value;
	}
	
	
	
	/**
	 * 创建时间
	 */
     @WhereSQL(sql="create_time=:TsEmePlanFilingMod_create_time")
	public java.lang.String getCreate_time() {
		return this.create_time;
	}
		/**
		 * bak1
		 */
	public void setBak1(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.bak1 = value;
	}
	
	
	
	/**
	 * bak1
	 */
     @WhereSQL(sql="bak1=:TsEmePlanFilingMod_bak1")
	public java.lang.String getBak1() {
		return this.bak1;
	}
		/**
		 * bak2
		 */
	public void setBak2(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.bak2 = value;
	}
	
	
	
	/**
	 * bak2
	 */
     @WhereSQL(sql="bak2=:TsEmePlanFilingMod_bak2")
	public java.lang.String getBak2() {
		return this.bak2;
	}
		/**
		 * bak3
		 */
	public void setBak3(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.bak3 = value;
	}
	
	
	
	/**
	 * bak3
	 */
     @WhereSQL(sql="bak3=:TsEmePlanFilingMod_bak3")
	public java.lang.String getBak3() {
		return this.bak3;
	}
	@Override
	public String toString() {
		return new StringBuilder()
			.append("主键id[").append(getId()).append("],")
			.append("公司名称[").append(getCompany_name()).append("],")
			.append("联系[").append(getContact()).append("],")
			.append("联系电话[").append(getContact_tel()).append("],")
			.append("备案编号[").append(getBeian_number()).append("],")
			.append("补充调整内容 关联到补充调整表[").append(getAdjustment_id()).append("],")
			.append("申请调整或补充理由[").append(getAdjustment_reason()).append("],")
			.append("申请日期[").append(getApply_date()).append("],")
			.append("单位公章[").append(getCompany_seal()).append("],")
			.append("公司id[").append(getCompany_id()).append("],")
			.append("创建人[").append(getCreate_user()).append("],")
			.append("创建时间[").append(getCreate_time()).append("],")
			.append("bak1[").append(getBak1()).append("],")
			.append("bak2[").append(getBak2()).append("],")
			.append("bak3[").append(getBak3()).append("],")
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

	
