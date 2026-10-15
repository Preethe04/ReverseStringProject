public class ReverseString {
    public static String reverse(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input must not be null");
        }
        return new StringBuilder(input).reverse().toString();
    }

    public static void main(String[] args) {
        String original = "Hello World";
        System.out.println("Original String = " + original);
        System.out.println("Reversed String = " + reverse(original));
    }
}
