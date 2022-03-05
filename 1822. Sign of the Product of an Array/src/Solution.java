public class Solution {
    public static int arraySign(int[] nums) {
        int negativeNumber = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                return 0;
            }
            if (nums[i] < 0) {
                negativeNumber++;
            }
        }
        if (negativeNumber % 2 == 0) {
            return 1;
        } else {
            return -1;
        }
    }

}


