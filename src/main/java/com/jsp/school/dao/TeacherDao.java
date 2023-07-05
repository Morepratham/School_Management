package com.jsp.school.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.school.dto.Student;
import com.jsp.school.dto.Teacher;

public class TeacherDao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Pratham");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction= entityManager.getTransaction();
	
	public Teacher saveTeacher(Teacher teacher) {
		entityTransaction.begin();
		entityManager.persist(teacher);
		entityTransaction.commit();
		return teacher;
	}
	public Teacher getTeacherById(int id) {
		Teacher teacher = entityManager.find(Teacher.class,id);
		return teacher;
		
	}
	public boolean deleteTeacherById(int id) {
	    Teacher teacher = entityManager.find(Teacher.class,id);
		entityTransaction.begin();
		entityManager.remove(teacher);
		entityTransaction.commit();
		return true;
	}
	public Teacher updateTeacherByid(Teacher teacher, int id) {
		entityTransaction.begin();
		entityManager.persist(teacher);
		entityTransaction.commit();
		return teacher;
	}
	public Student getStudentById(int id) {
		Student student = entityManager.find(Student.class, id);
		return student;
	}
	public List<Student> getAllStudent() {
		String sql = "SELECT * FORM STUDENT";
		javax.persistence.Query query = entityManager.createQuery(sql);
		List<Student> students = query.getResultList();
		return students;
	}
	public boolean deleteStudentById(int id) {
		Student student =  entityManager.find(Student.class, id);
		entityTransaction.begin();
		entityManager.remove(student);
		entityTransaction.commit();
		return true;
	}
	public Student updateStudentById(Student student , int id) {
		Student student2 = entityManager.find(Student.class, id);
		if(student2 != null) {
		entityTransaction.begin();
		entityManager.merge(student);
		entityTransaction.commit();
		}return student;
	}
}
