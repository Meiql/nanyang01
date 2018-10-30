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
 * @version  2018-10-30 21:26:26
 * @see org.springrain.nybusiness.ergency.entity.TsErgencyInvestigationType
 */
@Table(name="ts_ergency_investigation_type")
public class TsErgencyInvestigationType  extends BaseEntity {
	
	private static final long serialVersionUID = 1L;

	//alias
	/*
	public static final String TABLE_ALIAS = "F1码表  应急资源现状调查表 类别  1.设备2物资3场所";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_NAME = "name";
    */
	//date formats
	
	//columns START
	/**
	 * id
	 */
	private java.lang.Long id;
	/**
	 * name
	 */
	private java.lang.String name;
	//columns END 数据库字段结束
	
	//concstructor

	public TsErgencyInvestigationType(){
	}

	public TsErgencyInvestigationType(
		java.lang.Long id
	){
		this.id = id;
	}

	//get and set
		/**
		 * id
		 */
	public void setId(java.lang.Long value) {
		this.id = value;
	}
	
	
	
	/**
	 * id
	 */
	@Id
     @WhereSQL(sql="id=:TsErgencyInvestigationType_id")
	public java.lang.Long getId() {
		return this.id;
	}
		/**
		 * name
		 */
	public void setName(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.name = value;
	}
	
	
	
	/**
	 * name
	 */
     @WhereSQL(sql="name=:TsErgencyInvestigationType_name")
	public java.lang.String getName() {
		return this.name;
	}
	@Override
	public String toString() {
		return new StringBuilder()
			.append("id[").append(getId()).append("],")
			.append("name[").append(getName()).append("],")
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
		if(obj instanceof TsErgencyInvestigationType == false){
			return false;
		}
			
		if(this == obj){
			return true;
		}
		
		TsErgencyInvestigationType other = (TsErgencyInvestigationType)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

	
