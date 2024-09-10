
/**
 * The LongestCommonPrefix class is used to find the longest common prefix among an array of strings.
 */
import java.util.Optional;

public class LongestCommonPrefix {

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
