package com.lxd.dao;

import com.lxd.bean.User;


public interface UserDao  extends BaseDao{
	//public void save(User user);
//	public boolean exists(User user);
	public User existUser(User user);
	public User existUserBylogin(User user);
}
