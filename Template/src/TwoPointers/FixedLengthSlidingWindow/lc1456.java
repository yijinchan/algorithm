package TwoPointers.FixedLengthSlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class lc1456 {
    public int maxVowels(String s, int k) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        int maxVowelCount = 0;
        int n = s.length();
        int left = 0;
        int right = 0;
        int currentVowelCount = 0;
        while (right < n) {
            char currentChar = s.charAt(right);
            if (vowels.contains(currentChar)) {
                currentVowelCount++;
            }
            while (right - left + 1 > k) {
                char leftChar = s.charAt(left);
                if (vowels.contains(leftChar)) {
                    currentVowelCount--;
                }
                left++;
            }
            maxVowelCount = Math.max(maxVowelCount, currentVowelCount);
            right++;
        }

        return maxVowelCount;
    }
}
