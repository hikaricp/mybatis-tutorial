package cn.eaay.simple.mapper;

import cn.eaay.simple.dto.UserDto;
import cn.eaay.simple.model.SysRole;
import cn.eaay.simple.model.SysUser;

import java.util.List;

public interface SysUserMapper {

    SysUser selectById(Long id);

    List<SysUser> selectAll();

    /**
     * 根据用户id查询角色信息
     *
     * @param userId
     * @return
     */
    List<SysRole> selectRolesByUserId(Long userId);

    UserDto selectUserAndRoleById(Long userId);

    UserDto selectUserAndRoleById2(Long userId);

    UserDto selectUserAndRoleById3(Long userId);

    /**
     * 嵌套查询
     *
     * @param userId
     * @return
     */
    UserDto selectUserAndRoleByIdSelect(Long userId);
}
