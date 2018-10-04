package com.springboot.vue.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 学生表
 * </p>
 *
 * @author lqh
 * @since 2018-09-29
 */
public class Students extends Model<Students> {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
	@TableId(value="stu_id", type= IdType.AUTO)
	private Integer stuId;
    /**
     * 姓名
     */
	@TableField("stu_name")
	private String stuName;
    /**
     * 性别
     */
	@TableField("stu_sex")
	private Integer stuSex;
    /**
     * 年龄
     */
	@TableField("stu_age")
	private Integer stuAge;
    /**
     * 备注
     */
	@TableField("stu_info")
	private String stuInfo;


	public Integer getStuId() {
		return stuId;
	}

	public Students setStuId(Integer stuId) {
		this.stuId = stuId;
		return this;
	}

	public String getStuName() {
		return stuName;
	}

	public Students setStuName(String stuName) {
		this.stuName = stuName;
		return this;
	}

	public Integer getStuSex() {
		return stuSex;
	}

	public Students setStuSex(Integer stuSex) {
		this.stuSex = stuSex;
		return this;
	}

	public Integer getStuAge() {
		return stuAge;
	}

	public Students setStuAge(Integer stuAge) {
		this.stuAge = stuAge;
		return this;
	}

	public String getStuInfo() {
		return stuInfo;
	}

	public Students setStuInfo(String stuInfo) {
		this.stuInfo = stuInfo;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.stuId;
	}

}
