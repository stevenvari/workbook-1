package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        // Question 1:
        // declare variables here
        // then code solution
        // then use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer)

        /* Question 1: create two variables to represent the salary
        for Bob and Gary, name them bobSalary and garySalary.
        create a new variable named highestSalary.
        Determine whose salary is greater using Math.max() and
        store the answer in highestSalary. Set the initial salary
        variable to any value you want. Print the enswer( the highest salary is)
         */
        double bobSalary = 50.000;
        double garySalary = 65.000;

        double highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("the highest salary is " + highestSalary);

        /*Question 2: Find and display the smallest of two variables named
        carPrice and truckPrice. Set the variables to any value you want
         */
        double carPrice = 30.543;
        double truckPrice = 70.555;
        double smallest = Math.min(carPrice, truckPrice);
        System.out.println("the smallest price is " + smallest);

        /*Question 3: Find and display the area of a circle whose radius is 7.25*/
        double radiusOfACircle = 7.25;
        double area = Math.PI * Math.pow(radiusOfACircle, 2);
        System.out.println("the area of the circle " + area);

        /*Question 4: Find and display the square root a variable after it is set to 5.0*/
        double number = 5.0;
        double squareRoot = Math.sqrt(number);
        System.out.println("square root of " + number + "is " + squareRoot);

        /*Question 5: Find and display the distance between the points (5, 10) and (85, 50)*/
        int x1 = 5;
        int y1 = 10;

        int x2 = 85;
        int y2 = 50;

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2-y1, 2));
        System.out.println("the distance between the two points is " + distance);

        /*Question 6: Find and display the absolute (positive) value of a variable after it is set to -3.8*/

        double positiveValue = -3.8;
        double absoluteValue = Math.abs(positiveValue);
        System.out.println("the positive value is " + absoluteValue );

        /*Find and display a random number between 0 and 1*/
        double randomNumber = Math.random();
        System.out.println("a random number between 0 and 1 is " + randomNumber);


















    }
}
