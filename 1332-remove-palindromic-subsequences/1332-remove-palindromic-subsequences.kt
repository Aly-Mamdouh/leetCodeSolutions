class Solution {
    fun pal(s: String): Boolean {
    var ok: Boolean
    var str = s.reversed()
    if (s == str) {
        ok = true
    } else {
        ok = false
    }
    return ok
}
    fun removePalindromeSub(s: String): Int {
    var cnt:Int=0
    if (pal(s)) {
        cnt=1
    } else {
        cnt=2
    }
    return cnt
    }
}