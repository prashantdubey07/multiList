/**
 * 
 */
package com.prashant.multilist;

import java.util.HashMap;
import java.util.Map;

/**
 * @author p00318395
 *
 */
public class Class {
	
	private Integer classID;
	
	private String className;
	
	private Map<Student,Grade>listOfStudent= new HashMap<Student,Grade>();

	public  Map<Student,Grade> getListOfStudent() {
		return listOfStudent;
	}

	public void setListOfStudent( Map<Student,Grade> listOfStudent) {
		this.listOfStudent = listOfStudent;
	}

	public Integer getClassID() {
		return classID;
	}

	public void setClassID(Integer classID) {
		this.classID = classID;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

}
