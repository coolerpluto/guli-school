package com.fan.edu_service.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fan.edu_service.domain.EduTeacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootTest
public class TEst {

    
    @Autowired
    EduTeacherMapper eduTeacherMapper;
    
    @Test
    public void test(){
        Page<EduTeacher> objectPage = new Page<EduTeacher>(1, 2);
        List<EduTeacher> eduTeachers = eduTeacherMapper.selectList(null);

        List<EduTeacher> records = eduTeacherMapper.selectPage(objectPage, null).getRecords();
        for (EduTeacher record : records) {
            System.out.println(record);
        }
//        for (EduTeacher eduTeacher : eduTeachers) {
//            System.out.println(eduTeacher);
//        }
    }


}
