package calulator;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter the second number");
        int secondNumber = scanner.nextInt();

        System.out.print("Possible calculation:\n" +
                "(A)dd\n" +
                "(S)ubtract\n" +
                "(M)ultiply\n" +
                "(D)ivide\n" +
                "Please select an option:  ");
        String answer = scanner.next();

        int result;
        result = firstNumber * secondNumber;
//        if (answer == "a") {
//            result = firstNumber + secondNumber;
//        }    else if (answer == "s") {
//            result = firstNumber - secondNumber;
//        } else if (answer == "m" ) {
//            result = firstNumber * secondNumber;
//        }   else if (answer == "d") {
//                result = firstNumber / secondNumber;
//            } else {
//                System.out.print("Not applicable");
//            }
            System.out.printf("%d * %d = %d ", firstNumber, secondNumber, result );




    }
}
