import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        System.out.println("Calculator");
        System.out.println("Enter first number: ");
        double a;
        double b;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        System.out.println("Enter second number: ");
        b = input.nextInt();
        double sum = a + b;
        System.out.println("Sum is: " + sum);
        double sub = a - b;
        System.out.println("Sub is: " + sub);
        double multi = a * b;
        System.out.println("Multiplication is: " + multi);
        double div = a / b;
        System.out.println("Division is: " + div);





    }
}
