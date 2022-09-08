package tasks.calculatorProgramm;

public class CalcProgram  {

    double result = 0;
    double result2 = 0;
    double result3 = 0;
    double result4 = 0;
    void Multiplication(double firstNumber, double secondNumber) {
       result = firstNumber * secondNumber;
    }

    void Segmentation(double firstNumber, double secondNumber) {
        result2 = firstNumber / secondNumber;
    }
    void Substraction(double firstNumber, double secondNumber) {
        result3 = firstNumber - secondNumber;
    }

    void Sum(double firstNumber, double secondNumber) {
        result4 = firstNumber + secondNumber;
    }

}
