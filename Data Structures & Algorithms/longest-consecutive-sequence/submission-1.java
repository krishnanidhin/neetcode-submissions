class Solution {
    public int longestConsecutive(int[] arr) {
        Set<Integer> set = Arrays.stream(arr).boxed().collect(Collectors.toSet());
        int longestSeq=0;
        for (int nums:set){

            int streak = 0;
            if (!set.contains(nums-1)) {
                streak++;
                while(set.contains(nums+1)){
                    streak++;
                    nums++;
                }
            }
            longestSeq=Math.max(streak,longestSeq);
        }
        return longestSeq;
    }
}
