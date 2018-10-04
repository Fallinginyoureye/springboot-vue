package com.springboot.vue.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.springboot.vue.entity.Students;
import com.springboot.vue.entity.Teacher;
import com.springboot.vue.service.IStudentsService;
import com.springboot.vue.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 学生表 前端控制器
 * </p>
 *
 * @author lqh
 * @since 2018-09-29
 */
@Controller
@RequestMapping("/admin")
public class StudentsController {

    @Autowired
    private IStudentsService studentsService;

    @Autowired
    private ITeacherService teacherService;

    @GetMapping("/stu/{id}")
    @ResponseBody
    public Students test1(@PathVariable("id") Integer id){
        return studentsService.selectById(id);
    }

    @GetMapping("/teacher")
    @ResponseBody
    public List<Teacher> getAll(){
        return teacherService.selectList(null);
    }


    @GetMapping("/select/{name}")
    @ResponseBody
    public List<Students> selectByName(@PathVariable("name") String name){
        return studentsService.selectList(new EntityWrapper<Students>().eq("stu_name", name));
    }


	
}
