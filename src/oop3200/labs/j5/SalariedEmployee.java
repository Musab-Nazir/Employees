package oop3200.labs.j5;

import java.time.LocalDate;


/**
 * @file    SalariedEMployee.java
 * @author  Kevin Astilla
 * @author  Musab Nazir
 * @since 6th December 2018
 * @description: This is the SalariedEmployee class that inherits Employee
 */
public class SalariedEmployee extends Employee {
    // Attributes
    double yearlySalary;
    // Constant used for pay calculation
    static final int WEEKS_PER_YEAR = 52;
    
    // Parametrized ctor
    public SalariedEmployee(String name, LocalDate birthDate, String id, double salary){
        super(name, birthDate, id);
        setYearlySalary(salary);
    }
    
    /**
     * Mutator for yearlySalary that throws an exception if the provided parameter is negative.
     * Since it is used in the ctor it is final
     * @param salary 
     */
    public final void setYearlySalary(double salary){
        if(salary >= 0){
            yearlySalary = salary;
        }
        else {
            throw new IllegalArgumentException("Yearly Salary cannot be a"
                    + " Negative number");
        }
    }
    /**
     * Accessor for yearlySalary
     * @return yearlySalary
     */
    public double getYearlySalary(){
        return yearlySalary;
    }
    
    /**
     * Override for the abstract method in Employee. Calculates weekly pay and returns a double
     * @return weeklyPay
     */
    @Override
    public double CalculatePayDay() {
        return yearlySalary/WEEKS_PER_YEAR;
    }
    
}
