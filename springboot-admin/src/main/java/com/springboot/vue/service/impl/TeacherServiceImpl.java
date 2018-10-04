package com.springboot.vue.service.impl;

import com.springboot.vue.entity.Teacher;
import com.springboot.vue.mapper.TeacherMapper;
import com.springboot.vue.service.ITeacherService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 教师表 服务实现类
 * </p>
 *
 * @author lqh
 * @since 2018-09-29
 */
@Service
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper, Teacher> implements ITeacherService {
	
}
