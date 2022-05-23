class Solution {
    fun twoSum(nums: IntArray, target: Int): ArrayList<Int> {
        
    val lst = ArrayList<Int>()
   
  for (i in 0..nums.size - 1) {
        for (j in (i+1)..nums.size - 1) {
            if ((nums[i] + nums[j]) == target) {
                lst.add(i)
                lst.add(j)
                break
            }
        }
    }
    return lst
    }
}