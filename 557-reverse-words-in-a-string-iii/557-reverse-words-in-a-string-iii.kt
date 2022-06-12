class Solution {
    fun reverseWords(s: String): String {
          var lst = s.split(' ')
    var str=""
    for (i in 0 until lst.size) {
        str+=lst[i].reversed()
        str+=' '
    }
    return str.trim()
    }
}