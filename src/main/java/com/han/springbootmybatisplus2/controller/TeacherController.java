package com.han.springbootmybatisplus2.controller;

import com.han.springbootmybatisplus2.entity.Teacher;
import com.han.springbootmybatisplus2.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName TeacherController
 * @Description TODO
 * @Author HanWL
 * @Since 2020/5/9 0009 14:36
 */
@Controller
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    TeacherService teacherService;

    @PostMapping
    @ResponseBody
    public Map<String, Object> insert(Teacher teacher){
        HashMap<String, Object> map = new HashMap<>();
        int result = teacherService.insert(teacher);
        map.put("data",result);
        return map;
    }

    @GetMapping
    @ResponseBody
    public Map<String, Object> findAll(){
        HashMap<String, Object> map = new HashMap<>();
        List<Teacher> list = teacherService.findAll();
        map.put("msg",list);
        return map;
    }

}
