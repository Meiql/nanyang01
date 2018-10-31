package org.springrain.nybusiness.ergency.entity;

import java.text.ParseException;
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
 * @version  2018-10-31 10:32:14
 * @see org.springrain.nybusiness.ergency.entity.TsEmePlanFiling
 */
@Table(name="ts_eme_plan_filing")
public class TsEmePlanFiling  extends BaseEntity {
	
	private static final long serialVersionUID = 1L;

	//alias
	/*
	public static final String TABLE_ALIAS = "企业事业单位环境应急预案备案表";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_COMPANY_NAME = "单位名称";
	public static final String ALIAS_COMPANY_CODE = "机构代码";
	public static final String ALIAS_LEGAL_PERSON = "法定代表人";
	public static final String ALIAS_LEGAL_PERSON_TEL = "法定代表人联系电话";
	public static final String ALIAS_CONTACTS_PEOPLE = "联系人";
	public static final String ALIAS_CONTACTS_PEOPLE_TEL = "联系人联系电话";
	public static final String ALIAS_FAX = "传真";
	public static final String ALIAS_EMAIL = "电子邮件";
	public static final String ALIAS_ADDRESS = "地址";
	public static final String ALIAS_CENTER = "经纬度（中心";
	public static final String ALIAS_SIGNING_DATE = "签署日期 配合内容使用";
	public static final String ALIAS_SIGNING_DESC = "签署内容公章等";
	public static final String ALIAS_SIGNING_PEOPLE = "预案签署人";
	public static final String ALIAS_DELIVERY_TIME = "报送时间";
	public static final String ALIAS_FILE_DIRECTORY = "预案备案文件目录";
	public static final String ALIAS_FILING_OPINION = "备案意见";
	public static final String ALIAS_FILING_NUMBER = "备案编号";
	public static final String ALIAS_DELIVERY_COMPANY = "报送单位";
	public static final String ALIAS_ACCEPTANCE_RESPONSIBLE_PEOPLE = "受理部门负责人";
	public static final String ALIAS_ACCEPTANCE_AGENT = "经办人";
	public static final String ALIAS_RECEIVED_DATE = "收讫日期配合备案意见使用";
	public static final String ALIAS_PLAN_NAME = "预案名称";
	public static final String ALIAS_RISK_LEVEL = "风险级别";
	public static final String ALIAS_ACCEPTANCE_DATE = "受理日期配合备案意见使用";
	public static final String ALIAS_COMPANY_ID = "公司id";
    */
	//date formats
	//public static final String FORMAT_SIGNING_DATE = DateUtils.DATETIME_FORMAT;
	//public static final String FORMAT_DELIVERY_TIME = DateUtils.DATETIME_FORMAT;
	//public static final String FORMAT_RECEIVED_DATE = DateUtils.DATETIME_FORMAT;
	//public static final String FORMAT_ACCEPTANCE_DATE = DateUtils.DATETIME_FORMAT;
	
	//columns START
	/**
	 * id
	 */
	private java.lang.String id;
	/**
	 * 单位名称
	 */
	private java.lang.String company_name;
	/**
	 * 机构代码
	 */
	private java.lang.String company_code;
	/**
	 * 法定代表人
	 */
	private java.lang.String legal_person;
	/**
	 * 法定代表人联系电话
	 */
	private java.lang.String legal_person_tel;
	/**
	 * 联系人
	 */
	private java.lang.String contacts_people;
	/**
	 * 联系人联系电话
	 */
	private java.lang.String contacts_people_tel;
	/**
	 * 传真
	 */
	private java.lang.String fax;
	/**
	 * 电子邮件
	 */
	private java.lang.String email;
	/**
	 * 地址
	 */
	private java.lang.String address;
	/**
	 * 经纬度（中心
	 */
	private java.lang.String center;
	/**
	 * 签署日期 配合内容使用
	 */
	private java.util.Date signing_date;
	/**
	 * 签署内容公章等
	 */
	private java.lang.String signing_desc;
	/**
	 * 预案签署人
	 */
	private java.lang.String signing_people;
	/**
	 * 报送时间
	 */
	private java.util.Date delivery_time;
	/**
	 * 预案备案文件目录
	 */
	private java.lang.String file_directory;
	/**
	 * 备案意见
	 */
	private java.lang.String filing_opinion;
	/**
	 * 备案编号
	 */
	private java.lang.String filing_number;
	/**
	 * 报送单位
	 */
	private java.lang.String delivery_company;
	/**
	 * 受理部门负责人
	 */
	private java.lang.String acceptance_responsible_people;
	/**
	 * 经办人
	 */
	private java.lang.String acceptance_Agent;
	/**
	 * 收讫日期配合备案意见使用
	 */
	private java.util.Date received_date;
	/**
	 * 预案名称
	 */
	private java.lang.String plan_name;
	/**
	 * 风险级别
	 */
	private java.lang.String risk_level;
	/**
	 * 受理日期配合备案意见使用
	 */
	private java.util.Date acceptance_date;
	/**
	 * 公司id
	 */
	private java.lang.String company_id;
	//columns END 数据库字段结束
	
