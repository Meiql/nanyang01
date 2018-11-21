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
 * @version  2018-11-08 23:33:54
 * @see org.springrain.nybusiness.resourceAudit.entity.TsGoodsInventory
 */
@Table(name="ts_goods_inventory")
public class TsGoodsInventory  extends BaseEntity {
	
	private static final long serialVersionUID = 1L;

	//alias
	/*
	public static final String TABLE_ALIAS = "已发布资源清单";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_GOODS_NAME = "物质名称";
	public static final String ALIAS_GOODS_TYPE = "型号规格";
	public static final String ALIAS_GOODS_NUM = "物质总量";
	public static final String ALIAS_USEFUL_LIFE_NUM = "有效数量";
	public static final String ALIAS_EXPIRY_DATE_NUM = "失效数量";
	public static final String ALIAS_COMMENTS = "备注";
    */
	//date formats
	
	//columns START
	/**
	 * id
	 */
	private java.lang.String id;
	/**
	 * 物质名称
	 */
	private java.lang.String goods_name;
	/**
	 * 型号规格
	 */
	private java.lang.String goods_type;
	/**
	 * 物质总量
	 */
	private java.lang.Integer goods_num;
	/**
	 * 有效数量
	 */
	private java.lang.Integer useful_life_num;
	/**
	 * 失效数量
	 */
	private java.lang.Integer expiry_date_num;
	/**
	 * 备注
	 */
	private java.lang.String comments;
	//columns END 数据库字段结束
	
	//concstructor

	public TsGoodsInventory(){
	}

	public TsGoodsInventory(
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
     @WhereSQL(sql="id=:TsGoodsInventory_id")
	public java.lang.String getId() {
		return this.id;
	}
		/**
		 * 物质名称
		 */
	public void setGoods_name(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.goods_name = value;
	}
	
	
	
	/**
	 * 物质名称
	 */
     @WhereSQL(sql="goods_name=:TsGoodsInventory_goods_name")
	public java.lang.String getGoods_name() {
		return this.goods_name;
	}
		/**
		 * 型号规格
		 */
	public void setGoods_type(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.goods_type = value;
	}
	
	
	
	/**
	 * 型号规格
	 */
     @WhereSQL(sql="goods_type=:TsGoodsInventory_goods_type")
	public java.lang.String getGoods_type() {
		return this.goods_type;
	}
		/**
		 * 物质总量
		 */
	public void setGoods_num(java.lang.Integer value) {
		this.goods_num = value;
	}
	
	
	
	/**
	 * 物质总量
	 */
     @WhereSQL(sql="goods_num=:TsGoodsInventory_goods_num")
	public java.lang.Integer getGoods_num() {
		return this.goods_num;
	}
		/**
		 * 有效数量
		 */
	public void setUseful_life_num(java.lang.Integer value) {
		this.useful_life_num = value;
	}
	
	
	
	/**
	 * 有效数量
	 */
     @WhereSQL(sql="useful_life_num=:TsGoodsInventory_useful_life_num")
	public java.lang.Integer getUseful_life_num() {
		return this.useful_life_num;
	}
		/**
		 * 失效数量
		 */
	public void setExpiry_date_num(java.lang.Integer value) {
		this.expiry_date_num = value;
	}
	
	
	
	/**
	 * 失效数量
	 */
     @WhereSQL(sql="expiry_date_num=:TsGoodsInventory_expiry_date_num")
	public java.lang.Integer getExpiry_date_num() {
		return this.expiry_date_num;
	}
		/**
		 * 备注
		 */
	public void setComments(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.comments = value;
	}
	
	
	
	/**
	 * 备注
	 */
     @WhereSQL(sql="comments=:TsGoodsInventory_comments")
	public java.lang.String getComments() {
		return this.comments;
	}
	@Override
	public String toString() {
		return new StringBuilder()
			.append("id[").append(getId()).append("],")
			.append("物质名称[").append(getGoods_name()).append("],")
			.append("型号规格[").append(getGoods_type()).append("],")
			.append("物质总量[").append(getGoods_num()).append("],")
			.append("有效数量[").append(getUseful_life_num()).append("],")
			.append("失效数量[").append(getExpiry_date_num()).append("],")
			.append("备注[").append(getComments()).append("],")
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
		if(obj instanceof TsGoodsInventory == false){
			return false;
		}
			
		if(this == obj){
			return true;
		}
		
		TsGoodsInventory other = (TsGoodsInventory)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

	
