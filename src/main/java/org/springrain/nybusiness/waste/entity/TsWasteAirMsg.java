package org.springrain.nybusiness.waste.entity;

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
 * @version  2018-10-27 09:47:16
 * @see org.springrain.nybusiness.waste.entity.TsWasteAirMsg
 */
@Table(name="ts_waste_air_msg")
public class TsWasteAirMsg  extends BaseEntity {
	
	private static final long serialVersionUID = 1L;

	//alias
	/*
	public static final String TABLE_ALIAS = "废气集中处理设施";
	public static final String ALIAS_ID = "主键";
	public static final String ALIAS_WGPROCESSINGMETHOD = "废气处理方式名称";
	public static final String ALIAS_WGPROCESSINGCAPACITY = "废气处理能力 吨";
	public static final String ALIAS_WGSOURCE = "废气来源";
	public static final String ALIAS_WGTREATMENTEFFECT = "废气处理效果";
	public static final String ALIAS_EMISSIONHEIGHT = "排放高度";
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
	 * 废气处理方式名称
	 */
	private java.lang.String wgProcessingMethod;
	/**
	 * 废气处理能力 吨
	 */
	private java.lang.String wgprocessingCapacity;
	/**
	 * 废气来源
	 */
	private java.lang.String wgSource;
	/**
	 * 废气处理效果
	 */
	private java.lang.String wgTreatmentEffect;
	/**
	 * 排放高度
	 */
	private java.lang.String emissionHeight;
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
	@Transient
	private java.lang.String createName; 
	//concstructor
	
	
	public TsWasteAirMsg(){
	}

	public TsWasteAirMsg(
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
     @WhereSQL(sql="id=:TsWasteAirMsg_id")
	public java.lang.String getId() {
		return this.id;
	}
		/**
		 * 废气处理方式名称
		 */
	public void setWgProcessingMethod(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.wgProcessingMethod = value;
	}
	
	
	
	/**
	 * 废气处理方式名称
	 */
     @WhereSQL(sql="wgProcessingMethod=:TsWasteAirMsg_wgProcessingMethod")
	public java.lang.String getWgProcessingMethod() {
		return this.wgProcessingMethod;
	}
		/**
		 * 废气处理能力 吨
		 */
	public void setWgprocessingCapacity(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.wgprocessingCapacity = value;
	}
	
	
	
	/**
	 * 废气处理能力 吨
	 */
     @WhereSQL(sql="wgprocessingCapacity=:TsWasteAirMsg_wgprocessingCapacity")
	public java.lang.String getWgprocessingCapacity() {
		return this.wgprocessingCapacity;
	}
		/**
		 * 废气来源
		 */
	public void setWgSource(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.wgSource = value;
	}
	
	
	
	/**
	 * 废气来源
	 */
     @WhereSQL(sql="wgSource=:TsWasteAirMsg_wgSource")
	public java.lang.String getWgSource() {
		return this.wgSource;
	}
		/**
		 * 废气处理效果
		 */
	public void setWgTreatmentEffect(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.wgTreatmentEffect = value;
	}
	
	
	
	/**
	 * 废气处理效果
	 */
     @WhereSQL(sql="wgTreatmentEffect=:TsWasteAirMsg_wgTreatmentEffect")
	public java.lang.String getWgTreatmentEffect() {
		return this.wgTreatmentEffect;
	}
		/**
		 * 排放高度
		 */
	public void setEmissionHeight(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.emissionHeight = value;
	}
	
	
	
	/**
	 * 排放高度
	 */
     @WhereSQL(sql="emissionHeight=:TsWasteAirMsg_emissionHeight")
	public java.lang.String getEmissionHeight() {
		return this.emissionHeight;
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
     @WhereSQL(sql="createUser=:TsWasteAirMsg_createUser")
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
     @WhereSQL(sql="createTime=:TsWasteAirMsg_createTime")
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
     @WhereSQL(sql="remarks=:TsWasteAirMsg_remarks")
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
     @WhereSQL(sql="companyId=:TsWasteAirMsg_companyId")
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
     @WhereSQL(sql="bak1=:TsWasteAirMsg_bak1")
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
     @WhereSQL(sql="bak2=:TsWasteAirMsg_bak2")
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
	
	@Transient
	public String getCreateName() {
		return createName;
	}

	public void setCreateName(String createName) {
		this.createName = createName;
	}
	
	/**
	 * bak3
	 */
     @WhereSQL(sql="bak3=:TsWasteAirMsg_bak3")
	public java.lang.String getBak3() {
		return this.bak3;
	}
	@Override
	public String toString() {
		return new StringBuilder()
			.append("主键[").append(getId()).append("],")
			.append("废气处理方式名称[").append(getWgProcessingMethod()).append("],")
			.append("废气处理能力 吨[").append(getWgprocessingCapacity()).append("],")
			.append("废气来源[").append(getWgSource()).append("],")
			.append("废气处理效果[").append(getWgTreatmentEffect()).append("],")
			.append("排放高度[").append(getEmissionHeight()).append("],")
			.append("创建人[").append(getCreateUser()).append("],")
			.append("创建时间[").append(getCreateTime()).append("],")
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
		if(obj instanceof TsWasteAirMsg == false){
			return false;
		}
			
		if(this == obj){
			return true;
		}
		
		TsWasteAirMsg other = (TsWasteAirMsg)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

	
