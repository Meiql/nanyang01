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
 * @version  2018-11-24 13:28:27
 * @see org.springrain.nybusiness.resourceAudit.entity.TsExplorerGatherInfo
 */
@Table(name="ts_explorer_gather_info")
public class TsExplorerGatherInfo  extends BaseEntity {
	
	private static final long serialVersionUID = 1L;

	//alias
	/*
	public static final String TABLE_ALIAS = "资源统计";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_GOODSTYPE = "资源类型";
	public static final String ALIAS_AERA = "行政区划";
	public static final String ALIAS_COMPETENTORGANIZATION = "主管单位";
	public static final String ALIAS_COMPANYNAME = "公司名称";
	public static final String ALIAS_FLUEGASDEALTON = "废气处理能力（吨）";
	public static final String ALIAS_WASTEWATERDEALTON = "废水处理能力（吨）";
	public static final String ALIAS_HAZARDOUSWASTESPRODUCETON = "危险废物产生量（吨）";
	public static final String ALIAS_HAZARDOUSWASTESDEALTON = "危险废物处理量";
	public static final String ALIAS_BAK1 = "备用1";
	public static final String ALIAS_BAK2 = "备用2";
	public static final String ALIAS_BAK3 = "备用3";
    */
	//date formats
	
	//columns START
	/**
	 * id
	 */
	private java.lang.String id;
	/**
	 * 资源类型
	 */
	private java.lang.String goodsType;
	/**
	 * 行政区划
	 */
	private java.lang.String aera;
	/**
	 * 主管单位
	 */
	private java.lang.String competentOrganization;
	/**
	 * 公司名称
	 */
	private java.lang.String companyname;
	/**
	 * 废气处理能力（吨）
	 */
	private java.lang.String flueGasDealTon;
	/**
	 * 废水处理能力（吨）
	 */
	private java.lang.String wasteWaterDealTon;
	/**
	 * 危险废物产生量（吨）
	 */
	private java.lang.String hazardousWastesProduceTon;
	/**
	 * 危险废物处理量
	 */
	private java.lang.String hazardousWastesDealTon;
	/**
	 * 备用1
	 */
	private java.lang.String bak1;
	/**
	 * 备用2
	 */
	private java.lang.String bak2;
	/**
	 * 备用3
	 */
	private java.lang.String bak3;
	//columns END 数据库字段结束
	
	//concstructor

	public TsExplorerGatherInfo(){
	}

	public TsExplorerGatherInfo(
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
     @WhereSQL(sql="id=:TsExplorerGatherInfo_id")
	public java.lang.String getId() {
		return this.id;
	}
		/**
		 * 资源类型
		 */
	public void setGoodsType(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.goodsType = value;
	}
	
	
	
	/**
	 * 资源类型
	 */
     @WhereSQL(sql="goodsType=:TsExplorerGatherInfo_goodsType")
	public java.lang.String getGoodsType() {
		return this.goodsType;
	}
		/**
		 * 行政区划
		 */
	public void setAera(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.aera = value;
	}
	
	
	
	/**
	 * 行政区划
	 */
     @WhereSQL(sql="aera=:TsExplorerGatherInfo_aera")
	public java.lang.String getAera() {
		return this.aera;
	}
		/**
		 * 主管单位
		 */
	public void setCompetentOrganization(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.competentOrganization = value;
	}
	
	
	
	/**
	 * 主管单位
	 */
     @WhereSQL(sql="competentOrganization=:TsExplorerGatherInfo_competentOrganization")
	public java.lang.String getCompetentOrganization() {
		return this.competentOrganization;
	}
		/**
		 * 公司名称
		 */
	public void setCompanyname(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.companyname = value;
	}
	
	
	
	/**
	 * 公司名称
	 */
     @WhereSQL(sql="companyname=:TsExplorerGatherInfo_companyname")
	public java.lang.String getCompanyname() {
		return this.companyname;
	}
		/**
		 * 废气处理能力（吨）
		 */
	public void setFlueGasDealTon(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.flueGasDealTon = value;
	}
	
	
	
	/**
	 * 废气处理能力（吨）
	 */
     @WhereSQL(sql="flueGasDealTon=:TsExplorerGatherInfo_flueGasDealTon")
	public java.lang.String getFlueGasDealTon() {
		return this.flueGasDealTon;
	}
		/**
		 * 废水处理能力（吨）
		 */
	public void setWasteWaterDealTon(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.wasteWaterDealTon = value;
	}
	
	
	
	/**
	 * 废水处理能力（吨）
	 */
     @WhereSQL(sql="wasteWaterDealTon=:TsExplorerGatherInfo_wasteWaterDealTon")
	public java.lang.String getWasteWaterDealTon() {
		return this.wasteWaterDealTon;
	}
		/**
		 * 危险废物产生量（吨）
		 */
	public void setHazardousWastesProduceTon(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.hazardousWastesProduceTon = value;
	}
	
	
	
	/**
	 * 危险废物产生量（吨）
	 */
     @WhereSQL(sql="hazardousWastesProduceTon=:TsExplorerGatherInfo_hazardousWastesProduceTon")
	public java.lang.String getHazardousWastesProduceTon() {
		return this.hazardousWastesProduceTon;
	}
		/**
		 * 危险废物处理量
		 */
	public void setHazardousWastesDealTon(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.hazardousWastesDealTon = value;
	}
	
	
	
	/**
	 * 危险废物处理量
	 */
     @WhereSQL(sql="hazardousWastesDealTon=:TsExplorerGatherInfo_hazardousWastesDealTon")
	public java.lang.String getHazardousWastesDealTon() {
		return this.hazardousWastesDealTon;
	}
		/**
		 * 备用1
		 */
	public void setBak1(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.bak1 = value;
	}
	
	
	
	/**
	 * 备用1
	 */
     @WhereSQL(sql="bak1=:TsExplorerGatherInfo_bak1")
	public java.lang.String getBak1() {
		return this.bak1;
	}
		/**
		 * 备用2
		 */
	public void setBak2(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.bak2 = value;
	}
	
	
	
	/**
	 * 备用2
	 */
     @WhereSQL(sql="bak2=:TsExplorerGatherInfo_bak2")
	public java.lang.String getBak2() {
		return this.bak2;
	}
		/**
		 * 备用3
		 */
	public void setBak3(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.bak3 = value;
	}
	
	
	
	/**
	 * 备用3
	 */
     @WhereSQL(sql="bak3=:TsExplorerGatherInfo_bak3")
	public java.lang.String getBak3() {
		return this.bak3;
	}
	@Override
	public String toString() {
		return new StringBuilder()
			.append("id[").append(getId()).append("],")
			.append("资源类型[").append(getGoodsType()).append("],")
			.append("行政区划[").append(getAera()).append("],")
			.append("主管单位[").append(getCompetentOrganization()).append("],")
			.append("公司名称[").append(getCompanyname()).append("],")
			.append("废气处理能力（吨）[").append(getFlueGasDealTon()).append("],")
			.append("废水处理能力（吨）[").append(getWasteWaterDealTon()).append("],")
			.append("危险废物产生量（吨）[").append(getHazardousWastesProduceTon()).append("],")
			.append("危险废物处理量[").append(getHazardousWastesDealTon()).append("],")
			.append("备用1[").append(getBak1()).append("],")
			.append("备用2[").append(getBak2()).append("],")
			.append("备用3[").append(getBak3()).append("],")
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
		if(obj instanceof TsExplorerGatherInfo == false){
			return false;
		}
			
		if(this == obj){
			return true;
		}
		
		TsExplorerGatherInfo other = (TsExplorerGatherInfo)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

	
