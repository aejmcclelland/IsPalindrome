import java.util.Scanner;

public class reverseString {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter a word to reverse: ");
            String str = scanner.nextLine();
            System.out.println(reverseWord(str));
        }
    }

    public static String reverseWord(String input) {

        StringBuilder reverse = new StringBuilder();

        int length = input.length();
        for (int i = length - 1; i >= 0; i--) {
            reverse.append(input.charAt(i));
        }

        String result = reverse.toString();
        return result.toUpperCase();
    }
}
