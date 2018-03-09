package com.sxt.dao;

import com.sxt.entity.Student;

public interface StudentDao {
	/**
	 * 插入学生记录
	 * @param student 学生对象
	 * @return  成功插入的记录数
	 */
    public int insertStudent(Student student);
}
