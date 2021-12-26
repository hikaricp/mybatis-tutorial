package cn.eaay.simple.dto;

import cn.eaay.simple.model.SysRole;
import cn.eaay.simple.model.SysUser;
import lombok.Data;

@Data
public class RoleDto extends SysRole {
    private SysUser user;
}
