class Solution {
    public String minWindow(String s, String t) {
        int [] freq1 = new int [128];
        int [] freq2 = new int [128];

        int need =0;
       
        for (Character c : t.toCharArray()) {
            freq1[c]++;
            if (freq1[c]==1) {
                need++;
            }
        }
        int have=0,l=0,minL=-1,minR=-1;
        for (int r = 0; r< s.length(); r++){
            int c = s.charAt(r);
            freq2[c]++;
            if (freq1[c]>0 && freq2[c]==freq1[c]) {
                have++;
            }

            while (have == need) {

                if (minR==-1 || minR-minL+1>r-l+1){
                    minL=l;
                    minR=r;
                }
                int d = s.charAt(l);
                freq2[d]--;
                if (freq1[d]>0 && freq2[d]<freq1[d]) {
                    have--;
                }
                l++;
            }
        }
        return minR == -1 ? "" : s.substring(minL, minR + 1);
    }
}
