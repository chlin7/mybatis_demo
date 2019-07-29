package com.chl;

import com.chl.entity.SysUser;
import com.chl.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ desc：
 * @ Author     ：chenhl01.
 * @ Date       ：Created in 15:38 2019/7/24
 */
public class UserMapperTest extends BaseMapperTest {

	@Test
	public void testSelectAllUserAndPrivilegeRoles(){
		SqlSession sqlSession = getSqlSession();
		try {
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

			List<SysUser> result = userMapper.selectAllUserAndPrivilegeRoles(1L);

			Assert.assertNotNull(result);
		} finally {
			// 因此不手动执行 commit 也不会提交到数据库
			sqlSession.close();
		}
	}

	@Test
	public void testSelectAllUserAndRoles3(){
		SqlSession sqlSession = getSqlSession();
		try {
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

			List<SysUser> result = userMapper.selectAllUserAndRoles(1L);

			Assert.assertNotNull(result);
		} finally {
			// 因此不手动执行 commit 也不会提交到数据库
			sqlSession.close();
		}
	}

	@Test
	public void testSelectAssociationResultMapUserAndRoleById3(){
		SqlSession sqlSession = getSqlSession();
		try {
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

			SysUser result = userMapper.selectAssociationResultMapUserAndRoleById3(1L);

			System.out.println("======");

//			System.out.println(result.getSysRole());
//			Assert.assertNotNull(result);
		} finally {
			// 因此不手动执行 commit 也不会提交到数据库
			sqlSession.close();
		}
	}

	@Test
	public void testSelectAssociationResultMapUserAndRoleById2(){
		SqlSession sqlSession = getSqlSession();
		try {
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

			SysUser result = userMapper.selectAssociationResultMapUserAndRoleById2(1L);

			Assert.assertNotNull(result);
		} finally {
			// 因此不手动执行 commit 也不会提交到数据库
			sqlSession.close();
		}
	}

	@Test
	public void testSelectAssociationResultMapUserAndRoleById(){
		SqlSession sqlSession = getSqlSession();
		try {
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

			SysUser result = userMapper.selectAssociationResultMapUserAndRoleById(1L);

			Assert.assertNotNull(result);
		} finally {
			// 因此不手动执行 commit 也不会提交到数据库
			sqlSession.close();
		}
	}


	@Test
	public void testSelectResultMapUserAndRoleById(){
		SqlSession sqlSession = getSqlSession();
		try {
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

			SysUser result = userMapper.selectResultMapUserAndRoleById(1L);

			Assert.assertNotNull(result);
		} finally {
			// 因此不手动执行 commit 也不会提交到数据库
			sqlSession.close();
		}
	}

	@Test
	public void testSelectUserAndRoleById(){
		SqlSession sqlSession = getSqlSession();
		try {
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

			SysUser result = userMapper.selectUserAndRoleById(1L);

			Assert.assertNotNull(result);
		} finally {
			// 因此不手动执行 commit 也不会提交到数据库
			sqlSession.close();
		}
	}

	@Test
	public void testSelectByIdList(){
		SqlSession sqlSession = getSqlSession();
		try {
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

			List<Long> idList = new ArrayList<>();
			idList.add(1L);
			idList.add(1001L);

			List<SysUser> result = userMapper.selectByIdList(idList);

			Assert.assertNotNull(result);
			Assert.assertTrue(result.size() > 0);
			//id 为 null ，没有给 id 赋值，并且没有配置回写 id 的值

		} finally {
			// 因此不手动执行 commit 也不会提交到数据库
			sqlSession.close();
		}
	}

	@Test
	public void testUpdateByidSelective(){
		SqlSession sqlSession = getSqlSession();
		try {
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

			SysUser sysUser = new SysUser();
			sysUser.setId(1001L);
			sysUser.setUserName("test001 ");
//			sysUser.setUserEmail("test@126.com");
			//将新建的对象插入数据库中，特别注意这里的返回值 result 是执行的 SQL 影响的行数
			int result = userMapper.updateByidSelective(sysUser);

			Assert.assertNotNull(result);
			Assert.assertTrue(result > 0);
			//id 为 null ，没有给 id 赋值，并且没有配置回写 id 的值

		} finally {
			// 由于默认的 sqlSessionFactory . openSession （）是不自动提交的
			// 因此不手动执行 commit 也不会提交到数据库
			sqlSession.commit();
			sqlSession.close();
		}
	}

	@Test
	public void testSelectByUser(){
		SqlSession sqlSession = getSqlSession();
		try {
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

			SysUser sysUser = new SysUser();
			sysUser.setUserName("testl ");
//			sysUser.setUserEmail("test@126.com");
			//将新建的对象插入数据库中，特别注意这里的返回值 result 是执行的 SQL 影响的行数
			List<SysUser> result = userMapper.selectByUser(sysUser);

			Assert.assertNotNull(result);
			Assert.assertTrue(result.size() > 0);
			//id 为 null ，没有给 id 赋值，并且没有配置回写 id 的值

		} finally {
			// 因此不手动执行 commit 也不会提交到数据库
			sqlSession.close();
		}
	}

