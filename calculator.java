import java.util.Scanner;

public class calculator {
    static int add(int a, int b) {
        return a + b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static int divide(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        scanner.close();

        switch (operator) {
            case '+':
                System.out.println(a + " + " + b + " = " + add(a, b));
                break;
            case '-':
                System.out.println(a + " - " + b + " = " + subtract(a, b));
                break;
            case '*':
                System.out.println(a + " * " + b + " = " + multiply(a, b));
                break;
            case '/':
                int result = divide(a, b);
                if (result == 0) {
                    System.out.println("Division by zero is not allowed");
                } else {
                    System.out.println(a + " / " + b + " = " + result);
                }
                break;
            default:
                System.out.println("Invalid operator!");
                break;
        }
    }
}
