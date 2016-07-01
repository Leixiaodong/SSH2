package com.lxd.dao;



import com.lxd.bean.Teacher;



public interface TeacherDao  extends BaseDao{
	//public void save(User user);
//	public boolean exists(User user);
	public Teacher existTeacher(Teacher teacher);
}
