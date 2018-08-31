package CalculatorOop;

import java.awt.*;
import java.util.InputMismatchException;

public class Calculation extends Component {
    public float plus(float a, float b) {
        return a + b;
    }

    public float multiply(float a, float b) {
        return a * b;
    }

    public float subtract(float a, float b) {
        return a - b;
    }

    public float divide(float a, float b) {
        if (b == 0) {
            throw new ArithmeticException("На ноль делить нельзя");
        }
        return a / b;
    }

    public float calc(String operator, float a, float b) {

        float answer;

        switch (operator) {
            case "+":
                answer = plus(a, b);
                break;
            case "-":
                answer = subtract(a, b);
                break;
            case "*":
                answer = multiply(a, b);
                break;
            case "/":
                answer = divide(a, b);
                break;
            default:
                throw new IllegalArgumentException("Оператор " + operator + " не поддерживается: выберите -, +, * или /");
        }
        return answer;
    }
}
