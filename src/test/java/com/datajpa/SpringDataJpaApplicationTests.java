package com.datajpa;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.datajpa.entity.Address;
import com.datajpa.entity.EducationDetails;
import com.datajpa.entity.Student;

@SpringBootTest
class SpringDataJpaApplicationTests {
	@Autowired
	StudentRepository userrepo;
	@Test
	void contextLoads() {
		
	//	Student student = userrepo.findByStudentName("new1");
		//System.out.println(student);
		Address address = new Address("vilangudi", "madurai", "tamilNadu");
	//	EducationDetails educationDetails = new EducationDetails(0,"KLN",72.22f);
		Student student1 = new Student(0, "new111");
		Student student2 = new Student(0, "new23");
		student1.setAddress(address);
		student2.setAddress(address);
		//userrepo.save(student1);
//		userrepo.save(student2);
		
		List<Student> list = userrepo.findAllByStudentName("new111");
		list.forEach(System.out :: println);
		
		System.out.println(userrepo.findById(1));
		System.out.println(userrepo.getStudentNameById(1));
	}

}
