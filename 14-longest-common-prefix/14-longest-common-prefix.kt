class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        
    strs.sort()
    var res:String=""
    if(strs.size==0){
        res+=" "
    }
    var a:String=strs[0]
    var b:String=strs[strs.size-1]
    for (i in 0 until a.length) {
         if(a[i]==b[i]){
             res+=a[i]
         }else{
             break
         }
    }
return res    }
}