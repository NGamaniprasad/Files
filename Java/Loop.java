public class Loop {
    public static void main(String[] args) {
        // 1. For loop
        System.out.println("For loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i: " + i);
        }

        // 2. While loop
        System.out.println("\nWhile loop:");
        int j = 1;
        while (j <= 5) {
            System.out.println("j: " + j);
            j++;
        }

        // 3. Do-While loop
        System.out.println("\nDo-While loop:");
        int k = 1;
        do {
            System.out.println("k: " + k);
            k++;
        } while (k <= 5);

        // 4. Enhanced For loop (For-each loop)
        System.out.println("\nEnhanced For loop:");
        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
            System.out.println("num: " + num);
        }
    }
}
