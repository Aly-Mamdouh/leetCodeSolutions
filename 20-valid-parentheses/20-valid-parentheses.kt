class Solution {
    fun isValid(s: String): Boolean {
      
    var ok: Boolean = false
    val st = Stack<Char>()

    for (i in 0 until s.length) {
        if (st.isEmpty()) {
            st.push(s[i])
        } else if ((st.peek() == '(' && s[i] == ')') ||
                        (st.peek() == '{' && s[i] == '}') ||
                        (st.peek() == '[' && s[i] == ']')
        ) {
            st.pop()
        }else{
            st.push(s[i])
        }
    }
    if(st.isEmpty()){
        ok=true
    }else{
        ok=false
    }
   
    return ok
    }
}