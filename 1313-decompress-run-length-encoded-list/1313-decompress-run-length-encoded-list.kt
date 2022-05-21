class Solution {
    fun decompressRLElist(nums: IntArray): ArrayList<Int> {
        
  val res = ArrayList<Int>()
  
  for (i in 0..nums.size - 1 step 2) {
    var numev: Int = 0
    var numod: Int = 0
      numev = nums[i]
      numod = nums[i+1]
    
    while (numev > 0) {
     res.add(numod)
      numev--
    }
    
  }
  return res
    }
}