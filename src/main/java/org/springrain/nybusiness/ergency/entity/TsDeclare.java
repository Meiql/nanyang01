package org.springrain.nybusiness.ergency.entity;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import org.springrain.frame.annotation.WhereSQL;
import org.springrain.frame.entity.BaseEntity;
/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-11-20 11:16:28
 * @see org.springrain.nybusiness.company.entity.TsDeclare
 */
@Table(name="ts_declare")
public class TsDeclare  extends BaseEntity {
	
	private static final long serialVersionUID = 1L;

	//alias
	/*
	public static final String TABLE_ALIAS = "年（月）度申报表";
	public static final String ALIAS_ID = "主键";
	public static final String ALIAS_MATERIALNAME = "物资名称";
	public static final String ALIAS_LASTYEARBALANCE = "上年结余";
	public static final String ALIAS_UNIT = "单位";
	public static final String ALIAS_NEWLYINCREASE = "本年新增";
	public static final String ALIAS_ORIGIN = "来源";
	public static final String ALIAS_REDUCEDYEAR = "本年减少";
	public static final String ALIAS_WHEREABOUTS = "去向";
	public static final String ALIAS_SURPLUS = "剩余";
	public static final String ALIAS_CREATEUSER = "创建人";
	public static final String ALIAS_CREATETIME = "创建时间";
	public static final String ALIAS_REMARKS = "remarks";
	public static final String ALIAS_COMPANYID = "companyId";
	public static final String ALIAS_BAK1 = "bak1";
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
	 * 物资名称
	 */
	private java.lang.String materialName;
	/**
	 * 上年结余
	 */
	private java.lang.String lastYearBalance;
	/**
	 * 单位
	 */
	private java.lang.String unit;
	/**
	 * 本年新增
	 */
	private java.lang.String newlyIncrease;
	/**
	 * 来源
	 */
	private java.lang.String origin;
	/**
	 * 本年减少
	 */
	private java.lang.String reducedYear;
	/**
	 * 去向
	 */
	private java.lang.String whereabouts;
	/**
	 * 剩余
	 */
	private java.lang.String surplus;
	/**
	 * 创建人
	 */
	private java.lang.String createUser;
	/**
	 * 创建时间
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
	 * bak1
	 */
	private java.lang.String bak1;//1：年报 2：月报
	/**
	 * bak2
	 */
	private java.lang.String bak2;//1：新增 2：审批中 3：通过 4：未通过
	/**
	 * bak3
	 */
	private java.lang.String bak3;
	/**
	 * 年（月）报时间
	 */
	private java.lang.String declareTime; 
	/**
	 * 审核人
	 */
	private java.lang.String auditor;
	/**
	 * 审核时间
	 */
	private java.lang.String auditorTime;
	//columns END 数据库字段结束
	@Transient
	private java.lang.String auditorName; 
	/**
	 * 审核人姓名
	 */
	private java.lang.String createName; 
	//concstructor

	public TsDeclare(){
	}

