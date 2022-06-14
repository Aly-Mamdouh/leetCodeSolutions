class Solution {
    fun nearestValidPoint(x: Int, y: Int, points: Array<IntArray>): Int {
         var idx = -1
    var distance = Int.MAX_VALUE
    for (i in 0 until points.size) {
        if (x == points[i][0] || y == points[i][1]) {
            var current_dis = Math.abs(x - points[i][0]) + Math.abs(y - points[i][1])
            if (current_dis < distance) {
                distance = current_dis
                idx = i
            }
        }
    }
    return idx
    }
}