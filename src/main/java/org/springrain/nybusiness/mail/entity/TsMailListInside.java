package org.springrain.nybusiness.mail.entity;

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
 * @version  2018-10-27 09:43:02
 * @see org.springrain.nybusiness.mail.entity.TsMailListInside
 */
@Table(name="ts_mail_list_inside")
public class TsMailListInside  extends BaseEntity {
	
	private static final long serialVersionUID = 1L;

	//alias
	/*
	public static final String TABLE_ALIAS = "内部通讯录";
	public static final String ALIAS_ID = "主键id";
	public static final String ALIAS_UNITNAME = "单位名称";
	public static final String ALIAS_CONTACTPHONE = "联系电话";
	public static final String ALIAS_CREATEUSER = "创建人";
	public static final String ALIAS_CREATETIME = "创建时间";
	public static final String ALIAS_REMARK = "备注";
	public static final String ALIAS_COMPANYID = "企业id";
	public static final String ALIAS_BAK1 = "预留字段1";
	public static final String ALIAS_BAK2 = "预留字段2";
	public static final String ALIAS_BAK3 = "预留字段3";
    */
	//date formats
	
	//columns START
	/**
	 * 主键id
	 */
	private java.lang.String id;
	/**
	 * 单位名称
	 */
	private java.lang.String unitName;
	/**
	 * 联系电话
	 */
	private java.lang.String contactPhone;
	/**
	 * 创建人
	 */
	private java.lang.String createUser;
	/**
	 * 创建时间
	 */
	private java.lang.String createTime;
	/**
	 * 备注
	 */
	private java.lang.String remark;
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

	public TsMailListInside(){
	}

	public TsMailListInside(
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
     @WhereSQL(sql="id=:TsMailListInside_id")
	public java.lang.String getId() {
		return this.id;
	}
		/**
		 * 单位名称
		 */
	public void setUnitName(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.unitName = value;
	}
	
	
	
	/**
	 * 单位名称
	 */
     @WhereSQL(sql="unitName=:TsMailListInside_unitName")
	public java.lang.String getUnitName() {
		return this.unitName;
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
     @WhereSQL(sql="contactPhone=:TsMailListInside_contactPhone")
	public java.lang.String getContactPhone() {
		return this.contactPhone;
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
     @WhereSQL(sql="createUser=:TsMailListInside_createUser")
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
     @WhereSQL(sql="createTime=:TsMailListInside_createTime")
	public java.lang.String getCreateTime() {
		return this.createTime;
	}
		/**
		 * 备注
		 */
	public void setRemark(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.remark = value;
	}
	
	
	
	/**
	 * 备注
	 */
     @WhereSQL(sql="remark=:TsMailListInside_remark")
	public java.lang.String getRemark() {
		return this.remark;
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
     @WhereSQL(sql="companyId=:TsMailListInside_companyId")
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
     @WhereSQL(sql="bak1=:TsMailListInside_bak1")
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
     @WhereSQL(sql="bak2=:TsMailListInside_bak2")
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
     @WhereSQL(sql="bak3=:TsMailListInside_bak3")
	public java.lang.String getBak3() {
		return this.bak3;
	}
	@Override
	public String toString() {
		return new StringBuilder()
			.append("主键id[").append(getId()).append("],")
			.append("单位名称[").append(getUnitName()).append("],")
			.append("联系电话[").append(getContactPhone()).append("],")
			.append("创建人[").append(getCreateUser()).append("],")
			.append("创建时间[").append(getCreateTime()).append("],")
			.append("备注[").append(getRemark()).append("],")
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
		if(obj instanceof TsMailListInside == false){
			return false;
		}
			
		if(this == obj){
			return true;
		}
		
		TsMailListInside other = (TsMailListInside)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

	
