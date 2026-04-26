class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
    Map<Integer, Long> map = Arrays.stream(nums)
        .boxed()
        .collect(Collectors.groupingBy(n -> n, Collectors.counting()));

    return map.entrySet().stream()
        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
        .limit(k)
        .mapToInt(Map.Entry::getKey)
        .toArray();
    }
}
