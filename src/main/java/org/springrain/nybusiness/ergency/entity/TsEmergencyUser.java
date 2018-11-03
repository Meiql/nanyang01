package org.springrain.nybusiness.ergency.entity;

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
 * @version  2018-11-03 10:32:33
 * @see org.springrain.nybusiness.ergency.entity.TsEmergencyUser
 */
@Table(name="ts_emergency_user")
public class TsEmergencyUser  extends BaseEntity {
	
	private static final long serialVersionUID = 1L;

	//alias
	/*
	public static final String TABLE_ALIAS = "应急组织人员";
	public static final String ALIAS_ID = "编号";
	public static final String ALIAS_NAME = "名称";
	public static final String ALIAS_EMERGENCYORGID = "所属应急组织";
	public static final String ALIAS_CREATEUSER = "创建人";
	public static final String ALIAS_CREATETIME = "创建时间";
	public static final String ALIAS_UPDATEUSER = "更新人";
	public static final String ALIAS_UPDATETIME = "更新时间";
	public static final String ALIAS_BAK1 = "bak1";
	public static final String ALIAS_BAK2 = "bak2";
	public static final String ALIAS_BAK3 = "bak3";
	public static final String ALIAS_BAK4 = "bak4";
	public static final String ALIAS_BAK5 = "bak5";
    */
	//date formats
	
	//columns START
	/**
	 * 编号
	 */
	private java.lang.String id;
	/**
	 * 名称
	 */
	private java.lang.String name;
	/**
	 * 所属应急组织
	 */
	private java.lang.String emergencyOrgId;
	/**
	 * 创建人
	 */
	private java.lang.String createUser;
	/**
	 * 创建时间
	 */
	private java.lang.String createTime;
	/**
	 * 更新人
	 */
	private java.lang.String updateUser;
	/**
	 * 更新时间
	 */
	private java.lang.String updateTime;
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
	/**
	 * bak4
	 */
	private java.lang.String bak4;
	/**
	 * bak5
	 */
	private java.lang.String bak5;
	//columns END 数据库字段结束
	
	//concstructor

	public TsEmergencyUser(){
	}

	public TsEmergencyUser(
		java.lang.String id
	){
		this.id = id;
	}

	//get and set
		/**
		 * 编号
		 */
	public void setId(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.id = value;
	}
	
	
	
	/**
	 * 编号
	 */
	@Id
     @WhereSQL(sql="id=:TsEmergencyUser_id")
	public java.lang.String getId() {
		return this.id;
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
     @WhereSQL(sql="name=:TsEmergencyUser_name")
	public java.lang.String getName() {
		return this.name;
	}
		/**
		 * 所属应急组织
		 */
	public void setEmergencyOrgId(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.emergencyOrgId = value;
	}
	
	
	
	/**
	 * 所属应急组织
	 */
     @WhereSQL(sql="emergencyOrgId=:TsEmergencyUser_emergencyOrgId")
	public java.lang.String getEmergencyOrgId() {
		return this.emergencyOrgId;
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
     @WhereSQL(sql="createUser=:TsEmergencyUser_createUser")
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
     @WhereSQL(sql="createTime=:TsEmergencyUser_createTime")
	public java.lang.String getCreateTime() {
		return this.createTime;
	}
		/**
		 * 更新人
		 */
	public void setUpdateUser(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.updateUser = value;
	}
	
	
	
	/**
	 * 更新人
	 */
     @WhereSQL(sql="updateUser=:TsEmergencyUser_updateUser")
	public java.lang.String getUpdateUser() {
		return this.updateUser;
	}
		/**
		 * 更新时间
		 */
	public void setUpdateTime(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.updateTime = value;
	}
	
	
	
	/**
	 * 更新时间
	 */
     @WhereSQL(sql="updateTime=:TsEmergencyUser_updateTime")
	public java.lang.String getUpdateTime() {
		return this.updateTime;
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
     @WhereSQL(sql="bak1=:TsEmergencyUser_bak1")
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
     @WhereSQL(sql="bak2=:TsEmergencyUser_bak2")
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
     @WhereSQL(sql="bak3=:TsEmergencyUser_bak3")
	public java.lang.String getBak3() {
		return this.bak3;
	}
		/**
		 * bak4
		 */
	public void setBak4(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.bak4 = value;
	}
	
	
	
	/**
	 * bak4
	 */
     @WhereSQL(sql="bak4=:TsEmergencyUser_bak4")
	public java.lang.String getBak4() {
		return this.bak4;
	}
		/**
		 * bak5
		 */
	public void setBak5(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.bak5 = value;
	}
	
	
	
	/**
	 * bak5
	 */
     @WhereSQL(sql="bak5=:TsEmergencyUser_bak5")
	public java.lang.String getBak5() {
		return this.bak5;
	}
	@Override
	public String toString() {
		return new StringBuilder()
			.append("编号[").append(getId()).append("],")
			.append("名称[").append(getName()).append("],")
			.append("所属应急组织[").append(getEmergencyOrgId()).append("],")
			.append("创建人[").append(getCreateUser()).append("],")
			.append("创建时间[").append(getCreateTime()).append("],")
			.append("更新人[").append(getUpdateUser()).append("],")
			.append("更新时间[").append(getUpdateTime()).append("],")
			.append("bak1[").append(getBak1()).append("],")
			.append("bak2[").append(getBak2()).append("],")
			.append("bak3[").append(getBak3()).append("],")
			.append("bak4[").append(getBak4()).append("],")
			.append("bak5[").append(getBak5()).append("],")
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
		if(obj instanceof TsEmergencyUser == false){
			return false;
		}
			
		if(this == obj){
			return true;
		}
		
		TsEmergencyUser other = (TsEmergencyUser)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

	
