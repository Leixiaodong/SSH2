package com.lxd.dao;

import java.util.List;



public interface BaseDao {
	//声明一些常用的方法
	//通过id返回对象

	public Object findById(Class<?> clazz,java.io.Serializable id); 
	//查询方法hql
	public List<?> excuteQuery(String hql);
	//查询分页
	public List<?> excuteQueryByPage(String hql,int pageNow,int PageSize);
	//添加一个对象
	public void add(Object obj);
	//public boolean exists(User user);
	//统一的删除
	public List<?> executeUpdate(String hql);
	
	//返回一个对象的操作
	public Object uniqueQuery(String hql);
	//得到hql，返回getPageCount
	public int getPageCount(String hql,int pageSize);
	//得到hql，返回getTotalCount
	public int getTotalCount(String hql,int pageSize);
	//8.根据id号删除对象
	public void delById(Class<?> clazz,java.io.Serializable id);
	//9.通过Object修改
	public void update(Object object);
	

}
