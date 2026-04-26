class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
     Map<Integer, Integer> map = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(n -> n, Collectors.summingInt(n->1)));
        System.out.println(map);

        List<Integer>[] bucket = new List[nums.length+1];
        for (int key: map.keySet()) {
            Integer freq = map.get(key);
            if (bucket[freq]==null) {
                bucket[freq] = new ArrayList<>();}
                bucket[freq].add(key);

        }
        int [] result = new int[k];
        int count=0;
        for (int i= bucket.length-1;i>0 && count<k;i--){
            if (bucket[i]!=null) {
                for (Integer j : bucket[i]) {
                    if (count<k){
                        result[count]=j;
                        count++;
                    }
                }
            }
        }
        Arrays.stream(result).forEach(System.out::print);
        return result;
    }
}
