package com.Pluralsight;

public class MethodExercise {
    public static void main(String[] args) {
        brushTeeth();

        String movie = favoriteMovie();
        System.out.println("My favorite movie is: " + movie);

        int sum = addTwoNumbers( 600, 100);
        System.out.println("The sum of two numbers is: " + sum);

    }

    public static void brushTeeth() {
        System.out.println("Steps to brush your teeth: ");
        System.out.println("Step 1");
        System.out.println("Step 2");
        System.out.println("Step 3");

    }
    public static String favoriteMovie() {
        return  "Titanic";
    }
    public static  int addTwoNumbers(int a, int b) {
        return a + b;
    }

}
