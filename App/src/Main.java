import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a word or phrase: ");
            String input = scanner.nextLine();

            if (PalindromeChecker.normalize(input).isEmpty()) {
                System.out.println("Please enter at least one letter or digit.");
            } else if (PalindromeChecker.isPalindrome(input)) {
                System.out.println(input + " is a palindrome.");
            } else {
                System.out.println(input + " is not a palindrome.");
            }
        }
    }
}
