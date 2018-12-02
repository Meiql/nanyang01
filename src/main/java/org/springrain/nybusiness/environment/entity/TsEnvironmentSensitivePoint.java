package org.springrain.nybusiness.environment.entity;

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
 * @version  2018-10-27 10:25:22
 * @see org.springrain.nybusiness.environment.entity.TsEnvironmentSensitivePoint
 */
@Table(name="ts_environment_sensitive_point")
public class TsEnvironmentSensitivePoint  extends BaseEntity {
	
	private static final long serialVersionUID = 1L;

	//alias
	/*
	public static final String TABLE_ALIAS = "周边环境敏感点分布";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_ENVIRELEMENTID = "环境要素id";
	public static final String ALIAS_ENVIRELEMENTNAME = "环境要素名称";
	public static final String ALIAS_RING = "环";
	public static final String ALIAS_POSITION = "方位";
	public static final String ALIAS_DISTANCE = "距离";
	public static final String ALIAS_SCALE = "规模";
	public static final String ALIAS_LONGITUDE = "经度";
	public static final String ALIAS_LATITUDE = "纬度";
	public static final String ALIAS_CREATEUSER = "createUser";
	public static final String ALIAS_CREATETIME = "createTime";
	public static final String ALIAS_REMARKS = "remarks";
	public static final String ALIAS_COMPANYID = "companyId";
	public static final String ALIAS_BAK1 = "bak1";
	public static final String ALIAS_BAK2 = "bak2";
	public static final String ALIAS_BAK3 = "bak3";
    */
	//date formats
	
	//columns START
	/**
	 * id
	 */
	private java.lang.String id;
	/**
	 * 环境要素id
	 */
	private java.lang.String envirElementId;
	/**
	 * 环境要素名称
	 */
	private java.lang.String envirElementName;
	/**
	 * 环
	 */
	private java.lang.String ring;
	/**
	 * 方位
	 */
	private java.lang.String position;
	/**
	 * 距离
	 */
	private java.lang.String distance;
	/**
	 * 规模
	 */
	private java.lang.String scale;
	/**
	 * 经度
	 */
	private java.lang.String longitude;
	/**
	 * 纬度
	 */
	private java.lang.String latitude;
	/**
	 * createUser
	 */
	private java.lang.String createUser;
	/**
	 * createTime
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
	 * createUserName
	 */
	private java.lang.String createUserName;
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

	public TsEnvironmentSensitivePoint(){
	}

	public TsEnvironmentSensitivePoint(
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
     @WhereSQL(sql="id=:TsEnvironmentSensitivePoint_id")
	public java.lang.String getId() {
		return this.id;
	}
		/**
		 * 环境要素id
		 */
	public void setEnvirElementId(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.envirElementId = value;
	}
	
	
	
	/**
	 * 环境要素id
	 */
     @WhereSQL(sql="envirElementId=:TsEnvironmentSensitivePoint_envirElementId")
	public java.lang.String getEnvirElementId() {
		return this.envirElementId;
	}
		/**
		 * 环境要素名称
		 */
	public void setEnvirElementName(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.envirElementName = value;
	}
	
	
	
	/**
	 * 环境要素名称
	 */
     @WhereSQL(sql="envirElementName=:TsEnvironmentSensitivePoint_envirElementName")
	public java.lang.String getEnvirElementName() {
		return this.envirElementName;
	}
		/**
		 * 环
		 */
	public void setRing(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.ring = value;
	}
	
	
	
	/**
	 * 环
	 */
     @WhereSQL(sql="ring=:TsEnvironmentSensitivePoint_ring")
	public java.lang.String getRing() {
		return this.ring;
	}
		/**
		 * 方位
		 */
	public void setPosition(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.position = value;
	}
	
	
	
	/**
	 * 方位
	 */
     @WhereSQL(sql="position=:TsEnvironmentSensitivePoint_position")
	public java.lang.String getPosition() {
		return this.position;
	}
		/**
		 * 距离
		 */
	public void setDistance(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.distance = value;
	}
	
	
	
	/**
	 * 距离
	 */
     @WhereSQL(sql="distance=:TsEnvironmentSensitivePoint_distance")
	public java.lang.String getDistance() {
		return this.distance;
	}
		/**
		 * 规模
		 */
	public void setScale(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.scale = value;
	}
	
	
	
	/**
	 * 规模
	 */
     @WhereSQL(sql="scale=:TsEnvironmentSensitivePoint_scale")
	public java.lang.String getScale() {
		return this.scale;
	}
		/**
		 * 经度
		 */
	public void setLongitude(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.longitude = value;
	}
	
	
	
	/**
	 * 经度
	 */
     @WhereSQL(sql="longitude=:TsEnvironmentSensitivePoint_longitude")
	public java.lang.String getLongitude() {
		return this.longitude;
	}
		/**
		 * 纬度
		 */
	public void setLatitude(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.latitude = value;
	}
	
	
	
	/**
	 * 纬度
	 */
     @WhereSQL(sql="latitude=:TsEnvironmentSensitivePoint_latitude")
	public java.lang.String getLatitude() {
		return this.latitude;
	}
		/**
		 * createUser
		 */
	public void setCreateUser(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.createUser = value;
	}
	
	
	
	/**
	 * createUser
	 */
     @WhereSQL(sql="createUser=:TsEnvironmentSensitivePoint_createUser")
	public java.lang.String getCreateUser() {
		return this.createUser;
	}
		/**
		 * createTime
		 */
	public void setCreateTime(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.createTime = value;
	}
	
	
	
	/**
	 * createTime
	 */
     @WhereSQL(sql="createTime=:TsEnvironmentSensitivePoint_createTime")
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
     @WhereSQL(sql="remarks=:TsEnvironmentSensitivePoint_remarks")
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
     @WhereSQL(sql="companyId=:TsEnvironmentSensitivePoint_companyId")
	public java.lang.String getCompanyId() {
		return this.companyId;
	}
		/**
		 * bak1
		 */
	public void setCreateUserName(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.createUserName = value;
	}
	
	
	
	/**
	 * bak1
	 */
     @WhereSQL(sql="createUserName=:TsEnvironmentSensitivePoint_createUserName")
	public java.lang.String getCreateUserName() {
		return this.createUserName;
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
     @WhereSQL(sql="bak2=:TsEnvironmentSensitivePoint_bak2")
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
     @WhereSQL(sql="bak3=:TsEnvironmentSensitivePoint_bak3")
	public java.lang.String getBak3() {
		return this.bak3;
	}
     

	@Override
	public String toString() {
		return new StringBuilder()
			.append("id[").append(getId()).append("],")
			.append("环境要素id[").append(getEnvirElementId()).append("],")
			.append("环境要素名称[").append(getEnvirElementName()).append("],")
			.append("环[").append(getRing()).append("],")
			.append("方位[").append(getPosition()).append("],")
			.append("距离[").append(getDistance()).append("],")
			.append("规模[").append(getScale()).append("],")
			.append("经度[").append(getLongitude()).append("],")
			.append("纬度[").append(getLatitude()).append("],")
			.append("createUser[").append(getCreateUser()).append("],")
			.append("createTime[").append(getCreateTime()).append("],")
			.append("remarks[").append(getRemarks()).append("],")
			.append("companyId[").append(getCompanyId()).append("],")
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
		if(obj instanceof TsEnvironmentSensitivePoint == false){
			return false;
		}
			
		if(this == obj){
			return true;
		}
		
		TsEnvironmentSensitivePoint other = (TsEnvironmentSensitivePoint)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

	
