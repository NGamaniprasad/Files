public class Final{
    public static void main(String[] args) {
        final int x = 10; // declaring a final variable
        
        // x = 20; // Trying to reassign a value to a final variable will result in a compilation error
        
        System.out.println("The value of final variable x is: " + x);
        
        final double PI = 3.14159; // declaring a final variable PI
        System.out.println("The value of PI is: " + PI);
        
        // PI = 3.14; // Trying to reassign a value to a final variable PI will result in a compilation error
        
        final String greeting = "Hello"; // declaring a final reference variable
        System.out.println(greeting + " World!");
        
        // Modifying the object referred to by a final reference variable is allowed
        final StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb);
    }
}
