package com.geena.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.geena.dao.StudentDAO;
import com.geena.model.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDAO studentDAO;
	
	@Transactional
	public Student getStudent(int studentId) {
		return studentDAO.getStudent(studentId);
	}

	
	@Transactional
	public void add(Student student) {
		studentDAO.add(student);

	}

	@Transactional
	public void edit(Student student) {
		studentDAO.edit(student);
	}

	@Transactional
	public void delete(int studentId) {
		studentDAO.delete(studentId);

	}

	
	@Transactional
	public List getAllStudents() {
		return studentDAO.getAllStudents();
	}

}
