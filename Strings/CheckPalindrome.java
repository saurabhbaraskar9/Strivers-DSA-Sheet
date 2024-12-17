
public class CheckPalindrome {

    public static boolean checkPalindrome(String str) {
        // Preprocess: Remove non-alphanumeric characters and convert to lowercase
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int n = str.length(); // Updated length after filtering

        // Compare characters from start and end moving toward the center
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false; // Not a palindrome
            }
        }

        return true; // Palindrome
    }

    public static void main(String[] args) {

        System.out.println(checkPalindrome("a1221 a"));

    }
}
