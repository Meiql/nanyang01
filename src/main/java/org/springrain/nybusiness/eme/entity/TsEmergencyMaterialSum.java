package org.springrain.nybusiness.eme.entity;

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
 * @version  2018-10-27 09:32:26
 * @see org.springrain.nybusiness.eme.entity.TsEmergencyMaterialSum
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
    */
	//date formats
	
	//columns START
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

	
