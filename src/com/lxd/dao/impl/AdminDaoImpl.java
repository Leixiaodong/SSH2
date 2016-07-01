package com.lxd.dao.impl;


import java.util.List;


import org.springframework.stereotype.Component;

import com.lxd.bean.Admin;
import com.lxd.dao.AdminDao;

@Component
public class AdminDaoImpl extends BaseDaoImpl implements AdminDao{


	@SuppressWarnings("unchecked")
	public Admin checkAdmin(Admin admin) {
		// TODO Auto-generated method stub
		
		System.out.println("AdminDao的方法："+admin.getId()+"#######"+"管理员的密码"+admin.getPassword());
		String hql="from Admin where id='"+admin.getId()+"' and password='"+admin.getPassword()+"'";
		
		System.out.println("第一个hql"+hql);

		
		List<Admin> list=(List<Admin>) this.excuteQuery(hql);
		
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
