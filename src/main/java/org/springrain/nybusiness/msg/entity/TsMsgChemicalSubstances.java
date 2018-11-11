package org.springrain.nybusiness.msg.entity;

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
 * @version  2018-10-27 09:44:12
 * @see org.springrain.nybusiness.msg.entity.TsMsgChemicalSubstances
 */
@Table(name="ts_msg_chemical_substances")
public class TsMsgChemicalSubstances  extends BaseEntity {
	
	private static final long serialVersionUID = 1L;

	//alias
	/*
	public static final String TABLE_ALIAS = "化学物质调研表";
	public static final String ALIAS_ID = "主键";
	public static final String ALIAS_CHEMISTRYNAME = "化学品名称";
	public static final String ALIAS_CASTYPEID = "CAS 号或危 险废物类类别id 字典";
	public static final String ALIAS_CASTYPENAME = "CAS 号或危 险废物类别 2 name 字典";
	public static final String ALIAS_MAXSTOCK = "最大存量";
	public static final String ALIAS_RAWMATERIAL = "原料";
	public static final String ALIAS_ACCESSORIES = "辅料";
	public static final String ALIAS_PRODUCT = "产品";
	public static final String ALIAS_BETWEENPRODUCT = "中间产品";
	public static final String ALIAS_BYPRODUCT = "副产品";
	public static final String ALIAS_CATALYZER = "催化剂";
	public static final String ALIAS_DISCARDEDMATTER = "废弃物";
	public static final String ALIAS_RISKUNIT = "设计环境风险单位";
	public static final String ALIAS_CREATEUSER = "createUser";
	public static final String ALIAS_CREATETIME = "createTime";
	public static final String ALIAS_REMARKS = "remarks";
	public static final String ALIAS_COMPANYID = "companyId";
	public static final String ALIAS_CREATEUSER = "createUserName";
	public static final String ALIAS_BAK2 = "bak2";
	public static final String ALIAS_BAK3 = "bak3";
    */
	//date formats
	
	//columns START
	/**
	 * 主键
	 */
	private java.lang.String id;
	/**
	 * 化学品名称
	 */
	private java.lang.String chemistryName;
	/**
	 * CAS 号或危 险废物类类别id 字典
	 */
	private java.lang.String casTypeid;
	/**
	 * CAS 号或危 险废物类别 2 name 字典
	 */
	private java.lang.String casTypeName;
	/**
	 * 最大存量
	 */
	private java.lang.String maxstock;
	/**
	 * 原料
	 */
	private java.lang.String rawmaterial;
	/**
	 * 辅料
	 */
	private java.lang.String accessories;
	/**
	 * 产品
	 */
	private java.lang.String product;
	/**
	 * 中间产品
	 */
	private java.lang.String betweenProduct;
	/**
	 * 副产品
	 */
	private java.lang.String byProduct;
	/**
	 * 催化剂
	 */
	private java.lang.String catalyzer;
	/**
	 * 废弃物
	 */
	private java.lang.String discardedMatter;
	/**
	 * 设计环境风险单位
	 */
	private java.lang.String riskunit;
	/**
	 * createUser
	 */
	private java.lang.String createUser;
	/**
	 * createTime
	 */
	private java.lang.String createTime;
	/**
	 * remarks
	 */
	private java.lang.String remarks;
	/**
	 * companyId
	 */
	private java.lang.String companyId;
	/**
	 * createUserName
	 */
	private java.lang.String createUserName;
	/**
	 * bak2
	 */
	private java.lang.String bak2;
	/**
	 * bak3
	 */
	private java.lang.String bak3;
	//columns END 数据库字段结束
	
	//concstructor

	public TsMsgChemicalSubstances(){
	}

	public TsMsgChemicalSubstances(
		java.lang.String id
	){
		this.id = id;
	}

	//get and set
		/**
		 * 主键
		 */
	public void setId(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.id = value;
	}
	
	
	
	/**
	 * 主键
	 */
	@Id
     @WhereSQL(sql="id=:TsMsgChemicalSubstances_id")
	public java.lang.String getId() {
		return this.id;
	}
		/**
		 * 化学品名称
		 */
	public void setChemistryName(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.chemistryName = value;
	}
	
	
	
	/**
	 * 化学品名称
	 */
     @WhereSQL(sql="chemistryName=:TsMsgChemicalSubstances_chemistryName")
	public java.lang.String getChemistryName() {
		return this.chemistryName;
	}
		/**
		 * CAS 号或危 险废物类类别id 字典
		 */
	public void setCasTypeid(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.casTypeid = value;
	}
	
	
	
	/**
	 * CAS 号或危 险废物类类别id 字典
	 */
     @WhereSQL(sql="casTypeid=:TsMsgChemicalSubstances_casTypeid")
	public java.lang.String getCasTypeid() {
		return this.casTypeid;
	}
		/**
		 * CAS 号或危 险废物类别 2 name 字典
		 */
	public void setCasTypeName(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.casTypeName = value;
	}
	
	
	
	/**
	 * CAS 号或危 险废物类别 2 name 字典
	 */
     @WhereSQL(sql="casTypeName=:TsMsgChemicalSubstances_casTypeName")
	public java.lang.String getCasTypeName() {
		return this.casTypeName;
	}
		/**
		 * 最大存量
		 */
	public void setMaxstock(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.maxstock = value;
	}
	
	
	
	/**
	 * 最大存量
	 */
     @WhereSQL(sql="maxstock=:TsMsgChemicalSubstances_maxstock")
	public java.lang.String getMaxstock() {
		return this.maxstock;
	}
		/**
		 * 原料
		 */
	public void setRawmaterial(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.rawmaterial = value;
	}
	
	
	
