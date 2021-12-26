package cn.eaay.simple.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SysRole {
    private Long id;
    private String roleName;
    private Integer enabled;
    private Long createBy;
    private Date createTime;
}
