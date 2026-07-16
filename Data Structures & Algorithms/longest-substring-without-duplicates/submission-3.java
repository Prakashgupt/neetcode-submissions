class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxcnt = 0, cnt = 0, left = 0;
        Set<Character> st = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            if (!st.contains(s.charAt(right))) {
                st.add(s.charAt(right));
                cnt++;
            }
            else {
                while(st.contains(s.charAt(right)))
                { st.remove(st.remove(s.charAt(left)));
                left++;
                cnt--;
                } 
                st.add(s.charAt(right));
                cnt++;   
            }

            maxcnt = Math.max(maxcnt, cnt);
        }
        return maxcnt;
    }
}
