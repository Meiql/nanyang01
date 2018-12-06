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
 * @version  2018-11-05 21:01:39
 * @see org.springrain.nybusiness.ergency.entity.TsEmergencyEquipmentSum
 */
@Table(name="ts_emergency_equipment_sum")
public class TsEmergencyEquipmentSum  extends BaseEntity {
	
	private static final long serialVersionUID = 1L;

	//alias
	/*
	public static final String TABLE_ALIAS = "F2应急救援设施设备汇总表";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_SERIAL_NUMBER = "序号";
	public static final String ALIAS_CATEGORY = "类别";
	public static final String ALIAS_NAME = "名称";
	public static final String ALIAS_QUANTITY = "数量";
	public static final String ALIAS_UNIT = "单位";
	public static final String ALIAS_OUTSIDE_TEL = "外部供应单位联系方式_联络方式";
	public static final String ALIAS_OUTSIDE_PEOPLE = "外部供应单位联系方式_主要联系人";
	public static final String ALIAS_OUTSIDE_COMPANY = "外部供应单位名称";
	public static final String ALIAS_OUT_EQUIPMENT = "设备来源_厂外设备";
	public static final String ALIAS_IN_EQUIPMENT = "设备来源_厂内设备";
	public static final String ALIAS_CREATE_USER = "创建用户";
	public static final String ALIAS_CREATE_TIME = "创建时间";
	public static final String ALIAS_COMPANY_ID = "公司id";
    */
	//date formats
	
	//columns START
	/**
	 * id
	 */
	private java.lang.String id;
	/**
	 * 序号
	 */
	private java.lang.Long serial_number;
	/**
	 * 类别
	 */
	private java.lang.Long category;
	/**
	 * 名称
	 */
	private java.lang.String name;
	/**
	 * 数量
	 */
	private java.lang.Long quantity;
	/**
	 * 单位
	 */
	private java.lang.String unit;
	/**
	 * 外部供应单位联系方式_联络方式
	 */
	private java.lang.String outside_tel;
	/**
	 * 外部供应单位联系方式_主要联系人
	 */
	private java.lang.String outside_people;
	/**
	 * 外部供应单位名称
	 */
	private java.lang.String outside_company;
	/**
	 * 设备来源_厂外设备
	 */
	private java.lang.String out_Equipment;
	/**
	 * 设备来源_厂内设备
	 */
	private java.lang.String in_Equipment;
	/**
	 * 创建用户
	 */
	private java.lang.String create_user;
	/**
	 * 创建时间
	 */
	private java.lang.String create_time;
	/**
	 * 公司id
	 */
	private java.lang.String company_id;
	
	private java.lang.String companyName;
	 @Transient
	public String getCompanyName() {
			return companyName;
	}

	public void setCompanyName(String companyName) {
			this.companyName = companyName;
	}
	//columns END 数据库字段结束
	private java.lang.String bak1;
	public java.lang.String getBak1() {
		return bak1;
	}

	public void setBak1(java.lang.String bak1) {
		this.bak1 = bak1;
	}

	public java.lang.String getBak2() {
		return bak2;
	}

	public void setBak2(java.lang.String bak2) {
		this.bak2 = bak2;
	}

	public java.lang.String getBak3() {
		return bak3;
	}

	public void setBak3(java.lang.String bak3) {
		this.bak3 = bak3;
	}
	private java.lang.String bak2;
	private java.lang.String bak3;
	//concstructor

	public TsEmergencyEquipmentSum(){
	}

