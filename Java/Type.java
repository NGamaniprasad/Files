public class Type {
    public static void main(String[] args) {
        // Implicit Casting (Widening Conversion)
        int intValue = 10;
        double doubleValue = intValue; // int to double (automatic conversion)
        System.out.println("Double value after implicit casting: " + doubleValue);

        // Explicit Casting (Narrowing Conversion)
        double doubleNum = 15.75;
        int intNum = (int) doubleNum; // double to int (explicit casting required)
        System.out.println("Integer value after explicit casting: " + intNum);

        // Casting with Objects (Inheritance)
        Object obj = "Hello";
        String str = (String) obj; // Object to String (explicit casting required)
        System.out.println("String value after casting with objects: " + str);

        // Casting with Arrays
        double[] doubleArray = {1.1, 2.2, 3.3};
        int[] intArray = new int[doubleArray.length];
        for (int i = 0; i < doubleArray.length; i++) {
            intArray[i] = (int) doubleArray[i]; // double to int (explicit casting)
        }
        System.out.print("Integer Array after casting with arrays: ");
        for (int num : intArray) {
            System.out.print(num + " ");
        }
    }
}
