package org.springrain.nybusiness.company.entity;

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
 * @version  2018-11-04 21:31:43
 * @see org.springrain.nybusiness.company.entity.TsCompanyInfo
 */
@Table(name="ts_company_info")
public class TsCompanyInfo  extends BaseEntity {
	
	private static final long serialVersionUID = 1L;

	//alias
	/*
	public static final String TABLE_ALIAS = "TsCompanyInfo";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_COMPANYNAME = "公司名称";
	public static final String ALIAS_CORPORATIONCODE = "法人代码";
	public static final String ALIAS_CORPORATIONNAME = "法人名称";
	public static final String ALIAS_POSTALCODE = "邮政编码";
	public static final String ALIAS_CONTACTSNAME = "联系人";
	public static final String ALIAS_PHONE = "联系电话";
	public static final String ALIAS_EAMIL = "电子邮箱";
	public static final String ALIAS_ADDRESS = "厂区地址";
	public static final String ALIAS_INDUSTRIALYUANCHU = "所在工业园区";
	public static final String ALIAS_LONGITUDE = "经度";
	public static final String ALIAS_LATITUDE = "纬度";
	public static final String ALIAS_RUNNINGDAYS = "运行天数";
	public static final String ALIAS_MAINBUSINESS = "主要业务";
	public static final String ALIAS_INDUSTRYCATEGARY = "行业类别";
	public static final String ALIAS_INDUSTRYCODE = "行业编码";
	public static final String ALIAS_REGISTERTYPE = "注册类型";
	public static final String ALIAS_ENTERPRISESIZE = "企业规模";
	public static final String ALIAS_FACTORYTIME = "建厂时间";
	public static final String ALIAS_WASTEREMISSION = "废水排放量";
	public static final String ALIAS_WASTERWHEREABOUTS = "废水排放去向";
	public static final String ALIAS_ORGID = "管辖机构id";
	public static final String ALIAS_USERID = "用户id";
	public static final String ALIAS_CREATETIME = "创建时间";
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
	 * 公司名称
	 */
	private java.lang.String companyName;
	/**
	 * 公司代码
	 */
	private java.lang.String companyCode;
	/**
	 * 法人代码
	 */
	private java.lang.String corporationCode;
	/**
	 * 法人名称
	 */
	private java.lang.String corporationName;
	/**
	 * 邮政编码
	 */
	private java.lang.String postalCode;
	/**
	 * 联系人
	 */
	private java.lang.String contactsName;
	/**
	 * 联系电话
	 */
	private java.lang.String phone;
	/**
	 * 电子邮箱
	 */
	private java.lang.String eamil;
	/**
	 * 厂区地址
	 */
	private java.lang.String address;
	/**
	 * 所在工业园区
	 */
	private java.lang.String industrialyuanchu;
	/**
	 * 经度
	 */
	private java.lang.String longitude;
	/**
	 * 纬度
	 */
	private java.lang.String latitude;
	/**
	 * 运行天数
	 */
	private java.lang.String runningDays;
	/**
	 * 主要业务
	 */
	private java.lang.String mainBusiness;
	/**
	 * 行业类别
	 */
	private java.lang.String industryCategary;
	/**
	 * 行业编码
	 */
	private java.lang.String industryCode;
	/**
	 * 注册类型
	 */
	private java.lang.String registerType;
	/**
	 * 企业规模
	 */
	private java.lang.String enterprisesize;
	/**
	 * 建厂时间
	 */
	private java.lang.String factoryTime;
	/**
	 * 废水排放量
	 */
	private java.lang.String wasterEmission;
	/**
	 * 废水排放去向
	 */
	private java.lang.String wasterWhereabouts;
	/**
	 * 管辖机构id
	 */
	private java.lang.String orgid;
	/**
	 * 用户id
	 */
	private java.lang.String userId;
	/**
	 * 创建时间
	 */
	private java.lang.String createTime;
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
	private java.lang.String state;
	private java.lang.String dismissal;
	
	//columns END 数据库字段结束
	@Transient
	private String account;
	@Transient
	private String password;
	
	//concstructor

	public TsCompanyInfo(){
	}

