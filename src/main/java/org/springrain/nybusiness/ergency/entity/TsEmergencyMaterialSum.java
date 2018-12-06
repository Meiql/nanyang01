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
 * @version  2018-11-05 21:18:49
 * @see org.springrain.nybusiness.ergency.entity.TsEmergencyMaterialSum
 */
@Table(name="ts_emergency_material_sum")
public class TsEmergencyMaterialSum  extends BaseEntity {
	
	private static final long serialVersionUID = 1L;

	//alias
	/*
	public static final String TABLE_ALIAS = "F3应急救援物资汇总表";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_SERIAL_NUMBER = "serial_number";
	public static final String ALIAS_MEATERIAL_NAME = "物资名称";
	public static final String ALIAS_QUANTITY = "quantity";
	public static final String ALIAS_UNIT = "单位";
	public static final String ALIAS_IN_EQUIPMENT = "设备来源-厂内设备";
	public static final String ALIAS_OUTSIDE_TEL = "外部供应单位主要联系方式";
	public static final String ALIAS_OUTSIDE_PEOPLE = "外部供应单位主要联系人";
	public static final String ALIAS_OUTSIDE_COMPANY = "外部供应单位名称";
	public static final String ALIAS_OUT_EQUIPMENT = "设备来源-外部供应";
	public static final String ALIAS_CREATE_USER = "创建用户";
	public static final String ALIAS_CREATE_TIME = "创建时间";
	public static final String ALIAS_COMPANY_ID = "公司id";
	public static final String ALIAS_BAK1 = "bak1";
	public static final String ALIAS_BAK2 = "bak2";
	public static final String ALIAS_BAK3 = "bak3";
    */
	//date formats
	
	//columns START
	@Transient
	private java.lang.String table_from;
	@Transient
	public java.lang.String getTable_from() {
		return table_from;
	}
	@Transient
	public void setTable_from(java.lang.String table_from) {
		this.table_from = table_from;
	}
	@Transient
	private java.lang.String name;
	@Transient
	public java.lang.String getName() {
		return name;
	}
	@Transient
	public void setName(java.lang.String name) {
		this.name = name;
	}
	private java.lang.String companyName;
	 @Transient
	public String getCompanyName() {
			return companyName;
	}

	public void setCompanyName(String companyName) {
			this.companyName = companyName;
	}
	/**
	 * id
	 */
	private java.lang.String id;
	/**
	 * serial_number
	 */
	private java.lang.Long serial_number;
	/**
	 * 物资名称
	 */
	private java.lang.String meaterial_name;
	/**
	 * quantity
	 */
	private java.lang.Long quantity;
	/**
	 * 单位
	 */
	private java.lang.String unit;
	/**
	 * 设备来源-厂内设备
	 */
	private java.lang.String in_Equipment;
	/**
	 * 外部供应单位主要联系方式
	 */
	private java.lang.String outside_tel;
	/**
	 * 外部供应单位主要联系人
	 */
	private java.lang.String outside_people;
	/**
	 * 外部供应单位名称
	 */
	private java.lang.String outside_company;
	/**
	 * 设备来源-外部供应
	 */
	private java.lang.String out_equipment;
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

	public TsEmergencyMaterialSum(){
	}

