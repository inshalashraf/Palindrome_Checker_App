import java.util.Scanner;
import java.util.Stack;

class Main {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            System.out.print("Enter a word or phrase: ");
            String input = scn.nextLine();
            String normalized = input.replaceAll("[^\\p{Alnum}]", "").toLowerCase();

            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < normalized.length(); i++) {
                stack.push(normalized.charAt(i));
            }

            boolean isPalindrome = true;
            for (int i = 0; i < normalized.length(); i++) {
                if (normalized.charAt(i) != stack.pop()) {
                    isPalindrome = false;
                    break;
                }
            }

            if (normalized.isEmpty()) {
                System.out.println("Please enter at least one letter or digit.");
            } else if (isPalindrome) {
                System.out.println(input + " is a palindrome.");
            } else {
                System.out.println(input + " is not a palindrome.");
            }
        }
    }
}