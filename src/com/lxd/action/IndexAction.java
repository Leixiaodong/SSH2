package com.lxd.action;



import javax.annotation.Resource;

import com.lxd.bean.News;
import com.lxd.bean.Project;
import com.lxd.bean.Student;
import com.lxd.bean.Teacher;
import com.lxd.dao.NewsDao;
import com.lxd.dao.ProjectDao;
import com.lxd.dao.StudentDao;
import com.lxd.dao.TeacherDao;

public class IndexAction extends SuperAction {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String s_pageNow;
	private NewsDao newsDao;
	private News news;
	private int pageNow=1;
	private Project project;
	private ProjectDao projectDao;
	private Student student;
	private StudentDao studentDao;
	private Teacher teacher;
	private TeacherDao teacherDao;
	
	
	
	public String showList(){
		//System.out.println("#####s_pageNow##@@@@@@@@#"+s_pageNow+"+，###############");
//		if(s_pageNow!=null)
//		{
//			pageNow=Integer.parseInt(s_pageNow);
//			System.out.println("#####pageNow##@@@@@@@@#"+pageNow+"+，####pageNow##########");
//		}
		//System.out.println("######这里是IndexAction中的showList烦烦烦方法++++++++++++++++++++++");
		String hql="from News order by id desc";
		String hql1="from Project order by id desc";
		//System.out.println("#####！！！￥￥￥￥￥￥￥￥￥￥￥￥%%%%%%#####IndexAction的showList（）方法，###############");
		//System.out.println("######"+hql);
		//System.out.println("######"+hql1);
		request.put("newsList",newsDao.excuteQueryByPage(hql, 1, 7));
		request.put("projectList",projectDao.excuteQueryByPage(hql1, 1,6));
		//List list=newsDao.excuteQueryByPage(hql, 1, 5);
		//System.out.println("######"+list.getClass());
		//System.out.println("#####！！！￥￥￥￥￥￥￥￥￥￥￥￥%%%%%%#####IndexAction的showList（）方法，###############");
	
		return "index_showList_success";
	}
	public String execute() {
	//	session.get("loginInfo");
	//	System.out.println("######这里是IndexAction中的execute烦烦烦方法++++++++++++++++++++++");
		String hql="from News order by id desc";
		String hql1="from Project order by id desc";
		//System.out.println("#####！！！￥￥￥￥￥￥￥￥￥￥￥￥%%%%%%#####IndexAction的showList（）方法，###############");
		request.put("newsList",newsDao.excuteQueryByPage(hql, 1, 7));
		request.put("projectList",projectDao.excuteQueryByPage(hql1, 1, 7));
		//System.out.println("#####！！！￥￥￥￥￥￥￥￥￥￥￥￥%%%%%%#####IndexAction的showList（）方法，###############");
	
		return SUCCESS; 
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
	public NewsDao getNewsDao() {
		return newsDao;
	}
	
	@Resource
	public void setNewsDao(NewsDao newsDao) {
		this.newsDao = newsDao;
	}
	public News getNews() {
		return news;
	}
	public void setNews(News news) {
		this.news = news;
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
	public ProjectDao getProjectDao() {
		return projectDao;
	}
	
	@Resource
	public void setProjectDao(ProjectDao projectDao) {
		this.projectDao = projectDao;
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
	
	
	
	

	
}
