public class Loops {
    public static void main(String[] args) {

        // for loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello " + i);
        }

        // while loop
        int i = 1;
        while (i <= 9) {
            System.out.println("Count " + i);
            i++;
        }

        // do loop
        i = 1;
        do {
            System.out.println("Count " + i);
            i++;
        } while (i <= 5);
    }
}
