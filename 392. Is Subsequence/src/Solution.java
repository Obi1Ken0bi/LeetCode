class Solution {
    public static boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) {
            return true;
        }
        int index = 0;
        boolean isSub = false;
        boolean result = true;
        for (int i = 0; i < s.length(); i++) {
            if (result) {
                for (int j = index; j < t.length(); j++) {
                    if (s.charAt(i) == t.charAt(j)) {
                        index = j + 1;
                        isSub = true;
                    }
                    if (isSub) {

                        break;
                    }

                }
                result = isSub;
                isSub = false;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        String s = "abc";
        String t = "adfjidifjbasjhduhsdc";
        System.out.println(isSubsequence(s, t));
    }
}