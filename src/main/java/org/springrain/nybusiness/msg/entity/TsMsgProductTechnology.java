package org.springrain.nybusiness.msg.entity;

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
 * @version  2018-10-27 09:45:34
 * @see org.springrain.nybusiness.msg.entity.TsMsgProductTechnology
 */
@Table(name="ts_msg_product_technology")
public class TsMsgProductTechnology  extends BaseEntity {
	
	private static final long serialVersionUID = 1L;

	//alias
	/*
	public static final String TABLE_ALIAS = "生产工艺过程综合情况表";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_TECHNOLOGYID = "工艺id";
	public static final String ALIAS_RISKUNITNUMBER = "涉及到的风险单元套数";
	public static final String ALIAS_RISKUNIT = "涉及到的风险单元";
	public static final String ALIAS_CREATEUSER = "createUser";
	public static final String ALIAS_CREATETIME = "createTime";
	public static final String ALIAS_REMARKS = "remarks";
	public static final String ALIAS_COMPANYID = "companyId";
	public static final String ALIAS_TECHNOLOGYNAME = "technologyName";
	public static final String ALIAS_WHETHERORNOT = "whetherOrNot";
	public static final String ALIAS_BAK3 = "bak3";
    */
	//date formats
	
	//columns START
	/**
	 * id
	 */
	private java.lang.String id;
	/**
	 * 工艺id
	 */
	private java.lang.String technologyId;
	/**
	 * 涉及到的风险单元套数
	 */
	private java.lang.String riskUnitNumber;
	/**
	 * 涉及到的风险单元
	 */
	private java.lang.String riskUnit;
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
	 * technologyName
	 */
	private java.lang.String technologyName;
	/**
	 * whetherOrNot
	 */
	private java.lang.String whetherOrNot;
	/**
	 * bak3
	 */
	private java.lang.String bak3;
	//columns END 数据库字段结束
	
	//concstructor
	public TsMsgProductTechnology(){
		
	}

	//get and set
	public TsMsgProductTechnology(
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
     @WhereSQL(sql="id=:TsMsgProductTechnology_id")
	public java.lang.String getId() {
		return this.id;
	}
		/**
		 * 工艺id
		 */
	public void setTechnologyId(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.technologyId = value;
	}
	
	
	
	/**
	 * 工艺id
	 */
     @WhereSQL(sql="technologyId=:TsMsgProductTechnology_technologyId")
	public java.lang.String getTechnologyId() {
		return this.technologyId;
	}
		/**
		 * 涉及到的风险单元套数
		 */
	public void setRiskUnitNumber(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.riskUnitNumber = value;
	}
	
	
	
	/**
	 * 涉及到的风险单元套数
	 */
     @WhereSQL(sql="riskUnitNumber=:TsMsgProductTechnology_riskUnitNumber")
	public java.lang.String getRiskUnitNumber() {
		return this.riskUnitNumber;
	}
		/**
		 * 涉及到的风险单元
		 */
	public void setRiskUnit(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.riskUnit = value;
	}
	
	
	
	/**
	 * 涉及到的风险单元
	 */
     @WhereSQL(sql="riskUnit=:TsMsgProductTechnology_riskUnit")
	public java.lang.String getRiskUnit() {
		return this.riskUnit;
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
     @WhereSQL(sql="createUser=:TsMsgProductTechnology_createUser")
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
     @WhereSQL(sql="createTime=:TsMsgProductTechnology_createTime")
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
     @WhereSQL(sql="remarks=:TsMsgProductTechnology_remarks")
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
     @WhereSQL(sql="companyId=:TsMsgProductTechnology_companyId")
	public java.lang.String getCompanyId() {
		return this.companyId;
	}
		/**
		 * technologyName
		 */
	public void setTechnologyName(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.technologyName = value;
	}
	
	
	
	/**
	 * technologyName
	 */
     @WhereSQL(sql="technologyName=:TsMsgProductTechnology_technologyName")
	public java.lang.String getTechnologyName() {
		return this.technologyName;
	}
		/**
		 * whetherOrNot
		 */
	public void setWhetherOrNot(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.whetherOrNot = value;
	}
	
	
	
	/**
	 * whetherOrNot
	 */
     @WhereSQL(sql="whetherOrNot=:TsMsgProductTechnology_whetherOrNot")
	public java.lang.String getWhetherOrNot() {
		return this.whetherOrNot;
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
     @WhereSQL(sql="bak3=:TsMsgProductTechnology_bak3")
	public java.lang.String getBak3() {
		return this.bak3;
	}
	@Override
	public String toString() {
		return new StringBuilder()
			.append("id[").append(getId()).append("],")
			.append("工艺id[").append(getTechnologyId()).append("],")
			.append("涉及到的风险单元套数[").append(getRiskUnitNumber()).append("],")
			.append("涉及到的风险单元[").append(getRiskUnit()).append("],")
			.append("createUser[").append(getCreateUser()).append("],")
			.append("createTime[").append(getCreateTime()).append("],")
			.append("remarks[").append(getRemarks()).append("],")
			.append("companyId[").append(getCompanyId()).append("],")
			.append("technologyName[").append(getTechnologyName()).append("],")
			.append("whetherOrNot[").append(getWhetherOrNot()).append("],")
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
		if(obj instanceof TsMsgProductTechnology == false){
			return false;
		}
			
		if(this == obj){
			return true;
		}
		
		TsMsgProductTechnology other = (TsMsgProductTechnology)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}
	
