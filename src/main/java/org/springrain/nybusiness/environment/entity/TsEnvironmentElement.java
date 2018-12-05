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
 * @version  2018-10-27 10:25:09
 * @see org.springrain.nybusiness.environment.entity.TsEnvironmentElement
 */
@Table(name="ts_environment_element")
public class TsEnvironmentElement  extends BaseEntity {
	
	private static final long serialVersionUID = 1L;

	//alias
	/*
	public static final String TABLE_ALIAS = "环境要素表";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_ENVIRELEMENTNAME = "环境要素名称";
	public static final String ALIAS_CREATEUSER = "createUser";
	public static final String ALIAS_CREATETIME = "createTime";
	public static final String ALIAS_REMARKS = "remarks";
    */
	//date formats
	
	//columns START
	/**
	 * id
	 */
	private java.lang.String id;
	/**
	 * 环境要素名称
	 */
	private java.lang.String envirElementName;
	/**
	 * createUser
	 */
	private java.lang.String createUser;
	/**
	 * createName
	 */
	private java.lang.String createName;
	/**
	 * createTime
	 */
	private java.lang.String createTime;
	/**
	 * companyId
	 */
	private java.lang.String companyId;
	/**
	 * remarks
	 */
	private java.lang.String remarks;
	//columns END 数据库字段结束
	
	//concstructor

	public TsEnvironmentElement(){
	}

	public TsEnvironmentElement(
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
     @WhereSQL(sql="id=:TsEnvironmentElement_id")
	public java.lang.String getId() {
		return this.id;
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
     @WhereSQL(sql="envirElementName=:TsEnvironmentElement_envirElementName")
	public java.lang.String getEnvirElementName() {
		return this.envirElementName;
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
     @WhereSQL(sql="createUser=:TsEnvironmentElement_createUser")
	public java.lang.String getCreateUser() {
		return this.createUser;
	}
     /**
		 * createName
		 */
	public void setCreateName(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.createName = value;
	}
	
	
	
	/**
	 * createName
	 */
  @WhereSQL(sql="createName=:TsEnvironmentElement_createName")
	public java.lang.String getCreateName() {
		return this.createName;
	}
  /**
	 * createName
	 */
public void setCompanyId(java.lang.String value) {
	    if(StringUtils.isNotBlank(value)){
		 value=value.trim();
		}
	this.companyId = value;
}



/**
* createName
*/
@WhereSQL(sql="companyId=:TsEnvironmentElement_companyId")
public java.lang.String getCompanyId() {
	return this.companyId;
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
     @WhereSQL(sql="createTime=:TsEnvironmentElement_createTime")
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
     @WhereSQL(sql="remarks=:TsEnvironmentElement_remarks")
	public java.lang.String getRemarks() {
		return this.remarks;
	}
	@Override
	public String toString() {
		return new StringBuilder()
			.append("id[").append(getId()).append("],")
			.append("环境要素名称[").append(getEnvirElementName()).append("],")
			.append("createUser[").append(getCreateUser()).append("],")
			.append("createTime[").append(getCreateTime()).append("],")
			.append("createId[").append(getCreateTime()).append("],")
			.append("createName[").append(getCreateTime()).append("],")
			.append("remarks[").append(getRemarks()).append("],")
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
		if(obj instanceof TsEnvironmentElement == false){
			return false;
		}
			
		if(this == obj){
			return true;
		}
		
		TsEnvironmentElement other = (TsEnvironmentElement)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

	
