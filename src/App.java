import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a word to check for palindrome: ");

            String input = scanner.nextLine();

            if (isPalindrome(input)) {
                System.out.println(input + " is a palindrome");
            } else {
                System.out.println(input + " is not a palindrome.");
            }
        }

    }

    public static boolean isPalindrome(String str) {
        String cleanInput = str.toLowerCase();

        char[] charArray = cleanInput.toCharArray();

        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            if (charArray[left] != charArray[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
