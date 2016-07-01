package com.lxd.action;

import javax.annotation.Resource;

import com.lxd.bean.User;
import com.lxd.dao.UserDao;



public class UserAction extends SuperAction{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private User user;
	private UserDao userDao;
	private int id;
	private String s_pageNow;
	private int pageNow=1;
	
	public String update(){
		try {
			userDao.update(user);
		} catch (Exception e) {
			// TODO: handle exception
		}	
		return "user_update_success";
	}


	public String updateInput(){
		
	User user= (User) userDao.findById(User.class, id);
		//显示管理员页面，在下一个页面
		request.put("user",user);
		return "user_updateInput_success";
	}
	public String delete(){
		
		System.out.println("##########UserAction的delete（）方法，###############");
		System.out.println("这里是UserAction的delete（）方法，删除一个管理员。显示User的信息"+id);
		
		try {
			userDao.delById(User.class, id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return "user_delete_success";
		
	}
	public String add(){
		System.out.println("userAction中的User的值"+user.getName()+user.getClass());
		System.out.println("#####@@@@@@@@#####UserAction的add（）方法，###############");
		
		System.out.println("userAction中的User的性别"+user.getSex()+user.getClass());
		//System.out.println("这里是AdminAction的add（）方法，添加一个管理员。显示NewAction的信息");
		//String hql="from Admin where id='"+admin.getName()+"' and password='"+admin.getPassword()+"'";
		System.out.println("UserAction的教师信息编号"+user.getId());
		
		try {
			userDao.add(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("##########UserAction的add（）方法，###############");
		return "user_add_success";
	}
	
	
	
	public String showList(){
		
		System.out.println("##@@@@@@UserAction中的Teacher###s_pageNow##@@@@@@@@#"+s_pageNow+"+，###############");
		if(s_pageNow!=null)
		{
			pageNow=Integer.parseInt(s_pageNow);
			System.out.println("#####pageNow##@@@@@@@@#"+pageNow+"+，####pageNow##########");
		}
		String hql="from User order by id";
		request.put("userList",userDao.excuteQueryByPage(hql, pageNow, 3));

		String hql1="select count(*) from User";
		int pageCount=userDao.getPageCount(hql1, 3);
		//得到Admin中的PageCount
		
		int totalCount=userDao.getTotalCount(hql1, 3);
		request.put("pageCount",pageCount);
		request.put("totalCount",totalCount);
		request.put("pageNow",pageNow);
		return "user_showList_success";
	}
	
	
	
	
	
	
	
	
	
	
	
	public String execute(){
		return SUCCESS;
		
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getS_pageNow() {
		return s_pageNow;
	}
	public void setS_pageNow(String sPageNow) {
		s_pageNow = sPageNow;
	}
	public int getPageNow() {
		return pageNow;
	}
	public void setPageNow(int pageNow) {
		this.pageNow = pageNow;
	}
	
	
	
}
