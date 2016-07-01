package com.lxd.action;

import javax.annotation.Resource;


import com.lxd.bean.Project;
import com.lxd.dao.ProjectDao;


public class ProjectAction extends SuperAction{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String s_pageNow;
	private Project project;
	private ProjectDao projectDao;
	private int pageNow=1;

	
	
	
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
	
	public ProjectDao getProjectDao() {
		return projectDao;
	}
	@Resource
	public void setProjectDao(ProjectDao projectDao) {
		this.projectDao = projectDao;
	}
	public int getPageNow() {
		return pageNow;
	}
	
	public void setPageNow(int pageNow) {
		this.pageNow = pageNow;
	}
	

	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	
	
	
	
	
	
	public String updateInput(){
		Project project= (Project) projectDao.findById(Project.class, id);
		//显示管理员页面，在下一个页面
		request.put("project",project);
		return "project_updateInput_success";
	}
	public String delete(){
		
		//System.out.println("##########ProjectAction的delete（）方法，###############");
		//System.out.println("这里是ProjectAction的delete（）方法，删除一个管理员。显示admin的信息"+id);
		
		try {
			projectDao.delById(Project.class, id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return "project_delete_success";
		
	}
	public String add(){
		//System.out.println("ProjectAction中的Project的值"+project.getProinfo()+project.getTeacher().getId()+project.getProname());
		//System.out.println("##########ProjectAction的add（）方法，###############");
		//System.out.println("这里是AdminAction的add（）方法，添加一个管理员。显示NewAction的信息");
		//String hql="from Admin where id='"+admin.getName()+"' and password='"+admin.getPassword()+"'";
		//System.out.println("ProjectAction的教师信息编号"+project.getTeacher().getId());
		
		try {
			projectDao.add(project);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//System.out.println("##########ProjectAction的add（）方法，###############");
		return "project_add_success";
	}
	
	public String update(){
		projectDao.update(project);
		return "project_update_success";
		
	}
	
	public String showContent(){
		
		project=(Project) projectDao.findById(Project.class, id);
		//String hql="from Project where id='"+id+"'";
		//System.out.println("##@@@@@@ProjectAction中的Project"+id);
		//System.out.println("##@@@@@@ProjectAction中的hql"+hql);
	
		request.put("project",project);
		return "project_showContent_success";
	}
	
	public String showList(){
		
		//System.out.println("##@@@@@@ProjectAction中的Project###s_pageNow##@@@@@@@@#"+s_pageNow+"+，###############");
		if(s_pageNow!=null)
		{
			pageNow=Integer.parseInt(s_pageNow);
			//System.out.println("#####pageNow##@@@@@@@@#"+pageNow+"+，####pageNow##########");
		}
		String hql="from Project order by id";
		request.put("projectList",projectDao.excuteQueryByPage(hql, pageNow, 3));

		String hql1="select count(*) from Project";
		int pageCount=projectDao.getPageCount(hql1, 3);
		//得到Admin中的PageCount
		
		int totalCount=projectDao.getTotalCount(hql1, 3);
		request.put("pageCount",pageCount);
		request.put("totalCount",totalCount);
		request.put("pageNow",pageNow);
		return "project_showList_success";
	}
	
	


}
