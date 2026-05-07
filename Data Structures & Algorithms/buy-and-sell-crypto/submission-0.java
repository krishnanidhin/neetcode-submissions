class Solution {
    public int maxProfit(int[] arr) {
        int l=0,r=1,max=0;
        while (r<arr.length) {
            if (arr[l]>arr[r]) {
                l=r;
            }
            max=Math.max(max,arr[r]-arr[l]);
            r++;
        }
        return max;

    }
}
