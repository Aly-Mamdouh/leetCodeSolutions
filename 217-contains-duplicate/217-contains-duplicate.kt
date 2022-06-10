class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
    var ok:Boolean
    var mp = HashMap<Int, Int>()
    for (i in 0 until nums.size) {
        var count = mp[nums[i]]
        if (count == null) {
            count = 0
        }
        mp[nums[i]] = count + 1
    }
    if(mp.size==nums.size){
        ok=false
    }
    else{
        ok=true
    }
    return ok
    }
}