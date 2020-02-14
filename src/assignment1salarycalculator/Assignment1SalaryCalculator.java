/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1salarycalculator;

/**
 *
 * @author gubotdev
 */
public class Assignment1SalaryCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SalaryCalculator salaryCalculator = new SalaryCalculator();
        salaryCalculator.calcSalary(20);
        salaryCalculator.calcHourly(41600);
        salaryCalculator.calcTakeHomePerMonth(41600, .125);
        salaryCalculator.calcTaxes(41600, .125);
    }
    
}
