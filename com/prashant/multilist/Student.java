/**
 * 
 */
package com.prashant.multilist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author p00318395
 *
 */
public class Student {
	
	private Integer studentID;
	
	private String studentName;
	
	private List<Class>listOfClass= new ArrayList<Class>();
	
	private Map<Class,Grade>listOfGrade= new HashMap<Class,Grade>();

	public List<Class> getListOfClass() {
		return listOfClass;
	}

	public void setListOfClass(List<Class> listOfClass) {
		this.listOfClass = listOfClass;
	}

	public Integer getStudentID() {
		return studentID;
	}

	public void setStudentID(Integer studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Map<Class,Grade> getListOfGrade() {
		return listOfGrade;
	}

	public void setListOfGrade(Map<Class,Grade> listOfGrade) {
		this.listOfGrade = listOfGrade;
	}
	

}
