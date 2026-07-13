class Solution {
    public boolean isPalindrome(String s) {
        int l=0;
        s= s.toLowerCase();
        int r=s.length()-1;
        while(l<r)
        {
          if(!Character.isLetterOrDigit(s.charAt(l)))
          {l++; continue;}
          if(!Character.isLetterOrDigit(s.charAt(r)))
          {r--; continue;}
          if(s.charAt(l)!=s.charAt(r))
          return false;
          l++;
          r--;

        }
        return true;
    }
}
