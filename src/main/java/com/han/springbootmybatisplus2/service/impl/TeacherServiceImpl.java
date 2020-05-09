package com.han.springbootmybatisplus2.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.han.springbootmybatisplus2.entity.Teacher;
import com.han.springbootmybatisplus2.mapper.TeacherMapper;
import com.han.springbootmybatisplus2.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public List<Teacher> findAll() {
        return teacherMapper.selectList(null);
    }

    @Override
    public int delete(Long id) {
        return teacherMapper.deleteById(id);
    }

    @Override
    public int update(Teacher teacher) {
        return teacherMapper.updateById(teacher);
    }

    public Teacher selectOne(Long id) {
        return teacherMapper.selectById(id);
    }

    @Override
    public Teacher selectOneByCondition(String name,Integer age) {

        QueryWrapper<Teacher> queryWrapper = new QueryWrapper<>();

        queryWrapper.eq("name",name).gt("age",age);

        return teacherMapper.selectOne(queryWrapper);
    }
}
