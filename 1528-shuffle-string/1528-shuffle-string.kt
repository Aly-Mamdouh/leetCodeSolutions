class Solution {
    fun restoreString(s: String, indices: IntArray): String {
        
  var res :String =""
  val mp: MutableMap<Int, Char> = HashMap()
  for (i in 0..indices.size - 1) {
   
    mp.put(indices[i], s[i])
  }
 
  mp.forEach { it ->
    res+=it.value
}

  return res
    }
}