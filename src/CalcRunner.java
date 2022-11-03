import java.util.Scanner;

public class CalcRunner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an expression with *, /, +, -, %, or ^: ");
        String expression = scan.nextLine();

        double num1 = Double.parseDouble(expression.substring(0, expression.indexOf(" ")));
        String operator = expression.substring(expression.indexOf(" ") + 1, expression.indexOf(" ") + 2);
        double num2 = Double.parseDouble(expression.substring(expression.indexOf(" ") + 3));

        Calculator calc = new Calculator(num1, num2);

        if (operator.equals("*")) {
            calc.Multiply();
        }
        if (operator.equals("/")) {
            calc.Divide();
        }
        if (operator.equals("+")) {
            calc.Add();
        }
        if (operator.equals("-")) {
            calc.Subtract();
        }
        if (operator.equals("%")) {
            calc.Remainder();
        }
        if (operator.equals("^")) {
            calc.Exponent();
        }
    }
}
