import java.util.Scanner;

public class Subtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1, num2, result;

        System.out.print("Enter first number: ");
        num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        num2 = scanner.nextInt();

        result = num1 - num2;

        System.out.println("Subtraction result: " + result);

        scanner.close();
    }
}
