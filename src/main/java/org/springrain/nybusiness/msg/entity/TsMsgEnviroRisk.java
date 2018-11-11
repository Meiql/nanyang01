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
 * @version  2018-10-27 09:44:24
 * @see org.springrain.nybusiness.msg.entity.TsMsgEnviroRisk
 */
@Table(name="ts_msg_enviro_risk")
public class TsMsgEnviroRisk  extends BaseEntity {
	
	private static final long serialVersionUID = 1L;

	//alias
	/*
	public static final String TABLE_ALIAS = "环境风险单元信息表";
	public static final String ALIAS_ID = "主键id";
	public static final String ALIAS_RISKUNITNAME = "风险单位名称";
	public static final String ALIAS_RISKUNITTYPEID = "风险单位类型";
	public static final String ALIAS_RISKUNITTYPENAME = "风险单位类别 name ";
	public static final String ALIAS_RESERVES = "设计能力或储量";
	public static final String ALIAS_CREATEUSER = "createUser";
	public static final String ALIAS_CREATETIME = "createTime";
	public static final String ALIAS_REMARKS = "remarks";
	public static final String ALIAS_COMPANYID = "企业id";
	public static final String ALIAS_INVOLVECHEMICAL = "involveChemical";
	public static final String ALIAS_DEscribes = "describes";
	public static final String ALIAS_CREATEUSERNAME = "createUserName";
    */
	//date formats
	
	//columns START
	/**
	 * 主键id
	 */
	private java.lang.String id;
	/**
	 * 风险单位名称
	 */
	private java.lang.String riskUnitName;
	/**
	 * 风险单位类型
	 */
	private java.lang.String riskUnitTypeid;
	/**
	 * 风险单位类别 name 
	 */
	private java.lang.String riskUnitTypeName;
	/**
	 * 设计能力或储量
	 */
	private java.lang.String reserves;
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
	 * 企业id
	 */
	private java.lang.String companyId;
	/**
	 * involveChemical
	 */
	private java.lang.String involveChemical;
	/**
	 * describes
	 */
	private java.lang.String describes;
	/**
	 * createUserName
	 */
	private java.lang.String createUserName;
	//columns END 数据库字段结束
	
	//concstructor
	public TsMsgEnviroRisk(){
		
	}

	//get and set
	public TsMsgEnviroRisk(
		java.lang.String id
	){
		this.id = id;
	}
		/**
		 * 主键id
		 */
	public void setId(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.id = value;
	}
	
	
	
	/**
	 * 主键id
	 */
	@Id
     @WhereSQL(sql="id=:TsMsgEnviroRisk_id")
	public java.lang.String getId() {
		return this.id;
	}
		/**
		 * 风险单位名称
		 */
	public void setRiskUnitName(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.riskUnitName = value;
	}
	
	
	
	/**
	 * 风险单位名称
	 */
     @WhereSQL(sql="riskUnitName=:TsMsgEnviroRisk_riskUnitName")
	public java.lang.String getRiskUnitName() {
		return this.riskUnitName;
	}
		/**
		 * 风险单位类型
		 */
	public void setRiskUnitTypeid(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.riskUnitTypeid = value;
	}
	
	
	
	/**
	 * 风险单位类型
	 */
     @WhereSQL(sql="riskUnitTypeid=:TsMsgEnviroRisk_riskUnitTypeid")
	public java.lang.String getRiskUnitTypeid() {
		return this.riskUnitTypeid;
	}
		/**
		 * 风险单位类别 name 
		 */
	public void setRiskUnitTypeName(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.riskUnitTypeName = value;
	}
	
	
	
	/**
	 * 风险单位类别 name 
	 */
     @WhereSQL(sql="riskUnitTypeName=:TsMsgEnviroRisk_riskUnitTypeName")
	public java.lang.String getRiskUnitTypeName() {
		return this.riskUnitTypeName;
	}
		/**
		 * 设计能力或储量
		 */
	public void setReserves(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.reserves = value;
	}
	
	
	
	/**
	 * 设计能力或储量
	 */
     @WhereSQL(sql="reserves=:TsMsgEnviroRisk_reserves")
	public java.lang.String getReserves() {
		return this.reserves;
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
     @WhereSQL(sql="createUser=:TsMsgEnviroRisk_createUser")
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
     @WhereSQL(sql="createTime=:TsMsgEnviroRisk_createTime")
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
     @WhereSQL(sql="remarks=:TsMsgEnviroRisk_remarks")
	public java.lang.String getRemarks() {
		return this.remarks;
	}
		/**
		 * 企业id
		 */
	public void setCompanyId(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.companyId = value;
	}
	
	
	
	/**
	 * 企业id
	 */
     @WhereSQL(sql="companyId=:TsMsgEnviroRisk_companyId")
	public java.lang.String getCompanyId() {
		return this.companyId;
	}
		/**
		 * involveChemical
		 */
	public void setInvolveChemical(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.involveChemical = value;
	}
	
	
	
	/**
	 * involveChemical
	 */
     @WhereSQL(sql="involveChemical=:TsMsgEnviroRisk_involveChemical")
	public java.lang.String getInvolveChemical() {
		return this.involveChemical;
	}
		/**
		 * describes
		 */
	public void setDescribes(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.describes = value;
	}
	
	
	
	/**
	 * describes
	 */
     @WhereSQL(sql="describes=:TsMsgEnviroRisk_describes")
	public java.lang.String getDescribes() {
		return this.describes;
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
     @WhereSQL(sql="createUserName=:TsMsgEnviroRisk_createUserName")
	public java.lang.String getCreateUserName() {
		return this.createUserName;
	}
	@Override
	public String toString() {
		return new StringBuilder()
			.append("主键id[").append(getId()).append("],")
			.append("风险单位名称[").append(getRiskUnitName()).append("],")
			.append("风险单位类型[").append(getRiskUnitTypeid()).append("],")
			.append("风险单位类别 name [").append(getRiskUnitTypeName()).append("],")
			.append("设计能力或储量[").append(getReserves()).append("],")
			.append("createUser[").append(getCreateUser()).append("],")
			.append("createTime[").append(getCreateTime()).append("],")
			.append("remarks[").append(getRemarks()).append("],")
			.append("企业id[").append(getCompanyId()).append("],")
			.append("involveChemical[").append(getInvolveChemical()).append("],")
			.append("describes[").append(getDescribes()).append("],")
			.append("createUserName[").append(getCreateUserName()).append("],")
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
		if(obj instanceof TsMsgEnviroRisk == false){
			return false;
		}
			
		if(this == obj){
			return true;
		}
		
		TsMsgEnviroRisk other = (TsMsgEnviroRisk)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

	
