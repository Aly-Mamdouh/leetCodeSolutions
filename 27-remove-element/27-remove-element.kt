class Solution {
    fun removeElement(nums: IntArray, `vl`: Int): Int {
   
    var cnt:Int=0
    for(i in 0 until nums.size){
       if (nums[i] != vl) {
            nums[cnt++] = nums[i];
        }
    }
    return cnt
        
    }
}