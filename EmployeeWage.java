package com;

public class EmployeeWage {

	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;
	public static final int EMP_RATE_PER_HOUR=20;
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee wage computation program");
		
		checkPresent();
	}

	/**
	 * UC-1 to check if employee is present or absent
	 * UC-3 to check if Employee is part time and calculate Wage
	 */
	private static void checkPresent() {
		
		int empHrs=0;
		int empCheck = (int)Math.floor(Math.random()*10) % 3;
		
		if (empCheck == IS_FULL_TIME) {
			System.out.println("Employee is Present");
			empHrs=8;
		}
		else if (empCheck == IS_PART_TIME ){
			System.out.println("Employee is Part Time");
			empHrs=4;
		}	
		else {
			System.out.println("Employee is Absent");
		}
		
		EmpWage(empHrs);
	}
	
	/**
	 * UC-2 to calculate Employee wage per day
	 * @param empHrs
	 */
	private static void EmpWage(int empHrs) {
		
		int empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage per day" + empWage);
	}
}
