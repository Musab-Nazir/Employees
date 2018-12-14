package oop3200.labs.j5;

import java.time.LocalDate;

/**
 * @file    HourlyClass.java
 * @author  Kevin Astilla
 * @author  Musab Nazir
 * @since 6th December 2018
 * @description:
 * This is the HourlyWorker class that inherits from the Employee class
 * It has two specific attributes Rate and Hours per week and it overrides the CalculatePayDay method
 * from the Employee Class
 */
public class HourlyWorker extends Employee {
    
    // Attributes
    double hourlyRate;
    double hoursPerWeek;
    // static constants used for validation purposes
    static final double MAXIMUM_HOURS_PER_WEEK = 48;
    static final double MINIMUM_RATE = 16.00;
    
    
    // Parametrized ctor
    public HourlyWorker(String name, LocalDate date, String employeeId, double rate, double hours){
        // call the employee constructor
        super(name, date, employeeId);
        // set the individual attributes using mutators that have validation in them
        setHourlyRate(rate);
        setHoursPerWeek(hours);
       
    }
    
    /**
     * Mutator for the hourlyRate. It has validation built in
     * If invalid argument is provided an IllegalArgumentException is thrown
     * It is final as it is used in the ctor
     * @param rate 
     */
    public final void setHourlyRate(double rate){
        if(rate > MINIMUM_RATE){
            hourlyRate = rate;
        }
        else{
            throw new IllegalArgumentException(String.format("employee rate "
                    + "cannot be lower than the %d ",MINIMUM_RATE));
        }
    }
    /**
     * Accessor for hourlyRate
     * @return hourlyRate
     */
    public double getHourlyRate(){
        return hourlyRate;
    }
    
    /**
     * Mutator for HoursPerWeek. It has validation built in
     * If invalid argument is provided an IllegalArgumentException is thrown
     * It is final as it is used in the ctor
     * @param hours 
     */
    public final void setHoursPerWeek(double hours){
        if(hours >= 0 && hours <= MAXIMUM_HOURS_PER_WEEK){
            hoursPerWeek = hours;
        }
        else{
            throw new IllegalArgumentException(String.format("hour can only be "
                    + "between 0 and %d",MAXIMUM_HOURS_PER_WEEK));
        }
    }
    
    /**
     * Accessor for hoursPerWeek
     * @return hourlyRate
     */
    public double getHoursPerWeek(){
        return hoursPerWeek;
    }
    
    /**
     * CalculatePayDay override. It takes the product of rate and the hours worked per week
     * and returns a double
     * @return WeeklyPay
     */
    @Override
    public double CalculatePayDay() {
        return hourlyRate * hoursPerWeek;
    }
    
}
