class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int aLength = nums1.length;
        int bLength = nums2.length;
        int totalLength = aLength + bLength;
        if (nums1.length == 0 && nums2.length == 0) {
            return 0;
        }

        if (nums1.length == 0) {
            return nums2[(bLength - 1) / 2] * 0.5 + nums2[bLength / 2] * 0.5;
        }

        if (nums2.length == 0) {
            return nums1[(aLength - 1) / 2] * 0.5 + nums1[aLength / 2] * 0.5;
        }
        if (aLength > bLength) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int leftBorder = 0;
        int rightBorder = aLength - 1;
        int half = (totalLength / 2);
        while (true) {
            int aMiddle = (leftBorder + rightBorder) / 2;
            int bMiddle = half - aMiddle - 2;

            int aLeft = aMiddle < 0 ? Integer.MIN_VALUE : nums1[aMiddle];
            int aRight = aMiddle + 1 < aLength ? nums1[aMiddle + 1] : Integer.MAX_VALUE;
            int bLeft = bMiddle >= 0 ? nums2[bMiddle] : Integer.MIN_VALUE;
            int bRight = bMiddle + 1 < bLength ? nums2[bMiddle + 1] : Integer.MAX_VALUE;

            if (aLeft <= bRight && bLeft <= aRight) {
                if (totalLength % 2 == 1) {

                    return Math.min(aRight, bRight);
                } else {
                    return (double) (Math.max(aLeft, bLeft) + Math.min(aRight, bRight)) / 2;
                }
            } else if (aLeft > bRight) {
                rightBorder = aMiddle - 2;
            } else {
                leftBorder = aMiddle + 2;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1, 2, 6, 7, 8}, new int[]{3, 4, 5, 9, 10}));
    }
}