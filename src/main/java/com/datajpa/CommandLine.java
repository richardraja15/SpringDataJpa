package com.datajpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.datajpa.entity.Student;


public class CommandLine implements CommandLineRunner {

	@Autowired
	StudentRepository userrepo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	Student student = new Student(0, "richard");
		Student student1 = new Student(0, "richard1");
		Student student2 = new Student(0, "richard2");
		userrepo.save(student);
		userrepo.save(student1);
		userrepo.save(student2);
		List<Student> list = userrepo.findAll();
		list.forEach(System.out :: println);
	}

}
