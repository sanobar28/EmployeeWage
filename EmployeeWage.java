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
	 * UC-4 to calculate Wage using switch statements 
	 */
	private static void checkPresent() {
		
		int empHrs=0;
		int empcheck = (int) Math.floor(Math.random()*10)%3;
		
		switch (empcheck){
			
			case(IS_FULL_TIME):
				empHrs=8;
				break;		
		
			case(IS_PART_TIME):
				empHrs=4;
				break;
		
			default:
				empHrs=0;
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
