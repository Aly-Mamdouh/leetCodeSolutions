class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
  
    var lv=nums[nums.size-1]
    if(target>lv){
        return nums.size
    }
        
    var idx: Int = 0
    for (i in 0 until nums.size) {
        if (target <=nums[i] ) {
            idx = i
            break
        }
    }
    
    return idx 
    }
}