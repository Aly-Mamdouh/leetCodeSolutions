class Solution {
    fun countOdds(low: Int, high: Int): Int {
        var cnt: Int = 0
    for(i in low until high+1){
        if(i%2!=0){
            cnt++
        }
    }
    return cnt
    }
}