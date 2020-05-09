package com.han.springbootmybatisplus2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author HanWL
 * @Since 2020/5/9 0009 14:07
 */
@Controller
public class HelloController {

    @RequestMapping({"/","/index"})
    public String hello(Model model){
        model.addAttribute("msg","Hello MybatisPlus");
        return "index";
    }

}
