import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        // Example usage of LongestCommonPrefixCreate main to run methods in codebase
        // Assuming LongestCommonPrefix is a class in the same package or imported
        // correctly
        LongestAttempt1 lcp = new LongestAttempt1();
        String[] strings = { "flower", "flow", "flight" };
        Optional<String> prefix = lcp.longestCommonPrefix(strings);
        prefix.ifPresent(System.out::println); // This will print the longest common prefix if present
    }
}
