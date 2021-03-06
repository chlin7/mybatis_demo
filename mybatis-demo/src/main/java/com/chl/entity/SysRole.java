package com.chl.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @ desc：角色表
 * @ Author     ：chenhl01.
 * @ Date       ：Created in 10:31 2019/7/24
 */
public class SysRole implements Serializable {

	private Long id;
	private String roleName;
	private int enabled;
	private Long createBy;
	private Date createTime;

	List<SysPrivilege> privilegeList;

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

	public int getEnabled() {
		return enabled;
	}

	public void setEnabled(int enabled) {
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

	public List<SysPrivilege> getPrivilegeList() {
		return privilegeList;
	}

	public void setPrivilegeList(List<SysPrivilege> privilegeList) {
		this.privilegeList = privilegeList;
	}
}
