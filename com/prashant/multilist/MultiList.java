package com.prashant.multilist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MultiList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer, Student> mapOfStudent = new HashMap<Integer, Student>();
		Class classnew = null;
		Grade grade = null;
		List<Class> listOfClass = new ArrayList<Class>();
		Map<Class, Grade> listOfGrade = new HashMap<Class, Grade>();
		Map<Student, Grade> listOfStudent = new HashMap<Student, Grade>();
		do {
			System.out.println("please input student Number");
			System.out
					.println("please input N to exit and Y to enter more details");

			int number = sc.nextInt();
			if (mapOfStudent.containsKey(number)) {
				Student student1 = mapOfStudent.get(number);
				System.out.println("please input course Number");
				int classNumber = sc.nextInt();
				classnew = new Class();
				classnew.setClassID(classNumber);

				if (student1.getListOfClass().contains(classnew)) {
					System.out.println("please input different course Number");
					continue;
				} else {
					student1.getListOfClass().add(classnew);
				}

				System.out.println("please input grade Number");
				int gradeNumber = sc.nextInt();
				grade = new Grade();
				grade.setGradeID(gradeNumber);

				student1.getListOfGrade().put(classnew, grade);
				listOfStudent.put(student1, grade);
				classnew.setListOfStudent(listOfStudent);
			} else {
				Student student1 = new Student();
				listOfClass = new ArrayList<Class>();
				listOfGrade = new HashMap<Class, Grade>();
				student1.setListOfClass(listOfClass);
				student1.setListOfGrade(listOfGrade);
				student1.setStudentID(1);
				System.out.println("please input course Number");
				int classNumber = sc.nextInt();
				classnew = new Class();
				classnew.setClassID(classNumber);
				if (student1.getListOfClass().contains(classnew)) {
					System.out.println("please input different course Number");
					continue;
				} else {
					student1.getListOfClass().add(classnew);
				}
				System.out.println("please input grade Number");
				int gradeNumber = sc.nextInt();
				grade = new Grade();
				grade.setGradeID(gradeNumber);
				student1.getListOfGrade().put(classnew, grade);
				listOfStudent.put(student1, grade);
				classnew.setListOfStudent(listOfStudent);
			}
		} while (sc.next().equalsIgnoreCase("y"));
	}

}
