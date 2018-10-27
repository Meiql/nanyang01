package org.springrain.nybusiness.eme.entity;

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
 * @version  2018-10-27 09:29:44
 * @see org.springrain.nybusiness.eme.entity.TsEmePlanFilAdjustment
 */
@Table(name="ts_eme_plan_fil_adjustment")
public class TsEmePlanFilAdjustment  extends BaseEntity {
	
	private static final long serialVersionUID = 1L;

	//alias
	/*
	public static final String TABLE_ALIAS = "补充或调整内容 与环境应急预案变更备案表 关联 adjustment_id 关联";
	public static final String ALIAS_ADJUSTMENT_ID = "adjustment_id";
	public static final String ALIAS_ADJUSTMENT_CATALOG = "调整或补充文件目录";
	public static final String ALIAS_ADJUSTMENT_DESC = "调整或补充内容";
    */
	//date formats
	
	//columns START
	/**
	 * adjustment_id
	 */
	private java.lang.String adjustment_id;
	/**
	 * 调整或补充文件目录
	 */
	private java.lang.String adjustment_catalog;
	/**
	 * 调整或补充内容
	 */
	private java.lang.String adjustment_desc;
	//columns END 数据库字段结束
	

	//get and set
		/**
		 * adjustment_id
		 */
	public void setAdjustment_id(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.adjustment_id = value;
	}
	
	
	
	/**
	 * adjustment_id
	 */
     @WhereSQL(sql="adjustment_id=:TsEmePlanFilAdjustment_adjustment_id")
	public java.lang.String getAdjustment_id() {
		return this.adjustment_id;
	}
		/**
		 * 调整或补充文件目录
		 */
	public void setAdjustment_catalog(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.adjustment_catalog = value;
	}
	
	
	
	/**
	 * 调整或补充文件目录
	 */
     @WhereSQL(sql="adjustment_catalog=:TsEmePlanFilAdjustment_adjustment_catalog")
	public java.lang.String getAdjustment_catalog() {
		return this.adjustment_catalog;
	}
		/**
		 * 调整或补充内容
		 */
	public void setAdjustment_desc(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.adjustment_desc = value;
	}
	
	
	
	/**
	 * 调整或补充内容
	 */
     @WhereSQL(sql="adjustment_desc=:TsEmePlanFilAdjustment_adjustment_desc")
	public java.lang.String getAdjustment_desc() {
		return this.adjustment_desc;
	}
	@Override
	public String toString() {
		return new StringBuilder()
			.append("adjustment_id[").append(getAdjustment_id()).append("],")
			.append("调整或补充文件目录[").append(getAdjustment_catalog()).append("],")
			.append("调整或补充内容[").append(getAdjustment_desc()).append("],")
			.toString();
	}
	@Override
	public int hashCode() {
		return new HashCodeBuilder()
			.toHashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof TsEmePlanFilAdjustment == false){
			return false;
		}
			
		if(this == obj){
			return true;
		}
		
		TsEmePlanFilAdjustment other = (TsEmePlanFilAdjustment)obj;
		return new EqualsBuilder()
			.isEquals();
	}
}

	
