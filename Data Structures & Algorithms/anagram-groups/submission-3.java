class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            int[] frequency = new int[26];
            for (Character c : str.toCharArray()) {
                frequency[c - 'a']++;
            }
            String s = Arrays.toString(frequency);
            map.putIfAbsent(s, new ArrayList<>());
            map.get(s).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
