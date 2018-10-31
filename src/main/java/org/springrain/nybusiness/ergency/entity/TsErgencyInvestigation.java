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
 * @version  2018-10-31 10:30:32
 * @see org.springrain.nybusiness.ergency.entity.TsErgencyInvestigation
 */
@Table(name="ts_ergency_investigation")
public class TsErgencyInvestigation  extends BaseEntity {
	
	private static final long serialVersionUID = 1L;

	//alias
	/*
	public static final String TABLE_ALIAS = "F1应急资源现状调查表";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_SERIAL_NUMBER = "serial_number";
	public static final String ALIAS_CATEGORY = "category";
	public static final String ALIAS_NAME = "name";
	public static final String ALIAS_TYPE_SPECIFICATIONS = "type_Specifications";
	public static final String ALIAS_QUANTITY = "quantity";
	public static final String ALIAS_UNIT = "unit";
	public static final String ALIAS_PLACE = "place";
	public static final String ALIAS_CUSTODIAN_OR_POST = "custodian_or_post";
	public static final String ALIAS_USER_OR_POSTS = "user_or_posts";
	public static final String ALIAS_FINAL_VALIDITY_TIME = "final_validity_time";
	public static final String ALIAS_REMARKS = "remarks";
	public static final String ALIAS_COMPANY_ID = "公司id";
    */
	//date formats
	//public static final String FORMAT_FINAL_VALIDITY_TIME = DateUtils.DATETIME_FORMAT;
	
	//columns START
	/**
	 * id
	 */
	private java.lang.Long id;
	/**
	 * serial_number
	 */
	private java.lang.String serial_number;
	/**
	 * category
	 */
	private java.lang.Long category;
	/**
	 * name
	 */
	private java.lang.String name;
	/**
	 * type_Specifications
	 */
	private java.lang.String type_Specifications;
	/**
	 * quantity
	 */
	private java.lang.Long quantity;
	/**
	 * unit
	 */
	private java.lang.String unit;
	/**
	 * place
	 */
	private java.lang.String place;
	/**
	 * custodian_or_post
	 */
	private java.lang.String custodian_or_post;
	/**
	 * user_or_posts
	 */
	private java.lang.String user_or_posts;
	/**
	 * final_validity_time
	 */
	private java.util.Date final_validity_time;
	/**
	 * remarks
	 */
	private java.lang.String remarks;
	/**
	 * 公司id
	 */
	private java.lang.String company_id;
	//columns END 数据库字段结束
	
	//concstructor

	public TsErgencyInvestigation(){
	}

	public TsErgencyInvestigation(
		java.lang.Long id
	){
		this.id = id;
	}

	//get and set
		/**
		 * id
		 */
	public void setId(java.lang.Long value) {
		this.id = value;
	}
	
	
	
	/**
	 * id
	 */
	@Id
     @WhereSQL(sql="id=:TsErgencyInvestigation_id")
	public java.lang.Long getId() {
		return this.id;
	}
		/**
		 * serial_number
		 */
	public void setSerial_number(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.serial_number = value;
	}
	
	
	
	/**
	 * serial_number
	 */
     @WhereSQL(sql="serial_number=:TsErgencyInvestigation_serial_number")
	public java.lang.String getSerial_number() {
		return this.serial_number;
	}
		/**
		 * category
		 */
	public void setCategory(java.lang.Long value) {
		this.category = value;
	}
	
	
	
	/**
	 * category
	 */
     @WhereSQL(sql="category=:TsErgencyInvestigation_category")
	public java.lang.Long getCategory() {
		return this.category;
	}
		/**
		 * name
		 */
	public void setName(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.name = value;
	}
	
	
	
	/**
	 * name
	 */
     @WhereSQL(sql="name=:TsErgencyInvestigation_name")
	public java.lang.String getName() {
		return this.name;
	}
		/**
		 * type_Specifications
		 */
	public void setType_Specifications(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.type_Specifications = value;
	}
	
	
	
	/**
	 * type_Specifications
	 */
     @WhereSQL(sql="type_Specifications=:TsErgencyInvestigation_type_Specifications")
	public java.lang.String getType_Specifications() {
		return this.type_Specifications;
	}
		/**
		 * quantity
		 */
	public void setQuantity(java.lang.Long value) {
		this.quantity = value;
	}
	
	
	
	/**
	 * quantity
	 */
     @WhereSQL(sql="quantity=:TsErgencyInvestigation_quantity")
	public java.lang.Long getQuantity() {
		return this.quantity;
	}
		/**
		 * unit
		 */
	public void setUnit(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.unit = value;
	}
	
	
	
	/**
	 * unit
	 */
     @WhereSQL(sql="unit=:TsErgencyInvestigation_unit")
	public java.lang.String getUnit() {
		return this.unit;
	}
		/**
		 * place
		 */
	public void setPlace(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.place = value;
	}
	
	
	
	/**
	 * place
	 */
     @WhereSQL(sql="place=:TsErgencyInvestigation_place")
	public java.lang.String getPlace() {
		return this.place;
	}
		/**
		 * custodian_or_post
		 */
	public void setCustodian_or_post(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.custodian_or_post = value;
	}
	
	
	
	/**
	 * custodian_or_post
	 */
     @WhereSQL(sql="custodian_or_post=:TsErgencyInvestigation_custodian_or_post")
	public java.lang.String getCustodian_or_post() {
		return this.custodian_or_post;
	}
		/**
		 * user_or_posts
		 */
	public void setUser_or_posts(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.user_or_posts = value;
	}
	
	
	
	/**
	 * user_or_posts
	 */
     @WhereSQL(sql="user_or_posts=:TsErgencyInvestigation_user_or_posts")
	public java.lang.String getUser_or_posts() {
		return this.user_or_posts;
	}
		/*
	public String getfinal_validity_timeString() {
		return DateUtils.convertDate2String(FORMAT_FINAL_VALIDITY_TIME, getfinal_validity_time());
	}
	public void setfinal_validity_timeString(String value) throws ParseException{
		setfinal_validity_time(DateUtils.convertString2Date(FORMAT_FINAL_VALIDITY_TIME,value));
	}*/
	
		/**
		 * final_validity_time
		 */
	public void setFinal_validity_time(java.util.Date value) {
		this.final_validity_time = value;
	}
	
	
	
	/**
	 * final_validity_time
	 */
     @WhereSQL(sql="final_validity_time=:TsErgencyInvestigation_final_validity_time")
	public java.util.Date getFinal_validity_time() {
		return this.final_validity_time;
	}
		/**
		 * remarks
		 */
	public void setRemarks(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.remarks = value;
	}
	
	
	
	/**
	 * remarks
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
	@Override
	public String toString() {
		return new StringBuilder()
			.append("id[").append(getId()).append("],")
			.append("serial_number[").append(getSerial_number()).append("],")
			.append("category[").append(getCategory()).append("],")
			.append("name[").append(getName()).append("],")
			.append("type_Specifications[").append(getType_Specifications()).append("],")
			.append("quantity[").append(getQuantity()).append("],")
			.append("unit[").append(getUnit()).append("],")
			.append("place[").append(getPlace()).append("],")
			.append("custodian_or_post[").append(getCustodian_or_post()).append("],")
			.append("user_or_posts[").append(getUser_or_posts()).append("],")
			.append("final_validity_time[").append(getFinal_validity_time()).append("],")
			.append("remarks[").append(getRemarks()).append("],")
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

	
