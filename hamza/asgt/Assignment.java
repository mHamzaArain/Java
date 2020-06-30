/**
 * This assingment has been submitted on Monday, 29 June 2020
 *
 * @author Muhammad Hamza Hanif B18101067
 * @version 0.1 
 * @since Assignment-01
 * @see Employee query
 * 
 * github: https://github.com/mHamzaHanif/Java/
 *  
 * -----------------------------------------------------------
 */

import java.util.ArrayList;

/**
 * Employ abstract class
 */
abstract class Employee{
    public String firstName;
    public String lastName;
    public String socialSecurityNumber; 

    abstract double earnings();
} 

/**
 * Salary emplyee implemented
 */

class SalariedEmployee extends Employee{
    /**
    * Constructor for class SalariedEmployee 
    */
    SalariedEmployee(final String fn, final String ln, final String SSN) {
        this.firstName = fn;
        this.lastName = ln;
        this.socialSecurityNumber = SSN;
    }
    
    /**
     * Call in another function to implement contract.
     * @return int {@value}
     */
    public double weeklySalary() {
        return(7000000);
    }
    
    /**
     * abstract method implemeted
     */
    public double earnings() {
        return weeklySalary();
    }
    
    /**
     * @return String {@value} # Info of employee
     */
    public String toString() {
        return "Salaried employee: " + this.firstName + " " + this.lastName + "\n" +
               "Social security number: " + this.socialSecurityNumber + "\n" +
               "Weekly salary: " + weeklySalary();
    }
}

/**
 * Hourly emplyee implemented
 */
class HourlyEmployee extends Employee{
    Double wage = 1235.64;
    double salary;
    int hours;

    /**
    * Constructor for class HourlyEmployee 
    */
    HourlyEmployee(final String fn, final String ln, final String SSN, int h) {
        this.firstName = fn;
        this.lastName = ln;
        this.socialSecurityNumber = SSN;
        hours = h;
    }

    /**
     * abstract method implemeted
     */
    public double earnings() {
        if (hours <= 40) {
            salary = wage * Double.valueOf(hours);
        } else if (hours > 40) {
            salary = 40 * wage + (hours - 40) * wage * 1.5;
        }
        return (salary);
    }

    /**
     * @return String {@value} # Info of employee
     */
    public String toString() {
        return "Hourly employee: " + this.firstName + " " + this.lastName + "\n" +
               "Social security number: " + this.socialSecurityNumber + "\n" +
               "Earned: " + earnings() + "\n" + "hourly wage: " + wage + "\n" +
               "hours worked:" + hours;
    }
}

/**
 * Commssion emplyee implemented
 */
class CommissionEmployee extends Employee {
    double commisionRate = 31; // 10%
    double salary;
    double grossSales;
    
    /**
     * Constructors for class CommissionEmployee 
     */
    CommissionEmployee() {}
    CommissionEmployee(final String fn, final String ln, final String SSN, double gs) {
        this.firstName = fn;
        this.lastName = ln;
        this.socialSecurityNumber = SSN;
        grossSales = gs;     
    }

    /**
     * abstract method implemeted
     */
    public double earnings() {
        salary = commisionRate * grossSales;
        return salary;
    }

    /**
     * @return String {@value} # Info of employee
     */
    public String toString() {
        return "Commision employee: " + this.firstName + " " + this.lastName + "\n" +
               "Social security number: " + this.socialSecurityNumber + "\n" +
               "Gross Sale: " + this.grossSales + "\n" +
               "Commision rate: " + commisionRate;
    }
}

/**
 * Base plus commsion emplyee implemented
 */
class BasePlusCommisionEmployee extends CommissionEmployee {
    /**
    * Constructor for class BasePlusCommisionEmployee 
    */
    
    BasePlusCommisionEmployee(final String fn, final String ln, final String SSN, final double grossSales) {
        this.firstName = fn;
        this.lastName = ln;
        this.socialSecurityNumber = SSN;
    }

    double baseSalary = 10000;

    /**
     * abstract method implemeted
     */
    public double earnings() {
        salary = (commisionRate * grossSales) + baseSalary;
        return salary;
    }

    /**
     * @return String {@value} # Info of employee
     */
    public String toString() {
        return "Base plus commision employee: " + this.firstName + " " + this.lastName + "\n" +
               "Social security number: " + this.socialSecurityNumber + "\n" +
               "Gross Sale: " + this.grossSales + "\n" +
               "Commision rate: " + commisionRate + "\n" +
               "base salary: " + baseSalary;
    }
}

public class Assignment {
    public static void main(final String[] args) {
        // Instantiate ArrayList of Employ type
        final ArrayList<Employee> list = new ArrayList<Employee>();

        // Adding employee obj into ArrayList
        list.add(new SalariedEmployee("Hamza", "Hanif", "666"));
        list.add(new HourlyEmployee("Imran", "Azher", "992", 55));
        list.add(new CommissionEmployee("Uzair", "Qureshi", "999", 13401));
        list.add(new BasePlusCommisionEmployee("Ehtesham", "Attar", "809", 76));

        // To print these objs in loop
        for (final Employee e : list) {
            System.out.println("\n========================================");
            System.out.println(e.toString());
            System.out.println(e.earnings());
            System.out.println("========================================\n");
        }
    }
}