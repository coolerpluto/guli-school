package com.fan.edu_service;

import com.fan.common.R;
import com.fan.edu_service.domain.EduTeacher;
import com.fan.edu_service.service.EduTeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/eduTeacher")
public class EduServiceTeacherController {

    @Autowired
    private EduTeacherService eduTeacherService;

    @GetMapping("list")
    public R getTeachers(){
        List<EduTeacher> teachers = eduTeacherService.list();
        return R.success().put("data", teachers);
    }

    @GetMapping("{id}")
    public R getTeacherById(@PathVariable String id){
        EduTeacher eduTeacher = eduTeacherService.getById(id);
        return R.success().put("data",eduTeacher);
    }

    @DeleteMapping("{id}")
    public R deleteEduTeacherById(@PathVariable String id){
        EduTeacher teacher = eduTeacherService.getById(id);
        boolean remove = eduTeacherService.removeById(teacher);
        return remove?R.success():R.fail();
    }

    @PostMapping("add")
    public R addEduTeacher(@RequestBody EduTeacher eduTeacher){
        boolean save = eduTeacherService.save(eduTeacher);
        return save?R.success():R.fail();
    }
}
