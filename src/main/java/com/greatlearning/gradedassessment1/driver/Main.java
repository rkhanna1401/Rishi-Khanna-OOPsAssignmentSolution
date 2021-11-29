package com.greatlearning.gradedassessment1.driver;

import com.greatlearning.gradedassessment1.departments.AdminDepartment;
import com.greatlearning.gradedassessment1.departments.HrDepartment;
import com.greatlearning.gradedassessment1.departments.SuperDepartment;
import com.greatlearning.gradedassessment1.departments.TechDepartment;

public class Main {
	
	public static void main(String[] args) {
		//Objects
		AdminDepartment adminDepartment = new AdminDepartment();
		HrDepartment hrDepartment = new HrDepartment();
		TechDepartment techDepartment = new TechDepartment();
		SuperDepartment admin = new AdminDepartment();
		SuperDepartment hr = new HrDepartment();
		SuperDepartment tech = new TechDepartment();
		
		//Functionalities of Admin Department
		System.out.println(" Welcome to"+adminDepartment.departmentName());
		System.out.println(adminDepartment.getTodaysWork());
		System.out.println(adminDepartment.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday());
		System.out.println();

		//Functionalities of HR Department
		System.out.println(" Welcome to"+hrDepartment.departmentName());
		System.out.println(hrDepartment.doActivity());
		System.out.println(hrDepartment.getTodaysWork());
		System.out.println(hrDepartment.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());
		System.out.println();
		
		//Functionalities of Tech Department
		System.out.println(" Welcome to"+techDepartment.departmentName());
		System.out.println(techDepartment.getTodaysWork());
		System.out.println(techDepartment.getWorkDeadline());
		System.out.println(techDepartment.getTechStackInformation());
		System.out.println(tech.isTodayAHoliday());
	}

}
