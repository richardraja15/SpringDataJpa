package com.datajpa.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class EducationDetails {

	@Id
	@SequenceGenerator(name="seq",sequenceName="education_id_seq")        
//  @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seq")
	private long educationId;
	
	private String collegeName;
	
	private float percentage;

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public EducationDetails() {
		// TODO Auto-generated constructor stub
	}

	public EducationDetails(long educationId,String collegeName, float percentage) {
		super();
		this.educationId = educationId;
		this.collegeName = collegeName;
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "EducationDetails [collegeName=" + collegeName + ", percentage=" + percentage + "]";
	}

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	public long getEducationId() {
		return educationId;
	}

	public void setEducationId(long educationId) {
		this.educationId = educationId;
	}
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id",referencedColumnName = "id")
	private Student student;
}
