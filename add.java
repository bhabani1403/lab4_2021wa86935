import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the first number: ");
        int num3 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num4 = scanner.nextInt();

        // Calculate the sum
        int sum = num3 + num4;

        // Display the result
        System.out.println("The sum is: " + sum);
        
        scanner.close();
    }
}
