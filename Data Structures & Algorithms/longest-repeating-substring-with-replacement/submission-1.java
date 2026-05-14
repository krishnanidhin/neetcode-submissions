class Solution {
    public int characterReplacement(String s, int k) {
        int longest=0,maxFreq=0,l=0;
        char [] charArray = s.toCharArray();
        int [] freqArr = new int [26];
        for (int r=0;r<charArray.length;r++){
            freqArr[charArray[r] - 'A']++;
             maxFreq = Math.max(maxFreq,freqArr[charArray[r] - 'A']);
             int window = r-l+1;
             if (window-maxFreq<=k){
                 longest=Math.max(longest,window);
             } else {
                 freqArr[charArray[l]-'A']--;
                 l++;
             }
        }

       return longest;
    }
}
