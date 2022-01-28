package com.datajpa.entity;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Student {


	@Override
	public String toString() {
		String value;
		if(address != null)
			value =  "Student [Id=" + id + ", studentName=" + studentName + ", address=" + address.toString() + "]";
		else
			value =  "Student [Id=" + id + ", studentName=" + studentName + "]";
		return value;
	}

//	@Id
//    @SequenceGenerator(name="seq",sequenceName="student_id_seq")        
//    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq") 
	@Id
	@SequenceGenerator(name="seq",sequenceName="student_id_seq")        
//  @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seq")
	private int id;
	
	public Student(int id, String studentName) {
		super();
		this.id = id;
		this.studentName = studentName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	private String studentName;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentNickName() {
		return studentNickName;
	}

	public void setStudentNickName(String studentNickName) {
		this.studentNickName = studentNickName;
	}

	private String studentNickName;
	
	@Embedded
	private Address address;
	
	
}
