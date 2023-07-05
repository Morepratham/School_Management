package com.jsp.school.service;

import com.jsp.school.dao.StudentDao;
import com.jsp.school.dto.Student;

public class StudentService {
	StudentDao studentDao = new StudentDao();
	 
	public Student saveStudent(Student student) {
		 if (student != null) {
			 return studentDao.saveStudent(student);
		 }else {
			 return null;
		 }
	}
	public Student getStudentById (int id) {
		if(id>0) {
			return studentDao.getStudentById(id);
		}else {
			return null;
		}
	}
	public Student updateStudentById(int id, String name, String email, String password) {
		Student student = studentDao.getStudentById(id);
		student.setStudent_name(name);
		student.setStudent_email(email);
		student.setPassword(password);
		return studentDao.saveStudent(student);
	}
	public boolean deleteStudentById(int id) {
		if(id>0) {
			return studentDao.deleteStudentById(id);
		}else {
			return false;
		}
	}
}
