import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------ Welcome To Our -----------");
        System.out.println("-------- Temperature Converter --------");
        System.out.println("--- Enter -> Continue | '0' -> exit ---");
        while (true) {
            double result = 0;
            String input = scanner.nextLine();
            if (!input.equals("0")) {
                for (int i = 0; i < 20; i++) {
                    System.out.println();
                }

                System.out.print("What type is your temperature? [ C -> Celsius, F -> Fahrenheit, K -> Kelvin ] ");
                char from = scanner.next().charAt(0);
                System.out.print("Value: ");
                double valueFrom = scanner.nextDouble();

                System.out.print("What type you want to convert? [ C -> Celsius, F -> Fahrenheit, K -> Kelvin ] ");
                char to = scanner.next().charAt(0);
                double valueTo;

                if (from == 'C' && to == 'F') {
                    valueTo = (valueFrom * 9/5) + 32;
                    System.out.println("Converted temperature: " + valueTo + " °F");
                } else if (from == 'C' && to == 'K') {
                    valueTo = valueFrom +  273.15;
                    System.out.println("Converted temperature: " + valueTo + " K");
                } else if (from == 'F' && to == 'C') {
                    valueTo = (valueFrom - 32) * 5/9;
                    System.out.println("Converted temperature: " + valueTo + " °C");
                } else if (from == 'F' && to == 'K') {
                    valueTo = ((valueFrom - 32) * 5/9) + 273.15;
                    System.out.println("Converted temperature: " + valueTo + " K");
                } else if (from == 'K' && to == 'C') {
                    valueTo = valueFrom -  273.15;
                    System.out.println("Converted temperature: " + valueTo + " °C");
                } else if (from == 'K' && to == 'F') {
                    valueTo = ((valueFrom -  273.15) * 9/5) + 32;
                    System.out.println("Converted temperature: " + valueTo + " °F");
                } else {
                    System.out.println(" ! Invalid or Same temperature types entered. ! ");
                }
                System.out.println("--- Enter -> Continue | '0' -> exit ---");
                input = scanner.nextLine();
            }
            else break;
        }

    }
}
