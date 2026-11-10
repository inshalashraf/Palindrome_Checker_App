public class PalindromeCheckerTest {
    public static void main(String[] args) {
        check(PalindromeChecker.isPalindrome("madam"), "simple palindrome");
        check(PalindromeChecker.isPalindrome("A man, a plan, a canal: Panama!"),
                "ignores spaces, punctuation, and case");
        check(PalindromeChecker.isPalindrome("12321"), "numeric palindrome");
        check(PalindromeChecker.isPalindrome("x"), "single character");
        check(!PalindromeChecker.isPalindrome(""), "empty string is not a palindrome");
        check(!PalindromeChecker.isPalindrome("hello"), "ordinary non-palindrome");
        check(!PalindromeChecker.isPalindrome("12345"), "numeric non-palindrome");
        check(!PalindromeChecker.isPalindrome("!!!"), "punctuation-only input");
        expectNullInput(() -> PalindromeChecker.isPalindrome(null));
        expectNullInput(() -> PalindromeChecker.normalize(null));
        System.out.println("All palindrome tests passed.");
    }

    private static void check(boolean condition, String message) {
        if (!condition) throw new AssertionError("FAILED: " + message);
        System.out.println("PASS: " + message);
    }

    private static void expectNullInput(Runnable action) {
        try {
            action.run();
            throw new AssertionError("Expected null input to be rejected.");
        } catch (IllegalArgumentException expected) {
            System.out.println("PASS: null input is rejected");
        }
    }
}
