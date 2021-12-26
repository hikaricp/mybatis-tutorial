package com.eaay.simple.mapper;

import cn.eaay.simple.dto.RoleDto;
import cn.eaay.simple.mapper.SysUserMapper;
import cn.eaay.simple.model.SysRole;
import cn.eaay.simple.model.SysUser;
import com.eaay.simple.BaseMapperTest;
import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class UserMapperTest extends BaseMapperTest {

    @Test
    public void testUserById() {
        // 获取SqlSession
        SqlSession sqlSession = getSqlSession();
        try {
            // 获取SysUserMapper代理对象
            SysUserMapper userMapper = sqlSession.getMapper(SysUserMapper.class);
            // 执行查询
            SysUser user = userMapper.selectById(1L);
            // user不为空
            Assert.assertNotNull(user);
            // userName = admin
            Assert.assertEquals("admin", user.getUserName());
        } finally {
            sqlSession.close();
        }

    }

    @Test
    public void testRolesByUserId() {
        SqlSession sqlSession = getSqlSession();
        try {
            SysUserMapper userMapper = sqlSession.getMapper(SysUserMapper.class);
            List<RoleDto> roles = userMapper.selectRolesByUserId(1L);
            // roles不为null
            Assert.assertNotNull(roles);
            Assert.assertTrue(roles.size() > 0);
        } finally {
            sqlSession.close();
        }
    }
}

