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
 * @version  2018-10-27 09:47:29
 * @see org.springrain.nybusiness.waste.entity.TsWasteEmptyingMsg
 */
@Table(name="ts_waste_emptying_msg")
public class TsWasteEmptyingMsg  extends BaseEntity {
	
	private static final long serialVersionUID = 1L;

	//alias
	/*
	public static final String TABLE_ALIAS = "放空情况";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_WATERID = "waterId";
	public static final String ALIAS_AIRID = "废弃处理表id";
	public static final String ALIAS_MATERIALID = "危险物质处理表id";
	public static final String ALIAS_PROCESSNAME = "存在放空的工艺名称";
	public static final String ALIAS_MAINCHEMICALMATERIALS = "涉及的化学物质";
	public static final String ALIAS_EMPTYINGCONDITION = "放空条件";
	public static final String ALIAS_EMPTYINGNUM = "放空次数";
	public static final String ALIAS_TIME = "平均单次执行时间";
	public static final String ALIAS_CREATEUSER = "createUser";
	public static final String ALIAS_CREATETIME = "createTime";
	public static final String ALIAS_REMARKS = "remarks";
	public static final String ALIAS_COMPANYID = "companyId";
	public static final String ALIAS_BAK1 = "bak1";
	public static final String ALIAS_BAK2 = "bak2";
	public static final String ALIAS_BAK3 = "bak3";
    */
	//date formats
	
	//columns START
	/**
	 * id
	 */
	private java.lang.String id;
	/**
	 * waterId
	 */
	private java.lang.String waterId;
	/**
	 * 废弃处理表id
	 */
	private java.lang.String airId;
	/**
	 * 危险物质处理表id
	 */
	private java.lang.String materialId;
	/**
	 * 存在放空的工艺名称
	 */
	private java.lang.String processName;
	/**
	 * 涉及的化学物质
	 */
	private java.lang.String mainChemicalMaterials;
	/**
	 * 放空条件
	 */
	private java.lang.String emptyingCondition;
	/**
	 * 放空次数
	 */
	private java.lang.String emptyingNum;
	/**
	 * 平均单次执行时间
	 */
	private java.lang.String time;
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

	public TsWasteEmptyingMsg(){
	}

	public TsWasteEmptyingMsg(
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
     @WhereSQL(sql="id=:TsWasteEmptyingMsg_id")
	public java.lang.String getId() {
		return this.id;
	}
		/**
		 * waterId
		 */
	public void setWaterId(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.waterId = value;
	}
	
	
	
	/**
	 * waterId
	 */
     @WhereSQL(sql="waterId=:TsWasteEmptyingMsg_waterId")
	public java.lang.String getWaterId() {
		return this.waterId;
	}
		/**
		 * 废弃处理表id
		 */
	public void setAirId(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.airId = value;
	}
	
	
	
	/**
	 * 废弃处理表id
	 */
     @WhereSQL(sql="airId=:TsWasteEmptyingMsg_airId")
	public java.lang.String getAirId() {
		return this.airId;
	}
		/**
		 * 危险物质处理表id
		 */
	public void setMaterialId(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.materialId = value;
	}
	
	
	
	/**
	 * 危险物质处理表id
	 */
     @WhereSQL(sql="materialId=:TsWasteEmptyingMsg_materialId")
	public java.lang.String getMaterialId() {
		return this.materialId;
	}
		/**
		 * 存在放空的工艺名称
		 */
	public void setProcessName(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.processName = value;
	}
	
	
	
	/**
	 * 存在放空的工艺名称
	 */
     @WhereSQL(sql="processName=:TsWasteEmptyingMsg_processName")
	public java.lang.String getProcessName() {
		return this.processName;
	}
		/**
		 * 涉及的化学物质
		 */
	public void setMainChemicalMaterials(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.mainChemicalMaterials = value;
	}
	
	
	
	/**
	 * 涉及的化学物质
	 */
     @WhereSQL(sql="mainChemicalMaterials=:TsWasteEmptyingMsg_mainChemicalMaterials")
	public java.lang.String getMainChemicalMaterials() {
		return this.mainChemicalMaterials;
	}
		/**
		 * 放空条件
		 */
	public void setEmptyingCondition(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.emptyingCondition = value;
	}
	
	
	
	/**
	 * 放空条件
	 */
     @WhereSQL(sql="emptyingCondition=:TsWasteEmptyingMsg_emptyingCondition")
	public java.lang.String getEmptyingCondition() {
		return this.emptyingCondition;
	}
		/**
		 * 放空次数
		 */
	public void setEmptyingNum(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.emptyingNum = value;
	}
	
	
	
	/**
	 * 放空次数
	 */
     @WhereSQL(sql="emptyingNum=:TsWasteEmptyingMsg_emptyingNum")
	public java.lang.String getEmptyingNum() {
		return this.emptyingNum;
	}
		/**
		 * 平均单次执行时间
		 */
	public void setTime(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.time = value;
	}
	
	
	
	/**
	 * 平均单次执行时间
	 */
     @WhereSQL(sql="time=:TsWasteEmptyingMsg_time")
	public java.lang.String getTime() {
		return this.time;
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
     @WhereSQL(sql="createUser=:TsWasteEmptyingMsg_createUser")
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
     @WhereSQL(sql="createTime=:TsWasteEmptyingMsg_createTime")
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
     @WhereSQL(sql="remarks=:TsWasteEmptyingMsg_remarks")
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
     @WhereSQL(sql="companyId=:TsWasteEmptyingMsg_companyId")
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
     @WhereSQL(sql="bak1=:TsWasteEmptyingMsg_bak1")
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
     @WhereSQL(sql="bak2=:TsWasteEmptyingMsg_bak2")
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
     @WhereSQL(sql="bak3=:TsWasteEmptyingMsg_bak3")
	public java.lang.String getBak3() {
		return this.bak3;
	}
	@Override
	public String toString() {
		return new StringBuilder()
			.append("id[").append(getId()).append("],")
			.append("waterId[").append(getWaterId()).append("],")
			.append("废弃处理表id[").append(getAirId()).append("],")
			.append("危险物质处理表id[").append(getMaterialId()).append("],")
			.append("存在放空的工艺名称[").append(getProcessName()).append("],")
			.append("涉及的化学物质[").append(getMainChemicalMaterials()).append("],")
			.append("放空条件[").append(getEmptyingCondition()).append("],")
			.append("放空次数[").append(getEmptyingNum()).append("],")
			.append("平均单次执行时间[").append(getTime()).append("],")
			.append("createUser[").append(getCreateUser()).append("],")
			.append("createTime[").append(getCreateTime()).append("],")
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
		if(obj instanceof TsWasteEmptyingMsg == false){
			return false;
		}
			
		if(this == obj){
			return true;
		}
		
		TsWasteEmptyingMsg other = (TsWasteEmptyingMsg)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

	
