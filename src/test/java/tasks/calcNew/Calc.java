package tasks.calcNew;

import java.util.Scanner;

public class Calc {
    Scanner console = new Scanner(System.in);
    String value = console.nextLine();
    double firstNumber = console.nextDouble();
    double secondNumber = console.nextDouble();
    double result;

    double Operation(String value, double firstNumber, double secondNumber) {
       switch (value) {
           case "+":
               result = firstNumber + secondNumber;
               System.out.println("Результат: " + result);
               break;
           case "-":
               result = firstNumber - secondNumber;
               System.out.println("Результат: " + result);
               break;
           case "*":
               result = firstNumber * secondNumber;
               System.out.println("Результат: " + result);
               break;
           case "/":
               result = firstNumber / secondNumber;
               System.out.println("Результат: " + result);
       }
        return result;
    }
}
