package com.chl.mapper;

import com.chl.entity.SysUser;

import java.util.List;

/**
 * @ desc：
 * @ Author     ：chenhl01.
 * @ Date       ：Created in 11:31 2019/7/24
 */
public interface UserMapper {


	/**
	 * 通过mybatis自动映射查询一对一关系
	 * @param id
	 * @return
	 */
	SysUser selectUserAndRoleById(Long id);

	/**
	 * 通过mybatis配置resultMap查询一对一关系
	 * @param id
	 * @return
	 */
	SysUser selectResultMapUserAndRoleById(Long id);

	SysUser selectAssociationResultMapUserAndRoleById(Long id);

	SysUser selectAssociationResultMapUserAndRoleById2(Long id);

	SysUser selectAssociationResultMapUserAndRoleById3(Long id);

	SysUser selectById(Long id);

	List<SysUser> selectAll();

	List<SysUser> selectAllUserAndRoles(Long id);

	List<SysUser> selectAllUserAndPrivilegeRoles(Long id);

	SysUser selectAllUserAndRolesSelect(Long id);

	/**
	 * 用户存储
	 */
	int insert(SysUser sysUser);

	/**
	 * 用户存储,返回自增主键
	 */
	int insert2(SysUser sysUser);

	/**
	 * 用户存储,使用<selectKey>标签返回主键
	 */
	int insert3(SysUser sysUser);
	/**
	 * 根据主键更新
	 */
	int updateById(SysUser sysUser);

	/**
	 * 删除
	 */
	int deleteById(Long id);

	/**
	 * 根据userName模糊查询或userEmail精准匹配
	 * @param sysUser
	 * @return
	 */
	List<SysUser> selectByUser(SysUser sysUser);

	int updateByidSelective(SysUser sysUser);

	/**
	 * 使用foreach遍历实现in查询
	 * @param idList
	 * @return
	 */
	List<SysUser> selectByIdList(List<Long> idList);

	/**
	 * 使用foreach批量插入
	 * @param userList
	 * @return
	 */
	int insertList(List<SysUser> userList);
}
