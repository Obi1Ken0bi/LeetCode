class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        return nums.any { nums.lastIndexOf(it) != nums.indexOf(it) }
    }
}

fun main() {
    var i: Long = 0
    while (true) {
        println("Hello world! $i")
        i++
    }
}