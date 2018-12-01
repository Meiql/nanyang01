package org.springrain.nybusiness.facility.entity;

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
 * @version  2018-11-28 16:52:21
 * @see org.springrain.nybusiness.company.entity.TsFacilityInfo
 */
@Table(name="ts_facility_info")
public class TsFacilityInfo  extends BaseEntity {
	
	private static final long serialVersionUID = 1L;

	//alias
	/*
	public static final String TABLE_ALIAS = "设备信息";
	public static final String ALIAS_ID = "主键";
	public static final String ALIAS_DEVICENUMBER = "浓度检测设备编号";
	public static final String ALIAS_CREATEUSER = "创建人";
	public static final String ALIAS_CREATETIME = "创建时间";
	public static final String ALIAS_REMARKS = "remarks";
	public static final String ALIAS_COMPANYID = "companyId";
	public static final String ALIAS_BAK1 = "bak1";
	public static final String ALIAS_BAK2 = "bak2";
	public static final String ALIAS_BAK3 = "bak3";
    */
	//date formats
	
	//columns START
	/**
	 * 主键
	 */
	private java.lang.String id;
	/**
	 * 浓度检测设备编号
	 */
	private java.lang.String deviceNumber;
	/**
	 * 位置
	 */
	private java.lang.String address;
	/**
	 * 创建人
	 */
	private java.lang.String createUser;
	/**
	 * 创建时间
	 */
	private java.lang.String createTime;
	/**
	 * remarks
	 */
	private java.lang.String remarks;
	/**
	 * companyId
	 */
	private java.lang.String companyId;
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

	public TsFacilityInfo(){
	}

	public TsFacilityInfo(
		java.lang.String id
	){
		this.id = id;
	}

	//get and set
		/**
		 * 主键
		 */
	public void setId(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.id = value;
	}
	
	
	
	/**
	 * 主键
	 */
	@Id
     @WhereSQL(sql="id=:TsFacilityInfo_id")
	public java.lang.String getId() {
		return this.id;
	}
		/**
		 * 浓度检测设备编号
		 */
	public void setDeviceNumber(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.deviceNumber = value;
	}
	
	
	
	/**
	 * 浓度检测设备编号
	 */
     @WhereSQL(sql="deviceNumber=:TsFacilityInfo_deviceNumber")
	public java.lang.String getDeviceNumber() {
		return this.deviceNumber;
	}
     
     /**
		 * 位置
		 */
	public void setAddress(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.address = value;
	}
	/**
	 * 位置
	 */
     @WhereSQL(sql="adress=:TsFacilityInfo_address")
	public java.lang.String getAddress() {
		return this.address;
	}
     
		/**
		 * 创建人
		 */
	public void setCreateUser(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.createUser = value;
	}
	
	
	
	/**
	 * 创建人
	 */
     @WhereSQL(sql="createUser=:TsFacilityInfo_createUser")
	public java.lang.String getCreateUser() {
		return this.createUser;
	}
		/**
		 * 创建时间
		 */
	public void setCreateTime(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.createTime = value;
	}
	
	
	
	/**
	 * 创建时间
	 */
     @WhereSQL(sql="createTime=:TsFacilityInfo_createTime")
	public java.lang.String getCreateTime() {
		return this.createTime;
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
     @WhereSQL(sql="remarks=:TsFacilityInfo_remarks")
	public java.lang.String getRemarks() {
		return this.remarks;
	}
		/**
		 * companyId
		 */
	public void setCompanyId(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.companyId = value;
	}
	
	
	
	/**
	 * companyId
	 */
     @WhereSQL(sql="companyId=:TsFacilityInfo_companyId")
	public java.lang.String getCompanyId() {
		return this.companyId;
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
     @WhereSQL(sql="bak1=:TsFacilityInfo_bak1")
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
     @WhereSQL(sql="bak2=:TsFacilityInfo_bak2")
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
     @WhereSQL(sql="bak3=:TsFacilityInfo_bak3")
	public java.lang.String getBak3() {
		return this.bak3;
	}
	@Override
	public String toString() {
		return new StringBuilder()
			.append("主键[").append(getId()).append("],")
			.append("浓度检测设备编号[").append(getDeviceNumber()).append("],")
			.append("位置[").append(getAddress()).append("],")
			.append("创建人[").append(getCreateUser()).append("],")
			.append("创建时间[").append(getCreateTime()).append("],")
			.append("remarks[").append(getRemarks()).append("],")
			.append("companyId[").append(getCompanyId()).append("],")
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
		if(obj instanceof TsFacilityInfo == false){
			return false;
		}
			
		if(this == obj){
			return true;
		}
		
		TsFacilityInfo other = (TsFacilityInfo)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

	
