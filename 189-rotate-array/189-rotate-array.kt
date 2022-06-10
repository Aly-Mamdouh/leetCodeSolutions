import java.util.*
class Solution {
    fun rotate(nums: IntArray, k: Int): Unit {
     
         var orgArr=nums.copyOf()
    for(i in 0 until nums.size){
        var j = (i+k)%nums.size
        nums[j]=orgArr[i]
    }
    }
}