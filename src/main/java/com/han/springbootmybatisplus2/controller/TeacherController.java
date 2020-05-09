package com.han.springbootmybatisplus2.controller;

import com.han.springbootmybatisplus2.entity.Teacher;
import com.han.springbootmybatisplus2.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
        int save= teacherService.insert(teacher);
        map.put("data",save);
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

    @DeleteMapping
    @ResponseBody
    public Map<String, Object> delete(Long id){
        HashMap<String, Object> map = new HashMap<>();
        int result = teacherService.delete(id);
        map.put("msg",result);
        return map;
    }

    @PutMapping
    @ResponseBody
    public Map<String, Object> update(Teacher teacher){
        HashMap<String, Object> map = new HashMap<>();
        int result = teacherService.update(teacher);
        map.put("msg",result);
        return map;
    }

    @GetMapping("{id}")
    @ResponseBody
    public Map<String, Object> selectOne(@PathVariable("id") Long id){
        HashMap<String, Object> map = new HashMap<>();
        Teacher teacher = teacherService.selectOne(id);
        map.put("msg",teacher);
        return map;
    }

    @GetMapping("/one")
    @ResponseBody
    public Map<String, Object> selectOneByCondition(String name,Integer age){
        HashMap<String, Object> map = new HashMap<>();
        Teacher teacher = teacherService.selectOneByCondition(name,age);
        map.put("msg",teacher);
        return map;
    }

}
