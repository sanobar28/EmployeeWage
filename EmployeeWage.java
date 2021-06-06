package com;

public class EmployeeWage {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee wage computation program");
		
		checkPresent();
	}

	/**
	 * UC-1 to check if employee is present or absent
	 */
	private static void checkPresent() {
		
		double empCheck = Math.random();
		if (empCheck > 0.5) {
			System.out.println("Employee is Present");
		}
		else {
			System.out.println("Employee is Absent");
		}
		
	}
}
