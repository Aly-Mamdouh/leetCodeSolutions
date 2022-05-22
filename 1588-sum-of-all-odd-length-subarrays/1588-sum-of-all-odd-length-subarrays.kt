class Solution {
    fun sumOddLengthSubarrays(arr: IntArray): Int {
        
   
    val lst = ArrayList<Int>()

   

    var cnt:Int=0

    for (i in 0..arr.size - 1) {
        for (j in 0..arr.size - 1) {

            for (k in i..j) {
                lst.add(arr[k])
            }
            if (lst.size > 0 && lst.size % 2 != 0) {
                for (z in 0..lst.size - 1) {
                   cnt+=lst[z]
                }
            }
            lst.clear()
        }
    }
    return cnt
    }
}