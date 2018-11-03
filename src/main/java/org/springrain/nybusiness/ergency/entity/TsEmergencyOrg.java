package org.springrain.nybusiness.ergency.entity;

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
 * @version  2018-11-03 10:32:40
 * @see org.springrain.nybusiness.ergency.entity.TsEmergencyOrg
 */
@Table(name="ts_emergency_org")
public class TsEmergencyOrg  extends BaseEntity {
	
	private static final long serialVersionUID = 1L;

	//alias
	/*
	public static final String TABLE_ALIAS = "应急组织结构";
	public static final String ALIAS_ID = "编号";
	public static final String ALIAS_NAME = "名称";
	public static final String ALIAS_COMCODE = "代码";
	public static final String ALIAS_PID = "上级部门ID";
	public static final String ALIAS_LEAF = "叶子节点(0:树枝节点;1:叶子节点)";
	public static final String ALIAS_SORTNO = "排序号";
	public static final String ALIAS_DESCRIPTION = "描述";
	public static final String ALIAS_ACTIVE = "是否有效(0否,1是)";
	public static final String ALIAS_BAK1 = "bak1";
	public static final String ALIAS_BAK2 = "bak2";
	public static final String ALIAS_BAK3 = "bak3";
	public static final String ALIAS_BAK4 = "bak4";
	public static final String ALIAS_BAK5 = "bak5";
    */
	//date formats
	
	//columns START
	/**
	 * 编号
	 */
	private java.lang.String id;
	/**
	 * 名称
	 */
	private java.lang.String name;
	/**
	 * 代码
	 */
	private java.lang.String comcode;
	/**
	 * 上级部门ID
	 */
	private java.lang.String pid;
	/**
	 * 叶子节点(0:树枝节点;1:叶子节点)
	 */
	private java.lang.Integer leaf;
	/**
	 * 排序号
	 */
	private java.lang.Integer sortno;
	/**
	 * 描述
	 */
	private java.lang.String description;
	/**
	 * 是否有效(0否,1是)
	 */
	private java.lang.Integer active;
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
	/**
	 * bak4
	 */
	private java.lang.String bak4;
	/**
	 * bak5
	 */
	private java.lang.String bak5;
	//columns END 数据库字段结束
	
	//concstructor

	public TsEmergencyOrg(){
	}

	public TsEmergencyOrg(
		java.lang.String id
	){
		this.id = id;
	}

	//get and set
		/**
		 * 编号
		 */
	public void setId(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.id = value;
	}
	
	
	
	/**
	 * 编号
	 */
	@Id
     @WhereSQL(sql="id=:TsEmergencyOrg_id")
	public java.lang.String getId() {
		return this.id;
	}
		/**
		 * 名称
		 */
	public void setName(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.name = value;
	}
	
	
	
	/**
	 * 名称
	 */
     @WhereSQL(sql="name=:TsEmergencyOrg_name")
	public java.lang.String getName() {
		return this.name;
	}
		/**
		 * 代码
		 */
	public void setComcode(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.comcode = value;
	}
	
	
	
	/**
	 * 代码
	 */
     @WhereSQL(sql="comcode=:TsEmergencyOrg_comcode")
	public java.lang.String getComcode() {
		return this.comcode;
	}
		/**
		 * 上级部门ID
		 */
	public void setPid(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.pid = value;
	}
	
	
	
	/**
	 * 上级部门ID
	 */
     @WhereSQL(sql="pid=:TsEmergencyOrg_pid")
	public java.lang.String getPid() {
		return this.pid;
	}
		/**
		 * 叶子节点(0:树枝节点;1:叶子节点)
		 */
	public void setLeaf(java.lang.Integer value) {
		this.leaf = value;
	}
	
	
	
	/**
	 * 叶子节点(0:树枝节点;1:叶子节点)
	 */
     @WhereSQL(sql="leaf=:TsEmergencyOrg_leaf")
	public java.lang.Integer getLeaf() {
		return this.leaf;
	}
		/**
		 * 排序号
		 */
	public void setSortno(java.lang.Integer value) {
		this.sortno = value;
	}
	
	
	
	/**
	 * 排序号
	 */
     @WhereSQL(sql="sortno=:TsEmergencyOrg_sortno")
	public java.lang.Integer getSortno() {
		return this.sortno;
	}
		/**
		 * 描述
		 */
	public void setDescription(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.description = value;
	}
	
	
	
	/**
	 * 描述
	 */
     @WhereSQL(sql="description=:TsEmergencyOrg_description")
	public java.lang.String getDescription() {
		return this.description;
	}
		/**
		 * 是否有效(0否,1是)
		 */
	public void setActive(java.lang.Integer value) {
		this.active = value;
	}
	
	
	
	/**
	 * 是否有效(0否,1是)
	 */
     @WhereSQL(sql="active=:TsEmergencyOrg_active")
	public java.lang.Integer getActive() {
		return this.active;
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
     @WhereSQL(sql="bak1=:TsEmergencyOrg_bak1")
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
     @WhereSQL(sql="bak2=:TsEmergencyOrg_bak2")
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
     @WhereSQL(sql="bak3=:TsEmergencyOrg_bak3")
	public java.lang.String getBak3() {
		return this.bak3;
	}
		/**
		 * bak4
		 */
	public void setBak4(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.bak4 = value;
	}
	
	
	
	/**
	 * bak4
	 */
     @WhereSQL(sql="bak4=:TsEmergencyOrg_bak4")
	public java.lang.String getBak4() {
		return this.bak4;
	}
		/**
		 * bak5
		 */
	public void setBak5(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.bak5 = value;
	}
	
	
	
	/**
	 * bak5
	 */
     @WhereSQL(sql="bak5=:TsEmergencyOrg_bak5")
	public java.lang.String getBak5() {
		return this.bak5;
	}
	@Override
	public String toString() {
		return new StringBuilder()
			.append("编号[").append(getId()).append("],")
			.append("名称[").append(getName()).append("],")
			.append("代码[").append(getComcode()).append("],")
			.append("上级部门ID[").append(getPid()).append("],")
			.append("叶子节点(0:树枝节点;1:叶子节点)[").append(getLeaf()).append("],")
			.append("排序号[").append(getSortno()).append("],")
			.append("描述[").append(getDescription()).append("],")
			.append("是否有效(0否,1是)[").append(getActive()).append("],")
			.append("bak1[").append(getBak1()).append("],")
			.append("bak2[").append(getBak2()).append("],")
			.append("bak3[").append(getBak3()).append("],")
			.append("bak4[").append(getBak4()).append("],")
			.append("bak5[").append(getBak5()).append("],")
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
		if(obj instanceof TsEmergencyOrg == false){
			return false;
		}
			
		if(this == obj){
			return true;
		}
		
		TsEmergencyOrg other = (TsEmergencyOrg)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

	
