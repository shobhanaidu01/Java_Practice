public class ReverseAString {
    public static void main(String[] args) {

        String original = "Automation";

        StringBuilder reversed = new StringBuilder(original).reverse();

        System.out.println("The original string is " + original);
        System.out.println("The reverse string is " + reversed);

        // ---------------------------//

        String org = "Shobha";

        StringBuilder rev = new StringBuilder(org).reverse();

        System.out.println("The original string is " + org);
        System.out.println("The reverse string is " + rev);

    }
}
