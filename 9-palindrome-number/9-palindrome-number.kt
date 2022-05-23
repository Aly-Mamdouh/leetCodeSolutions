class Solution {
    fun isPalindrome(x: Int): Boolean {
   
       var str:String=x.toString()
       var rev:String=str.reversed()
       var ok:Boolean=false
       if(str==rev){
            ok=true
       }else{
           ok=false
       }
       return ok
    }
}