public class Array {
    public static void main(String[] args) {
        int[] marks = { 90, 80, 75, 60, 95 };

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Mark " + (i + 1) + ": " + marks[i]);
        }

        int[] numbers = { 2, 4, 6, 5, 1 };
        int sum = 0;
        int max = numbers[0];

        System.out.print("Numbers: ");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " ");

            sum += numbers[i];

            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Sum = " + sum);
        System.out.println("Maximum = " + max);

    }

}
