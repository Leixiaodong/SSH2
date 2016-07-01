package com.lxd.dao;



import com.lxd.bean.Admin;

public interface AdminDao extends BaseDao{
	//声明方法
	
	public Admin checkAdmin(Admin admin);
	
}
