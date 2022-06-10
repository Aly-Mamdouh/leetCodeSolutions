class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
    val mp = HashMap<Char, Int>()
    var ans = 0
    var last = -1
    for (i in s.indices) {
        last = Math.max(last, mp.getOrElse(s[i], { -1 }))
        ans = Math.max(ans, i - last)
        mp[s[i]] = i
    }
    return ans
    }
}