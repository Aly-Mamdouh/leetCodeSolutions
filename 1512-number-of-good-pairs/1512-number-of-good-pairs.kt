class Solution {
    fun numIdenticalPairs(nums: IntArray): Int {
  
 
      var cnt:Int=0
      for (i in 0..nums.size-1) {
        for(j in 0..nums.size-1){
          if(nums[i]==nums[j]&&i<j){
            cnt++
          }
        }
      }
  
  return cnt
    }
}