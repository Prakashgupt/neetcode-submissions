class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length())return false;
        int map[] = new int[27];  

        for(char ch : s.toCharArray())
        {
         map[ch-96]++; 

        }
        
        for(char ch : t.toCharArray())
        {
           if(map[ch-96]>0)
           {
            map[ch-96]--;
           }
           else
           {
            return false;
           }
        }
        return true;
    }
}
