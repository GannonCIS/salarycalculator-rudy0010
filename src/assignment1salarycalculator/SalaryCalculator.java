/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1salarycalculator;

/**
 *
 * @author jdrudy
 */
public class SalaryCalculator {
    //52 weeks of work per year
    //40 hours per week
    //calcHourly(int salary)                            return int
    //calcTakeHomePerMonth(int salary, double taxRate)  return double
    //calcTaxes(int salary, double taxes)               return double
    public int calcSalary(int hourlyRate){
        int salary = hourlyRate * 40 * 52;
        System.out.println(salary);
        return salary;
    }
    
    public int calcHourly(int salary){
        int hourly = salary/40/52;
        System.out.println(hourly);
        return hourly;
    }
    
    public double calcTakeHomePerMonth(int salary, double taxRate){
        double takeHomePerMonth = salary - (salary * taxRate);
        System.out.println(takeHomePerMonth);
        return takeHomePerMonth;
    }
    
    public double calcTaxes(int salary, double taxRate){
        double taxes = salary * taxRate;
        System.out.println(taxes);
        return taxes;
    }
}
