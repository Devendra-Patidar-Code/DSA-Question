 class Solution {
    public int characterReplacement(String s, int k) {

        int[] arr = new int[26];

        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            arr[s.charAt(right) - 'A']++;

            maxFreq = Math.max(maxFreq, arr[s.charAt(right) - 'A']);

            int windowLength = right - left + 1;

            if (windowLength - maxFreq > k) {
                arr[s.charAt(left) - 'A']--;
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}