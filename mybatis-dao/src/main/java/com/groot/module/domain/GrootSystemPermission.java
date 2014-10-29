package com.groot.module.domain;

import java.util.Date;
import java.io.Serializable;

public class GrootSystemPermission implements Serializable {

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column GROOT_SYSTEM_PERMISSION.ID
	 * @ibatorgenerated  Wed Oct 29 15:35:22 CST 2014
	 */
	private String id;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column GROOT_SYSTEM_PERMISSION.PERMISSION_NAME
	 * @ibatorgenerated  Wed Oct 29 15:35:22 CST 2014
	 */
	private String permissionName;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column GROOT_SYSTEM_PERMISSION.PERMISSION_KEY
	 * @ibatorgenerated  Wed Oct 29 15:35:22 CST 2014
	 */
	private String permissionKey;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column GROOT_SYSTEM_PERMISSION.PARENT_ID
	 * @ibatorgenerated  Wed Oct 29 15:35:22 CST 2014
	 */
	private String parentId;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column GROOT_SYSTEM_PERMISSION.PERMISSION_CODE
	 * @ibatorgenerated  Wed Oct 29 15:35:22 CST 2014
	 */
	private String permissionCode;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column GROOT_SYSTEM_PERMISSION.REQUEST_MAPPING_VALUE
	 * @ibatorgenerated  Wed Oct 29 15:35:22 CST 2014
	 */
	private String requestMappingValue;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column GROOT_SYSTEM_PERMISSION.STATUS
	 * @ibatorgenerated  Wed Oct 29 15:35:22 CST 2014
	 */
	private String status;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column GROOT_SYSTEM_PERMISSION.REMARK
	 * @ibatorgenerated  Wed Oct 29 15:35:22 CST 2014
	 */
	private String remark;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column GROOT_SYSTEM_PERMISSION.CREATE_TIME
	 * @ibatorgenerated  Wed Oct 29 15:35:22 CST 2014
	 */
	private Date createTime;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column GROOT_SYSTEM_PERMISSION.CREATE_USER_ID
	 * @ibatorgenerated  Wed Oct 29 15:35:22 CST 2014
	 */
	private String createUserId;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column GROOT_SYSTEM_PERMISSION.UPDATE_TIME
	 * @ibatorgenerated  Wed Oct 29 15:35:22 CST 2014
	 */
	private Date updateTime;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column GROOT_SYSTEM_PERMISSION.UPDATE_USER_ID
	 * @ibatorgenerated  Wed Oct 29 15:35:22 CST 2014
	 */
	private String updateUserId;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database table GROOT_SYSTEM_PERMISSION
	 * @ibatorgenerated  Wed Oct 29 15:35:22 CST 2014
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column GROOT_SYSTEM_PERMISSION.ID
	 * @return  the value of GROOT_SYSTEM_PERMISSION.ID
	 * @ibatorgenerated  Wed Oct 29 15:35:22 CST 2014
	 */
	public String getId() {
		return id;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column GROOT_SYSTEM_PERMISSION.ID
	 * @param id  the value for GROOT_SYSTEM_PERMISSION.ID
	 * @ibatorgenerated  Wed Oct 29 15:35:22 CST 2014
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column GROOT_SYSTEM_PERMISSION.PERMISSION_NAME
	 * @return  the value of GROOT_SYSTEM_PERMISSION.PERMISSION_NAME
	 * @ibatorgenerated  Wed Oct 29 15:35:22 CST 2014
	 */
	public String getPermissionName() {
		return permissionName;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column GROOT_SYSTEM_PERMISSION.PERMISSION_NAME
	 * @param permissionName  the value for GROOT_SYSTEM_PERMISSION.PERMISSION_NAME
	 * @ibatorgenerated  Wed Oct 29 15:35:22 CST 2014
	 */
	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column GROOT_SYSTEM_PERMISSION.PERMISSION_KEY
	 * @return  the value of GROOT_SYSTEM_PERMISSION.PERMISSION_KEY
	 * @ibatorgenerated  Wed Oct 29 15:35:22 CST 2014
	 */
	public String getPermissionKey() {
		return permissionKey;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column GROOT_SYSTEM_PERMISSION.PERMISSION_KEY
	 * @param permissionKey  the value for GROOT_SYSTEM_PERMISSION.PERMISSION_KEY
	 * @ibatorgenerated  Wed Oct 29 15:35:22 CST 2014
	 */
	public void setPermissionKey(String permissionKey) {
		this.permissionKey = permissionKey;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column GROOT_SYSTEM_PERMISSION.PARENT_ID
	 * @return  the value of GROOT_SYSTEM_PERMISSION.PARENT_ID
	 * @ibatorgenerated  Wed Oct 29 15:35:22 CST 2014
	 */
	public String getParentId() {
		return parentId;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column GROOT_SYSTEM_PERMISSION.PARENT_ID
	 * @param parentId  the value for GROOT_SYSTEM_PERMISSION.PARENT_ID
	 * @ibatorgenerated  Wed Oct 29 15:35:22 CST 2014
	 */
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column GROOT_SYSTEM_PERMISSION.PERMISSION_CODE
	 * @return  the value of GROOT_SYSTEM_PERMISSION.PERMISSION_CODE
	 * @ibatorgenerated  Wed Oct 29 15:35:22 CST 2014
	 */
	public String getPermissionCode() {
		return permissionCode;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column GROOT_SYSTEM_PERMISSION.PERMISSION_CODE
	 * @param permissionCode  the value for GROOT_SYSTEM_PERMISSION.PERMISSION_CODE
	 * @ibatorgenerated  Wed Oct 29 15:35:22 CST 2014
	 */
	public void setPermissionCode(String permissionCode) {
		this.permissionCode = permissionCode;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column GROOT_SYSTEM_PERMISSION.REQUEST_MAPPING_VALUE
	 * @return  the value of GROOT_SYSTEM_PERMISSION.REQUEST_MAPPING_VALUE
	 * @ibatorgenerated  Wed Oct 29 15:35:22 CST 2014
	 */
	public String getRequestMappingValue() {
		return requestMappingValue;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column GROOT_SYSTEM_PERMISSION.REQUEST_MAPPING_VALUE
	 * @param requestMappingValue  the value for GROOT_SYSTEM_PERMISSION.REQUEST_MAPPING_VALUE
	 * @ibatorgenerated  Wed Oct 29 15:35:22 CST 2014
	 */
	public void setRequestMappingValue(String requestMappingValue) {
		this.requestMappingValue = requestMappingValue;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column GROOT_SYSTEM_PERMISSION.STATUS
	 * @return  the value of GROOT_SYSTEM_PERMISSION.STATUS
	 * @ibatorgenerated  Wed Oct 29 15:35:22 CST 2014
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column GROOT_SYSTEM_PERMISSION.STATUS
	 * @param status  the value for GROOT_SYSTEM_PERMISSION.STATUS
	 * @ibatorgenerated  Wed Oct 29 15:35:22 CST 2014
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column GROOT_SYSTEM_PERMISSION.REMARK
	 * @return  the value of GROOT_SYSTEM_PERMISSION.REMARK
	 * @ibatorgenerated  Wed Oct 29 15:35:22 CST 2014
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column GROOT_SYSTEM_PERMISSION.REMARK
	 * @param remark  the value for GROOT_SYSTEM_PERMISSION.REMARK
	 * @ibatorgenerated  Wed Oct 29 15:35:22 CST 2014
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column GROOT_SYSTEM_PERMISSION.CREATE_TIME
	 * @return  the value of GROOT_SYSTEM_PERMISSION.CREATE_TIME
	 * @ibatorgenerated  Wed Oct 29 15:35:22 CST 2014
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column GROOT_SYSTEM_PERMISSION.CREATE_TIME
	 * @param createTime  the value for GROOT_SYSTEM_PERMISSION.CREATE_TIME
	 * @ibatorgenerated  Wed Oct 29 15:35:22 CST 2014
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column GROOT_SYSTEM_PERMISSION.CREATE_USER_ID
	 * @return  the value of GROOT_SYSTEM_PERMISSION.CREATE_USER_ID
	 * @ibatorgenerated  Wed Oct 29 15:35:22 CST 2014
	 */
	public String getCreateUserId() {
		return createUserId;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column GROOT_SYSTEM_PERMISSION.CREATE_USER_ID
	 * @param createUserId  the value for GROOT_SYSTEM_PERMISSION.CREATE_USER_ID
	 * @ibatorgenerated  Wed Oct 29 15:35:22 CST 2014
	 */
	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column GROOT_SYSTEM_PERMISSION.UPDATE_TIME
	 * @return  the value of GROOT_SYSTEM_PERMISSION.UPDATE_TIME
	 * @ibatorgenerated  Wed Oct 29 15:35:22 CST 2014
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column GROOT_SYSTEM_PERMISSION.UPDATE_TIME
	 * @param updateTime  the value for GROOT_SYSTEM_PERMISSION.UPDATE_TIME
	 * @ibatorgenerated  Wed Oct 29 15:35:22 CST 2014
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column GROOT_SYSTEM_PERMISSION.UPDATE_USER_ID
	 * @return  the value of GROOT_SYSTEM_PERMISSION.UPDATE_USER_ID
	 * @ibatorgenerated  Wed Oct 29 15:35:22 CST 2014
	 */
	public String getUpdateUserId() {
		return updateUserId;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column GROOT_SYSTEM_PERMISSION.UPDATE_USER_ID
	 * @param updateUserId  the value for GROOT_SYSTEM_PERMISSION.UPDATE_USER_ID
	 * @ibatorgenerated  Wed Oct 29 15:35:22 CST 2014
	 */
	public void setUpdateUserId(String updateUserId) {
		this.updateUserId = updateUserId;
	}
}