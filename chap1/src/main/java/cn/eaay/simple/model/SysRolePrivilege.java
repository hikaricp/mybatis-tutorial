package cn.eaay.simple.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SysRolePrivilege {
    private Long roleId;
    private Long privilegeId;
}
