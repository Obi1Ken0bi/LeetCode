public class Solution {
    public static int countOdds(int low, int high) {

        int nums = high - low + 1;  //counting total numbers in range

        if (low % 2 != 0 && high % 2 != 0)
            return nums / 2 + 1;

        else
            return nums / 2;
    }


    public static void main(String[] args) {
        System.out.println("countOdds(14,17) = " + countOdds(14, 17));
    }
}