	//concstructor

	public TsEmePlanFiling(){
	}

	public TsEmePlanFiling(
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
     @WhereSQL(sql="id=:TsEmePlanFiling_id")
	public java.lang.String getId() {
		return this.id;
	}
		/**
		 * 单位名称
		 */
	public void setCompany_name(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.company_name = value;
	}
	
	
	
	/**
	 * 单位名称
	 */
     @WhereSQL(sql="company_name=:TsEmePlanFiling_company_name")
	public java.lang.String getCompany_name() {
		return this.company_name;
	}
		/**
		 * 机构代码
		 */
	public void setCompany_code(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.company_code = value;
	}
	
	
	
	/**
	 * 机构代码
	 */
     @WhereSQL(sql="company_code=:TsEmePlanFiling_company_code")
	public java.lang.String getCompany_code() {
		return this.company_code;
	}
		/**
		 * 法定代表人
		 */
	public void setLegal_person(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.legal_person = value;
	}
	
	
	
	/**
	 * 法定代表人
	 */
     @WhereSQL(sql="legal_person=:TsEmePlanFiling_legal_person")
	public java.lang.String getLegal_person() {
		return this.legal_person;
	}
		/**
		 * 法定代表人联系电话
		 */
	public void setLegal_person_tel(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.legal_person_tel = value;
	}
	
	
	
	/**
	 * 法定代表人联系电话
	 */
     @WhereSQL(sql="legal_person_tel=:TsEmePlanFiling_legal_person_tel")
	public java.lang.String getLegal_person_tel() {
		return this.legal_person_tel;
	}
		/**
		 * 联系人
		 */
	public void setContacts_people(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.contacts_people = value;
	}
	
	
	
	/**
	 * 联系人
	 */
     @WhereSQL(sql="contacts_people=:TsEmePlanFiling_contacts_people")
	public java.lang.String getContacts_people() {
		return this.contacts_people;
	}
		/**
		 * 联系人联系电话
		 */
	public void setContacts_people_tel(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.contacts_people_tel = value;
	}
	
	
	
	/**
	 * 联系人联系电话
	 */
     @WhereSQL(sql="contacts_people_tel=:TsEmePlanFiling_contacts_people_tel")
	public java.lang.String getContacts_people_tel() {
		return this.contacts_people_tel;
	}
		/**
		 * 传真
		 */
	public void setFax(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.fax = value;
	}
	
	
	
	/**
	 * 传真
	 */
     @WhereSQL(sql="fax=:TsEmePlanFiling_fax")
	public java.lang.String getFax() {
		return this.fax;
	}
		/**
		 * 电子邮件
		 */
	public void setEmail(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.email = value;
	}
	
	
	
	/**
	 * 电子邮件
	 */
     @WhereSQL(sql="email=:TsEmePlanFiling_email")
	public java.lang.String getEmail() {
		return this.email;
	}
		/**
		 * 地址
		 */
	public void setAddress(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.address = value;
	}
	
	
	
	/**
	 * 地址
	 */
     @WhereSQL(sql="address=:TsEmePlanFiling_address")
	public java.lang.String getAddress() {
		return this.address;
	}
		/**
		 * 经纬度（中心
		 */
	public void setCenter(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.center = value;
	}
	
	
	
	/**
	 * 经纬度（中心
	 */
     @WhereSQL(sql="center=:TsEmePlanFiling_center")
	public java.lang.String getCenter() {
		return this.center;
	}
		/*
	public String getsigning_dateString() {
		return DateUtils.convertDate2String(FORMAT_SIGNING_DATE, getsigning_date());
	}
	public void setsigning_dateString(String value) throws ParseException{
		setsigning_date(DateUtils.convertString2Date(FORMAT_SIGNING_DATE,value));
	}*/
	
		/**
		 * 签署日期 配合内容使用
		 */
	public void setSigning_date(java.util.Date value) {
		this.signing_date = value;
	}
	
	
	
	/**
	 * 签署日期 配合内容使用
	 */
     @WhereSQL(sql="signing_date=:TsEmePlanFiling_signing_date")
	public java.util.Date getSigning_date() {
		return this.signing_date;
	}
		/**
		 * 签署内容公章等
		 */
	public void setSigning_desc(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.signing_desc = value;
	}
	
	
	
	/**
	 * 签署内容公章等
	 */
     @WhereSQL(sql="signing_desc=:TsEmePlanFiling_signing_desc")
	public java.lang.String getSigning_desc() {
		return this.signing_desc;
	}
		/**
		 * 预案签署人
		 */
	public void setSigning_people(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.signing_people = value;
	}
	
	
	
	/**
	 * 预案签署人
	 */
     @WhereSQL(sql="signing_people=:TsEmePlanFiling_signing_people")
	public java.lang.String getSigning_people() {
		return this.signing_people;
	}
		/*
	public String getdelivery_timeString() {
		return DateUtils.convertDate2String(FORMAT_DELIVERY_TIME, getdelivery_time());
	}
	public void setdelivery_timeString(String value) throws ParseException{
		setdelivery_time(DateUtils.convertString2Date(FORMAT_DELIVERY_TIME,value));
	}*/
	
		/**
		 * 报送时间
		 */
	public void setDelivery_time(java.util.Date value) {
		this.delivery_time = value;
	}
	
	
	
	/**
	 * 报送时间
	 */
     @WhereSQL(sql="delivery_time=:TsEmePlanFiling_delivery_time")
	public java.util.Date getDelivery_time() {
		return this.delivery_time;
	}
		/**
		 * 预案备案文件目录
		 */
	public void setFile_directory(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.file_directory = value;
	}
	
	
	
	/**
	 * 预案备案文件目录
	 */
     @WhereSQL(sql="file_directory=:TsEmePlanFiling_file_directory")
	public java.lang.String getFile_directory() {
		return this.file_directory;
	}
		/**
		 * 备案意见
		 */
	public void setFiling_opinion(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.filing_opinion = value;
	}
	
	
	
	/**
	 * 备案意见
	 */
     @WhereSQL(sql="filing_opinion=:TsEmePlanFiling_filing_opinion")
	public java.lang.String getFiling_opinion() {
		return this.filing_opinion;
	}
		/**
		 * 备案编号
		 */
	public void setFiling_number(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.filing_number = value;
	}
	
	
	
	/**
	 * 备案编号
	 */
     @WhereSQL(sql="filing_number=:TsEmePlanFiling_filing_number")
	public java.lang.String getFiling_number() {
		return this.filing_number;
	}
		/**
		 * 报送单位
		 */
	public void setDelivery_company(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.delivery_company = value;
	}
	
	
	
	/**
	 * 报送单位
	 */
     @WhereSQL(sql="delivery_company=:TsEmePlanFiling_delivery_company")
	public java.lang.String getDelivery_company() {
		return this.delivery_company;
	}
		/**
		 * 受理部门负责人
		 */
	public void setAcceptance_responsible_people(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.acceptance_responsible_people = value;
	}
	
	
	
	/**
	 * 受理部门负责人
	 */
     @WhereSQL(sql="acceptance_responsible_people=:TsEmePlanFiling_acceptance_responsible_people")
	public java.lang.String getAcceptance_responsible_people() {
		return this.acceptance_responsible_people;
	}
		/**
		 * 经办人
		 */
	public void setAcceptance_Agent(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.acceptance_Agent = value;
	}
	
	
	
	/**
	 * 经办人
	 */
     @WhereSQL(sql="acceptance_Agent=:TsEmePlanFiling_acceptance_Agent")
	public java.lang.String getAcceptance_Agent() {
		return this.acceptance_Agent;
	}
		/*
	public String getreceived_dateString() {
		return DateUtils.convertDate2String(FORMAT_RECEIVED_DATE, getreceived_date());
	}
	public void setreceived_dateString(String value) throws ParseException{
		setreceived_date(DateUtils.convertString2Date(FORMAT_RECEIVED_DATE,value));
	}*/
	
		/**
		 * 收讫日期配合备案意见使用
		 */
	public void setReceived_date(java.util.Date value) {
		this.received_date = value;
	}
	
	
	
	/**
	 * 收讫日期配合备案意见使用
	 */
     @WhereSQL(sql="received_date=:TsEmePlanFiling_received_date")
	public java.util.Date getReceived_date() {
		return this.received_date;
	}
		/**
		 * 预案名称
		 */
	public void setPlan_name(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.plan_name = value;
	}
	
	
	
	/**
	 * 预案名称
	 */
     @WhereSQL(sql="plan_name=:TsEmePlanFiling_plan_name")
	public java.lang.String getPlan_name() {
		return this.plan_name;
	}
		/**
		 * 风险级别
		 */
	public void setRisk_level(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.risk_level = value;
	}
	
	
	
	/**
	 * 风险级别
	 */
     @WhereSQL(sql="risk_level=:TsEmePlanFiling_risk_level")
	public java.lang.String getRisk_level() {
		return this.risk_level;
	}
		/*
	public String getacceptance_dateString() {
		return DateUtils.convertDate2String(FORMAT_ACCEPTANCE_DATE, getacceptance_date());
	}
	public void setacceptance_dateString(String value) throws ParseException{
		setacceptance_date(DateUtils.convertString2Date(FORMAT_ACCEPTANCE_DATE,value));
	}*/
	
		/**
		 * 受理日期配合备案意见使用
		 */
	public void setAcceptance_date(java.util.Date value) {
		this.acceptance_date = value;
	}
	
	
	
	/**
	 * 受理日期配合备案意见使用
	 */
     @WhereSQL(sql="acceptance_date=:TsEmePlanFiling_acceptance_date")
	public java.util.Date getAcceptance_date() {
		return this.acceptance_date;
	}
		/**
		 * 公司id
		 */
	public void setCompany_id(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.company_id = value;
	}
	
	
	
	/**
	 * 公司id
	 */
     @WhereSQL(sql="company_id=:TsEmePlanFiling_company_id")
	public java.lang.String getCompany_id() {
		return this.company_id;
	}
	@Override
	public String toString() {
		return new StringBuilder()
			.append("id[").append(getId()).append("],")
			.append("单位名称[").append(getCompany_name()).append("],")
			.append("机构代码[").append(getCompany_code()).append("],")
			.append("法定代表人[").append(getLegal_person()).append("],")
			.append("法定代表人联系电话[").append(getLegal_person_tel()).append("],")
			.append("联系人[").append(getContacts_people()).append("],")
			.append("联系人联系电话[").append(getContacts_people_tel()).append("],")
			.append("传真[").append(getFax()).append("],")
			.append("电子邮件[").append(getEmail()).append("],")
			.append("地址[").append(getAddress()).append("],")
			.append("经纬度（中心[").append(getCenter()).append("],")
			.append("签署日期 配合内容使用[").append(getSigning_date()).append("],")
			.append("签署内容公章等[").append(getSigning_desc()).append("],")
			.append("预案签署人[").append(getSigning_people()).append("],")
			.append("报送时间[").append(getDelivery_time()).append("],")
			.append("预案备案文件目录[").append(getFile_directory()).append("],")
			.append("备案意见[").append(getFiling_opinion()).append("],")
			.append("备案编号[").append(getFiling_number()).append("],")
			.append("报送单位[").append(getDelivery_company()).append("],")
			.append("受理部门负责人[").append(getAcceptance_responsible_people()).append("],")
			.append("经办人[").append(getAcceptance_Agent()).append("],")
			.append("收讫日期配合备案意见使用[").append(getReceived_date()).append("],")
			.append("预案名称[").append(getPlan_name()).append("],")
			.append("风险级别[").append(getRisk_level()).append("],")
			.append("受理日期配合备案意见使用[").append(getAcceptance_date()).append("],")
			.append("公司id[").append(getCompany_id()).append("],")
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
		if(obj instanceof TsEmePlanFiling == false){
			return false;
		}
			
		if(this == obj){
			return true;
		}
		
		TsEmePlanFiling other = (TsEmePlanFiling)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

	
