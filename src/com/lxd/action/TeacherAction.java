package com.lxd.action;

import javax.annotation.Resource;


import com.lxd.bean.Teacher;
import com.lxd.dao.TeacherDao;

public class TeacherAction extends SuperAction{
	/**
	 * 
	 */
	
	
	
	
	private static final long serialVersionUID = 1L;
	private Teacher teacher;
	private TeacherDao teacherDao;
	private int id;
	private String s_pageNow;
	private int pageNow=1;
	
     
	public String update(){
		teacherDao.update(teacher);
		return "teacher_update_success";
		
	}

	
	public String updateInput(){
		
		Teacher teacher= (Teacher) teacherDao.findById(Teacher.class, id);
		//显示管理员页面，在下一个页面
		request.put("teacher",teacher);
		return "teacher_updateInput_success";
	}
	public String delete(){
		
		System.out.println("##########TeacherAction的delete（）方法，###############");
		System.out.println("这里是TeacherAction的delete（）方法，删除一个管理员。显示admin的信息"+id);
		
		try {
			teacherDao.delById(Teacher.class, id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return "teacher_delete_success";
		
	}
	public String add(){
		System.out.println("TeacherAction中的Teacher的值"+teacher.getName()+teacher.getProjects().getClass()+teacher.getClass());
		System.out.println("##########TeacherAction的add（）方法，###############");
		//System.out.println("这里是AdminAction的add（）方法，添加一个管理员。显示NewAction的信息");
		//String hql="from Admin where id='"+admin.getName()+"' and password='"+admin.getPassword()+"'";
		System.out.println("TeacherAction的教师信息编号"+teacher.getId());
		
		try {
			teacherDao.add(teacher);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("##########TeacherAction的add（）方法，###############");
		return "teacher_add_success";
	}
	
	
	
	public String showList(){
		
		System.out.println("##@@@@@@TeacherAction中的Teacher###s_pageNow##@@@@@@@@#"+s_pageNow+"+，###############");
		if(s_pageNow!=null)
		{
			pageNow=Integer.parseInt(s_pageNow);
			System.out.println("#####pageNow##@@@@@@@@#"+pageNow+"+，####pageNow##########");
		}
		String hql="from Teacher order by id";
		request.put("teacherList",teacherDao.excuteQueryByPage(hql, pageNow, 3));

		String hql1="select count(*) from Teacher";
		int pageCount=teacherDao.getPageCount(hql1, 3);
		//得到Admin中的PageCount
		
		int totalCount=teacherDao.getTotalCount(hql1, 3);
		request.put("pageCount",pageCount);
		request.put("totalCount",totalCount);
		request.put("pageNow",pageNow);
		return "teacher_showList_success";
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
