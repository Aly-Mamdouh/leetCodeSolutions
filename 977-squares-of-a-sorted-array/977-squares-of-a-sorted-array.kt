class Solution {
    fun sortedSquares(nums: IntArray): ArrayList<Int> {
        var lst=ArrayList<Int>()
        var sq:Int=0
        for(i in 0 until nums.size){
            sq=nums[i]*nums[i]
            lst.add(sq)
        }
        lst.sort()
        return lst
    }
}