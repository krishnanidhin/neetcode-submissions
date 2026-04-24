class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> list = new ArrayList();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            map.put(Arrays.toString(chars), map.getOrDefault(Arrays.toString(chars), new ArrayList<>()));
            map.getOrDefault(Arrays.toString(chars), new ArrayList<>()).add(str);
        }
        for (String s : map.keySet()){
            list.add(map.get(s));
        }
        return list;
    }
}
