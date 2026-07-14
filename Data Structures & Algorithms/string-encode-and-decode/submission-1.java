class Solution {
     String encodingstring = "-12304%";
    public String encode(List<String> strs) {
      if(strs.size()==0) return "";
      String encode= "";
      for(String s : strs)
      {  if(s.length()==0)
        {
          encode += "empt";
        }
         encode += s+encodingstring;
      }
      System.out.println(encode);
      return encode;
    }

    public List<String> decode(String str) {
      if(str.length()==0) return new ArrayList<>();
      String [] decode =str.split(encodingstring);
      List<String> list = new ArrayList<>();
      for(String id : decode)
      {
         if(id.equals("empt")){list.add("");}
         else list.add(id);
      }
      return list;
    }
}
