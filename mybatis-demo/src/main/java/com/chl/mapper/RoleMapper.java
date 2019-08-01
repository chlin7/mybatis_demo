package com.chl.mapper;

import com.chl.entity.SysRole;
import org.apache.ibatis.annotations.CacheNamespaceRef;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ desc：
 * @ Author     ：chenhl01.
 * @ Date       ：Created in 11:31 2019/7/24
 */
@CacheNamespaceRef(RoleMapper.class)
public interface RoleMapper {

	SysRole selectById(Long id);

	int updateById(SysRole sysRole);

	List<SysRole> selectRolesByUserid(Long userId);

	/**
	 * 根据用户id和角色enabled查询用户角色列表
	 * @param userid
	 * @param enabled
	 * @return
	 */
	List<SysRole> selectRolesByUserIdAndRoleEnabled(@Param("userId") Long userId,@Param("enabled") Integer enabled);
}
