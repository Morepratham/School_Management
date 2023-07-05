package com.jsp.school.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.school.dto.Student;

public class StudentDao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Pratham");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public Student saveStudent(Student student) {
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
		return student;
	}
	public Student getStudentById(int id) {
		Student student = entityManager.find(Student.class, id);
		return student;
	}
	public Student updateStudentById(int id,Student student ) {
		if(student!= null) {
			entityTransaction.begin();
			entityManager.persist(student);
			entityTransaction.commit();
			return student;
		}
		else {
			return null;
		}
	}
	public boolean deleteStudentById(int id) {
		Student student = entityManager.find(Student.class, id);
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
		return true;
	}
}
