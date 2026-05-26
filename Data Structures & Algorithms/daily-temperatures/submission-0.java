class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int [] warmerDays = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        int pop =0;
        for (int i = 0; i< temperatures.length;i++){


                while (!stack.empty() && temperatures[i]>temperatures[stack.peek()]) {
                     pop =  stack.pop();
                    warmerDays[pop] = i - pop;
                }
            stack.push(i);
        }

        return warmerDays;
    }
}
