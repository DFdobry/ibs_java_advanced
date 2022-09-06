package tasks.calculatorProgramm;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Выберите тип операции для дробного числа: 1 - умножение, 2 - деление, 3 - вычитание, 4 - сложение");
        int value = console.nextInt();
        System.out.println("Введите дробное число:");
        double firstNumber = console.nextDouble();
        double secondNumber = console.nextDouble();

        switch (value) {
            case 1:
                CalcProgram myCalc = new CalcProgram();
                myCalc.Multiplication(firstNumber, secondNumber);
                System.out.println(myCalc.result);
                break;
            case 2:
                CalcProgram myCalc2 = new CalcProgram();
                myCalc2.Segmentation(firstNumber, secondNumber);
                System.out.println(myCalc2.result2);
                break;
            case 3:
                CalcProgram myCalc3 = new CalcProgram();
                myCalc3.Substraction(firstNumber, secondNumber);
                System.out.println(myCalc3.result3);
                break;
            case 4:
                CalcProgram myCalc4 = new CalcProgram();
                myCalc4.Sum(firstNumber, secondNumber);
                System.out.println(myCalc4.result4);
                break;
        }
    }
}
