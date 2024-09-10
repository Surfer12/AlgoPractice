/* 3. **Algorithm Name: Longest Common Prefix (LeetCode 14)**
   - **Core Idea:** Find the longest common prefix string amongst an array of strings.
 */
import java.util.Optional;

public class LongestAttempt1 {

    /**
     * Finds the longest common prefix among an array of strings.
     * 
     * @param strs An array of strings
     * @return The longest common prefix as a string
     */
    public Optional<String> longestCommonPrefix(String[] strs) {
        Optional<String[]> optStrs = Optional.ofNullable(strs);
        if (!optStrs.isPresent() || optStrs.get().length == 0) {
            return Optional.empty();
        }
        String prefix = strs[0];
        for(String str : strs) {
            while(!str.startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if(prefix.isEmpty()) {
                    return Optional.empty();
                }
            }
        }
        return Optional.of(prefix);
    }  
}
 
/*  The code snippet above contains the LongestCommonPrefix class that finds the longest common prefix string among an array of strings. The class has a method called longestCommonPrefix that takes an array of strings as input and returns the longest common prefix as a string. 
 The algorithm is described in the comments above the class. It involves finding the longest common prefix among the strings in the input array. The method first checks if the input array is empty and returns an empty string if it is. It then initializes the prefix with the first string in the array and iterates through the other strings to find the common prefix. If the prefix is not found in any of the strings, it shortens the prefix by one character and continues the process. If the prefix becomes empty, it returns an empty optional. 
 The method returns an optional string, which can be empty if no common prefix is found. 
 The code is well-structured and follows best practices for handling null input and returning an optional result. */