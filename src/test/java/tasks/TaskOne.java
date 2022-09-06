package tasks;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Выберите тип операции для дробного числа: 1 - сложение, 2 - умножение, 3 - деление, 4 - вычитание");
        int value = console.nextInt();
        System.out.println("Введите дробное число:");
        double firstNumber = console.nextDouble();
        double secondNumber = console.nextDouble();
        double answer = 0;
        switch (value) {
            case 1:
               answer = firstNumber + secondNumber;
                String result = String.format("%.4f", answer);
                System.out.println(result);
                  break;
            case 2:
               answer = firstNumber * secondNumber;
                String resultTwo = String.format("%.4f", answer);
                System.out.println(resultTwo);
                  break;
            case 3:
                answer = firstNumber / secondNumber;
                String resultThree = String.format("%.4f", answer);
                System.out.println(resultThree);
                  break;
            case 4:
                answer = firstNumber - secondNumber;
                String resultFour = String.format("%.4f", answer);
                System.out.println(resultFour);
                  break;
        }
    }
}
