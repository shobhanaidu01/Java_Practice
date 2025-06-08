public class Operators {
    public static void main(String[] args) {

        int a = 10, b = 5;

        // Arithmetic Operators
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Reminder: " + (a % b));

        // Relational Operators
        System.out.println("Is a > b: " + (a > b));
        System.out.println("Is a < b: " + (a < b));
        System.out.println("Is a == b: " + (a == b));
        System.out.println("Is a != b: " + (a != b));

        // Unary Operators
        int d = 5;
        System.out.println("d before increment: " + d);

        d--; // -- post decrement
        System.out.println("d post decrement: " + d);

        d++; // -- post increment
        System.out.println("d post increment: " + d);

        // -----
        int i = 2;
        i++;
        i = 10;
        System.out.println("flow: " + d);

    }

}
