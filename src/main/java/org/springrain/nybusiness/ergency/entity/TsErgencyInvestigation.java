package org.springrain.nybusiness.ergency.entity;

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
 * @version  2018-11-05 16:24:44
 * @see org.springrain.nybusiness.ergency.entity.TsErgencyInvestigation
 */
@Table(name="ts_ergency_investigation")
public class TsErgencyInvestigation  extends BaseEntity {
	
	private static final long serialVersionUID = 1L;

	//alias
	/*
	public static final String TABLE_ALIAS = "F1应急资源现状调查表";
	public static final String ALIAS_ID = "主键id";
	public static final String ALIAS_SERIAL_NUMBER = "序号";
	public static final String ALIAS_CATEGORY = "类别";
	public static final String ALIAS_NAME = "名称";
	public static final String ALIAS_TYPE_SPECIFICATIONS = "型号或规格";
	public static final String ALIAS_QUANTITY = "数量";
	public static final String ALIAS_UNIT = "单位";
	public static final String ALIAS_PLACE = "位置";
	public static final String ALIAS_CUSTODIAN_OR_POST = "保管人员或岗位";
	public static final String ALIAS_USER_OR_POSTS = "使用人员或岗位";
	public static final String ALIAS_FINAL_VALIDITY_TIME = "最后有效期限";
	public static final String ALIAS_REMARKS = "备注";
	public static final String ALIAS_COMPANY_ID = "公司id";
	public static final String ALIAS_CREATE_USER = "创建人";
	public static final String ALIAS_CREATE_TIME = "创建时间";
	public static final String ALIAS_BAK1 = "bak1";
	public static final String ALIAS_BAK2 = "bak2";
    */
	//date formats
	
	//columns START
	/**
	 * 主键id
	 */
	private java.lang.String id;
	/**
	 * 序号
	 */
	private java.lang.String serial_number;
	/**
	 * 类别
	 */
	private java.lang.Long category;
	/**
	 * 名称
	 */
	private java.lang.String name;
	/**
	 * 型号或规格
	 */
	private java.lang.String type_Specifications;
	/**
	 * 数量
	 */
	private java.lang.Long quantity;
	/**
	 * 单位
	 */
	private java.lang.String unit;
	/**
	 * 位置
	 */
	private java.lang.String place;
	/**
	 * 保管人员或岗位
	 */
	private java.lang.String custodian_or_post;
	/**
	 * 使用人员或岗位
	 */
	private java.lang.String user_or_posts;
	/**
	 * 最后有效期限
	 */
	private java.lang.String final_validity_time;
	/**
	 * 备注
	 */
	private java.lang.String remarks;
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
	//columns END 数据库字段结束
	
