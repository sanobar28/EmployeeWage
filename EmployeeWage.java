package com;

public class EmployeeWage {

    /**
     * calculateTotalWage method gets value from main method and calculate the
     * employee wage
     *
     * @param company
     * @param wageRatePerHour
     * @param maxWorkingDays
     * @param maxWorkingHours
     *
     */
    private static void calculateTotalWage(String companyName, int wageRatePerHour, int maxWorkingDays, int maxWorkingHours) {
        //constant variable
        final int PART_TIME = 1;
        final int FULL_TIME = 2;

        // instance variable
        int totalWage = 0;
        int workingHours = 0;
        int totalWorkingHours = 0;

        // for loop checking 
        for (int day = 1; day <= maxWorkingDays && totalWorkingHours <= maxWorkingHours; day++) {
            totalWorkingHours += workingHours;
            int employeeType = (int) (Math.random() * 100) % 3;
            switch (employeeType) {
                case FULL_TIME:
                    workingHours = 8;
                    break;
                case PART_TIME:
                    workingHours = 4;
                    break;
                default:
                    workingHours = 0;
            }
            int Employeewage = workingHours * wageRatePerHour;
            totalWage += Employeewage;

        }

        System.out.println("Total wage for a month of " + companyName + " employee is " + totalWage + "\n");
    }

    /**
     *
     * This is the main method Displaying Welcome to Employee Wage Computation
     * passing company name wage rate per hour into calculate total wage method
     * for employee wage
     *
     * @param args
     */
    public static void main(String args[]) {
        calculateTotalWage("RelianceMart", 30, 15, 200);
        calculateTotalWage("BigBazar", 20, 20, 100);
        calculateTotalWage("Dmart", 15, 25, 200);
    }
}