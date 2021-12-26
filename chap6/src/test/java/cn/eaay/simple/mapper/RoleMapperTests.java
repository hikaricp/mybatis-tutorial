package cn.eaay.simple.mapper;

import cn.eaay.simple.model.SysRole;
import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;

public class RoleMapperTests extends BaseMapperTest {

    @Test
    public void testSelectRoleById() {
        SqlSession sqlSession = getSqlSession();
        try {
            SysRoleMapper roleMapper = sqlSession.getMapper(SysRoleMapper.class);
            SysRole role = roleMapper.selectRoleById(1L);
            Assert.assertNotNull(role);
            Assert.assertEquals(role.getRoleName(), "管理员");
        } finally {
            sqlSession.close();
        }
    }
}
