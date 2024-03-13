public class Control{
    public static void main(String[] args) {
        // If-else statement
        int x = 10;
        if (x > 5) {
            System.out.println("x is greater than 5");
        } else {
            System.out.println("x is not greater than 5");
        }

        // Switch statement
        int day = 3;
        String dayString;
        switch (day) {
            case 1:
                dayString = "Monday";
                break;
            case 2:
                dayString = "Tuesday";
                break;
            case 3:
                dayString = "Wednesday";
                break;
            default:
                dayString = "Invalid day";
        }
        System.out.println("Day is: " + dayString);

        // While loop
        int i = 1;
        while (i <= 5) {
            System.out.println("While loop: i = " + i);
            i++;
        }

        // Do-while loop
        int j = 1;
        do {
            System.out.println("Do-while loop: j = " + j);
            j++;
        } while (j <= 5);

        // For loop
        for (int k = 1; k <= 5; k++) {
            System.out.println("For loop: k = " + k);
        }

        // Break statement
        for (int m = 1; m <= 10; m++) {
            if (m == 5) {
                break;
            }
            System.out.println("Break statement: m = " + m);
        }

        // Continue statement
        for (int n = 1; n <= 5; n++) {
            if (n == 3) {
                continue;
            }
            System.out.println("Continue statement: n = " + n);
        }
    }
}
