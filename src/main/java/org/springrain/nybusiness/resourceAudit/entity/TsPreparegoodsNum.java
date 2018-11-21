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
 * @version  2018-11-16 01:29:53
 * @see org.springrain.nybusiness.resourceAudit.entity.TsPreparegoodsNum
 */
@Table(name="ts_preparegoods_num")
public class TsPreparegoodsNum  extends BaseEntity {
	
	private static final long serialVersionUID = 1L;

	//alias
	/*
	public static final String TABLE_ALIAS = "待送审资源表";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_COMPANY = "企业信息注册";
	public static final String ALIAS_EMERGENCY = "应急物资申报";
	public static final String ALIAS_ENVIRO = "环境风险信息调查";
	public static final String ALIAS_FILING = "应急预案备案";
    */
	//date formats
	
	//columns START
	/**
	 * id
	 */
	private java.lang.String id;
	/**
	 * 企业信息注册
	 */
	private java.lang.String company;
	/**
	 * 应急物资申报
	 */
	private java.lang.String emergency;
	/**
	 * 环境风险信息调查
	 */
	private java.lang.String enviro;
	/**
	 * 应急预案备案
	 */
	private java.lang.String filing;
	//columns END 数据库字段结束
	
	//concstructor

	public TsPreparegoodsNum(){
	}

	public TsPreparegoodsNum(
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
     @WhereSQL(sql="id=:TsPreparegoodsNum_id")
	public java.lang.String getId() {
		return this.id;
	}
		/**
		 * 企业信息注册
		 */
	public void setCompany(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.company = value;
	}
	
	
	
	/**
	 * 企业信息注册
	 */
     @WhereSQL(sql="company=:TsPreparegoodsNum_company")
	public java.lang.String getCompany() {
		return this.company;
	}
		/**
		 * 应急物资申报
		 */
	public void setEmergency(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.emergency = value;
	}
	
	
	
	/**
	 * 应急物资申报
	 */
     @WhereSQL(sql="emergency=:TsPreparegoodsNum_emergency")
	public java.lang.String getEmergency() {
		return this.emergency;
	}
		/**
		 * 环境风险信息调查
		 */
	public void setEnviro(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.enviro = value;
	}
	
	
	
	/**
	 * 环境风险信息调查
	 */
     @WhereSQL(sql="enviro=:TsPreparegoodsNum_enviro")
	public java.lang.String getEnviro() {
		return this.enviro;
	}
		/**
		 * 应急预案备案
		 */
	public void setFiling(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.filing = value;
	}
	
	
	
	/**
	 * 应急预案备案
	 */
     @WhereSQL(sql="filing=:TsPreparegoodsNum_filing")
	public java.lang.String getFiling() {
		return this.filing;
	}
	@Override
	public String toString() {
		return new StringBuilder()
			.append("id[").append(getId()).append("],")
			.append("企业信息注册[").append(getCompany()).append("],")
			.append("应急物资申报[").append(getEmergency()).append("],")
			.append("环境风险信息调查[").append(getEnviro()).append("],")
			.append("应急预案备案[").append(getFiling()).append("],")
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
		if(obj instanceof TsPreparegoodsNum == false){
			return false;
		}
			
		if(this == obj){
			return true;
		}
		
		TsPreparegoodsNum other = (TsPreparegoodsNum)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

	
