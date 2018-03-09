package com.sxt.service;

import com.sxt.entity.Student;

public interface StudentService {
	/**
	 * 新增学生
	 * @param student  学生对象
	 * @return   是否新增成功
	 * @throws Exception
	 */
    public boolean addStudent(Student student) throws Exception;
}
