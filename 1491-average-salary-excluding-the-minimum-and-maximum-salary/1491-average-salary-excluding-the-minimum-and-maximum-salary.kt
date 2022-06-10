class Solution {
    fun average(salary: IntArray): Double {
         salary.sort()
    var cnt:Double=0.0
    var res:Double=0.0
    for(i in 1 until salary.size-1){
        cnt+=salary[i]
    }
    res=cnt/(salary.size-2)
    return res
    }
}