package com.springboot.vue.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.springboot.vue.entity.Students;
import com.springboot.vue.entity.Teacher;
import com.springboot.vue.service.IStudentsService;
import com.springboot.vue.service.ITeacherService;
import com.springboot.vue.util.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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


//    @CrossOrigin(origins = {"http://localhost:8081", "null"})
    @GetMapping("/stu")
    @ResponseBody
    public Msg listStu(){
        List<Students> list = studentsService.selectList(null);
        return Msg.success().add("stu", list);
    }
	
}
