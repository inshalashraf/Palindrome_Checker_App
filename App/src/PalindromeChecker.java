/** Utility methods for checking palindromes. */
public final class PalindromeChecker {
    private PalindromeChecker() {}

    /**
     * Checks letters and digits only, ignoring case, spaces, and punctuation.
     * Unicode letters and digits are retained.
     */
    public static boolean isPalindrome(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null.");
        }

        String normalized = normalize(input);
        if (normalized.isEmpty()) {
            return false;
        }

        int left = 0;
        int right = normalized.length() - 1;
        while (left < right) {
            if (normalized.charAt(left) != normalized.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    /** Returns the lowercase letters-and-digits-only form used by the checker. */
    public static String normalize(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null.");
        }
        return input.replaceAll("[^\\p{L}\\p{N}]", "").toLowerCase(java.util.Locale.ROOT);
    }
}
