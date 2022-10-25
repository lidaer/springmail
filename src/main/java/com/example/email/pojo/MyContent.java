package com.example.email.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class MyContent {
    //邮箱
    private String mailbox;

    //内容
    private String content;

    //标题
    private String title;
}
