class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

     Map<String, List<String>> map= new HashMap<>();

     for(String s : strs)


     {
        char []arr = s.toCharArray();
        Arrays.sort(arr);
        String sorted = new String(arr); 
      
      map.computeIfAbsent(sorted, k -> new ArrayList<>()).add(s);
     }

     List<List<String>> res = new ArrayList<>();
     for(List<String> it : map.values())
     {
       res.add(it);
     }
     return res;
        
    }

    public int sumchar(String s)
    {
        int sum=0;
        for(char ch : s.toCharArray())
        {
             sum += (int)ch;
        }
        return sum;
    }
   

}
