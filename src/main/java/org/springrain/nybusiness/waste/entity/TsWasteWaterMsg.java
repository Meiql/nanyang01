package org.springrain.nybusiness.waste.entity;

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
 * @version  2018-10-27 09:48:01
 * @see org.springrain.nybusiness.waste.entity.TsWasteWaterMsg
 */
@Table(name="ts_waste_water_msg")
public class TsWasteWaterMsg  extends BaseEntity {
	
	private static final long serialVersionUID = 1L;

	//alias
	/*
	public static final String TABLE_ALIAS = "废水处理设施基本情况表";
	public static final String ALIAS_ID = "主键";
	public static final String ALIAS_PROCESSINGMETHOD = "废水处理措施";
	public static final String ALIAS_PROCESSINGCAPACITY = "废水处理能力 吨";
	public static final String ALIAS_OUTLETLOCATION = "排污口方位";
	public static final String ALIAS_EMISSIONCODE = "废水排放去向代码";
	public static final String ALIAS_SEWAGESOURCE = "污水来源";
	public static final String ALIAS_STINKINGMATERIAL = "废水中恶臭物质";
	public static final String ALIAS_CONTROLMEASURES = "废水中是否有臭气控制";
	public static final String ALIAS_ACTIONBEHAVIOR = "措施行为 1 加盖 2 加药 3其他";
	public static final String ALIAS_PROCESSDESC = "流程说明";
	public static final String ALIAS_TREATMENTEFFECT = "废水处理效果";
	public static final String ALIAS_CREATEUSER = "createUser";
	public static final String ALIAS_CREATETIME = "createTime";
	public static final String ALIAS_REMARKS = "remarks";
	public static final String ALIAS_COMPANYID = "企业id";
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
	 * 废水处理措施
	 */
	private java.lang.String processingMethod;
	/**
	 * 废水处理能力 吨
	 */
	private java.lang.String processingCapacity;
	/**
	 * 排污口方位
	 */
	private java.lang.String outletLocation;
	/**
	 * 废水排放去向代码
	 */
	private java.lang.String emissionCode;
	/**
	 * 污水来源
	 */
	private java.lang.String sewageSource;
	/**
	 * 废水中恶臭物质
	 */
	private java.lang.String stinkingMaterial;
	/**
	 * 废水中是否有臭气控制
	 */
	private java.lang.String controlMeasures;
	/**
	 * 措施行为 1 加盖 2 加药 3其他
	 */
	private java.lang.String actionBehavior;
	/**
	 * 流程说明
	 */
	private java.lang.String processDesc;
	/**
	 * 废水处理效果
	 */
	private java.lang.String treatmentEffect;
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
	 * bak1
	 */
	private java.lang.String bak1;
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

	public TsWasteWaterMsg(){
	}

