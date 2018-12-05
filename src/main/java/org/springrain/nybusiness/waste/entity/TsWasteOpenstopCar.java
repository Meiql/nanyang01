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
 * @version  2018-10-27 09:47:49
 * @see org.springrain.nybusiness.waste.entity.TsWasteOpenstopCar
 */
@Table(name="ts_waste_openstop_car")
public class TsWasteOpenstopCar  extends BaseEntity {
	
	private static final long serialVersionUID = 1L;

	//alias
	/*
	public static final String TABLE_ALIAS = "开停车情况";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_WATERID = "废水处理表id";
	public static final String ALIAS_AIRID = "废弃处理表id";
	public static final String ALIAS_MATERIAL = "危险物质表id";
	public static final String ALIAS_ADDRESS = "存在正常开停车的场所";
	public static final String ALIAS_VOLUME = "是否有吹扫过程/ 吹扫容积(m3)";
	public static final String ALIAS_COUNTERMEASURE = "防范措施";
	public static final String ALIAS_PARKINGCYCLE = "停车周期";
	public static final String ALIAS_PARKINGREASON = "停车原因";
	public static final String ALIAS_CREATEUSER = "createUser";
	public static final String ALIAS_CREATETIME = "createTime";
	public static final String ALIAS_COMPANYID = "companyId";
	public static final String ALIAS_REMARKS = "remarks";
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
	 * 废水处理表id
	 */
	private java.lang.String waterId;
	/**
	 * 废弃处理表id
	 */
	private java.lang.String airId;
	/**
	 * 危险物质表id
	 */
	private java.lang.String material;
	/**
	 * 存在正常开停车的场所
	 */
	private java.lang.String address;
	/**
	 * 是否有吹扫过程/ 吹扫容积(m3)
	 */
	private java.lang.String volume;
	/**
	 * 防范措施
	 */
	private java.lang.String countermeasure;
	/**
	 * 停车周期
	 */
	private java.lang.String parkingCycle;
	/**
	 * 停车原因
	 */
	private java.lang.String parkingReason;
	/**
	 * createUser
	 */
	private java.lang.String createUser;
	/**
	 * createTime
	 */
	private java.lang.String createTime;
	/**
	 * companyId
	 */
	private java.lang.String companyId;
	/**
	 * remarks
	 */
	private java.lang.String remarks;
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
	private TsWasteAirMsg tsWasteAirMsg;
	@Transient
	private TsWasteWaterMsg tsWasteWaterMsg;
	@Transient
	private TsWasteMaterialMsg tsWasteMaterialMsg;
	@Transient
	private java.lang.String createName; 
	//concstructor

	public TsWasteOpenstopCar(){
	}

