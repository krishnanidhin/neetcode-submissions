class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
         int [] res = new int[nums.length-k+1];
        Deque<Integer> deque = new ArrayDeque<>();
        int longest=0,l=0,idx=0;
        for (int r=0;r<nums.length;r++) {


            while (!deque.isEmpty() && nums[r]>nums[deque.getLast()]) {
                deque.pollLast();
            }
            deque.add(r);

            if (deque.peekFirst()<l) {
                deque.pollFirst();

            }

            if (r>=l+k-1) {
                res[idx++]=nums[deque.peekFirst()];
                l++;

            }


            int n = l+k-1;
           // System.out.println(deque.peekFirst()+ " " + n);




        }
        Arrays.stream(res).forEach(System.out::println);
        return res;
    }
}
