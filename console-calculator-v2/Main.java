import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the calculation expression: ");
        String input = scanner.nextLine();

        // Remove spaces from the input string
        input = input.replaceAll("\\s+", "");

        // Separate operands and operators into arrays
        String[] operands = input.split("[+\\-*/]");
        String[] operators = input.split("\\d+");

        double result = Double.parseDouble(operands[0]);

        // Perform calculations based on operators
        for (int i = 1; i < operands.length; i++) {
            double operand = Double.parseDouble(operands[i]);
            String operator = operators[i];

            switch (operator) {
                case "+":
                    result += operand;
                    break;
                case "-":
                    result -= operand;
                    break;
                case "*":
                    result *= operand;
                    break;
                case "/":
                    result /= operand;
                    break;
                default:
                    System.out.println("Invalid operator: " + operator);
                    return;
            }
        }

        System.out.println("Result: " + result);
    }
}
