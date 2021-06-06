package com;

public class EmployeeWage {

	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;
	public static final int EMP_RATE_PER_HOUR=20;
	public static final int NUM_OF_WORK_DAYS=20;
	public static final int MAX_HRS_IN_MONTH=100;
	
	static int empHrs=0;
	static int totalEmpWage = 0;
	static int totalWorkingHrs=0; 
	static int totalWorkdays=0;
	
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee wage computation program");
		
		
		calculateWage();
	}

	/**
	 * UC-6 Code refactor and use class method and class variable
	 */
	private static void calculateWage() {
		

		while (totalWorkingHrs <= MAX_HRS_IN_MONTH && 
				totalWorkdays < NUM_OF_WORK_DAYS){
			
			totalWorkdays++;
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
			totalWorkingHrs += empHrs;
			int empWage = empHrs * EMP_RATE_PER_HOUR;
			totalEmpWage += empWage;
		}
	
		System.out.println("Total working hours : " + totalWorkingHrs);
		System.out.println("No. of working days: " + totalWorkdays);
		System.out.println("Total Emp Wage for month: " + totalEmpWage);
	}	
}
