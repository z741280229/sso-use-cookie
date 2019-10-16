package com.zeno.ssoshoplogin.login;

import com.zeno.ssoshoplogin.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @program: sso-use-cookie
 * @description: 登录接口
 * @author: Zeno
 * @create: 2019-10-16 17:28
 **/
@Controller
@RequestMapping( "/login")
public class LoginController {


    @PostMapping
    public String doLogin(User user, HttpSession session){
        String target = (String) session.getAttribute("target");
        if (user.getUsername().equals("admin") && user.getPassword().equals("123456")){
            System.out.println("保存用户信息");
        }else {
            session.setAttribute("msg","用户或密码错误");
            return "login";
        }
        System.out.println(target);
        return "redirect:"+target;
    }

}
