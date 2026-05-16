class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
         int [] freq1 = new int[26];
        int [] freq2 = new int [26];
        for (Character c :s1.toCharArray()){
            freq1[c-'a']++;
        }
        int matches=0;
        for (int i=0;i<26;i++){
            if (freq1[i]==freq2[i]) {
                matches++;
            }
        }
        int l=0;
        char [] charArray = s2.toCharArray();
        for (int r=0;r<charArray.length;r++) {

            freq2[charArray[r]-'a']++;
            if (freq1[charArray[r]-'a']==freq2[charArray[r]-'a']) {
                matches++;
            } else if (freq1[charArray[r]-'a']+1==freq2[charArray[r]-'a']) {
                matches--;
            }

            if (r>=s1.length()) {
                freq2[charArray[l]-'a']--;

                if (freq2[charArray[l]-'a']==freq1[charArray[l]-'a']) {
                    matches++;
                } else if (freq2[charArray[l]-'a']==freq1[charArray[l]-'a']-1) {
                    matches--;
                }
                l++;
            }



            System.out.println("r="+r+" l="+l+" matches="+matches+" freq2[t]="+freq2['t'-'a']+" freq1[t]="+freq1['t'-'a']);
                if (matches==26){
                    return true;
                }


        }


        return false;
    }
}