	public TsEmergencyEquipmentSum(
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
     @WhereSQL(sql="id=:TsEmergencyEquipmentSum_id")
	public java.lang.String getId() {
		return this.id;
	}
		/**
		 * 序号
		 */
	public void setSerial_number(java.lang.Long value) {
		this.serial_number = value;
	}
	
	
	
	/**
	 * 序号
	 */
     @WhereSQL(sql="serial_number=:TsEmergencyEquipmentSum_serial_number")
	public java.lang.Long getSerial_number() {
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
     @WhereSQL(sql="category=:TsEmergencyEquipmentSum_category")
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
     @WhereSQL(sql="name=:TsEmergencyEquipmentSum_name")
	public java.lang.String getName() {
		return this.name;
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
     @WhereSQL(sql="quantity=:TsEmergencyEquipmentSum_quantity")
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
     @WhereSQL(sql="unit=:TsEmergencyEquipmentSum_unit")
	public java.lang.String getUnit() {
		return this.unit;
	}
		/**
		 * 外部供应单位联系方式_联络方式
		 */
	public void setOutside_tel(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.outside_tel = value;
	}
	
	
	
	/**
	 * 外部供应单位联系方式_联络方式
	 */
     @WhereSQL(sql="outside_tel=:TsEmergencyEquipmentSum_outside_tel")
	public java.lang.String getOutside_tel() {
		return this.outside_tel;
	}
		/**
		 * 外部供应单位联系方式_主要联系人
		 */
	public void setOutside_people(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.outside_people = value;
	}
	
	
	
	/**
	 * 外部供应单位联系方式_主要联系人
	 */
     @WhereSQL(sql="outside_people=:TsEmergencyEquipmentSum_outside_people")
	public java.lang.String getOutside_people() {
		return this.outside_people;
	}
		/**
		 * 外部供应单位名称
		 */
	public void setOutside_company(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.outside_company = value;
	}
	
	
	
	/**
	 * 外部供应单位名称
	 */
     @WhereSQL(sql="outside_company=:TsEmergencyEquipmentSum_outside_company")
	public java.lang.String getOutside_company() {
		return this.outside_company;
	}
		/**
		 * 设备来源_厂外设备
		 */
	public void setOut_Equipment(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.out_Equipment = value;
	}
	
	
	
	/**
	 * 设备来源_厂外设备
	 */
     @WhereSQL(sql="out_Equipment=:TsEmergencyEquipmentSum_out_Equipment")
	public java.lang.String getOut_Equipment() {
		return this.out_Equipment;
	}
		/**
		 * 设备来源_厂内设备
		 */
	public void setIn_Equipment(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.in_Equipment = value;
	}
	
	
	
	/**
	 * 设备来源_厂内设备
	 */
     @WhereSQL(sql="in_Equipment=:TsEmergencyEquipmentSum_in_Equipment")
	public java.lang.String getIn_Equipment() {
		return this.in_Equipment;
	}
		/**
		 * 创建用户
		 */
	public void setCreate_user(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.create_user = value;
	}
	
	
	
	/**
	 * 创建用户
	 */
     @WhereSQL(sql="create_user=:TsEmergencyEquipmentSum_create_user")
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
     @WhereSQL(sql="create_time=:TsEmergencyEquipmentSum_create_time")
	public java.lang.String getCreate_time() {
		return this.create_time;
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
     @WhereSQL(sql="company_id=:TsEmergencyEquipmentSum_company_id")
	public java.lang.String getCompany_id() {
		return this.company_id;
	}
	@Override
	public String toString() {
		return new StringBuilder()
			.append("id[").append(getId()).append("],")
			.append("序号[").append(getSerial_number()).append("],")
			.append("类别[").append(getCategory()).append("],")
			.append("名称[").append(getName()).append("],")
			.append("数量[").append(getQuantity()).append("],")
			.append("单位[").append(getUnit()).append("],")
			.append("外部供应单位联系方式_联络方式[").append(getOutside_tel()).append("],")
			.append("外部供应单位联系方式_主要联系人[").append(getOutside_people()).append("],")
			.append("外部供应单位名称[").append(getOutside_company()).append("],")
			.append("设备来源_厂外设备[").append(getOut_Equipment()).append("],")
			.append("设备来源_厂内设备[").append(getIn_Equipment()).append("],")
			.append("创建用户[").append(getCreate_user()).append("],")
			.append("创建时间[").append(getCreate_time()).append("],")
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
		if(obj instanceof TsEmergencyEquipmentSum == false){
			return false;
		}
			
		if(this == obj){
			return true;
		}
		
		TsEmergencyEquipmentSum other = (TsEmergencyEquipmentSum)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

	
