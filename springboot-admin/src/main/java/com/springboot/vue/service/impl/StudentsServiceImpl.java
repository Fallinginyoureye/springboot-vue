package com.springboot.vue.service.impl;

import com.springboot.vue.entity.Students;
import com.springboot.vue.mapper.StudentsMapper;
import com.springboot.vue.service.IStudentsService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 学生表 服务实现类
 * </p>
 *
 * @author lqh
 * @since 2018-09-29
 */
@Service
public class StudentsServiceImpl extends ServiceImpl<StudentsMapper, Students> implements IStudentsService {
	
}
