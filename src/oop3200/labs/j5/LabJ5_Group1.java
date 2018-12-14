package oop3200.labs.j5;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @author Kevin Astilla
 * @author Musab Nazir
 * @since 6th December 2018
 * @description: Main class for Lab 5. This class is primarily for the testing
 * of the other classes like Employee, SalariedEmployee, HourlyWorker etc.
 */
public class LabJ5_Group1 {

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*        
// For currency format conversion
        NumberFormat defaultCurrency = NumberFormat.getCurrencyInstance();
        try {
            // instantiate a salaried worker
            SalariedEmployee tims = new SalariedEmployee("mariah", LocalDate.of(1992, 05, 22), "12345678", 48000);
            // print salary
            System.out.println(String.format("%s salary is %s", tims.getName(),
                    defaultCurrency.format(tims.getYearlySalary())));
            // modify salary
            tims.setYearlySalary(78850);
            
            // print the worker salary again
            System.out.println(String.format("%s salary is %s", tims.getName(),
                    defaultCurrency.format(tims.getYearlySalary())));
            
            // instantiate a hourly worker
            HourlyWorker walmart = new HourlyWorker("vinny", LocalDate.of(1992, 05, 22), "45789632", 17.38, 35);
            // print the worker details
            System.out.println(String.format("%s rate is %s for %.2f hours", 
                        walmart.getName(),
                        defaultCurrency.format(walmart.getHourlyRate()),
                        walmart.getHoursPerWeek()));
            // modify the rate and the hours
            walmart.setHourlyRate(21.35);
            walmart.setHoursPerWeek(20);
            // print details again
            System.out.println(String.format("%s rate is %s for %.2f hours", 
                        walmart.getName(),
                        defaultCurrency.format(walmart.getHourlyRate()),
                        walmart.getHoursPerWeek()));
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        try{
            double overallPayAmount = 0;            // for tracking total weekly amount paid
            ArrayList<Employee> employeeList = new ArrayList<>();       // to hold all the employee objects
            // instantiate salariedEmployees
            employeeList.add(new SalariedEmployee("mandy", LocalDate.of(1992, 06, 30), "78451236", 24000));
            employeeList.add(new SalariedEmployee("bryce", LocalDate.of(1989, 07, 27), "78451774", 23599));
            // instantiate hourlyWorkers
            employeeList.add(new HourlyWorker("leshawn", LocalDate.of(1994, 12, 25), "84577885", 18.00, 15.0));
            employeeList.add(new HourlyWorker("ping", LocalDate.of(1998, 02, 12), "45788520", 19.38, 26.0));
            employeeList.add(new HourlyWorker("sir", LocalDate.of(2001, 03, 01), "45789630", 18.38, 20.0));
            
            // print the payroll report
            System.out.println("Payroll Report");
            System.out.printf("%-10s %-10s %s\n","ID",
                        "Name",
                        "Pay");
               
            System.out.println("=============================");
            for(Employee employees : employeeList)
            {
                System.out.printf("%-10s %-10s %s\n",employees.GetEmployeeId(),
                        employees.getName(),
                        defaultCurrency.format(employees.CalculatePayDay()));
                overallPayAmount += employees.CalculatePayDay();
            }
            System.out.println("=============================");
            System.out.printf("%-10s %s\n","TOTAL:",
                    defaultCurrency.format(overallPayAmount));
            
        }
        
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
         */
        Vector<String> vect = new Vector<String>(3);
        vect.add("str1");
        vect.add("str2");
        vect.add("str3");
        vect.add("str4");

        System.out.println(vect.capacity());
    }
}
