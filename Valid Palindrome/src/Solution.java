public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome("aa"));
    }

    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z\\d]", "");
        s = s.toLowerCase();
        if (s.equals(""))
            return true;
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;

    }
}
