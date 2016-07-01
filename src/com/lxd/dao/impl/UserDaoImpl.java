package com.lxd.dao.impl;



import java.util.List;

import org.springframework.stereotype.Component;


import com.lxd.bean.User;
import com.lxd.dao.UserDao;


@Component
public class UserDaoImpl  extends BaseDaoImpl  implements UserDao{



	@SuppressWarnings("unchecked")
	public User existUser(User user) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.out.println("AdminDao的方法："+user.getId()+"#######"+"管理员的密码"+user.getPassword());
		String hql="from User where name='"+user.getName()+"' and password='"+user.getPassword()+"'";
		
		System.out.println("第一个hql"+hql);

		
		List<User> list=(List<User>) this.excuteQuery(hql);
		
		System.out.println("list.size的个数"+list.size());
//		for(int i=0;i<list.size();i++){
//			System.out.println("AdminDao数据DAO："+"第"+i+
//					"个"+list.get(i));
//		}
		if(list.size()==0)
		{
			return null;
		}else{
			System.out.println("AdminDao数据DAO++list.get(0)的信息："+list.get(0)+"\t"+list.getClass());
			return list.get(0);
		}
	}

	@SuppressWarnings("unchecked")
	public User existUserBylogin(User user) {
		// TODO Auto-generated method stub
		System.out.println("AdminDao的方法："+user.getId()+"#######"+"管理员的密码"+user.getPassword());
		String hql="from User where name='"+user.getId()+"' and password='"+user.getPassword()+"'";
		
		System.out.println("第一个hql"+hql);

		
		List<User> list=(List<User>) this.excuteQuery(hql);
		
		System.out.println("list.size的个数"+list.size());
//		for(int i=0;i<list.size();i++){
//			System.out.println("AdminDao数据DAO："+"第"+i+
//					"个"+list.get(i));
//		}
		if(list.size()==0)
		{
			return null;
		}else{
			System.out.println("AdminDao数据DAO++list.get(0)的信息："+list.get(0)+"\t"+list.getClass());
			return list.get(0);
		}
	}

	
	
	
}
