import java.util.Scanner;

public class CalcRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num1, num2;
        String operator;
        System.out.println("Enter an expression containing *, /, +, -, %, or ^: ");
        String expression = scan.nextLine();

        num1 = Double.parseDouble(expression.substring(0, expression.indexOf(" ")));
        operator = expression.substring(expression.indexOf(" ") + 1, expression.indexOf(" ") + 2);
        num2 = Double.parseDouble(expression.substring(expression.indexOf(" ") + 2));

        Calculator calc = new Calculator(num1, num2);
    }
}
