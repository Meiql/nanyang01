package org.springrain.nybusiness.mail.entity;

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
 * @version  2018-10-27 09:42:46
 * @see org.springrain.nybusiness.mail.entity.TsMailListOutside
 */
@Table(name="ts_mail_list_outside")
public class TsMailListOutside  extends BaseEntity {
	
	private static final long serialVersionUID = 1L;

	//alias
	/*
	public static final String TABLE_ALIAS = "外部通讯录";
	public static final String ALIAS_ID = "主键";
	public static final String ALIAS_ORGID = "部门id";
	public static final String ALIAS_ORGNAME = "部门名称";
	public static final String ALIAS_CONTACTPEOPLE = "联系人";
	public static final String ALIAS_CONTACTPHONE = "联系电话";
	public static final String ALIAS_DUTYID = "职务id";
	public static final String ALIAS_DUTYNAME = "职务名称";
	public static final String ALIAS_CREATETIME = "创建时间";
	public static final String ALIAS_CREATEUSER = "创建人";
	public static final String ALIAS_COMPANYID = "企业id";
	public static final String ALIAS_BAK1 = "预留字段1";
	public static final String ALIAS_BAK2 = "预留字段2";
	public static final String ALIAS_BAK3 = "预留字段3";
    */
	//date formats
	
	//columns START
	/**
	 * 主键
	 */
	private java.lang.String id;
	/**
	 * 部门id
	 */
	private java.lang.String orgid;
	/**
	 * 部门名称
	 */
	private java.lang.String orgname;
	/**
	 * 联系人
	 */
	private java.lang.String contactPeople;
	/**
	 * 联系电话
	 */
	private java.lang.String contactPhone;
	/**
	 * 职务id
	 */
	private java.lang.String dutyId;
	/**
	 * 职务名称
	 */
	private java.lang.String dutyname;
	/**
	 * 创建时间
	 */
	private java.lang.String createTime;
	/**
	 * 创建人
	 */
	private java.lang.String createUser;
	/**
	 * 企业id
	 */
	private java.lang.String companyId;
	/**
	 * 预留字段1
	 */
	private java.lang.String bak1;
	/**
	 * 预留字段2
	 */
	private java.lang.String bak2;
	/**
	 * 预留字段3
	 */
	private java.lang.String bak3;
	//columns END 数据库字段结束
	
	//concstructor

	public TsMailListOutside(){
	}

	public TsMailListOutside(
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
     @WhereSQL(sql="id=:TsMailListOutside_id")
	public java.lang.String getId() {
		return this.id;
	}
		/**
		 * 部门id
		 */
	public void setOrgid(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.orgid = value;
	}
	
	
	
	/**
	 * 部门id
	 */
     @WhereSQL(sql="orgid=:TsMailListOutside_orgid")
	public java.lang.String getOrgid() {
		return this.orgid;
	}
		/**
		 * 部门名称
		 */
	public void setOrgname(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.orgname = value;
	}
	
	
	
	/**
	 * 部门名称
	 */
     @WhereSQL(sql="orgname=:TsMailListOutside_orgname")
	public java.lang.String getOrgname() {
		return this.orgname;
	}
		/**
		 * 联系人
		 */
	public void setContactPeople(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.contactPeople = value;
	}
	
	
	
	/**
	 * 联系人
	 */
     @WhereSQL(sql="contactPeople=:TsMailListOutside_contactPeople")
	public java.lang.String getContactPeople() {
		return this.contactPeople;
	}
		/**
		 * 联系电话
		 */
	public void setContactPhone(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.contactPhone = value;
	}
	
	
	
	/**
	 * 联系电话
	 */
     @WhereSQL(sql="contactPhone=:TsMailListOutside_contactPhone")
	public java.lang.String getContactPhone() {
		return this.contactPhone;
	}
		/**
		 * 职务id
		 */
	public void setDutyId(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.dutyId = value;
	}
	
	
	
	/**
	 * 职务id
	 */
     @WhereSQL(sql="dutyId=:TsMailListOutside_dutyId")
	public java.lang.String getDutyId() {
		return this.dutyId;
	}
		/**
		 * 职务名称
		 */
	public void setDutyname(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.dutyname = value;
	}
	
	
	
	/**
	 * 职务名称
	 */
     @WhereSQL(sql="dutyname=:TsMailListOutside_dutyname")
	public java.lang.String getDutyname() {
		return this.dutyname;
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
     @WhereSQL(sql="createTime=:TsMailListOutside_createTime")
	public java.lang.String getCreateTime() {
		return this.createTime;
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
     @WhereSQL(sql="createUser=:TsMailListOutside_createUser")
	public java.lang.String getCreateUser() {
		return this.createUser;
	}
		/**
		 * 企业id
		 */
	public void setCompanyId(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.companyId = value;
	}
	
	
	
	/**
	 * 企业id
	 */
     @WhereSQL(sql="companyId=:TsMailListOutside_companyId")
	public java.lang.String getCompanyId() {
		return this.companyId;
	}
		/**
		 * 预留字段1
		 */
	public void setBak1(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.bak1 = value;
	}
	
	
	
	/**
	 * 预留字段1
	 */
     @WhereSQL(sql="bak1=:TsMailListOutside_bak1")
	public java.lang.String getBak1() {
		return this.bak1;
	}
		/**
		 * 预留字段2
		 */
	public void setBak2(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.bak2 = value;
	}
	
	
	
	/**
	 * 预留字段2
	 */
     @WhereSQL(sql="bak2=:TsMailListOutside_bak2")
	public java.lang.String getBak2() {
		return this.bak2;
	}
		/**
		 * 预留字段3
		 */
	public void setBak3(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.bak3 = value;
	}
	
	
	
	/**
	 * 预留字段3
	 */
     @WhereSQL(sql="bak3=:TsMailListOutside_bak3")
	public java.lang.String getBak3() {
		return this.bak3;
	}
	@Override
	public String toString() {
		return new StringBuilder()
			.append("主键[").append(getId()).append("],")
			.append("部门id[").append(getOrgid()).append("],")
			.append("部门名称[").append(getOrgname()).append("],")
			.append("联系人[").append(getContactPeople()).append("],")
			.append("联系电话[").append(getContactPhone()).append("],")
			.append("职务id[").append(getDutyId()).append("],")
			.append("职务名称[").append(getDutyname()).append("],")
			.append("创建时间[").append(getCreateTime()).append("],")
			.append("创建人[").append(getCreateUser()).append("],")
			.append("企业id[").append(getCompanyId()).append("],")
			.append("预留字段1[").append(getBak1()).append("],")
			.append("预留字段2[").append(getBak2()).append("],")
			.append("预留字段3[").append(getBak3()).append("],")
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
		if(obj instanceof TsMailListOutside == false){
			return false;
		}
			
		if(this == obj){
			return true;
		}
		
		TsMailListOutside other = (TsMailListOutside)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

	
