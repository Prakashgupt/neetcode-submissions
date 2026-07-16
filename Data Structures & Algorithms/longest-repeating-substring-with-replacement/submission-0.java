class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
        Map<Character,Integer> map=new HashMap<>();
        int maxFreq=0;
        int maxres = 0;
        for(int right=0;right<s.length();right++)
        {
          char curr=s.charAt(right);

          map.put(curr, map.getOrDefault(curr,0)+1);
          maxFreq= Math.max(maxFreq,map.get(curr));


          int window = right-left+1;
          while(window-maxFreq>k)
          {

            map.put(s.charAt(left),map.getOrDefault(s.charAt(left),0)-1);
            left++;
            window=right-left+1;
          }
          
          maxres= Math.max(maxres,window);


        }
        return maxres;
        
    }
}
