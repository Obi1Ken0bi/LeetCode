public class Solution {
    public static int hammingWeight(int n) {
        int c = 0;
        while (n != 0) {
            c += (n & 1);
            n >>>= 1;
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.printf("%d", hammingWeight(00000000000000000000000000001011));
    }
}
