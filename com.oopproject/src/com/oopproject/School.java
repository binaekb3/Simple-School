package com.oopproject;

import java.util.Scanner;
import java.util.*;
import java.util.ArrayList;

public class School {

	public static void main(String[] args) {
		

		Teacher t1 = new Teacher(1, 500, "binayak");
		Teacher t2 = new Teacher(2, 1000, "bijaya");
		Teacher t3 = new Teacher(3, 3000, "binita");

		Student s1 = new Student(1, 4, "joe");
		Student s2 = new Student(2, 5, "bob");
		Student s3 = new Student(3, 7, "sue");

		s1.updateFeesPaid(1000);
		s2.updateFeesPaid(2000);
		s3.updateFeesPaid(5000);

		ArrayList<Teacher> teacher = new ArrayList<Teacher>();
		teacher.add(t1);
		teacher.add(t2);
		teacher.add(t3);
		for (Teacher list : teacher) {
			System.out.println(list);
		}
		System.out.println();
		ArrayList<Student> student = new ArrayList<Student>();
		student.add(s1);
		student.add(s2);
		student.add(s3);

		for (int i = 0; i < student.size(); i++) {
			System.out.println(student.get(i));
		}

		
	}

}
