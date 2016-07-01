package com.lxd.action;




import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;

import com.lxd.bean.User;
import com.lxd.biz.UserBiz;
import com.lxd.dao.UserDao;


@Scope("prototype")
public class RegisterAction extends SuperAction{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private User user;
	private String gender;
	private UserBiz userBiz;
	private String message;
	private String username;
	private String password;
	private String password2;
	private String email;
	private UserDao userDao;

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword2() {
		return password2;
	}

	public void setPassword2(String password2) {
		this.password2 = password2;
	}

	public String getEmail() {
		return email;
	}  

	public void setEmail(String email) {
		this.email = email;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserBiz getUserBiz() {
		return userBiz;
	}

	public void setUserBiz(UserBiz userBiz) {
		this.userBiz = userBiz;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String execute() throws Exception{
		//if(userBiz.exist())
		System.out.println("这里是@@@User的用户名已经存在！！！！");
		System.out.println("这里是@@@User的用户名已经存在！！！！");
	
		System.out.println("这里是@@@User的用户名已经存在！！！！");
		System.out.println("这里是@@@User的用户名已经存在！！！！");	System.out.println("这里是@@@User的用户名已经存在！！！！");
	
		User user=new User();
		user.setName(username);
		user.setPassword(password);
		user.setSex(gender);
		user.setEmail(email);
		System.out.println("名已经存在！！！！"+username+password+user.getName());
//		System.out.println("这里是@@@User的用户名已经存在！！！！");
//		System.out.println("这里是注cczxczxz的Action@@@@@@@@User的用户名已经存在！！！！");
//		System.out.println("这里是注cczxczxz的Action@@@@@@@@User的用户名已经存在！！！！");
		if(userDao.existUser(user)==null){
			userDao.add(user);
			System.out.println("这里是注cczxczxz的Action@@@@@@@@User的用户名已经存在！！！！");
			return "register_success";
		}
		System.out.println("这里是注册的Adfgg ddddfgdgdsgdfgsdction@@@@@@@@User的用户名已经存在！！！！");
		System.out.println("这里是注册的Action@ddfgdfgdgdfgdsgdfgdfsgfg的用户名已经存在！！！！");
		this.setMessage("注册失败，用户名以经存在！！！请重新注册");
		return INPUT;
		
		
	}
    @Resource
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public UserDao getUserDao() {
		return userDao;
	}


}
	