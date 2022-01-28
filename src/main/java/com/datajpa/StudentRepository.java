package com.datajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.datajpa.entity.Student;



@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

	Student findByStudentName(String name);
	
	List<Student> findAllByStudentName(String name);
	
	Student findById(int Id);
	
	@Query(" select s.studentName from Student s where s.id = :id")
	String getStudentNameById(int id);
}
