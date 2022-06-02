class Solution {
    fun strStr(haystack: String, needle: String): Int {
   
        var fidx: Int = 0
    var ok :Boolean=false

    if (needle.isEmpty()) {
       return 0
    }

    if (haystack.contains(needle)) {
        ok=true
        fidx = haystack.indexOf(needle)
    } 
    if(ok==false){
        fidx=-1
    }
        
   return fidx
    }
}