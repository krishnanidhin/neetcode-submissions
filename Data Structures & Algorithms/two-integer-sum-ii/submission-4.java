class Solution {
    public int[] twoSum(int[] arr, int sum) {
         int i = 0;
       int j =arr.length-1;

       while (i<j){
            int current = arr[i]+arr[j];
           if (sum == current ){
              return new int[]{i+1,j+1};
           } else if (current>=sum) {
                j--;
           } else {
               i++;
           }
       }
        return new int[]{};
    }
}
