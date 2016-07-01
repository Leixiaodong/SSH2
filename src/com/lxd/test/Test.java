package com.lxd.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lxd.bean.Admin;
import com.lxd.bean.Student;
import com.lxd.dao.AdminDao;
import com.lxd.dao.impl.AdminDaoImpl;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
//		TestService ts=(TestService) ctx.getBean("testServce");
//		System.out.println(ts.getName());
		
		AdminDao adminDao=(AdminDao) ctx.getBean("adminDaoImpl");
//		Admin student=new Admin("String name", "String sex");
//		adminDao.addAdmin(student);		
		Admin admin=new Admin();
		admin.setId(1);
		admin.setPassword("aaa");
		admin= adminDao.checkAdmin(admin);
	
			System.out.println("Admin的数据："+admin.getName());
		
	}

}
