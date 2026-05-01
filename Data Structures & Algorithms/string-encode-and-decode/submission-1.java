class Solution {

    public String encode(List<String> strs) {
        String res = "";
        for (String s : strs) {
            res += s.length() + "#" + s;
        }
        return res;
    }

    public List<String> decode(String s) {
        List<String> res = new ArrayList<>();
        int i = 0;

        while (i < s.length()) {
            int hash = s.indexOf('#', i);
            int len = Integer.parseInt(s.substring(i, hash));

            String word = s.substring(hash + 1, hash + 1 + len);
            res.add(word);

            i = hash + 1 + len;
        }

        return res;
    }
}