package com.zeno.ssoshoplogin.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @program: sso-use-cookie
 * @description: 用户
 * @author: Zeno
 * @create: 2019-10-16 16:57
 **/
@Data  //get set
@NoArgsConstructor  //无参构造
@AllArgsConstructor // 有参构造
@Accessors(chain = true) //链式调用
public class User {
    private Integer id;
    private String username;
    private String password;
}
