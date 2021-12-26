package cn.eaay.simple.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SysPrivilege {
    private Long id;
    private String privilegeName;
    private String privilegeUrl;
}
