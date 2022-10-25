package com.example.email;

import com.example.email.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
public class Mail {

    @Autowired
    private MailUtil mailUtil;

    @PostMapping("/mails")
    @ResponseBody
    public RespBean doMail(MyContent content){
        System.out.println("数据: " + content);

        String data=content.getContent();
        List<String> mailList= Arrays.asList(content.getMailbox().split(";"));

        if (content.getContent() != null&&content.getContent()!=""){
            for(int i=0;i<mailList.size();i++){
                MailBean mailBean = new MailBean();
                mailBean.setRecipient(mailList.get(i));//接收者
                mailBean.setSubject(content.getTitle());//标题
                //内容主体
                mailBean.setContent(content.getContent());
                mailUtil.sendSimpleMail(mailBean);
            }
            return RespBean.success("已发送到"+content.getMailbox(),content.getContent());
        }
        return RespBean.error("发送失败！");
    }

}
