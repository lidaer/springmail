package com.example.email.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private static final long serialVersionUID = -2116367492649751914L;

    //用户名
    private String name;
    //密码
    private String password;
    //邮箱
    private String mailbox;

}
