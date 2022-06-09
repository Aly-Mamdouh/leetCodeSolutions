/* The isBadVersion API is defined in the parent class VersionControl.
      fun isBadVersion(version: Int) : Boolean {} */

class Solution: VersionControl() {
    override fun firstBadVersion(n: Int) : Int {
        var lo: Int = 0
    var hi: Int = n
    var ok: Int = -1
    while (lo <= hi) {
        var mid = lo + (hi - lo) / 2
        if (isBadVersion(mid)) {
            hi = mid - 1
        } else {
            lo = mid + 1
        }
    }
    return lo
	}
}