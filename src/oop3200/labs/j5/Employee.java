package oop3200.labs.j5;

import java.time.LocalDate;


/**
 * @file    Employee.java
 * @author  Kevin Astilla
 * @author  Musab Nazir
 * @since 6th December 2018
 * @description:
 *  This file contains the definition and implementation of the employee class that
 * extends from the person class. This class is used for derived classes such as SalariedEmployee and HourlyWorker
 */
public abstract class Employee extends Person {
    
    // Attributes definition
    private final String EmployeeId;
    
    // Parameterized Constructor
    public Employee(String name, LocalDate birthDate, String employeeId) {
        super(name, birthDate);
        if (employeeId.length() == 8) {  
            EmployeeId = employeeId;
        } else {
            throw new IllegalArgumentException("All Employee ID mus be an "
                    + "8-digit number ");
        }
    }
    
    /**
     * Accessor for EmployeeId
     * @return EmployeeId
     */
    public String GetEmployeeId() {
        return EmployeeId;
    }
    
    // CaclulatePayDay abstract method that each specific child of Employee Class will override
    public abstract double CalculatePayDay();
}
