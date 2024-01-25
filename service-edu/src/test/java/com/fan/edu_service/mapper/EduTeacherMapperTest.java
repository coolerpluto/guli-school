package com.fan.edu_service.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fan.edu_service.entity.EduTeacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class EduTeacherMapperTest {
    
    @Autowired
    private EduTeacherMapper eduTeacherMapper;
    
    @Test
    public void test1(){
        List<EduTeacher> eduTeachers = eduTeacherMapper.selectList(null);
        for (EduTeacher eduTeacher : eduTeachers) {
            System.out.println(eduTeacher);
        }
    }
    
    @Test
    public void page(){
        Page<EduTeacher> page = new Page<>(1,3);
        LambdaQueryWrapper<EduTeacher> eduTeacherLambdaQueryWrapper = new LambdaQueryWrapper<>();
        eduTeacherLambdaQueryWrapper.eq(EduTeacher::getId,"1");
        Page<EduTeacher> page1 = eduTeacherMapper.selectPage(page, eduTeacherLambdaQueryWrapper);
        for (EduTeacher record : page1.getRecords()) {
            System.out.println(record);
        }
    }
}