package net.codog.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
/**
* @author 王文涵 
* @date 2016年10月20日
* <p>Description:role表的实体类 </p>
 */
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Setter
@Getter
public class Role {
    private Integer roleId;

    private String roleName;
}