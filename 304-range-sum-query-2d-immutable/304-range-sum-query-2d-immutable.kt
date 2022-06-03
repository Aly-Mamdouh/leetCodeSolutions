class NumArray(val nums: IntArray) {

    val sums = IntArray(nums.size)

    init {
        for (index in nums.indices) {
            if (index == 0) {
                sums[0] = nums[0]
            } else {
                sums[index] = sums[index - 1] + nums[index]
            }
        }
    }

    fun sumRange(i: Int, j: Int): Int {
        if (i == j) {
            return nums[i]
        }
        if (i == 0) {
            return sums[j]
        }
        return sums[j] - sums[i - 1]
    }
}

class NumMatrix(val matrix: Array<IntArray>) {

    var rowSums: Array<NumArray> = Array(matrix.size) { NumArray(matrix[it]) }

    fun sumRegion(row1: Int, col1: Int, row2: Int, col2: Int): Int {
        if (row1 == row2 && col1 == col2) {
            return matrix[row1][col1]
        }
        var result = 0
        for (index in row1..row2) {
            result += rowSums[index].sumRange(col1, col2)
        }
        return result
    }

}
