package cn.eaay.simple.mapper;

import cn.eaay.simple.dto.UserDto;
import cn.eaay.simple.model.SysUser;
import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class UserMapperTest extends BaseMapperTest {

    @Test
    public void testSelectAll() {
        SqlSession sqlSession = getSqlSession();
        try {
            SysUserMapper userMapper = sqlSession.getMapper(SysUserMapper.class);
            List<SysUser> users = userMapper.selectAll();
            Assert.assertNotNull(users);
            Assert.assertTrue(users.size() > 0);
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void testUserAndRoleById() {
        SqlSession sqlSession = getSqlSession();
        try {
            SysUserMapper userMapper = sqlSession.getMapper(SysUserMapper.class);
            UserDto user = userMapper.selectUserAndRoleById(1001L);
            Assert.assertNotNull(user);
            Assert.assertNotNull(user.getRole());
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void testUserAndRoleById2() {
        SqlSession sqlSession = getSqlSession();
        try {
            SysUserMapper userMapper = sqlSession.getMapper(SysUserMapper.class);
            UserDto user = userMapper.selectUserAndRoleById2(1001L);
            Assert.assertNotNull(user);
            Assert.assertNotNull(user.getRole());
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void testUserAndRoleById3() {
        SqlSession sqlSession = getSqlSession();
        try {
            SysUserMapper userMapper = sqlSession.getMapper(SysUserMapper.class);
            UserDto user = userMapper.selectUserAndRoleById3(1001L);
            Assert.assertNotNull(user);
            Assert.assertNotNull(user.getRole());
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void testSelectUserAndRoleByIdSelect() {
        SqlSession sqlSession = getSqlSession();
        try {
            SysUserMapper userMapper = sqlSession.getMapper(SysUserMapper.class);
            UserDto user = userMapper.selectUserAndRoleByIdSelect(1001L);
            Assert.assertNotNull(user);
        } finally {
            sqlSession.close();
        }
    }
}
