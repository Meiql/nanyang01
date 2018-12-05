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
 * @version  2018-10-27 09:47:39
 * @see org.springrain.nybusiness.waste.entity.TsWasteMaterialMsg
 */
@Table(name="ts_waste_material_msg")
public class TsWasteMaterialMsg  extends BaseEntity {
	
	private static final long serialVersionUID = 1L;

	//alias
	/*
	public static final String TABLE_ALIAS = "危险废物处理措施";
	public static final String ALIAS_ID = "主键";
	public static final String ALIAS_HWPRODUCTNUM = "危险废物产生量";
	public static final String ALIAS_HWTRANSPORTNUM = "危险废物运输量";
	public static final String ALIAS_HWHANDLENUM = "危险废物处置量";
	public static final String ALIAS_HWSTORAGENUM = "危险废物存放量";
	public static final String ALIAS_HANDLEUNITNAME = "处置单位名称";
	public static final String ALIAS_HANDELUNITADDRESS = "处置单位地址";
	public static final String ALIAS_TRANSPORTUNITNAME = "危险固废运输单位名称";
	public static final String ALIAS_VEHICLETYPE = "车船型";
	public static final String ALIAS_ZYWLD = "转运五联单 1 有 0无";
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
	 * 主键
	 */
	private java.lang.String id;
	/**
	 * 危险废物产生量
	 */
	private java.lang.String hwproductNum;
	/**
	 * 危险废物运输量
	 */
	private java.lang.String hwTransportNum;
	/**
	 * 危险废物处置量
	 */
	private java.lang.String hwhandleNum;
	/**
	 * 危险废物存放量
	 */
	private java.lang.String hwStorageNum;
	/**
	 * 处置单位名称
	 */
	private java.lang.String handleUnitName;
	/**
	 * 处置单位地址
	 */
	private java.lang.String handelUnitAddress;
	/**
	 * 危险固废运输单位名称
	 */
	private java.lang.String transportUnitName;
	/**
	 * 车船型
	 */
	private java.lang.String vehicleType;
	/**
	 * 转运五联单 1 有 0无
	 */
	private java.lang.String zywld;
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
	@Transient
	private java.lang.String createName; 
	//concstructor

	public TsWasteMaterialMsg(){
	}

	public TsWasteMaterialMsg(
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
     @WhereSQL(sql="id=:TsWasteMaterialMsg_id")
	public java.lang.String getId() {
		return this.id;
	}
		/**
		 * 危险废物产生量
		 */
	public void setHwproductNum(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.hwproductNum = value;
	}
	
	
	
	/**
	 * 危险废物产生量
	 */
     @WhereSQL(sql="hwproductNum=:TsWasteMaterialMsg_hwproductNum")
	public java.lang.String getHwproductNum() {
		return this.hwproductNum;
	}
		/**
		 * 危险废物运输量
		 */
	public void setHwTransportNum(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.hwTransportNum = value;
	}
	
	
	
	/**
	 * 危险废物运输量
	 */
     @WhereSQL(sql="hwTransportNum=:TsWasteMaterialMsg_hwTransportNum")
	public java.lang.String getHwTransportNum() {
		return this.hwTransportNum;
	}
		/**
		 * 危险废物处置量
		 */
	public void setHwhandleNum(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.hwhandleNum = value;
	}
	
	
	
	/**
	 * 危险废物处置量
	 */
     @WhereSQL(sql="hwhandleNum=:TsWasteMaterialMsg_hwhandleNum")
	public java.lang.String getHwhandleNum() {
		return this.hwhandleNum;
	}
		/**
		 * 危险废物存放量
		 */
	public void setHwStorageNum(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.hwStorageNum = value;
	}
	
	
	
	/**
	 * 危险废物存放量
	 */
     @WhereSQL(sql="hwStorageNum=:TsWasteMaterialMsg_hwStorageNum")
	public java.lang.String getHwStorageNum() {
		return this.hwStorageNum;
	}
		/**
		 * 处置单位名称
		 */
	public void setHandleUnitName(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.handleUnitName = value;
	}
	
	
	
	/**
	 * 处置单位名称
	 */
     @WhereSQL(sql="handleUnitName=:TsWasteMaterialMsg_handleUnitName")
	public java.lang.String getHandleUnitName() {
		return this.handleUnitName;
	}
		/**
		 * 处置单位地址
		 */
	public void setHandelUnitAddress(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.handelUnitAddress = value;
	}
	
	
	
	/**
	 * 处置单位地址
	 */
     @WhereSQL(sql="handelUnitAddress=:TsWasteMaterialMsg_handelUnitAddress")
	public java.lang.String getHandelUnitAddress() {
		return this.handelUnitAddress;
	}
		/**
		 * 危险固废运输单位名称
		 */
	public void setTransportUnitName(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.transportUnitName = value;
	}
	
	
	
	/**
	 * 危险固废运输单位名称
	 */
     @WhereSQL(sql="transportUnitName=:TsWasteMaterialMsg_transportUnitName")
	public java.lang.String getTransportUnitName() {
		return this.transportUnitName;
	}
		/**
		 * 车船型
		 */
	public void setVehicleType(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.vehicleType = value;
	}
	
	
	
	/**
	 * 车船型
	 */
     @WhereSQL(sql="vehicleType=:TsWasteMaterialMsg_vehicleType")
	public java.lang.String getVehicleType() {
		return this.vehicleType;
	}
		/**
		 * 转运五联单 1 有 0无
		 */
	public void setZywld(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.zywld = value;
	}
	
	
	
	/**
	 * 转运五联单 1 有 0无
	 */
     @WhereSQL(sql="zywld=:TsWasteMaterialMsg_zywld")
	public java.lang.String getZywld() {
		return this.zywld;
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
     @WhereSQL(sql="createUser=:TsWasteMaterialMsg_createUser")
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
     @WhereSQL(sql="createTime=:TsWasteMaterialMsg_createTime")
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
     @WhereSQL(sql="remarks=:TsWasteMaterialMsg_remarks")
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
     @WhereSQL(sql="companyId=:TsWasteMaterialMsg_companyId")
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
     @WhereSQL(sql="bak1=:TsWasteMaterialMsg_bak1")
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
     @WhereSQL(sql="bak2=:TsWasteMaterialMsg_bak2")
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
     @WhereSQL(sql="bak3=:TsWasteMaterialMsg_bak3")
	public java.lang.String getBak3() {
		return this.bak3;
	}
	@Override
	public String toString() {
		return new StringBuilder()
			.append("主键[").append(getId()).append("],")
			.append("危险废物产生量[").append(getHwproductNum()).append("],")
			.append("危险废物运输量[").append(getHwTransportNum()).append("],")
			.append("危险废物处置量[").append(getHwhandleNum()).append("],")
			.append("危险废物存放量[").append(getHwStorageNum()).append("],")
			.append("处置单位名称[").append(getHandleUnitName()).append("],")
			.append("处置单位地址[").append(getHandelUnitAddress()).append("],")
			.append("危险固废运输单位名称[").append(getTransportUnitName()).append("],")
			.append("车船型[").append(getVehicleType()).append("],")
			.append("转运五联单 1 有 0无[").append(getZywld()).append("],")
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
		if(obj instanceof TsWasteMaterialMsg == false){
			return false;
		}
			
		if(this == obj){
			return true;
		}
		
		TsWasteMaterialMsg other = (TsWasteMaterialMsg)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

	
