class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Integer[] indices = new Integer[position.length];
        //Arrays.stream(position).forEach(System.out::println);
        for (int i = 0;i < indices.length; i++){
            indices[i]=i;
        }
        Arrays.sort(indices,(a,b)->position[b]-position[a]);
       // Arrays.stream(indices).forEach(System.out::println);


        Stack <Double> stack = new Stack<>();
        for (int i = 0; i< position.length;i++){
            double time = (double) (target - position[indices[i]]) /speed[indices[i]];
            if (stack.empty() || time > stack.peek()) {
                stack.push(time);
            }
        }
        return stack.size();
    }
}
