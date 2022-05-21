class Solution {
    fun createTargetArray(nums: IntArray, index: IntArray): ArrayList<Int> {
      
      var lst: ArrayList<Int> = arrayListOf()
      
     
      for (i in 0..index.size - 1) {
        lst.add(index[i], nums[i])
      }
      return lst
        
    }
}