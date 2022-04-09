public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.strStr("aaaaabb", "bba"));
    }

    public int strStr(String haystack, String needle) {
        if (needle.equals(" ")) {
            return 0;
        }
        int i = 0;
        while (i < haystack.length()) {
            int j = 0;
            while (j < needle.length()) {
                if (i + j >= haystack.length()) {
                    break;
                }
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
                if (j == needle.length() - 1) {
                    return i;
                }
                j++;

            }
            i++;
        }
        return -1;
    }
}
