class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();

        if(s.length()<t.length()) return "";
        if (t.isEmpty()) return "";

        for (char ch : t.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int left = 0;
        int len = t.length();
        int minstart = 0;
        int minlen = Integer.MAX_VALUE;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            if(map.containsKey(ch)) {
            
                if(map.get(ch) > 0) {
                   
                    len--;
                }
                 map.put(ch, map.get(ch) - 1);
            }

            while (len == 0) {
                if (right - left + 1 < minlen) {
                    minlen = right - left + 1;
                    minstart = left;
                }
                if(map.containsKey(s.charAt(left)))
                {

                    map.put(s.charAt(left),map.get(s.charAt(left))+1);
                    if(map.get(s.charAt(left))>0)
                       {len++;}
                }

                left++;
            }
        }

        return minlen == Integer.MAX_VALUE ? "" : s.substring(minstart,minstart+minlen);
    }
}
