package com.lxd.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.lxd.bean.Admin;
import com.lxd.bean.Student;
import com.lxd.bean.Teacher;
import com.lxd.bean.User;

import com.lxd.dao.AdminDao;
import com.lxd.dao.StudentDao;
import com.lxd.dao.TeacherDao;
import com.lxd.dao.UserDao;

@Component
@Scope("prototype")
public class LoginAction extends SuperAction {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String role;
	private Integer id;
	private String password;
	private Student student;
	private StudentDao studentDao;
	private Admin admin;
	private AdminDao adminDao;
	private Teacher teacher;
	private TeacherDao teacherDao;
	private User user;
	private UserDao userDao;
	private String message;
	

	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserDao getUserDao() {
		return userDao;
	}

	@Resource
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public StudentDao getStudentDao() {
		return studentDao;
	}

	@Resource
	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	public Admin getAdmin() {
		return admin;
	}

	
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public AdminDao getAdminDao() {
		return adminDao;
	}
	@Resource
	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public TeacherDao getTeacherDao() {
		return teacherDao;
	}

	@Resource
	public void setTeacherDao(TeacherDao teacherDao) {
		this.teacherDao = teacherDao;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String execute() throws Exception  {
		// HttpServletRequest request = ServletActionContext.getRequest();
		// String roles = request.getParameter("role");
		System.out.println("用户权限" + role + "###" + role.getClass());
		// System.out.println(role.equals(1));
		
		if (role.equals("1")) {
			// 学生
			// System.out.println(role);
			Student s = new Student();

			//System.out.println("ognl表学生学生学生达式中注入了" + id + password);
			s.setId(id);
		//	System.out.println("new的a学生学生学生学生学生dmin的id是："+s.getId());
			s.setPassword(password);
			//System.out.println("new的ad学生学生学生min的password是："+s.getPassword());
			
		//	System.out.println("new的学生学生学生学生admin的password是："+s.getPassword()+s.getId());
			
			s = studentDao.existUser(s);
			if (s != null) {
				// 在session中保存登录成功的用户
				session.put("loginInfo", s.getName());
				return "success_student";
			}
		} else if (role.equals("2")) {
			// 教师
			// System.out.println(role);
			//System.out.println(role+"用户权限是老师");
			Teacher t=new Teacher();
			//System.out.println("ognl表教师 教教师 教教师 教教师 教达式中注入了" + id + password);
			t.setId(id);
			//System.out.println("new的a教师 教教师 教教师 教dmin的id是："+t.getId());
			t.setPassword(password);
			//System.out.println("new的admi教师 教教师 教n的password是："+t.getPassword());
			
		//	System.out.println("n 教师 教师 教师 教师ew的admin的password是："+t.getPassword());
			try {
				t=teacherDao.existTeacher(t);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//System.out.println("n 11111教师 教师 教师 教师ew的admin的password是："+t.getPassword());
			//System.out.println("n 22222教师 教师 教师 教师ew的admin的password是："+t.getPassword());
			//System.out.println("n 333333教师 教师 教师 教师ew的admin的password是："+t.getPassword());
			if (t != null) {
				// 在session中保存登录成功的用户
				session.put("loginInfo", t);
				return "success_teacher";
			}

		} else if (role.equals("3")) {
			// 管理员
			Admin a = new Admin();
			//System.out.println("ognl表达式中注入了" + id + password);
			a.setId(id);
			//System.out.println("new的admin的id是："+a.getId());
			a.setPassword(password);
		//	System.out.println("new的admin的password是："+a.getPassword());
			
			a = adminDao.checkAdmin(a);
		//	System.out.println("LoginAction中的Admin中的名字："+admin.getName());
			if (a != null) {

				// 在session中保存登录成功的用户
				session.put("loginInfo", a);
				return "success_admin";
			}

		} else if (role.equals("4")) {
			// 普通用户
			// System.out.println(role);
			//System.out.println("普通用户普通用户普通用户用户权限" + role + "###" + role.getClass());
			//System.out.println("普通用户v用户权限" + role + "###" + role.getClass());
			//System.out.println("普通用户普通用户用户权限" + role + "###" + role.getClass());
			User user =new User();
			user.setId(id);
			user.setPassword(password);
			user=userDao.existUserBylogin(user);
			if (user!=null) {
				session.put("loginInfo", user);
				return "success_user";
			}

		}
		this.setMessage("登录失败，用户名不存在！！！");
		return INPUT;
	}

}
