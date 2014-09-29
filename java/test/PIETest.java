import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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

  @Test
  public void shouldBePalindrome() {
    boolean res = pie.isPalindrome("abba");
    assertTrue(res);
  }

  @Test
  public void shouldBePalindrome2() {
    boolean res = pie.isPalindrome("aba");
    assertTrue(res);
  }

  @Test
  public void shouldBePalindrome3() {
    boolean res = pie.isPalindrome("a");
    assertTrue(res);
  }

  @Test
  public void shouldFindMedianOfTwoSortedArrays() {
    int median = pie.findMedianOfTwoSortedArrays(new int[]{1, 11, 12, 15}, new int[]{2, 4, 5, 6, 7, 8, 19});
    assertEquals(7, median);
  }
}