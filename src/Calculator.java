public class Calculator {
    private double val1;
    private double val2;

    public Calculator(double number1, double number2) {
        val1 = number1;
        val2 = number2;
    }


    public void Multiply() {
        double answer = val1 * val2;
        if (answer % 1 == 0) {
            System.out.println((int) answer);
        } else {
            System.out.println(answer);
        }
    }

    public void Divide() {
        double answer = val1 / val2;
        if (answer % 1 == 0) {
            System.out.println((int) answer);
        } else {
            System.out.println(answer);
        }
    }

    public void Add() {
        double answer = val1 + val2;
        if (answer % 1 == 0) {
            System.out.println((int) answer);
        } else {
            System.out.println(answer);
        }
    }

    public void Subtract() {
        double answer = val1 - val2;
        if (answer % 1 == 0) {
            System.out.println((int) answer);
        } else {
            System.out.println(answer);
        }
    }

    public void Remainder() {
        double answer = val1 % val2;
        if (answer % 1 == 0) {
            System.out.println((int) answer);
        } else {
            System.out.println(answer);
        }
    }

    public void Exponent() {
        double answer = Math.pow(val1, val2);
        if (answer % 1 == 0) {
            System.out.println((int) answer);
        } else {
            System.out.println(answer);
        }
    }
}
