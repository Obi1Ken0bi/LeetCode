class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length)
            return false
        val alphabet = IntArray(26)
        val tChar = t.toCharArray()
        s.forEachIndexed { index, c ->
            alphabet[c - 'a']++
            alphabet[tChar[index] - 'a']--
        }
        return alphabet.all { it == 0 }
    }
}

