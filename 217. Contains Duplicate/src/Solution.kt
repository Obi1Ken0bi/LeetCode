class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
       return nums.any {nums.lastIndexOf(it)!=nums.indexOf(it)}
    }
}