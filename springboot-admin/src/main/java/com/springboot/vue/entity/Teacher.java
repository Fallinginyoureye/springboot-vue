package com.springboot.vue.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 教师表
 * </p>
 *
 * @author lqh
 * @since 2018-09-29
 */
public class Teacher extends Model<Teacher> {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
	@TableId(value="te_id", type= IdType.AUTO)
	private Integer teId;
    /**
     * 姓名
     */
	@TableField("te_name")
	private String teName;
    /**
     * 性别
     */
	@TableField("te_sex")
	private Integer teSex;
    /**
     * 薪水
     */
	@TableField("te_salary")
	private Double teSalary;


	public Integer getTeId() {
		return teId;
	}

	public Teacher setTeId(Integer teId) {
		this.teId = teId;
		return this;
	}

	public String getTeName() {
		return teName;
	}

	public Teacher setTeName(String teName) {
		this.teName = teName;
		return this;
	}

	public Integer getTeSex() {
		return teSex;
	}

	public Teacher setTeSex(Integer teSex) {
		this.teSex = teSex;
		return this;
	}

	public Double getTeSalary() {
		return teSalary;
	}

	public Teacher setTeSalary(Double teSalary) {
		this.teSalary = teSalary;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.teId;
	}

}
