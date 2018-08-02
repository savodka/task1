package CalculatorOop;

public class Calculation {
    public float plus(float a, float b) {
        float c = a + b;
        return c;
    }

    public float multiply(float a, float b) {
        float c = a * b;
        return c;
    }

    public float subtract(float a, float b) {
        float c = a - b;
        return c;
    }

    public float divide(float a, float b) {
        float c = a / b;
        return c;
    }
}

/*public class MetodCalc
{
    public int calc (float n1, String op, float n2)
    {
        int res = 0;
        switch (op)
        {
            case "+":
                res = n1+n2;
                break;
            case "-":
                res = n1-n2;
                break;
            case "*":
                res = n1*n2;
                break;
            case "/":
                res = n1/n2;
                break;
            default:
                res = 0;
                break;
        }
        return res;
    }
}
*/

