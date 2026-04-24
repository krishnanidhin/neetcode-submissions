class Solution {
    public boolean isAnagram(String s, String t) {

        Map<Character,Long> map1 = s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
        Map<Character,Long> map2 = t.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));

        return map1.equals(map2);

    }
}
