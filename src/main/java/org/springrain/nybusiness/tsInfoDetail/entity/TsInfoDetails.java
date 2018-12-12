package org.springrain.nybusiness.tsInfoDetail.entity;

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
 * @version  2018-12-11 22:31:15
 * @see org.springrain.nybusiness.tsInfoDetail.entity.TsInfoDetails
 */
@Table(name="ts_info_details")
public class TsInfoDetails  extends BaseEntity {
	
	private static final long serialVersionUID = 1L;

	//alias
	/*
	public static final String TABLE_ALIAS = "对应ts_info_portal表里的详情";
	public static final String ALIAS_ID = "主键id";
	public static final String ALIAS_PROTALID = "详情的ID  对应ts_info_portal表的detailsId字段";
	public static final String ALIAS_TEXTCONTENT = "文本详情";
	public static final String ALIAS_HTMLCONTENT = "带格式的文本详情";
	public static final String ALIAS_FLAG = "是否有效 0是无效  1是有效  默认1";
	public static final String ALIAS_REMARK = "备注";
	public static final String ALIAS_CREATE_USER = "创建人";
	public static final String ALIAS_CREATE_TIME = "创建时间";
    */
	//date formats
	
	//columns START
	/**
	 * 主键id
	 */
	private java.lang.String id;
	/**
	 * 详情的ID  对应ts_info_portal表的detailsId字段
	 */
	private java.lang.String protalId;
	/**
	 * 文本详情
	 */
	private java.lang.String textContent;
	/**
	 * 带格式的文本详情
	 */
	private java.lang.String htmlContent;
	/**
	 * 是否有效 0是无效  1是有效  默认1
	 */
	private java.lang.String flag;
	/**
	 * 备注
	 */
	private java.lang.String remark;
	/**
	 * 创建人
	 */
	private java.lang.String create_user;
	/**
	 * 创建时间
	 */
	private java.lang.String create_time;
	//columns END 数据库字段结束
	 @Transient
	 private java.lang.String title;


	public java.lang.String getTitle() {
		return title;
	}

	public void setTitle(java.lang.String title) {
		this.title = title;
	}
	//concstructor

	public TsInfoDetails(){
	}

	public TsInfoDetails(
		java.lang.String id
	){
		this.id = id;
	}

	//get and set
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
     @WhereSQL(sql="id=:TsInfoDetails_id")
	public java.lang.String getId() {
		return this.id;
	}
		/**
		 * 详情的ID  对应ts_info_portal表的detailsId字段
		 */
	public void setProtalId(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.protalId = value;
	}
	
	
	
	/**
	 * 详情的ID  对应ts_info_portal表的detailsId字段
	 */
     @WhereSQL(sql="protalId=:TsInfoDetails_protalId")
	public java.lang.String getProtalId() {
		return this.protalId;
	}
		/**
		 * 文本详情
		 */
	public void setTextContent(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.textContent = value;
	}
	
	
	
	/**
	 * 文本详情
	 */
     @WhereSQL(sql="textContent=:TsInfoDetails_textContent")
	public java.lang.String getTextContent() {
		return this.textContent;
	}
		/**
		 * 带格式的文本详情
		 */
	public void setHtmlContent(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.htmlContent = value;
	}
	
	
	
	/**
	 * 带格式的文本详情
	 */
     @WhereSQL(sql="htmlContent=:TsInfoDetails_htmlContent")
	public java.lang.String getHtmlContent() {
		return this.htmlContent;
	}
		/**
		 * 是否有效 0是无效  1是有效  默认1
		 */
	public void setFlag(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.flag = value;
	}
	
	
	
	/**
	 * 是否有效 0是无效  1是有效  默认1
	 */
     @WhereSQL(sql="flag=:TsInfoDetails_flag")
	public java.lang.String getFlag() {
		return this.flag;
	}
		/**
		 * 备注
		 */
	public void setRemark(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.remark = value;
	}
	
	
	
	/**
	 * 备注
	 */
     @WhereSQL(sql="remark=:TsInfoDetails_remark")
	public java.lang.String getRemark() {
		return this.remark;
	}
		/**
		 * 创建人
		 */
	public void setCreate_user(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.create_user = value;
	}
	
	
	
	/**
	 * 创建人
	 */
     @WhereSQL(sql="create_user=:TsInfoDetails_create_user")
	public java.lang.String getCreate_user() {
		return this.create_user;
	}
		/**
		 * 创建时间
		 */
	public void setCreate_time(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.create_time = value;
	}
	
	
	
	/**
	 * 创建时间
	 */
     @WhereSQL(sql="create_time=:TsInfoDetails_create_time")
	public java.lang.String getCreate_time() {
		return this.create_time;
	}
	@Override
	public String toString() {
		return new StringBuilder()
			.append("主键id[").append(getId()).append("],")
			.append("详情的ID  对应ts_info_portal表的detailsId字段[").append(getProtalId()).append("],")
			.append("文本详情[").append(getTextContent()).append("],")
			.append("带格式的文本详情[").append(getHtmlContent()).append("],")
			.append("是否有效 0是无效  1是有效  默认1[").append(getFlag()).append("],")
			.append("备注[").append(getRemark()).append("],")
			.append("创建人[").append(getCreate_user()).append("],")
			.append("创建时间[").append(getCreate_time()).append("],")
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
		if(obj instanceof TsInfoDetails == false){
			return false;
		}
			
		if(this == obj){
			return true;
		}
		
		TsInfoDetails other = (TsInfoDetails)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

	
