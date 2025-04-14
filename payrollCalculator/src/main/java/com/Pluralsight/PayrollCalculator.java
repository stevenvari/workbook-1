package com.Pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = scanner.nextLine();

        System.out.print("Enter hours worked : ");
        float hoursWorked = scanner.nextFloat();

        System.out.print("Enter pay rate : ");
        float payRate = scanner.nextFloat();
        float grossPay = hoursWorked * payRate;

        System.out.println("Payroll Summary : ");
        System.out.println("Employee's Name " + " " + name);
        System.out.printf("Gross Pay : $%.2f" , grossPay);






    }
}
