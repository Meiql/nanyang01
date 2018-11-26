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
 * @version  2018-11-14 22:54:36
 * @see org.springrain.nybusiness.resourceAudit.entity.TsPrepareGoodsReturn
 */
@Table(name="ts_prepare_goods_return")
public class TsPrepareGoodsReturn  extends BaseEntity {
	
	private static final long serialVersionUID = 1L;

	//alias
	/*
	public static final String TABLE_ALIAS = "待调整资源表";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_GOODS_NAME = "公司名称";
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
	 * 公司名称
	 */
	private java.lang.String goods_name;
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

	public TsPrepareGoodsReturn(){
	}

	public TsPrepareGoodsReturn(
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
     @WhereSQL(sql="id=:TsPrepareGoodsReturn_id")
	public java.lang.String getId() {
		return this.id;
	}
		/**
		 * 公司名称
		 */
	public void setGoods_name(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.goods_name = value;
	}
	
	
	
	/**
	 * 公司名称
	 */
     @WhereSQL(sql="goods_name=:TsPrepareGoodsReturn_goods_name")
	public java.lang.String getGoods_name() {
		return this.goods_name;
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
     @WhereSQL(sql="numbers=:TsPrepareGoodsReturn_numbers")
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
     @WhereSQL(sql="bak1=:TsPrepareGoodsReturn_bak1")
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
     @WhereSQL(sql="bak2=:TsPrepareGoodsReturn_bak2")
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
     @WhereSQL(sql="bak3=:TsPrepareGoodsReturn_bak3")
	public java.lang.String getBak3() {
		return this.bak3;
	}
	@Override
	public String toString() {
		return new StringBuilder()
			.append("id[").append(getId()).append("],")
			.append("公司名称[").append(getGoods_name()).append("],")
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
		if(obj instanceof TsPrepareGoodsReturn == false){
			return false;
		}
			
		if(this == obj){
			return true;
		}
		
		TsPrepareGoodsReturn other = (TsPrepareGoodsReturn)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

	
