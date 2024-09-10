import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        // Example usage of LongestCommonPrefix
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        String[] strings = {"flower", "flow", "flight"};
        Optional<String> prefix = lcp.longestCommonPrefix(strings);
        prefix.ifPresent(System.out::println); // This will print the longest common prefix if present
    }
}
