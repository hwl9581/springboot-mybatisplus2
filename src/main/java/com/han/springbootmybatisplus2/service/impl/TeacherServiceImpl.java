package com.han.springbootmybatisplus2.service.impl;

import com.han.springbootmybatisplus2.entity.Teacher;
import com.han.springbootmybatisplus2.mapper.TeacherMapper;
import com.han.springbootmybatisplus2.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName TeacherServiceImpl
 * @Description TODO
 * @Author HanWL
 * @Since 2020/5/9 0009 14:36
 */
@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    TeacherMapper teacherMapper;

    @Override
    public int insert(Teacher teacher) {
        return teacherMapper.insert(teacher);
    }
}
