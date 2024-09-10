package GenericCreationsFromWorkspace;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReverseNumberGenericTest {

   @Test
   public void testReverseInteger() {
      Integer input = 12345;
      Integer expected = 54321;
      Integer result = ReverseNumberGeneric.reverse(input);
      assertEquals(expected, result);
   }

   @Test
   public void testReverseLong() {
      Long input = 123456789L;
      Long expected = 987654321L;
      Long result = ReverseNumberGeneric.reverse(input);
      assertEquals(expected, result);
   }

   @Test
   public void testReverseByte() {
      Byte input = 12;
      Byte expected = 21;
      Byte result = ReverseNumberGeneric.reverse(input);
      assertEquals(expected, result);
   }

   @Test
   public void testReverseShort() {
      Short input = 1234;
      Short expected = 4321;
      Short result = ReverseNumberGeneric.reverse(input);
      assertEquals(expected, result);
   }

   @Test
   public void testReverseFloat() {
      Float input = 123.0f;
      Float expected = 321.0f;
      Float result = ReverseNumberGeneric.reverse(input);
      assertEquals(expected, result);
   }

   @Test
   public void testReverseDouble() {
      Double input = 123.0;
      Double expected = 321.0;
      Double result = ReverseNumberGeneric.reverse(input);
      assertEquals(expected, result);
   }

   @Test
   public void testUnsupportedType() {
      assertThrows(IllegalArgumentException.class, () -> {
         ReverseNumberGeneric.reverse(12345);
      });
   }
}