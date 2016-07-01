package com.lxd.dao.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.lxd.dao.BaseDao;


@Transactional
public abstract class BaseDaoImpl implements BaseDao {

	private SessionFactory sessionFactory;
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	@Resource
	public void setSessionFactory(SessionFactory sessionFactory) {
		System.out.println("spring注入sessionFactory");
		this.sessionFactory = sessionFactory;
	}
	public void add(Object obj) {
		// TODO Auto-generated method stub
		
		this.sessionFactory.getCurrentSession().save(obj);
	}

	

	public List<?> excuteQuery(String hql) {
		// TODO Auto-generated method stub
		Query query=this.sessionFactory.getCurrentSession().createQuery(hql);
		
		return query.list();
	}

	public List<?> excuteQueryByPage(String hql, int pageNow, int PageSize) {
		// TODO Auto-generated method stub
		Query query=this.sessionFactory.getCurrentSession().createQuery(hql);
		return query.setFirstResult((pageNow-1)*PageSize).setMaxResults(PageSize).list();
	}

	public Object findById(Class<?> clazz, Serializable id) {
		// TODO Auto-generated method stub
		return this.sessionFactory.getCurrentSession().get(clazz, id);
	}

   
	public void update(Object object) {
		// TODO Auto-generated method stub
		this.sessionFactory.getCurrentSession().update(object);
	}
	
	
	public Object uniqueQuery(String hql){
		Query query=this.sessionFactory.getCurrentSession().createQuery(hql);
		return query.uniqueResult();
	}
	public int getPageCount(String hql,int pageSize){
		//获取rowCount
		//List list=this.excuteQuery(hql);
		//System.out.println("########@@@@@@@@@@@@##BaseDaoImpl的getPageCount（）方法，###############");
		Object obj=this.uniqueQuery(hql);
		System.out.println("obj value= "+ obj);//obj如果等于rowConunt
		int rowCount=Integer.parseInt(obj.toString());
		
		return (rowCount-1)/pageSize+1;
	}
	
	public int getTotalCount(String hql, int pageSize) {
		// TODO Auto-generated method stub
		
		Object obj=this.uniqueQuery(hql);
		System.out.println("obj value= "+ obj);//obj如果等于rowConunt
		int totalCount=Integer.parseInt(obj.toString());
		return totalCount;
	}

	public void delById(Class<?> clazz,Serializable id) {
		// TODO Auto-generated method stub
		Session session=this.sessionFactory.getCurrentSession();
		session.delete(this.findById(clazz, id));
	}
	public List<?> executeUpdate(String hql) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
