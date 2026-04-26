class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
     Map<Integer, Integer> map = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(n -> n, Collectors.summingInt(n->1)));
        System.out.println(map);

        //PriorityQueue<Integer> queue = new PriorityQueue<>((a,b)->map.get(a)-map.get(b));
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.comparingInt(map::get));
        for (Map.Entry mp:map.entrySet()) {
            Integer i = (Integer) mp.getKey();
            queue.offer(i);
            if (queue.size()>k){
                queue.poll();
            }

        }

        queue.forEach(System.out::println);



        return queue.stream().mapToInt(n->n).toArray();
    }
}
