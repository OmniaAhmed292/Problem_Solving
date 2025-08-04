//https://leetcode.com/problems/top-k-frequent-elements/description/
//another solution would be to sort the array but it will take Olog(n)
class Solution {
    
fun topKFrequent(nums: IntArray, k: Int): IntArray {
    val maxHeap = PriorityQueue<Pair<Int, Int>>(compareByDescending { it.second })
    val frequencyMap = mutableMapOf<Int, Int>()
    for (num in nums) {
        frequencyMap[num] = frequencyMap.getOrDefault(num, 0) + 1
    }
    for ((num, freq) in frequencyMap) {
        maxHeap.offer(num to freq)
    }
    val result = IntArray(k)
    for (i in 0 until k) {
        result[i] = maxHeap.poll()?.first ?: 0
    }
    return result

}
}
