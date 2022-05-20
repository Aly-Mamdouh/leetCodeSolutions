class Solution {
    fun shuffle(nums: IntArray, n: Int): IntArray {
         
          val mix = IntArray(2*n) { 0 }
          val lst = ArrayList<Int>(2*n)
          for (i in 0..n - 1) {
            lst.add(nums[i])
            lst.add(nums[i + n])
          }

          for (i in 0..2*n-1) {
            mix[i] = lst[i]
          }
          return mix
    }
}