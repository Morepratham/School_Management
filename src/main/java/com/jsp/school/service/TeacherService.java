package com.jsp.school.service;

import java.util.List;

import com.jsp.school.dao.TeacherDao;
import com.jsp.school.dto.Student;
import com.jsp.school.dto.Teacher;

public class TeacherService {
	TeacherDao teacherDao = new TeacherDao();
	
	public Teacher saveTeacher(Teacher teacher) {
		if(teacher != null) {
			return teacherDao.saveTeacher(teacher);
		}else {
			return null;
		}
	}
	public Teacher getTeacherById(int id) {
		if (id>0) {
			return teacherDao.getTeacherById(id);
		}
		else {
			return null;
		}
	}
	public boolean deleteTeacherById(int id) {
		if(id>0) {
			return teacherDao.deleteStudentById(id);
		}else {
			return false;
		}
	}
	public Teacher updateTeacherById(int id, String name, String email, String password) {
		Teacher teacher = teacherDao.getTeacherById(id);
		teacher.setTeacher_name(name);
		teacher.setTeacher_email(email);
		teacher.setTeacher_password(password);
		return teacherDao.saveTeacher(teacher);	
	}
	public Student getStudentById(int id) {
		if(id>0) {
			return teacherDao.getStudentById(id);
		}else {
			return null;
		}
	}
	public List<Student> getAllStudent(){
		return teacherDao.getAllStudent();
	}
	public boolean deleteStudentById(int id) {
		if(id>0) {
			return teacherDao.deleteStudentById(id);
		}else {
			return false;
		}
	}
	public Student updateStudentById(Student student , int id){
		return teacherDao.updateStudentById(student, id);
	}
}
