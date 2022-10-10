package tasks.calculatorProgramm;

public class CalcOper extends Calc {
    public CalcOper(double firstNumber, double secondNumber, String calcFunc) {
        switch (calcFunc) {
            case "/": {
                setResult(firstNumber / secondNumber);
                if (secondNumber == 0) {
                    throw new ArithmeticException("Вы делите на 0");
                }
                break;
            }
            case "*": {
                setResult(firstNumber * secondNumber);
                break;
            }
            case "+": {
                setResult(firstNumber + secondNumber);
                break;
            }
            case "-": {
                setResult(firstNumber - secondNumber);
                break;
            }
        }
    }
}
