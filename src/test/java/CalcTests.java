
import CalculatorOop.Calc;
import org.junit.Test;
import CalculatorOop.Calculation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

import java.util.InputMismatchException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


@DisplayName("Набор тестов калькулятора")
public class CalcTests {
    @Test
    @DisplayName("Проверяем вычитание")
    public void resultMinus() {
        Calculation calculation = new Calculation();
        double res = calculation.calc("-", 5.5f, 20);
        assertEquals(-14.5f, res, 0);
    }

    @Test
    public void resultPlus() {
        Calculation calculation = new Calculation();
        double res = calculation.calc("+", 5.5f, 20);
        assertEquals(25.5d, res, 0);
    }

    @Test
    public void resultMultiply() {
        Calculation calculation = new Calculation();
        double res = calculation.calc("*", 5.5f, 20);
        assertEquals(110, res, 0);
    }

    @Test
    public void resultDivide() {
        Calculation calculation = new Calculation();
        double res = calculation.calc("/", 5.5f, 20);
        assertEquals(0.275d, res, 3);
    }

    @Test
    public void resultDivideNullException() {
        Calculation calculation = new Calculation();
        Assertions.assertThrows(ArithmeticException.class, () -> calculation.calc("/", 5.5f, 0));
    }

    @Test
    public void resultWrongOperator() {
        Calculation calculation = new Calculation();
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculation.calc("!", 6, 4));
    }
}
