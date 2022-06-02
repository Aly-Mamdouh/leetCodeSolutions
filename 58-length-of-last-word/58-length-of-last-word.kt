class Solution {
    fun lengthOfLastWord(s: String): Int {
         var str=s.reversed().trim()
    var cnt:Int=0
    for(i in 0 until str.length){
        if(str[i].isLetter()){
            cnt++
        }
        if(str[i]==' '){
            break;
        }
    }
    return cnt
    }
}