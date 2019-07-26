package com.chl;

import com.chl.entity.SysRole;
import com.chl.entity.SysUser;
import com.chl.mapper.RoleMapper;
import com.chl.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * @ desc：
 * @ Author     ：chenhl01.
 * @ Date       ：Created in 15:38 2019/7/24
 */
public class RoleMapperTest extends BaseMapperTest {

	@Test
	public void testSelectRolesByUserIdAndRoleEnabled(){
		SqlSession sqlSession = getSqlSession();
		try {
			RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
			List<SysRole> sysRole = roleMapper.selectRolesByUserIdAndRoleEnabled(1L,1);

			Assert.assertNotNull(sysRole);

			Assert.assertTrue(sysRole.size()>0);
		} finally {
			sqlSession.close();
		}
	}

	@Test
	public void selectRolesByUserid(){
		SqlSession sqlSession = getSqlSession();
		try {
			RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
			List<SysRole> sysRole = roleMapper.selectRolesByUserid(1L);

			Assert.assertNotNull(sysRole);

			Assert.assertTrue(sysRole.size()>0);
		} finally {
			sqlSession.close();
		}
	}
}
