package com.zeno.ssoshopvip;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: sso-use-cookie
 * @description:
 * @author: Zeno
 * @create: 2019-10-16 17:50
 **/
@Controller
@RequestMapping("/view")
public class VipController {
    @GetMapping("index")
    public String toIndex(){
        return "index";
    }
}
