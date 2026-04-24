class Solution {
    public int[] twoSum(int[] nums, int target) {
         Map<Integer,Integer> map = new HashMap<>();
        int [] returnvalue = new int[2];
        for (int i=0;i< nums.length;i++){

            if (null != map.get(nums[i])) {

                returnvalue[0]=map.get(nums[i]);
                returnvalue[1]=i;
                return returnvalue;

            } else {

                map.put(target - nums[i], i);
            }
        }
        return returnvalue;
    }
}
