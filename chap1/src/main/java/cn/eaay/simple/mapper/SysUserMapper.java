package cn.eaay.simple.mapper;

import cn.eaay.simple.dto.RoleDto;
import cn.eaay.simple.model.SysRole;
import cn.eaay.simple.model.SysUser;

import java.util.List;

public interface SysUserMapper {
    SysUser selectById(Long id);

    /**
     * 根据用户id查询角色信息
     * @param userId
     * @return
     */
    List<RoleDto> selectRolesByUserId(Long userId);
}
