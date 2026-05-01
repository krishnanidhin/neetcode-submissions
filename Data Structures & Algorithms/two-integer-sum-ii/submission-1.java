class Solution {
    public int[] twoSum(int[] arr, int sum) {
         Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<arr.length;i++) {
            int num = sum-arr[i];
            if (!map.containsKey(num)) {
                map.put(arr[i], i);
            } else {
                return new int[]{map.get(num)+1,i+1};
            }

        }
        return new int[]{};
    }
}
