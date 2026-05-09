class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (null == s || s.isEmpty()) {
            return 0;
        }
        Set<Character> c = new HashSet<>();
        c.add(s.charAt(0));
        int l=0,r=1,maxLength=1,sum=1;
        while (r<s.length()){
            if (!c.contains(s.charAt(r))) {
                c.add(s.charAt(r));
                sum=r-l+1;
                maxLength=Math.max(maxLength,sum);
                r++;
            } else {
                c.remove(s.charAt(l));
                l++;
            }


        }

        return maxLength;
    }
}
