package com.lxd.dao.impl;


import java.util.List;


import org.springframework.stereotype.Component;

import com.lxd.bean.Student;

import com.lxd.dao.StudentDao;

@Component
public class StudentDaoImpl  extends BaseDaoImpl implements StudentDao {

	@SuppressWarnings("unchecked")
	public Student existUser(Student student) {
		// TODO Auto-generated method stub
		System.out.println("AdminDao的方法："+student.getId()+"#######"+"管理员的密码"+student.getPassword());
		String hql="from Student where id='"+student.getId()+"' and password='"+student.getPassword()+"'";
		
		System.out.println("第一个hql"+hql);

		
		List<Student> list=(List<Student>) this.excuteQuery(hql);
		
		System.out.println("list.size的个数"+list.size());
		for(int i=0;i<list.size();i++){
			System.out.println("AdminDao数据DAO："+"第"+i+
					"个"+list.get(i));
		}
		if(list.size()==0)
		{
			return null;
		}else{
			System.out.println("AdminDao数据DAO++list.get(0)的信息："+list.get(0)+"\t"+list.getClass());
			return list.get(0);
		}
	}

	
	
	
}
