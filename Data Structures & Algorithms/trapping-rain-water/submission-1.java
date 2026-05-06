class Solution {
    public int trap(int[] height) {
        int leftMax=0,rightMax=0,sum=0;
        int l=0,r=height.length-1;
        while (l<=r) {
            if (leftMax<rightMax){
                leftMax=Math.max(leftMax,height[l]);
                sum+=leftMax-height[l];
                l++;
            } else {
                rightMax=Math.max(rightMax,height[r]);
                sum+=rightMax-height[r];
                r--;
            }

        }

        return sum;
    }
}
