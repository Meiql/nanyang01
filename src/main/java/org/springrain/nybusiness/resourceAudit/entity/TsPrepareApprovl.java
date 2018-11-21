package org.springrain.nybusiness.resourceAudit.entity;

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
 * @version  2018-11-14 22:30:47
 * @see org.springrain.nybusiness.resourceAudit.entity.TsPrepareApprovl
 */
@Table(name="ts_prepare_approvl")
public class TsPrepareApprovl  extends BaseEntity {
	
	private static final long serialVersionUID = 1L;

	//alias
	/*
	public static final String TABLE_ALIAS = "待审核资源表";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_GOODS_NAME = "物资名称";
	public static final String ALIAS_COMPANY = "所属公司";
	public static final String ALIAS_NUMBERS = "数量";
	public static final String ALIAS_BAK1 = "备用字段1";
	public static final String ALIAS_BAK2 = "备用字段2";
	public static final String ALIAS_BAK3 = "备用字段2";
    */
	//date formats
	
	//columns START
	/**
	 * id
	 */
	private java.lang.String id;
	/**
	 * 物资名称
	 */
	private java.lang.String goods_name;
	/**
	 * 所属公司
	 */
	private java.lang.String company;
	/**
	 * 数量
	 */
	private java.lang.String numbers;
	/**
	 * 备用字段1
	 */
	private java.lang.String bak1;
	/**
	 * 备用字段2
	 */
	private java.lang.String bak2;
	/**
	 * 备用字段2
	 */
	private java.lang.String bak3;
	//columns END 数据库字段结束
	
	//concstructor

	public TsPrepareApprovl(){
	}

	public TsPrepareApprovl(
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
     @WhereSQL(sql="id=:TsPrepareApprovl_id")
	public java.lang.String getId() {
		return this.id;
	}
		/**
		 * 物资名称
		 */
	public void setGoods_name(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.goods_name = value;
	}
	
	
	
	/**
	 * 物资名称
	 */
     @WhereSQL(sql="goods_name=:TsPrepareApprovl_goods_name")
	public java.lang.String getGoods_name() {
		return this.goods_name;
	}
		/**
		 * 所属公司
		 */
	public void setCompany(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.company = value;
	}
	
	
	
	/**
	 * 所属公司
	 */
     @WhereSQL(sql="company=:TsPrepareApprovl_company")
	public java.lang.String getCompany() {
		return this.company;
	}
		/**
		 * 数量
		 */
	public void setNumbers(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.numbers = value;
	}
	
	
	
	/**
	 * 数量
	 */
     @WhereSQL(sql="numbers=:TsPrepareApprovl_numbers")
	public java.lang.String getNumbers() {
		return this.numbers;
	}
		/**
		 * 备用字段1
		 */
	public void setBak1(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.bak1 = value;
	}
	
	
	
	/**
	 * 备用字段1
	 */
     @WhereSQL(sql="bak1=:TsPrepareApprovl_bak1")
	public java.lang.String getBak1() {
		return this.bak1;
	}
		/**
		 * 备用字段2
		 */
	public void setBak2(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.bak2 = value;
	}
	
	
	
	/**
	 * 备用字段2
	 */
     @WhereSQL(sql="bak2=:TsPrepareApprovl_bak2")
	public java.lang.String getBak2() {
		return this.bak2;
	}
		/**
		 * 备用字段2
		 */
	public void setBak3(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.bak3 = value;
	}
	
	
	
	/**
	 * 备用字段2
	 */
     @WhereSQL(sql="bak3=:TsPrepareApprovl_bak3")
	public java.lang.String getBak3() {
		return this.bak3;
	}
	@Override
	public String toString() {
		return new StringBuilder()
			.append("id[").append(getId()).append("],")
			.append("物资名称[").append(getGoods_name()).append("],")
			.append("所属公司[").append(getCompany()).append("],")
			.append("数量[").append(getNumbers()).append("],")
			.append("备用字段1[").append(getBak1()).append("],")
			.append("备用字段2[").append(getBak2()).append("],")
			.append("备用字段2[").append(getBak3()).append("],")
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
		if(obj instanceof TsPrepareApprovl == false){
			return false;
		}
			
		if(this == obj){
			return true;
		}
		
		TsPrepareApprovl other = (TsPrepareApprovl)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

	
