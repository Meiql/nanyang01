package org.springrain.nybusiness.tsInfoDetail.entity;

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
 * @version  2018-12-11 22:30:58
 * @see org.springrain.nybusiness.tsInfoDetail.entity.TsInfoPortal
 */
@Table(name="ts_info_portal")
public class TsInfoPortal  extends BaseEntity {
	
	private static final long serialVersionUID = 1L;

	//alias
	/*
	public static final String TABLE_ALIAS = "首页门户的主表  用于各种信息政策的显示";
	public static final String ALIAS_ID = "主键id";
	public static final String ALIAS_TYPEID = "对应公告新闻政策等的类型";
	public static final String ALIAS_TITLE = "标题";
	public static final String ALIAS_INTRO = "详情的简介";
	public static final String ALIAS_DETAILSID = "对应详情表里的关联字段";
	public static final String ALIAS_IMGURL = "图片的url";
	public static final String ALIAS_FLAG = "是否删除  0是删除  1是不删除  默认为不删除";
	public static final String ALIAS_STICK = "是否置顶  0是不置顶  1是置顶   默认为0";
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
	 * 对应公告新闻政策等的类型
	 */
	private java.lang.String typeId;
	/**
	 * 标题
	 */
	private java.lang.String title;
	/**
	 * 详情的简介
	 */
	private java.lang.String intro;
	/**
	 * 对应详情表里的关联字段
	 */
	private java.lang.String detailsId;
	/**
	 * 图片的url
	 */
	private java.lang.String imgUrl;
	/**
	 * 是否删除  0是删除  1是不删除  默认为不删除
	 */
	private java.lang.String flag;
	/**
	 * 是否置顶  0是不置顶  1是置顶   默认为0
	 */
	private java.lang.String stick;
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
	
	//concstructor

	public TsInfoPortal(){
	}

	public TsInfoPortal(
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
     @WhereSQL(sql="id=:TsInfoPortal_id")
	public java.lang.String getId() {
		return this.id;
	}
		/**
		 * 对应公告新闻政策等的类型
		 */
	public void setTypeId(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.typeId = value;
	}
	
	
	
	/**
	 * 对应公告新闻政策等的类型
	 */
     @WhereSQL(sql="typeId=:TsInfoPortal_typeId")
	public java.lang.String getTypeId() {
		return this.typeId;
	}
		/**
		 * 标题
		 */
	public void setTitle(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.title = value;
	}
	
	
	
	/**
	 * 标题
	 */
     @WhereSQL(sql="title=:TsInfoPortal_title")
	public java.lang.String getTitle() {
		return this.title;
	}
		/**
		 * 详情的简介
		 */
	public void setIntro(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.intro = value;
	}
	
	
	
	/**
	 * 详情的简介
	 */
     @WhereSQL(sql="intro=:TsInfoPortal_intro")
	public java.lang.String getIntro() {
		return this.intro;
	}
		/**
		 * 对应详情表里的关联字段
		 */
	public void setDetailsId(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.detailsId = value;
	}
	
	
	
	/**
	 * 对应详情表里的关联字段
	 */
     @WhereSQL(sql="detailsId=:TsInfoPortal_detailsId")
	public java.lang.String getDetailsId() {
		return this.detailsId;
	}
		/**
		 * 图片的url
		 */
	public void setImgUrl(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.imgUrl = value;
	}
	
	
	
	/**
	 * 图片的url
	 */
     @WhereSQL(sql="imgUrl=:TsInfoPortal_imgUrl")
	public java.lang.String getImgUrl() {
		return this.imgUrl;
	}
		/**
		 * 是否删除  0是删除  1是不删除  默认为不删除
		 */
	public void setFlag(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.flag = value;
	}
	
	
	
	/**
	 * 是否删除  0是删除  1是不删除  默认为不删除
	 */
     @WhereSQL(sql="flag=:TsInfoPortal_flag")
	public java.lang.String getFlag() {
		return this.flag;
	}
		/**
		 * 是否置顶  0是不置顶  1是置顶   默认为0
		 */
	public void setStick(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.stick = value;
	}
	
	
	
	/**
	 * 是否置顶  0是不置顶  1是置顶   默认为0
	 */
     @WhereSQL(sql="stick=:TsInfoPortal_stick")
	public java.lang.String getStick() {
		return this.stick;
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
     @WhereSQL(sql="remark=:TsInfoPortal_remark")
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
     @WhereSQL(sql="create_user=:TsInfoPortal_create_user")
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
     @WhereSQL(sql="create_time=:TsInfoPortal_create_time")
	public java.lang.String getCreate_time() {
		return this.create_time;
	}
	@Override
	public String toString() {
		return new StringBuilder()
			.append("主键id[").append(getId()).append("],")
			.append("对应公告新闻政策等的类型[").append(getTypeId()).append("],")
			.append("标题[").append(getTitle()).append("],")
			.append("详情的简介[").append(getIntro()).append("],")
			.append("对应详情表里的关联字段[").append(getDetailsId()).append("],")
			.append("图片的url[").append(getImgUrl()).append("],")
			.append("是否删除  0是删除  1是不删除  默认为不删除[").append(getFlag()).append("],")
			.append("是否置顶  0是不置顶  1是置顶   默认为0[").append(getStick()).append("],")
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
		if(obj instanceof TsInfoPortal == false){
			return false;
		}
			
		if(this == obj){
			return true;
		}
		
		TsInfoPortal other = (TsInfoPortal)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

	