	@Test
	public void testUpdateById(){
		SqlSession sqlSession = getSqlSession();
		try {
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

			SysUser sysUser = new SysUser();
			sysUser.setId(11L);
			sysUser.setUserName("testl ");
			sysUser.setUserPassword(" 123456");
			sysUser.setUserEmail("test@126.com");
			sysUser.setUserInfo("test info");
			//正常情况下应该读入一张图片存到 byte 数纽中
			sysUser.setHeadImg(new byte[]{1, 2, 3});
			sysUser.setCreateTime(new Date());
			//将新建的对象插入数据库中，特别注意这里的返回值 result 是执行的 SQL 影响的行数
			int result = userMapper.updateById(sysUser);

			Assert.assertEquals(1,result);
			//id 为 null ，没有给 id 赋值，并且没有配置回写 id 的值
			Assert.assertNotNull(sysUser.getId());

		} finally {
			// 由于默认的 sqlSessionFactory . openSession （）是不自动提交的
			// 因此不手动执行 commit 也不会提交到数据库
			sqlSession.commit();
			sqlSession.close();
		}
	}

	@Test
	public void testInsert2() {
		SqlSession sqlSession = getSqlSession();
		try {
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

			SysUser sysUser = new SysUser();
			sysUser.setUserName("testl ");
			sysUser.setUserPassword(" 123456");
			sysUser.setUserEmail("test@126.com");
			sysUser.setUserInfo("test info");
			//正常情况下应该读入一张图片存到 byte 数纽中
			sysUser.setHeadImg(new byte[]{1, 2, 3});
			sysUser.setCreateTime(new Date());
			//将新建的对象插入数据库中，特别注意这里的返回值 result 是执行的 SQL 影响的行数
			int result = userMapper.insert2(sysUser);

			Assert.assertEquals(1,result);
			//id 为 null ，没有给 id 赋值，并且没有配置回写 id 的值
			Assert.assertNotNull(sysUser.getId());

		} finally {
			//为了不影响其他测试，这里选择曰：农
			// 由于默认的 sqlSessionFactory . openSession （）是不自动提交的
			// 因此不手动执行 commit 也不会提交到数据库
			sqlSession.rollback();
			sqlSession.close();
		}
	}

	@Test
	public void testInsert() {
		SqlSession sqlSession = getSqlSession();
		try {
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

			SysUser sysUser = new SysUser();
			sysUser.setUserName("testl ");
			sysUser.setUserPassword(" 123456");
			sysUser.setUserEmail("test@126.com");
			sysUser.setUserInfo("test info");
			//正常情况下应该读入一张图片存到 byte 数纽中
			sysUser.setHeadImg(new byte[]{1, 2, 3});
			sysUser.setCreateTime(new Date());
			//将新建的对象插入数据库中，特别注意这里的返回值 result 是执行的 SQL 影响的行数
			int result = userMapper.insert(sysUser);

			Assert.assertEquals(1,result);
			//id 为 null ，没有给 id 赋值，并且没有配置回写 id 的值
			Assert.assertNull(sysUser.getId());

		} finally {
			//为了不影响其他测试，这里选择曰：农
			// 由于默认的 sqlSessionFactory . openSession （）是不自动提交的
			// 因此不手动执行 commit 也不会提交到数据库
			sqlSession.rollback();
			sqlSession.close();
		}
	}

	@Test
	public void testInsertList(){
		SqlSession sqlSession = getSqlSession();
		try {
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

			SysUser sysUser = new SysUser();
			sysUser.setUserName("test00l ");
			sysUser.setUserPassword(" 123456");
			sysUser.setUserEmail("test@126.com");
			sysUser.setUserInfo("test info");
			//正常情况下应该读入一张图片存到 byte 数纽中
			sysUser.setHeadImg(new byte[]{1, 2, 3});
			sysUser.setCreateTime(new Date());

			SysUser sysUser2 = new SysUser();
			sysUser2.setUserName("test002 ");
			sysUser2.setUserPassword(" 123456");
			sysUser2.setUserEmail("test@126.com");
			sysUser2.setUserInfo("test info");
			//正常情况下应该读入一张图片存到 byte 数纽中
			sysUser2.setHeadImg(new byte[]{1, 2, 3});
			sysUser2.setCreateTime(new Date());

			List<SysUser> sysUserList = new ArrayList<>();
			sysUserList.add(sysUser);
			sysUserList.add(sysUser2);

			int result = userMapper.insertList(sysUserList);

			Assert.assertTrue(result>0);
		} finally {
			//为了不影响其他测试，这里选择曰：农
			// 由于默认的 sqlSessionFactory . openSession （）是不自动提交的
			// 因此不手动执行 commit 也不会提交到数据库
			sqlSession.commit();
			sqlSession.close();
		}
	}

	@Test
	public void testSelectById() {
		SqlSession sqlSession = getSqlSession();
		try {
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			SysUser sysUser = userMapper.selectById(1L);

			Assert.assertNotNull(sysUser);

			Assert.assertEquals("admin", sysUser.getUserName());
		} finally {
			sqlSession.close();
		}
	}
}
