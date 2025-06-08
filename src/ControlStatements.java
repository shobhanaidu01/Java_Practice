public class ControlStatements {
    public static void main(String[] args) {
        int num = 2;

        // if statement
        // Check the number is positive
        if (num > 0) {
            System.out.println("The Number is positive");
        }

        // if else
        // Check the number is odd or even
        if (num % 2 == 0) {
            System.out.println("The Number is even");
        } else {
            System.out.println("The Number is odd");
        }

        // else-if ladder
        // Check wether the number is zero, positive or negative

        if (num == 0) {
            System.out.println("The Number is zero");
        } else if (num > 0) {
            System.out.println("The Number is positive");
        } else {
            System.out.println("The Number is negative");
        }

        // Switch statement
        // Check wether the number is zero, one, two or something else

        switch (num) {
            case 0:
                System.out.println("The Number is zero");
                break;

            case 1:
                System.out.println("The Number is one");
                break;

            case 2:
                System.out.println("The Number is two");
                break;

            default:

                System.out.println("The Number is something else");
        }

    }
}
