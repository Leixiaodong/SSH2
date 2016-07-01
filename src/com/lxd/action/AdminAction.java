package com.lxd.action;

import javax.annotation.Resource;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.lxd.bean.Admin;
import com.lxd.dao.AdminDao;

@Component
@Scope("prototype")
public class AdminAction  extends SuperAction {

	/**
	 * 
	 */
	
	
	private Admin admin;
	private AdminDao adminDao;
	private int id;
	private String s_pageNow;
	private int pageNow=1;
	public AdminDao getAdminDao() {
		return adminDao;
	}
	@Resource
	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}
	private static final long serialVersionUID = 1L;
	public String showList(){
		//System.out.println("#####s_pageNow##@@@@@@@@#"+s_pageNow+"+，###############");
		if(s_pageNow!=null)
		{
			pageNow=Integer.parseInt(s_pageNow);
			//System.out.println("#####pageNow##@@@@@@@@#"+pageNow+"+，####pageNow##########");
		}
		String hql="from Admin order by id";
		//System.out.println("##########AdminAction的showList（）方法，###############");
		request.put("adminList",adminDao.excuteQueryByPage(hql, pageNow, 3));

		String hql1="select count(*) from Admin";
		int pageCount=adminDao.getPageCount(hql1, 3);
		//得到Admin中的PageCount
		request.put("pageCount",pageCount);
		int totalCount=adminDao.getTotalCount(hql1, 3);
		request.put("totalCount",totalCount);
		request.put("pageNow",pageNow);
		return "admin_showList_success";
	}
	public String add(){
		//System.out.println("##########AdminAction的add（）方法，###############");
		//System.out.println("这里是AdminAction的add（）方法，添加一个管理员。显示admin的信息"+admin.getName()+admin.getPassword());
		//String hql="from Admin where id='"+admin.getName()+"' and password='"+admin.getPassword()+"'";
		//System.out.println("AdminAction中的Admin的值"+admin.getName()+admin.getPassword());
		adminDao.add(admin);
		//System.out.println("##########AdminAction的add（）方法，###############");
		return "admin_add_success";
	}
	public String execute() {
		session.get("loginInfo");
		return SUCCESS; 
	}
	
	
	public String updateInput(){
		
		Admin admin=(Admin) adminDao.findById(Admin.class, id);
		//显示管理员页面，在下一个页面
		request.put("admin",admin);
		
		return "admin_updateInput_success";
	}
	
	
	
	public String update(){
		//System.out.println("这里是AdminAction的update（）方法，添加一个管理员。显示update（）方法admin的信息"+admin.getName()+admin.getPassword());
		
		adminDao.update(admin);
		//System.out.println("这里是AdminAction的的更新之后的update（）方法，修改一个管理员。显示update（）方法admin的信息"+admin.getName()+admin.getPassword());
		
		return "admin_update_success";
		
	}
	
	
	public String delete(){
		
	//System.out.println("##########AdminAction的delete（）方法，###############");
	//System.out.println("这里是AdminAction的delete（）方法，删除一个管理员。显示admin的信息"+id);
	
	try {
		adminDao.delById(Admin.class, id);
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	
	
		return "admin_delete_success";
		
	}

	//管理员注销退出
	public String logout(){
//		ActionContext ctx=ActionContext.getContext();  
//		Map<K, V> session=ctx.getSession();  
//		session.get("XX");
//		return null;
		  System.out.println("***********AdminAction**************");
		  System.out.println("这里是AdminAction文件下的logout方法中");
		  System.out.println("seession中的值"+session.get("loginInfo"));
		  System.out.println("************AdminAction*************");
		if(session.get("loginInfo")!=null){
			session.remove("loginInfo");
			 System.out.println("消除seession中的值"+session.get("loginInfo"));
		}
		return "logout_success";
	}
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
