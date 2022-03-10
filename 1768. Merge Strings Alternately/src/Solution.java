class Solution {
    public String mergeAlternately(String word1, String word2) {
        int length1 = word1.length();
        int length2 = word2.length();
        int maxLength = length1 > length2 ? length1 : length2;
        char[] str = new char[length1 + length2];
        int i = 0;
        int j = 0;
        int r = 0;
        while (i < length1 || j < length2) {
            if (i < length1)
                str[r++] = word1.charAt(i++);

            if (j < length2)
                str[r++] = word2.charAt(j++);
        }
        return new String(str);
    }
}