	public TsWasteOpenstopCar(
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
     @WhereSQL(sql="id=:TsWasteOpenstopCar_id")
	public java.lang.String getId() {
		return this.id;
	}
		/**
		 * 废水处理表id
		 */
	public void setWaterId(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.waterId = value;
	}
	
	
	
	/**
	 * 废水处理表id
	 */
     @WhereSQL(sql="waterId=:TsWasteOpenstopCar_waterId")
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
     @WhereSQL(sql="airId=:TsWasteOpenstopCar_airId")
	public java.lang.String getAirId() {
		return this.airId;
	}
		/**
		 * 危险物质表id
		 */
	public void setMaterial(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.material = value;
	}
	
	
	
	/**
	 * 危险物质表id
	 */
     @WhereSQL(sql="material=:TsWasteOpenstopCar_material")
	public java.lang.String getMaterial() {
		return this.material;
	}
		/**
		 * 存在正常开停车的场所
		 */
	public void setAddress(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.address = value;
	}
	
	
	
	/**
	 * 存在正常开停车的场所
	 */
     @WhereSQL(sql="address=:TsWasteOpenstopCar_address")
	public java.lang.String getAddress() {
		return this.address;
	}
		/**
		 * 是否有吹扫过程/ 吹扫容积(m3)
		 */
	public void setVolume(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.volume = value;
	}
	
	
	
	/**
	 * 是否有吹扫过程/ 吹扫容积(m3)
	 */
     @WhereSQL(sql="volume=:TsWasteOpenstopCar_volume")
	public java.lang.String getVolume() {
		return this.volume;
	}
		/**
		 * 防范措施
		 */
	public void setCountermeasure(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.countermeasure = value;
	}
	
	
	
	/**
	 * 防范措施
	 */
     @WhereSQL(sql="countermeasure=:TsWasteOpenstopCar_countermeasure")
	public java.lang.String getCountermeasure() {
		return this.countermeasure;
	}
		/**
		 * 停车周期
		 */
	public void setParkingCycle(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.parkingCycle = value;
	}
	
	
	
	/**
	 * 停车周期
	 */
     @WhereSQL(sql="parkingCycle=:TsWasteOpenstopCar_parkingCycle")
	public java.lang.String getParkingCycle() {
		return this.parkingCycle;
	}
		/**
		 * 停车原因
		 */
	public void setParkingReason(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.parkingReason = value;
	}
	
	
	
	/**
	 * 停车原因
	 */
     @WhereSQL(sql="parkingReason=:TsWasteOpenstopCar_parkingReason")
	public java.lang.String getParkingReason() {
		return this.parkingReason;
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
     @WhereSQL(sql="createUser=:TsWasteOpenstopCar_createUser")
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
     @WhereSQL(sql="createTime=:TsWasteOpenstopCar_createTime")
	public java.lang.String getCreateTime() {
		return this.createTime;
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
     @WhereSQL(sql="companyId=:TsWasteOpenstopCar_companyId")
	public java.lang.String getCompanyId() {
		return this.companyId;
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
     @WhereSQL(sql="remarks=:TsWasteOpenstopCar_remarks")
	public java.lang.String getRemarks() {
		return this.remarks;
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
     @WhereSQL(sql="bak1=:TsWasteOpenstopCar_bak1")
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
     @WhereSQL(sql="bak2=:TsWasteOpenstopCar_bak2")
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
     @WhereSQL(sql="bak3=:TsWasteOpenstopCar_bak3")
	public java.lang.String getBak3() {
		return this.bak3;
	}
     
     @Transient
	public TsWasteAirMsg getTsWasteAirMsg() {
		return tsWasteAirMsg;
	}

	public void setTsWasteAirMsg(TsWasteAirMsg tsWasteAirMsg) {
		this.tsWasteAirMsg = tsWasteAirMsg;
	}
	@Transient
	public TsWasteWaterMsg getTsWasteWaterMsg() {
		return tsWasteWaterMsg;
	}

	public void setTsWasteWaterMsg(TsWasteWaterMsg tsWasteWaterMsg) {
		this.tsWasteWaterMsg = tsWasteWaterMsg;
	}
	@Transient
	public TsWasteMaterialMsg getTsWasteMaterialMsg() {
		return tsWasteMaterialMsg;
	}

	public void setTsWasteMaterialMsg(TsWasteMaterialMsg tsWasteMaterialMsg) {
		this.tsWasteMaterialMsg = tsWasteMaterialMsg;
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
			.append("id[").append(getId()).append("],")
			.append("废水处理表id[").append(getWaterId()).append("],")
			.append("废弃处理表id[").append(getAirId()).append("],")
			.append("危险物质表id[").append(getMaterial()).append("],")
			.append("存在正常开停车的场所[").append(getAddress()).append("],")
			.append("是否有吹扫过程/ 吹扫容积(m3)[").append(getVolume()).append("],")
			.append("防范措施[").append(getCountermeasure()).append("],")
			.append("停车周期[").append(getParkingCycle()).append("],")
			.append("停车原因[").append(getParkingReason()).append("],")
			.append("createUser[").append(getCreateUser()).append("],")
			.append("createTime[").append(getCreateTime()).append("],")
			.append("companyId[").append(getCompanyId()).append("],")
			.append("remarks[").append(getRemarks()).append("],")
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
		if(obj instanceof TsWasteOpenstopCar == false){
			return false;
		}
			
		if(this == obj){
			return true;
		}
		
		TsWasteOpenstopCar other = (TsWasteOpenstopCar)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

	
