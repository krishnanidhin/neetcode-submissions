class Solution {
    public int trap(int[] height) {
        int [] leftMax=new int[height.length];
        int [] rightMax=new int[height.length];
        int num=0,sum=0;

        for (int i=0;i<height.length;i++) {
            num=Math.max(num,height[i]);
            leftMax[i]=num;
        }
        num=0;
        for (int i=height.length-1;i>=0;i--) {
            num=Math.max(num,height[i]);
            rightMax[i]=num;
        }
        for (int i=0;i<height.length;i++) {
            num=Math.min(leftMax[i],rightMax[i])-height[i];
            sum+=Math.max(num,0);
        }

        return sum;
    }
}
