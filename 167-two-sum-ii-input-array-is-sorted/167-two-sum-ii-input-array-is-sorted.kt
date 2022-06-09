class Solution {
    fun twoSum(numbers: IntArray, target: Int): ArrayList<Int> {
        var lst=ArrayList<Int>()
        var l:Int=0
        var r:Int=numbers.size-1
        var indl:Int=0
        var indr:Int=0
        while(l<r){
            if(numbers[l]+numbers[r]==target){
                indl=l
                indr=r
                break
            }
            else if(numbers[l]+numbers[r]<target){
                l++
            }
            else{
                r--
            }
        }
        indl+=1
        indr+=1
        lst.add(indl)
        lst.add(indr)
    return lst
    }
}