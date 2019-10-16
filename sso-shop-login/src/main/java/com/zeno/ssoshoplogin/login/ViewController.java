package com.zeno.ssoshoplogin.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;

/**
 * @program: sso-use-cookie
 * @description:
 * @author: Zeno
 * @create: 2019-10-16 17:29
 **/
@Controller
@RequestMapping("/view")
public class ViewController {

    @GetMapping("/login")
    public String toLogin(@RequestParam(required = false,defaultValue = "") String target, HttpSession session){
        System.out.println("========"+target);
        if (StringUtils.isEmpty(target)){
            target = "http://www.codeshop.com:9010";
        }
        session.setAttribute("target",target);
        return "login";
    }
}
