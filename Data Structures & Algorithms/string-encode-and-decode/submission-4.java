class Solution {

    public String encode(List<String> strings) {
        StringBuilder sb = new StringBuilder();
        for (String s:strings) {
            sb.append(s.length()).append("#").append(s);
        }
        return sb.toString();

    }

    public List<String> decode(String strings) {
        List<String> result = new ArrayList<>();
        int i=0;
        while (i<strings.length()){
            int idx = strings.indexOf("#",i);
            int length = Integer.parseInt(strings.substring(i,idx));
            result.add(strings.substring(idx+1,idx+1+length));
            i=idx+1+length;
        }
        return result;
    }
}
