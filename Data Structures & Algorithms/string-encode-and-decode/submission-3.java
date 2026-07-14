class Solution {
     String encodingstring = "-%";
    public String encode(List<String> strs) {
      if(strs.size()==0) return "";
      StringBuilder sb = new StringBuilder();
      for(String s : strs)
      {  if(s.length()==0)
        {
           sb.append("em");
        }
         sb.append(s).append(encodingstring);
      }
   //   System.out.println(encode);
      return sb.toString();
    }

    public List<String> decode(String str) {
      if(str.length()==0) return new ArrayList<>();
      String [] decode =str.split(encodingstring);
      List<String> list = new ArrayList<>();
      for(String id : decode)
      {
         if(id.equals("em")){list.add("");}
         else list.add(id);
      }
      return list;
    }
}