	private java.lang.String companyName;
	 @Transient
		public String getCompanyName() {
			return companyName;
		}

		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}
	//concstructor

	public TsErgencyInvestigation(){
	}

	public TsErgencyInvestigation(
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
     @WhereSQL(sql="id=:TsErgencyInvestigation_id")
	public java.lang.String getId() {
		return this.id;
	}
		/**
		 * 序号
		 */
	public void setSerial_number(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.serial_number = value;
	}
	
	
	
	/**
	 * 序号
	 */
     @WhereSQL(sql="serial_number=:TsErgencyInvestigation_serial_number")
	public java.lang.String getSerial_number() {
		return this.serial_number;
	}
		/**
		 * 类别
		 */
	public void setCategory(java.lang.Long value) {
		this.category = value;
	}
	
	
	
	/**
	 * 类别
	 */
     @WhereSQL(sql="category=:TsErgencyInvestigation_category")
	public java.lang.Long getCategory() {
		return this.category;
	}
		/**
		 * 名称
		 */
	public void setName(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.name = value;
	}
	
	
	
	/**
	 * 名称
	 */
     @WhereSQL(sql="name=:TsErgencyInvestigation_name")
	public java.lang.String getName() {
		return this.name;
	}
		/**
		 * 型号或规格
		 */
	public void setType_Specifications(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.type_Specifications = value;
	}
	
	
	
	/**
	 * 型号或规格
	 */
     @WhereSQL(sql="type_Specifications=:TsErgencyInvestigation_type_Specifications")
	public java.lang.String getType_Specifications() {
		return this.type_Specifications;
	}
		/**
		 * 数量
		 */
	public void setQuantity(java.lang.Long value) {
		this.quantity = value;
	}
	
	
	
	/**
	 * 数量
	 */
     @WhereSQL(sql="quantity=:TsErgencyInvestigation_quantity")
	public java.lang.Long getQuantity() {
		return this.quantity;
	}
		/**
		 * 单位
		 */
	public void setUnit(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.unit = value;
	}
	
	
	
	/**
	 * 单位
	 */
     @WhereSQL(sql="unit=:TsErgencyInvestigation_unit")
	public java.lang.String getUnit() {
		return this.unit;
	}
		/**
		 * 位置
		 */
	public void setPlace(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.place = value;
	}
	
	
	
	/**
	 * 位置
	 */
     @WhereSQL(sql="place=:TsErgencyInvestigation_place")
	public java.lang.String getPlace() {
		return this.place;
	}
		/**
		 * 保管人员或岗位
		 */
	public void setCustodian_or_post(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.custodian_or_post = value;
	}
	
	
	
	/**
	 * 保管人员或岗位
	 */
     @WhereSQL(sql="custodian_or_post=:TsErgencyInvestigation_custodian_or_post")
	public java.lang.String getCustodian_or_post() {
		return this.custodian_or_post;
	}
		/**
		 * 使用人员或岗位
		 */
	public void setUser_or_posts(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.user_or_posts = value;
	}
	
	
	
	/**
	 * 使用人员或岗位
	 */
     @WhereSQL(sql="user_or_posts=:TsErgencyInvestigation_user_or_posts")
	public java.lang.String getUser_or_posts() {
		return this.user_or_posts;
	}
		/**
		 * 最后有效期限
		 */
	public void setFinal_validity_time(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.final_validity_time = value;
	}
	
	
	
	/**
	 * 最后有效期限
	 */
     @WhereSQL(sql="final_validity_time=:TsErgencyInvestigation_final_validity_time")
	public java.lang.String getFinal_validity_time() {
		return this.final_validity_time;
	}
		/**
		 * 备注
		 */
	public void setRemarks(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.remarks = value;
	}
	
	
	
	/**
	 * 备注
	 */
     @WhereSQL(sql="remarks=:TsErgencyInvestigation_remarks")
	public java.lang.String getRemarks() {
		return this.remarks;
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
     @WhereSQL(sql="company_id=:TsErgencyInvestigation_company_id")
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
     @WhereSQL(sql="create_user=:TsErgencyInvestigation_create_user")
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
     @WhereSQL(sql="create_time=:TsErgencyInvestigation_create_time")
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
     @WhereSQL(sql="bak1=:TsErgencyInvestigation_bak1")
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
     @WhereSQL(sql="bak2=:TsErgencyInvestigation_bak2")
	public java.lang.String getBak2() {
		return this.bak2;
	}
	@Override
	public String toString() {
		return new StringBuilder()
			.append("主键id[").append(getId()).append("],")
			.append("序号[").append(getSerial_number()).append("],")
			.append("类别[").append(getCategory()).append("],")
			.append("名称[").append(getName()).append("],")
			.append("型号或规格[").append(getType_Specifications()).append("],")
			.append("数量[").append(getQuantity()).append("],")
			.append("单位[").append(getUnit()).append("],")
			.append("位置[").append(getPlace()).append("],")
			.append("保管人员或岗位[").append(getCustodian_or_post()).append("],")
			.append("使用人员或岗位[").append(getUser_or_posts()).append("],")
			.append("最后有效期限[").append(getFinal_validity_time()).append("],")
			.append("备注[").append(getRemarks()).append("],")
			.append("公司id[").append(getCompany_id()).append("],")
			.append("创建人[").append(getCreate_user()).append("],")
			.append("创建时间[").append(getCreate_time()).append("],")
			.append("bak1[").append(getBak1()).append("],")
			.append("bak2[").append(getBak2()).append("],")
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
		if(obj instanceof TsErgencyInvestigation == false){
			return false;
		}
			
		if(this == obj){
			return true;
		}
		
		TsErgencyInvestigation other = (TsErgencyInvestigation)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

	
