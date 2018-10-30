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
 * @copyright {@link 9iu.org}
 * @author springrain<Auto generate>
 * @version  2018-10-30 13:45:27
 * @see org.springrain.nybusiness.ergency.entity.TsEmeEquSumCategory
 */
@Table(name="ts_eme_equ_sum_category")
public class TsEmeEquSumCategory  extends BaseEntity {
	
	private static final long serialVersionUID = 1L;

	//alias
	/*
	public static final String TABLE_ALIAS = "F2 码表应急救援设施设备汇总表_类别码表";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_NAME = "类别名称";
    */
	//date formats
	
	//columns START
	/**
	 * id
	 */
	private java.lang.Long id;
	/**
	 * 类别名称
	 */
	private java.lang.String name;
	//columns END 数据库字段结束
	
	//concstructor

	public TsEmeEquSumCategory(){
	}

	public TsEmeEquSumCategory(
		java.lang.Long id
	){
		this.id = id;
	}

	//get and set
	public void setId(java.lang.Long value) {
		this.id = value;
	}
	
	@Id
     @WhereSQL(sql="id=:TsEmeEquSumCategory_id")
	public java.lang.Long getId() {
		return this.id;
	}
	public void setName(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.name = value;
	}
	
     @WhereSQL(sql="name=:TsEmeEquSumCategory_name")
	public java.lang.String getName() {
		return this.name;
	}
	
	public String toString() {
		return new StringBuffer()
			.append("id[").append(getId()).append("],")
			.append("类别名称[").append(getName()).append("],")
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof TsEmeEquSumCategory == false) return false;
		if(this == obj) return true;
		TsEmeEquSumCategory other = (TsEmeEquSumCategory)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

	
