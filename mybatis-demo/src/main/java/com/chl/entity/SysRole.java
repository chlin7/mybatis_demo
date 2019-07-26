package com.chl.entity;

import java.util.Date;

/**
 * @ desc：角色表
 * @ Author     ：chenhl01.
 * @ Date       ：Created in 10:31 2019/7/24
 */
public class SysRole {

	private Long id;
	private String roleName;
	private Integer enabled;
	private Long createBy;
	private Date createTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Integer getEnabled() {
		return enabled;
	}

	public void setEnabled(Integer enabled) {
		this.enabled = enabled;
	}

	public Long getCreateBy() {
		return createBy;
	}

	public void setCreateBy(Long createBy) {
		this.createBy = createBy;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
