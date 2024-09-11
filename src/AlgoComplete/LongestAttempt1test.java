package AlgoComplete;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Optional;

public class LongestAttempt1test {

    @Test
    public void testEmptyArray() {
        LongestAttempt1 lcp = new LongestAttempt1();
        String[] strs = {};
        Optional<String> result = lcp.longestCommonPrefix(strs);
        assertFalse(result.isPresent());
    }

    @Test
    public void testSingleString() {
        LongestAttempt1 lcp = new LongestAttempt1();
        String[] strs = { "hello" };
        Optional<String> result = lcp.longestCommonPrefix(strs);
        assertTrue(result.isPresent());
        assertEquals("hello", result.get());
    }

    @Test
    public void testCommonPrefix() {
        LongestAttempt1 lcp = new LongestAttempt1();
        String[] strs = { "flower", "flow", "flight" };
        Optional<String> result = lcp.longestCommonPrefix(strs);
        assertTrue(result.isPresent());
        assertEquals("fl", result.get());
    }

    @Test
    public void testNoCommonPrefix() {
        LongestAttempt1 lcp = new LongestAttempt1();
        String[] strs = { "dog", "racecar", "car" };
        Optional<String> result = lcp.longestCommonPrefix(strs);
        assertFalse(result.isPresent());
    }

    @Test
    public void testFullStringAsPrefix() {
        LongestAttempt1 lcp = new LongestAttempt1();
        String[] strs = { "interspecies", "interstellar", "interstate" };
        Optional<String> result = lcp.longestCommonPrefix(strs);
        assertTrue(result.isPresent());
        assertEquals("inters", result.get());
    }
}