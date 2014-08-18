import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PIETest {

  PIE pie;

  @Before
  public void init() {
    pie = new PIE();
  }

  @Test
  public void shouldFindLongestContiguousIncreasingSubsequence1() {
    int[] input = new int[]{20, 7, -5, 1, 2, 3, 9, 2, -4};
    int result = pie.longestContiguousIncreasingSubsequence(input);
    assertEquals(5, result);
  }

  @Test
  public void shouldFindLongestContiguousIncreasingSubsequence2() {
    int[] input = new int[]{1, 2, 2, -4};
    int result = pie.longestContiguousIncreasingSubsequence(input);
    assertEquals(2, result);
  }

  @Test
  public void shouldFindLongestContiguousIncreasingSubsequence3() {
    int[] input = new int[]{1, 2, -4, 2, 3, 4};
    int result = pie.longestContiguousIncreasingSubsequence(input);
    assertEquals(4, result);
  }

  @Test
  public void shouldFindFirstNonRepeatedChar() {
    char result = pie.findFirstNonRepeatedChar("total");
    assertEquals('o', result);
  }

  @Test
  public void shouldRemoveChars() {
    String result = pie.removeChars("total", "t");
    assertEquals("oal", result);
  }

  @Test
  public void shouldRemoveChars2() {
    String result = pie.removeChars("Battle of the Vowels: Hawaii vs. Grozny", "aeiou");
    assertEquals("Bttl f th Vwls: Hw vs. Grzny", result);
  }
}