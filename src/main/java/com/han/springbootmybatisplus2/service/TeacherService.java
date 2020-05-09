package com.han.springbootmybatisplus2.service;

import com.han.springbootmybatisplus2.entity.Teacher;

import java.util.List;

/**
 * @ClassName TeacherService
 * @Description TODO
 * @Author HanWL
 * @Since 2020/5/9 0009 14:35
 */
public interface TeacherService {

    int insert(Teacher teacher);

    List<Teacher> findAll();

    int delete(Long id);

    int update(Teacher teacher);

    Teacher selectOne(Long id);

    Teacher selectOneByCondition(String name,Integer age);
}
