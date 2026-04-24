class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      
        return new ArrayList<>(
        Arrays.stream(strs)
            .collect(Collectors.groupingBy(s -> {
                int[] freq = new int[26];
                for (char c : s.toCharArray()) freq[c - 'a']++;
                return Arrays.toString(freq);         
            }))
            .values()
    );                                
    
    }
}