	public TsWasteWaterMsg(
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
     @WhereSQL(sql="id=:TsWasteWaterMsg_id")
	public java.lang.String getId() {
		return this.id;
	}
		/**
		 * 废水处理措施
		 */
	public void setProcessingMethod(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.processingMethod = value;
	}
	
	
	
	/**
	 * 废水处理措施
	 */
     @WhereSQL(sql="processingMethod=:TsWasteWaterMsg_processingMethod")
	public java.lang.String getProcessingMethod() {
		return this.processingMethod;
	}
		/**
		 * 废水处理能力 吨
		 */
	public void setProcessingCapacity(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.processingCapacity = value;
	}
	
	
	
	/**
	 * 废水处理能力 吨
	 */
     @WhereSQL(sql="processingCapacity=:TsWasteWaterMsg_processingCapacity")
	public java.lang.String getProcessingCapacity() {
		return this.processingCapacity;
	}
		/**
		 * 排污口方位
		 */
	public void setOutletLocation(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.outletLocation = value;
	}
	
	
	
	/**
	 * 排污口方位
	 */
     @WhereSQL(sql="outletLocation=:TsWasteWaterMsg_outletLocation")
	public java.lang.String getOutletLocation() {
		return this.outletLocation;
	}
		/**
		 * 废水排放去向代码
		 */
	public void setEmissionCode(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.emissionCode = value;
	}
	
	
	
	/**
	 * 废水排放去向代码
	 */
     @WhereSQL(sql="emissionCode=:TsWasteWaterMsg_emissionCode")
	public java.lang.String getEmissionCode() {
		return this.emissionCode;
	}
		/**
		 * 污水来源
		 */
	public void setSewageSource(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.sewageSource = value;
	}
	
	
	
	/**
	 * 污水来源
	 */
     @WhereSQL(sql="sewageSource=:TsWasteWaterMsg_sewageSource")
	public java.lang.String getSewageSource() {
		return this.sewageSource;
	}
		/**
		 * 废水中恶臭物质
		 */
	public void setStinkingMaterial(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.stinkingMaterial = value;
	}
	
	
	
	/**
	 * 废水中恶臭物质
	 */
     @WhereSQL(sql="stinkingMaterial=:TsWasteWaterMsg_stinkingMaterial")
	public java.lang.String getStinkingMaterial() {
		return this.stinkingMaterial;
	}
		/**
		 * 废水中是否有臭气控制
		 */
	public void setControlMeasures(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.controlMeasures = value;
	}
	
	
	
	/**
	 * 废水中是否有臭气控制
	 */
     @WhereSQL(sql="controlMeasures=:TsWasteWaterMsg_controlMeasures")
	public java.lang.String getControlMeasures() {
		return this.controlMeasures;
	}
		/**
		 * 措施行为 1 加盖 2 加药 3其他
		 */
	public void setActionBehavior(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.actionBehavior = value;
	}
	
	
	
	/**
	 * 措施行为 1 加盖 2 加药 3其他
	 */
     @WhereSQL(sql="actionBehavior=:TsWasteWaterMsg_actionBehavior")
	public java.lang.String getActionBehavior() {
		return this.actionBehavior;
	}
		/**
		 * 流程说明
		 */
	public void setProcessDesc(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.processDesc = value;
	}
	
	
	
	/**
	 * 流程说明
	 */
     @WhereSQL(sql="processDesc=:TsWasteWaterMsg_processDesc")
	public java.lang.String getProcessDesc() {
		return this.processDesc;
	}
		/**
		 * 废水处理效果
		 */
	public void setTreatmentEffect(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.treatmentEffect = value;
	}
	
	
	
	/**
	 * 废水处理效果
	 */
     @WhereSQL(sql="treatmentEffect=:TsWasteWaterMsg_treatmentEffect")
	public java.lang.String getTreatmentEffect() {
		return this.treatmentEffect;
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
     @WhereSQL(sql="createUser=:TsWasteWaterMsg_createUser")
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
     @WhereSQL(sql="createTime=:TsWasteWaterMsg_createTime")
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
     @WhereSQL(sql="remarks=:TsWasteWaterMsg_remarks")
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
     @WhereSQL(sql="companyId=:TsWasteWaterMsg_companyId")
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
     @WhereSQL(sql="bak1=:TsWasteWaterMsg_bak1")
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
     @WhereSQL(sql="bak2=:TsWasteWaterMsg_bak2")
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
     @WhereSQL(sql="bak3=:TsWasteWaterMsg_bak3")
	public java.lang.String getBak3() {
		return this.bak3;
	}
	@Override
	public String toString() {
		return new StringBuilder()
			.append("主键[").append(getId()).append("],")
			.append("废水处理措施[").append(getProcessingMethod()).append("],")
			.append("废水处理能力 吨[").append(getProcessingCapacity()).append("],")
			.append("排污口方位[").append(getOutletLocation()).append("],")
			.append("废水排放去向代码[").append(getEmissionCode()).append("],")
			.append("污水来源[").append(getSewageSource()).append("],")
			.append("废水中恶臭物质[").append(getStinkingMaterial()).append("],")
			.append("废水中是否有臭气控制[").append(getControlMeasures()).append("],")
			.append("措施行为 1 加盖 2 加药 3其他[").append(getActionBehavior()).append("],")
			.append("流程说明[").append(getProcessDesc()).append("],")
			.append("废水处理效果[").append(getTreatmentEffect()).append("],")
			.append("createUser[").append(getCreateUser()).append("],")
			.append("createTime[").append(getCreateTime()).append("],")
			.append("remarks[").append(getRemarks()).append("],")
			.append("企业id[").append(getCompanyId()).append("],")
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
		if(obj instanceof TsWasteWaterMsg == false){
			return false;
		}
			
		if(this == obj){
			return true;
		}
		
		TsWasteWaterMsg other = (TsWasteWaterMsg)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

	
