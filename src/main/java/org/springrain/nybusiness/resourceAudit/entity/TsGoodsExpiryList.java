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
 * @version  2018-11-14 22:59:33
 * @see org.springrain.nybusiness.resourceAudit.entity.TsGoodsExpiryList
 */
@Table(name="ts_goods_expiry_list")
public class TsGoodsExpiryList  extends BaseEntity {
	
	private static final long serialVersionUID = 1L;

	//alias
	/*
	public static final String TABLE_ALIAS = "已过期资源清单";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_GOODS_NAME = "物质名称";
	public static final String ALIAS_GOODS_TYPE = "型号规格";
	public static final String ALIAS_COMPANY = "所属公司";
	public static final String ALIAS_GOODS_NUM = "总量";
	public static final String ALIAS_COMMENTS = "备注";
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
	 * 物质名称
	 */
	private java.lang.String goods_name;
	/**
	 * 型号规格
	 */
	private java.lang.String goods_type;
	/**
	 * 所属公司
	 */
	private java.lang.String company;
	/**
	 * 总量
	 */
	private java.lang.Integer goods_num;
	/**
	 * 备注
	 */
	private java.lang.String comments;
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

	public TsGoodsExpiryList(){
	}

	public TsGoodsExpiryList(
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
     @WhereSQL(sql="id=:TsGoodsExpiryList_id")
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
     @WhereSQL(sql="goods_name=:TsGoodsExpiryList_goods_name")
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
     @WhereSQL(sql="goods_type=:TsGoodsExpiryList_goods_type")
	public java.lang.String getGoods_type() {
		return this.goods_type;
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
     @WhereSQL(sql="company=:TsGoodsExpiryList_company")
	public java.lang.String getCompany() {
		return this.company;
	}
		/**
		 * 总量
		 */
	public void setGoods_num(java.lang.Integer value) {
		this.goods_num = value;
	}
	
	
	
	/**
	 * 总量
	 */
     @WhereSQL(sql="goods_num=:TsGoodsExpiryList_goods_num")
	public java.lang.Integer getGoods_num() {
		return this.goods_num;
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
     @WhereSQL(sql="comments=:TsGoodsExpiryList_comments")
	public java.lang.String getComments() {
		return this.comments;
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
     @WhereSQL(sql="bak1=:TsGoodsExpiryList_bak1")
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
     @WhereSQL(sql="bak2=:TsGoodsExpiryList_bak2")
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
     @WhereSQL(sql="bak3=:TsGoodsExpiryList_bak3")
	public java.lang.String getBak3() {
		return this.bak3;
	}
	@Override
	public String toString() {
		return new StringBuilder()
			.append("id[").append(getId()).append("],")
			.append("物质名称[").append(getGoods_name()).append("],")
			.append("型号规格[").append(getGoods_type()).append("],")
			.append("所属公司[").append(getCompany()).append("],")
			.append("总量[").append(getGoods_num()).append("],")
			.append("备注[").append(getComments()).append("],")
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
		if(obj instanceof TsGoodsExpiryList == false){
			return false;
		}
			
		if(this == obj){
			return true;
		}
		
		TsGoodsExpiryList other = (TsGoodsExpiryList)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

	
