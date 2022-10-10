package tasks.calculatorProgramm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCalc extends MainClass {

    @Test
    void testMyCalc() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            CalcOper calcPr = new CalcOper(1000, 0, "/");
            System.out.println(calcPr.getResult());
        });
        System.out.println("Исключение выброшено успешно при делении на 0");
    }

}
