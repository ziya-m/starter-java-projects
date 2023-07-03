import java.util.Scanner;


/* Console Calculator Version 1.0 */
/* Version 1.0 just for 2 number and 1 operator */
/* If you want version 2 of console calculator: */
/* https://github.com/ziya-m/starter-java-projects/console-calculator-v2/ */
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();
        String op = scanner.next();
        double num2 = scanner.nextDouble();
        double res = 0;

        if (op.equals("+")) {
            res = num1 + num2;
        } else if (op.equals("-")) {
            res = num1 - num2;
        } else if (op.equals("*")) {
            res = num1 * num2;
        } else if (op.equals("/")) {
            res = num1 / num2;
        } else {
            System.out.println("Invalid operator!");
            return;
        }

        System.out.println("Result of calculation: " + res);
    }
}