	/**
	 * 原料
	 */
     @WhereSQL(sql="rawmaterial=:TsMsgChemicalSubstances_rawmaterial")
	public java.lang.String getRawmaterial() {
		return this.rawmaterial;
	}
		/**
		 * 辅料
		 */
	public void setAccessories(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.accessories = value;
	}
	
	
	
	/**
	 * 辅料
	 */
     @WhereSQL(sql="accessories=:TsMsgChemicalSubstances_accessories")
	public java.lang.String getAccessories() {
		return this.accessories;
	}
		/**
		 * 产品
		 */
	public void setProduct(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.product = value;
	}
	
	
	
	/**
	 * 产品
	 */
     @WhereSQL(sql="product=:TsMsgChemicalSubstances_product")
	public java.lang.String getProduct() {
		return this.product;
	}
		/**
		 * 中间产品
		 */
	public void setBetweenProduct(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.betweenProduct = value;
	}
	
	
	
	/**
	 * 中间产品
	 */
     @WhereSQL(sql="betweenProduct=:TsMsgChemicalSubstances_betweenProduct")
	public java.lang.String getBetweenProduct() {
		return this.betweenProduct;
	}
		/**
		 * 副产品
		 */
	public void setByProduct(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.byProduct = value;
	}
	
	
	
	/**
	 * 副产品
	 */
     @WhereSQL(sql="byProduct=:TsMsgChemicalSubstances_byProduct")
	public java.lang.String getByProduct() {
		return this.byProduct;
	}
		/**
		 * 催化剂
		 */
	public void setCatalyzer(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.catalyzer = value;
	}
	
	
	
	/**
	 * 催化剂
	 */
     @WhereSQL(sql="catalyzer=:TsMsgChemicalSubstances_catalyzer")
	public java.lang.String getCatalyzer() {
		return this.catalyzer;
	}
		/**
		 * 废弃物
		 */
	public void setDiscardedMatter(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.discardedMatter = value;
	}
	
	
	
	/**
	 * 废弃物
	 */
     @WhereSQL(sql="discardedMatter=:TsMsgChemicalSubstances_discardedMatter")
	public java.lang.String getDiscardedMatter() {
		return this.discardedMatter;
	}
		/**
		 * 设计环境风险单位
		 */
	public void setRiskunit(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.riskunit = value;
	}
	
	
	
	/**
	 * 设计环境风险单位
	 */
     @WhereSQL(sql="riskunit=:TsMsgChemicalSubstances_riskunit")
	public java.lang.String getRiskunit() {
		return this.riskunit;
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
     @WhereSQL(sql="createUser=:TsMsgChemicalSubstances_createUser")
	public java.lang.String getCreateUser() {
		return this.createUser;
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
     @WhereSQL(sql="createTime=:TsMsgChemicalSubstances_createTime")
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
     @WhereSQL(sql="remarks=:TsMsgChemicalSubstances_remarks")
	public java.lang.String getRemarks() {
		return this.remarks;
	}
		/**
		 * companyId
		 */
	public void setCompanyId(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.companyId = value;
	}
	
	
	
	/**
	 * companyId
	 */
     @WhereSQL(sql="companyId=:TsMsgChemicalSubstances_companyId")
	public java.lang.String getCompanyId() {
		return this.companyId;
	}
		/**
		 * createUserName
		 */
	public void setCreateUserName(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.createUserName = value;
	}
	
	
	
	/**
	 * createUserName
	 */
     @WhereSQL(sql="createUserName=:TsMsgChemicalSubstances_createUserName")
	public java.lang.String getCreateUserName() {
		return this.createUserName;
	}
		/**
		 * bak2
		 */
	public void setBak2(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.bak2 = value;
	}
	
	
	
	/**
	 * bak2
	 */
     @WhereSQL(sql="bak2=:TsMsgChemicalSubstances_bak2")
	public java.lang.String getBak2() {
		return this.bak2;
	}
		/**
		 * bak3
		 */
	public void setBak3(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.bak3 = value;
	}
	
	
	
	/**
	 * bak3
	 */
     @WhereSQL(sql="bak3=:TsMsgChemicalSubstances_bak3")
	public java.lang.String getBak3() {
		return this.bak3;
	}
	@Override
	public String toString() {
		return new StringBuilder()
			.append("主键[").append(getId()).append("],")
			.append("化学品名称[").append(getChemistryName()).append("],")
			.append("CAS 号或危 险废物类类别id 字典[").append(getCasTypeid()).append("],")
			.append("CAS 号或危 险废物类别 2 name 字典[").append(getCasTypeName()).append("],")
			.append("最大存量[").append(getMaxstock()).append("],")
			.append("原料[").append(getRawmaterial()).append("],")
			.append("辅料[").append(getAccessories()).append("],")
			.append("产品[").append(getProduct()).append("],")
			.append("中间产品[").append(getBetweenProduct()).append("],")
			.append("副产品[").append(getByProduct()).append("],")
			.append("催化剂[").append(getCatalyzer()).append("],")
			.append("废弃物[").append(getDiscardedMatter()).append("],")
			.append("设计环境风险单位[").append(getRiskunit()).append("],")
			.append("createUser[").append(getCreateUser()).append("],")
			.append("createTime[").append(getCreateTime()).append("],")
			.append("remarks[").append(getRemarks()).append("],")
			.append("companyId[").append(getCompanyId()).append("],")
			.append("createUserName[").append(getCreateUserName()).append("],")
			.append("bak2[").append(getBak2()).append("],")
			.append("bak3[").append(getBak3()).append("],")
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
		if(obj instanceof TsMsgChemicalSubstances == false){
			return false;
		}
			
		if(this == obj){
			return true;
		}
		
		TsMsgChemicalSubstances other = (TsMsgChemicalSubstances)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

	
