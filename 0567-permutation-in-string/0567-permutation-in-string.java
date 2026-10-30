class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int n = s1.length();
        int m = s2.length();

        if (n > m) return false;

        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for (int i = 0; i < n; i++) {
            arr1[s1.charAt(i) - 'a']++;
        }

        for (int i = 0; i <= m - n; i++) {

            arr2 = new int[26];

            for (int j = i; j < i + n; j++) {
                arr2[s2.charAt(j) - 'a']++;
            }

            boolean flag = true;

            for (int k = 0; k < 26; k++) {
                if (arr1[k] != arr2[k]) {
                    flag = false;
                    break;
                }
            }

            if (flag) return true;
        }

        return false;
    }
}