	public TsDeclare(
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
     @WhereSQL(sql="id=:TsDeclare_id")
	public java.lang.String getId() {
		return this.id;
	}
		/**
		 * 物资名称
		 */
	public void setMaterialName(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.materialName = value;
	}
	
	
	
	/**
	 * 物资名称
	 */
     @WhereSQL(sql="materialName=:TsDeclare_materialName")
	public java.lang.String getMaterialName() {
		return this.materialName;
	}
		/**
		 * 上年结余
		 */
	public void setLastYearBalance(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.lastYearBalance = value;
	}
	
	
	
	/**
	 * 上年结余
	 */
     @WhereSQL(sql="lastYearBalance=:TsDeclare_lastYearBalance")
	public java.lang.String getLastYearBalance() {
		return this.lastYearBalance;
	}
		/**
		 * 单位
		 */
	public void setUnit(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.unit = value;
	}
	
	
	
	/**
	 * 单位
	 */
     @WhereSQL(sql="unit=:TsDeclare_unit")
	public java.lang.String getUnit() {
		return this.unit;
	}
		/**
		 * 本年新增
		 */
	public void setNewlyIncrease(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.newlyIncrease = value;
	}
	
	
	
	/**
	 * 本年新增
	 */
     @WhereSQL(sql="newlyIncrease=:TsDeclare_newlyIncrease")
	public java.lang.String getNewlyIncrease() {
		return this.newlyIncrease;
	}
		/**
		 * 来源
		 */
	public void setOrigin(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.origin = value;
	}
	
	
	
	/**
	 * 来源
	 */
     @WhereSQL(sql="origin=:TsDeclare_origin")
	public java.lang.String getOrigin() {
		return this.origin;
	}
		/**
		 * 本年减少
		 */
	public void setReducedYear(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.reducedYear = value;
	}
	
	
	
	/**
	 * 本年减少
	 */
     @WhereSQL(sql="reducedYear=:TsDeclare_reducedYear")
	public java.lang.String getReducedYear() {
		return this.reducedYear;
	}
		/**
		 * 去向
		 */
	public void setWhereabouts(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.whereabouts = value;
	}
	
	
	
	/**
	 * 去向
	 */
     @WhereSQL(sql="whereabouts=:TsDeclare_whereabouts")
	public java.lang.String getWhereabouts() {
		return this.whereabouts;
	}
		/**
		 * 剩余
		 */
	public void setSurplus(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.surplus = value;
	}
	
	
	
	/**
	 * 剩余
	 */
     @WhereSQL(sql="surplus=:TsDeclare_surplus")
	public java.lang.String getSurplus() {
		return this.surplus;
	}
		/**
		 * 创建人
		 */
	public void setCreateUser(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.createUser = value;
	}
	
	
	
	/**
	 * 创建人
	 */
     @WhereSQL(sql="createUser=:TsDeclare_createUser")
	public java.lang.String getCreateUser() {
		return this.createUser;
	}
		/**
		 * 创建时间
		 */
	public void setCreateTime(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.createTime = value;
	}
	
	
	
	/**
	 * 创建时间
	 */
     @WhereSQL(sql="createTime=:TsDeclare_createTime")
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
     @WhereSQL(sql="remarks=:TsDeclare_remarks")
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
     @WhereSQL(sql="companyId=:TsDeclare_companyId")
	public java.lang.String getCompanyId() {
		return this.companyId;
	}
		/**
		 * bak1
		 */
	public void setBak1(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.bak1 = value;
	}
	
	
	
	/**
	 * bak1
	 */
     @WhereSQL(sql="bak1=:TsDeclare_bak1")
	public java.lang.String getBak1() {
		return this.bak1;
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
     @WhereSQL(sql="bak2=:TsDeclare_bak2")
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
	 *
	 */
 @WhereSQL(sql="bak3=:TsDeclare_bak3")
	public java.lang.String getBak3() {
		return this.bak3;
	}
	
	
	/**
	 * 制表时间
	 */
     @WhereSQL(sql="declareTime=:TsDeclare_declareTime")
	public java.lang.String getDeclareTime() {
		return this.declareTime;
	}
 		/**
		 * 制表时间
		 */
	public void setDeclareTime(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.declareTime = value;
	}
	
	/**
	 * 审核人
	 */
     @WhereSQL(sql="auditor=:TsDeclare_auditor")
	public java.lang.String getAuditor() {
		return this.auditor;
	}
 		/**
		 * 审核人
		 */
	public void setAuditor(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.auditor = value;
	}
	
	/**
	 * 审核时间
	 */
     @WhereSQL(sql="auditorTime=:TsDeclare_auditorTime")
	public java.lang.String getAuditorTime() {
		return this.auditorTime;
	}
 		/**
		 * 审核时间
		 */
	public void setAuditorTime(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.auditorTime = value;
	}
	
	
	 @WhereSQL(sql="auditorName=:TsDeclare_auditorName")
 	public String getAuditorName() {
 		return auditorName;
 	}

 	public void setAuditorName(String auditorName) {
 		this.auditorName = auditorName;
 	}
 	
 	@Transient
 	public String getCreateName() {
 		return createName;
 	}

 	public void setCreateName(String createName) {
 		this.createName = createName;
 	}
	@Override
	public String toString() {
		return new StringBuilder()
			.append("主键[").append(getId()).append("],")
			.append("物资名称[").append(getMaterialName()).append("],")
			.append("上年结余[").append(getLastYearBalance()).append("],")
			.append("单位[").append(getUnit()).append("],")
			.append("本年新增[").append(getNewlyIncrease()).append("],")
			.append("来源[").append(getOrigin()).append("],")
			.append("本年减少[").append(getReducedYear()).append("],")
			.append("去向[").append(getWhereabouts()).append("],")
			.append("剩余[").append(getSurplus()).append("],")
			.append("创建人[").append(getCreateUser()).append("],")
			.append("创建时间[").append(getCreateTime()).append("],")
			.append("年（月）报时间[").append(getCreateTime()).append("],")
			.append("审核人[").append(getCreateTime()).append("],")
			.append("审核时间[").append(getCreateTime()).append("],")
			.append("remarks[").append(getRemarks()).append("],")
			.append("companyId[").append(getCompanyId()).append("],")
			.append("bak1[").append(getBak1()).append("],")
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
		if(obj instanceof TsDeclare == false){
			return false;
		}
			
		if(this == obj){
			return true;
		}
		
		TsDeclare other = (TsDeclare)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

	
