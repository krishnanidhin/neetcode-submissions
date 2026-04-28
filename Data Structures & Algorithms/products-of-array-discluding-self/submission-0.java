class Solution {
    public int[] productExceptSelf(int[] arr) {
         int [] res = new int [arr.length];
        int i=1,pr=1;
        res[0]=1;
        while(i< arr.length) {
            pr=pr*arr[i-1];
            res[i]=pr;
            i++;
        }
        Arrays.stream(res).forEach(System.out::println);
        int j=arr.length-2;
        pr=1;
        while (j>=0){
            pr=pr*arr[j+1];
            res[j]=res[j]*pr;
            j--;
        }
        Arrays.stream(res).forEach(System.out::println);

        return res;
    }
}  
