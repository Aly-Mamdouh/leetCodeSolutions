class Solution {
  fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
    
  var mx: Int = -1
  for (i in 0..candies.size - 1) {
    mx = Math.max(mx, candies[i])
  }

  for (i in 0..candies.size - 1) {
    candies[i] += extraCandies
  }

  var lst =ArrayList<Boolean>()

   for (i in 0..candies.size - 1) {
    if (candies[i] >= mx) {
      lst.add(true)
    }
    else{
      lst.add(false)
    }
  }
  return lst
      
 }
}