package com.lxd.dao.impl;

import java.util.List;


import org.springframework.stereotype.Component;

import com.lxd.bean.Teacher;
import com.lxd.dao.TeacherDao;



@Component
public class TeacherDaoImpl  extends BaseDaoImpl implements TeacherDao{

	
//	public void save(User user);
//	public boolean exists(User user);
	@SuppressWarnings("unchecked")
	public Teacher existTeacher(Teacher teacher){
		   
		   System.out.println("teacher的方法："+teacher.getId()+"#######"+"管理员的密码"+teacher.getPassword());
			String hql="from Teacher where id='"+teacher.getId()+"' and password='"+teacher.getPassword()+"'";
			
			System.out.println("第一个hql"+hql);

			
			List<Teacher> list=(List<Teacher>) this.excuteQuery(hql);
			
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
