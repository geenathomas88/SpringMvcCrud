package com.geena.dao.Impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.geena.dao.StudentDAO;
import com.geena.model.Student;

@Repository
public class StudentDAOImpl implements StudentDAO {

	@Autowired
	private SessionFactory session;

	@Override
	public Student getStudent(int studentId) {
		return (Student) session.getCurrentSession().get(Student.class, studentId);
	}
	
	@Override
	public void add(Student student) {
		session.getCurrentSession().save(student);
	}

	@Override
	public void edit(Student student) {
		session.getCurrentSession().update(student);
	}

	@Override
	public void delete(int studentId) {
		session.getCurrentSession().delete(getStudent(studentId));
	}

	

	@Override
	public List getAllStudents() {
		return session.getCurrentSession().createQuery("from Student").list();
	}

}
