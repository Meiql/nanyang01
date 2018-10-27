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
 * @version  2018-10-27 09:32:11
 * @see org.springrain.nybusiness.eme.entity.TsEmergencyEquipmentSum
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
	//columns END 数据库字段结束
	
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

	