	public TsEmergencyMaterialSum(
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
     @WhereSQL(sql="id=:TsEmergencyMaterialSum_id")
	public java.lang.String getId() {
		return this.id;
	}
		/**
		 * serial_number
		 */
	public void setSerial_number(java.lang.Long value) {
		this.serial_number = value;
	}
	
	
	
	/**
	 * serial_number
	 */
     @WhereSQL(sql="serial_number=:TsEmergencyMaterialSum_serial_number")
	public java.lang.Long getSerial_number() {
		return this.serial_number;
	}
		/**
		 * 物资名称
		 */
	public void setMeaterial_name(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.meaterial_name = value;
	}
	
	
	
	/**
	 * 物资名称
	 */
     @WhereSQL(sql="meaterial_name=:TsEmergencyMaterialSum_meaterial_name")
	public java.lang.String getMeaterial_name() {
		return this.meaterial_name;
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
     @WhereSQL(sql="quantity=:TsEmergencyMaterialSum_quantity")
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
     @WhereSQL(sql="unit=:TsEmergencyMaterialSum_unit")
	public java.lang.String getUnit() {
		return this.unit;
	}
		/**
		 * 设备来源-厂内设备
		 */
	public void setIn_Equipment(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.in_Equipment = value;
	}
	
	
	
	/**
	 * 设备来源-厂内设备
	 */
     @WhereSQL(sql="in_Equipment=:TsEmergencyMaterialSum_in_Equipment")
	public java.lang.String getIn_Equipment() {
		return this.in_Equipment;
	}
		/**
		 * 外部供应单位主要联系方式
		 */
	public void setOutside_tel(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.outside_tel = value;
	}
	
	
	
	/**
	 * 外部供应单位主要联系方式
	 */
     @WhereSQL(sql="outside_tel=:TsEmergencyMaterialSum_outside_tel")
	public java.lang.String getOutside_tel() {
		return this.outside_tel;
	}
		/**
		 * 外部供应单位主要联系人
		 */
	public void setOutside_people(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.outside_people = value;
	}
	
	
	
	/**
	 * 外部供应单位主要联系人
	 */
     @WhereSQL(sql="outside_people=:TsEmergencyMaterialSum_outside_people")
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
     @WhereSQL(sql="outside_company=:TsEmergencyMaterialSum_outside_company")
	public java.lang.String getOutside_company() {
		return this.outside_company;
	}
		/**
		 * 设备来源-外部供应
		 */
	public void setOut_equipment(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.out_equipment = value;
	}
	
	
	
	/**
	 * 设备来源-外部供应
	 */
     @WhereSQL(sql="out_equipment=:TsEmergencyMaterialSum_out_equipment")
	public java.lang.String getOut_equipment() {
		return this.out_equipment;
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
     @WhereSQL(sql="create_user=:TsEmergencyMaterialSum_create_user")
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
     @WhereSQL(sql="create_time=:TsEmergencyMaterialSum_create_time")
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
     @WhereSQL(sql="company_id=:TsEmergencyMaterialSum_company_id")
	public java.lang.String getCompany_id() {
		return this.company_id;
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
     @WhereSQL(sql="bak1=:TsEmergencyMaterialSum_bak1")
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
     @WhereSQL(sql="bak2=:TsEmergencyMaterialSum_bak2")
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
     @WhereSQL(sql="bak3=:TsEmergencyMaterialSum_bak3")
	public java.lang.String getBak3() {
		return this.bak3;
	}
	@Override
	public String toString() {
		return new StringBuilder()
			.append("id[").append(getId()).append("],")
			.append("serial_number[").append(getSerial_number()).append("],")
			.append("物资名称[").append(getMeaterial_name()).append("],")
			.append("quantity[").append(getQuantity()).append("],")
			.append("单位[").append(getUnit()).append("],")
			.append("设备来源-厂内设备[").append(getIn_Equipment()).append("],")
			.append("外部供应单位主要联系方式[").append(getOutside_tel()).append("],")
			.append("外部供应单位主要联系人[").append(getOutside_people()).append("],")
			.append("外部供应单位名称[").append(getOutside_company()).append("],")
			.append("设备来源-外部供应[").append(getOut_equipment()).append("],")
			.append("创建用户[").append(getCreate_user()).append("],")
			.append("创建时间[").append(getCreate_time()).append("],")
			.append("公司id[").append(getCompany_id()).append("],")
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
		if(obj instanceof TsEmergencyMaterialSum == false){
			return false;
		}
			
		if(this == obj){
			return true;
		}
		
		TsEmergencyMaterialSum other = (TsEmergencyMaterialSum)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

	
