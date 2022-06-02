class Solution {
    fun transpose(matrix: Array<IntArray>): Array<IntArray> {
        
         var n :Int=matrix.size
         var m :Int=matrix[0].size
         var trans = Array(m){IntArray(n)}
         
             for(i in 0 until n){
                 for(j in 0 until m){
                     trans[j][i]=matrix[i][j]
                  }
                }
         return trans
         
    }
}