	public TsCompanyInfo(
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
     @WhereSQL(sql="id=:TsCompanyInfo_id")
	public java.lang.String getId() {
		return this.id;
	}
		/**
		 * 公司名称
		 */
	public void setCompanyName(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.companyName = value;
	}
	
	
	
	/**
	 * 公司名称
	 */
     @WhereSQL(sql="companyName=:TsCompanyInfo_companyName")
	public java.lang.String getCompanyName() {
		return this.companyName;
	}
     
     
 	/**
		 * 公司代码
		 */
	public void setCompanyCode(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.companyCode = value;
	}
	
	
	
	/**
	 * 公司代码
	 */
  @WhereSQL(sql="companyCode=:TsCompanyInfo_companyCode")
	public java.lang.String getCompanyCode() {
		return this.companyCode;
	}
     
		/**
		 * 法人代码
		 */
	public void setCorporationCode(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.corporationCode = value;
	}
	
	
	
	/**
	 * 法人代码
	 */
     @WhereSQL(sql="corporationCode=:TsCompanyInfo_corporationCode")
	public java.lang.String getCorporationCode() {
		return this.corporationCode;
	}
		/**
		 * 法人名称
		 */
	public void setCorporationName(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.corporationName = value;
	}
	
	
	
	/**
	 * 法人名称
	 */
     @WhereSQL(sql="corporationName=:TsCompanyInfo_corporationName")
	public java.lang.String getCorporationName() {
		return this.corporationName;
	}
		/**
		 * 邮政编码
		 */
	public void setPostalCode(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.postalCode = value;
	}
	
	
	
	/**
	 * 邮政编码
	 */
     @WhereSQL(sql="postalCode=:TsCompanyInfo_postalCode")
	public java.lang.String getPostalCode() {
		return this.postalCode;
	}
		/**
		 * 联系人
		 */
	public void setContactsName(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.contactsName = value;
	}
	
	
	
	/**
	 * 联系人
	 */
     @WhereSQL(sql="contactsName=:TsCompanyInfo_contactsName")
	public java.lang.String getContactsName() {
		return this.contactsName;
	}
		/**
		 * 联系电话
		 */
	public void setPhone(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.phone = value;
	}
	
	
	
	/**
	 * 联系电话
	 */
     @WhereSQL(sql="phone=:TsCompanyInfo_phone")
	public java.lang.String getPhone() {
		return this.phone;
	}
		/**
		 * 电子邮箱
		 */
	public void setEamil(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.eamil = value;
	}
	
	
	
	/**
	 * 电子邮箱
	 */
     @WhereSQL(sql="eamil=:TsCompanyInfo_eamil")
	public java.lang.String getEamil() {
		return this.eamil;
	}
		/**
		 * 厂区地址
		 */
	public void setAddress(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.address = value;
	}
	
	
	
	/**
	 * 厂区地址
	 */
     @WhereSQL(sql="address=:TsCompanyInfo_address")
	public java.lang.String getAddress() {
		return this.address;
	}
		/**
		 * 所在工业园区
		 */
	public void setIndustrialyuanchu(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.industrialyuanchu = value;
	}
	
	
	
	/**
	 * 所在工业园区
	 */
     @WhereSQL(sql="industrialyuanchu=:TsCompanyInfo_industrialyuanchu")
	public java.lang.String getIndustrialyuanchu() {
		return this.industrialyuanchu;
	}
		/**
		 * 经度
		 */
	public void setLongitude(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.longitude = value;
	}
	
	
	
	/**
	 * 经度
	 */
     @WhereSQL(sql="longitude=:TsCompanyInfo_longitude")
	public java.lang.String getLongitude() {
		return this.longitude;
	}
		/**
		 * 纬度
		 */
	public void setLatitude(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.latitude = value;
	}
	
	
	
	/**
	 * 纬度
	 */
     @WhereSQL(sql="latitude=:TsCompanyInfo_latitude")
	public java.lang.String getLatitude() {
		return this.latitude;
	}
		/**
		 * 运行天数
		 */
	public void setRunningDays(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.runningDays = value;
	}
	
	
	
	/**
	 * 运行天数
	 */
     @WhereSQL(sql="runningDays=:TsCompanyInfo_runningDays")
	public java.lang.String getRunningDays() {
		return this.runningDays;
	}
		/**
		 * 主要业务
		 */
	public void setMainBusiness(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.mainBusiness = value;
	}
	
	
	
	/**
	 * 主要业务
	 */
     @WhereSQL(sql="mainBusiness=:TsCompanyInfo_mainBusiness")
	public java.lang.String getMainBusiness() {
		return this.mainBusiness;
	}
		/**
		 * 行业类别
		 */
	public void setIndustryCategary(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.industryCategary = value;
	}
	
	
	
	/**
	 * 行业类别
	 */
     @WhereSQL(sql="industryCategary=:TsCompanyInfo_industryCategary")
	public java.lang.String getIndustryCategary() {
		return this.industryCategary;
	}
		/**
		 * 行业编码
		 */
	public void setIndustryCode(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.industryCode = value;
	}
	
	
	
	/**
	 * 行业编码
	 */
     @WhereSQL(sql="industryCode=:TsCompanyInfo_industryCode")
	public java.lang.String getIndustryCode() {
		return this.industryCode;
	}
		/**
		 * 注册类型
		 */
	public void setRegisterType(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.registerType = value;
	}
	
	
	
	/**
	 * 注册类型
	 */
     @WhereSQL(sql="registerType=:TsCompanyInfo_registerType")
	public java.lang.String getRegisterType() {
		return this.registerType;
	}
		/**
		 * 企业规模
		 */
	public void setEnterprisesize(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.enterprisesize = value;
	}
	
	
	
	/**
	 * 企业规模
	 */
     @WhereSQL(sql="enterprisesize=:TsCompanyInfo_enterprisesize")
	public java.lang.String getEnterprisesize() {
		return this.enterprisesize;
	}
		/**
		 * 建厂时间
		 */
	public void setFactoryTime(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.factoryTime = value;
	}
	
	
	
	/**
	 * 建厂时间
	 */
     @WhereSQL(sql="factoryTime=:TsCompanyInfo_factoryTime")
	public java.lang.String getFactoryTime() {
		return this.factoryTime;
	}
		/**
		 * 废水排放量
		 */
	public void setWasterEmission(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.wasterEmission = value;
	}
	
	
	
	/**
	 * 废水排放量
	 */
     @WhereSQL(sql="wasterEmission=:TsCompanyInfo_wasterEmission")
	public java.lang.String getWasterEmission() {
		return this.wasterEmission;
	}
		/**
		 * 废水排放去向
		 */
	public void setWasterWhereabouts(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.wasterWhereabouts = value;
	}
	
	
	
	/**
	 * 废水排放去向
	 */
     @WhereSQL(sql="wasterWhereabouts=:TsCompanyInfo_wasterWhereabouts")
	public java.lang.String getWasterWhereabouts() {
		return this.wasterWhereabouts;
	}
		/**
		 * 管辖机构id
		 */
	public void setOrgid(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.orgid = value;
	}
	
	
	
	/**
	 * 管辖机构id
	 */
     @WhereSQL(sql="orgid=:TsCompanyInfo_orgid")
	public java.lang.String getOrgid() {
		return this.orgid;
	}
		/**
		 * 用户id
		 */
	public void setUserId(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.userId = value;
	}
	
	
	
	/**
	 * 用户id
	 */
     @WhereSQL(sql="userId=:TsCompanyInfo_userId")
	public java.lang.String getUserId() {
		return this.userId;
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
     @WhereSQL(sql="createTime=:TsCompanyInfo_createTime")
	public java.lang.String getCreateTime() {
		return this.createTime;
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
     @WhereSQL(sql="bak1=:TsCompanyInfo_bak1")
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
     @WhereSQL(sql="bak2=:TsCompanyInfo_bak2")
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
     @WhereSQL(sql="bak3=:TsCompanyInfo_bak3")
	public java.lang.String getBak3() {
		return this.bak3;
	}
	@Override
	public String toString() {
		return new StringBuilder()
			.append("id[").append(getId()).append("],")
			.append("公司名称[").append(getCompanyName()).append("],")
			.append("法人代码[").append(getCorporationCode()).append("],")
			.append("法人名称[").append(getCorporationName()).append("],")
			.append("邮政编码[").append(getPostalCode()).append("],")
			.append("联系人[").append(getContactsName()).append("],")
			.append("联系电话[").append(getPhone()).append("],")
			.append("电子邮箱[").append(getEamil()).append("],")
			.append("厂区地址[").append(getAddress()).append("],")
			.append("所在工业园区[").append(getIndustrialyuanchu()).append("],")
			.append("经度[").append(getLongitude()).append("],")
			.append("纬度[").append(getLatitude()).append("],")
			.append("运行天数[").append(getRunningDays()).append("],")
			.append("主要业务[").append(getMainBusiness()).append("],")
			.append("行业类别[").append(getIndustryCategary()).append("],")
			.append("行业编码[").append(getIndustryCode()).append("],")
			.append("注册类型[").append(getRegisterType()).append("],")
			.append("企业规模[").append(getEnterprisesize()).append("],")
			.append("建厂时间[").append(getFactoryTime()).append("],")
			.append("废水排放量[").append(getWasterEmission()).append("],")
			.append("废水排放去向[").append(getWasterWhereabouts()).append("],")
			.append("管辖机构id[").append(getOrgid()).append("],")
			.append("用户id[").append(getUserId()).append("],")
			.append("创建时间[").append(getCreateTime()).append("],")
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
		if(obj instanceof TsCompanyInfo == false){
			return false;
		}
			
		if(this == obj){
			return true;
		}
		
		TsCompanyInfo other = (TsCompanyInfo)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
	@Transient
	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}
	@Transient
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the state
	 */
	public java.lang.String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(java.lang.String state) {
		this.state = state;
	}

	/**
	 * @return the dismissal
	 */
	public java.lang.String getDismissal() {
		return dismissal;
	}

	/**
	 * @param dismissal the dismissal to set
	 */
	public void setDismissal(java.lang.String dismissal) {
		this.dismissal = dismissal;
	}
	
	
}

	
