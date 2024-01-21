import java.util.Scanner;

public class reverseString {

    /**
     * @param args
     */

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Please enter a word to reverse: (or type 'exit' to stop).");
                String input = scanner.nextLine();

                if (input.equalsIgnoreCase("exit")) {
                    break;
                }
                if (isPalindrome(input)) {
                    System.out.println(input + " is a palindrome!");
                } else {
                    System.out.println(input + " is not a palindrome.");
                }

            }

            System.out.println("Program exited");
        }
    }

    public static boolean isPalindrome(String input) {
        String reversed = reverseWord(input);
        return input.equalsIgnoreCase(reversed);
    }

    public static String reverseWord(String input) {

        StringBuilder reverse = new StringBuilder();

        int length = input.length();
        for (int i = length - 1; i >= 0; i--) {
            reverse.append(input.charAt(i));
        }

        return reverse.toString();

    }
}
