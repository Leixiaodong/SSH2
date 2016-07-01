package com.lxd.dao;

import com.lxd.bean.Student;






public interface StudentDao  extends BaseDao {
	
	//public Student checkStudent(Student Student);
	public Student existUser(Student student);
}
