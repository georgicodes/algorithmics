import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

public class PIE {
  public static void main(String[] args) {
    String result = reverseString("dean");
    System.out.println(result);
    String res = reverseWords("Do or do not, there is no try.");
    System.out.println(res);
  }

  public static String reverseString(String s) {
    if (s == null) return null;
    int sLength = s.length();
    if (sLength == 1) return s;
    char[] sArr = s.toCharArray(); // O(n) space complexity

    // O(n) time complexity
    for (int i = 0, j = sLength - 1; i <= j; i++, j--) {
      // swap chars in array
      char last = sArr[j];
      sArr[j] = sArr[i];
      sArr[i] = last;
    }

    return new String(sArr);
  }

  public static String reverseWords(String sen) {
    if (sen == null) return null;
    String[] words = sen.split(" ");
    if (words.length == 1) return sen;
    Stack<String> stack = new Stack<String>();

    // O(n) time complexity
    for (String word : words) {
      stack.push(word);
    }
    String[] reversed = new String[words.length]; // O(n) space complexity
    int idx = 0;
    // O(n) time complexity
    while (!stack.isEmpty()) {
      String word = stack.pop();
      reversed[idx] = word;
      idx++;
    }

    return StringUtils.join(reversed, " ");
  }

  // Given an array what is the longest contiguous increasing subsequence of elements?
  // Example
  // 20 7 -5 1 2 3 9 2 -4 => [1 2 3 9] which is 4 -- mix neg and pos
  // -1 -2 -3 -4 => 1 -- only decreasing
  // 1 2 -4 2 3 4 => [2 3 4] 4 -- multiple contiguous
  // 1 2 2 -4 => [1 2] 2 --duplicates
  // Approach
  // loop through from start of array
  // keep track of count
  // if curr > prev, inc count
  // if count > maxCount then maxCount = count
  // ASSUMES positive numbers
  // Time Complexity O(n)
  public int longestContiguousIncreasingSubsequence(int[] arr) {
    if (arr == null || arr.length == 0) return -1;
    if (arr.length == 1) return 1;
    int maxCount = 1;
    int currCount = 1;

    for (int i = 1; i < arr.length; i++) {
      int prev = arr[i - 1];
      int curr = arr[i];
      if (curr > prev) {
        currCount = currCount + 1;
        // update maxCount if currCount is higher
        if (currCount > maxCount) {
          maxCount = currCount;
        }
      } else {
        // reset currCount
        currCount = 1;
      }
    }

    return maxCount;
  }

  // Given an array what is the Maximum Value Contiguous Subsequence?
  // Examples
  // 1 2 5 -4 5 - 20 => 9 [1, 2, 5, -4, 5]
  // 1 2 5 -4 1
  // If adding negative nu


  // Write an efficient function to find the first nonrepeated character in a string.
  // For instance, the first nonrepeated character in “total” is 'o' and the first
  // nonrepeated character in “teeter” is 'r'. Discuss the efficiency of your algorithm.
  // ++ Examples
  // total => o
  // t => t
  // tt => null
  // null => null
  // ++ Approach
  // loop through word from start to finish
  // add each char to map with count as value
  // this will take time o(n) and space o(n)
  // loop through a second time and look up letter in map
  // if count is == 1 return char, this will take o(n)
  // overall time complexity O(n) and space complexity o(n)
  // ++ DRAWBACKS
  // This approach assumes every unicode char can be represented in a single 16-bit char
  // Unboxing costs time and is ineffecient, use custom objects instead
  public Character findFirstNonRepeatedChar(String s) {
    if (s == null || s.length() == 0) throw new IllegalArgumentException();

    char[] chars = s.toCharArray();
    if (chars.length == 1) return chars[0];

    Map<Character, Integer> letters = new HashMap<Character, Integer>();

    for (int i = 0; i < chars.length; i++) {
      char curr = chars[i];
      if (letters.containsKey(curr)) {
        Integer currCount = letters.get(curr);
        letters.put(curr, currCount + 1); // increment count and update map
      } else {
        letters.put(curr, 1); // add char with initial count to map
      }
    }

    for (int i = 0; i < chars.length; i++) {
      char curr = chars[i];
      Integer currCount = letters.get(curr);
      if (currCount == 1) return curr;
    }
    return null;
  }

  // Write an efficient function that deletes characters from an ASCII string. Use the prototype
  // === Examples
  // "Battle of the Vowels: Hawaii vs. Grozny", "aeiou" => Bttl f th Vwls: Hw vs. Grzny”.
  // "caaat", a => ct
  /// retain letter order, deal with nulls, repeated chars
  // === Approach
  // lettersToDelete should be added to map for fast lookup
  // loop through each letter in string, count number of chars that match the ones that need to be deleted (lookup map)
  // construct a new array of s.length - numRepeated as this will be what our final array size is
  // loop through again and place non deleted chars in result array, return array
  // time complexity is o(2n) = o(n) and space is O(n).
  public String removeChars(String s, String r) {
    if (s == null) throw new IllegalArgumentException();
    if (s.length() == 0) return s;

    char[] chars = s.toCharArray();
    char[] delete = r.toCharArray();
    HashMap<Character,Character> map = new HashMap<Character, Character>();

    // populating map will take o(m) where m is length of r and space o(m)
    for (int i=0;i<delete.length;i++) {
      char curr = delete[i];
      map.put(curr, curr);
    }

    // O(n)
    int numToDel = 0;
    for (int i=0; i<chars.length;i++) {
      char curr = chars[i];
      if (map.containsKey(curr)) {
        numToDel++;
      }
    }

    // create resulting array
    char[] res = new char[chars.length - numToDel];
    int resIdx = 0;

    // time o(n)
    for (int i=0;i<chars.length;i++) {
      char curr = chars[i];
      if(!map.containsKey(curr)) {
        res[resIdx] = curr;
        resIdx++;
      }
    }

    return new String(res);
  }

}
