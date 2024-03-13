import java.util.Scanner;

public class Us {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        while(number != 0) {
            System.out.println("The value entered is: " + number);
            System.out.print("Enter another number (or 0 to exit): ");
            number = scanner.nextInt();
        }

        scanner.close();
    }
}
