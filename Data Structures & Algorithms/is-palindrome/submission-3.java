class Solution {
    public boolean isPalindrome(String s) {
        int l=0;
        s= s.toLowerCase();
        int r=s.length()-1;
        while(l<r)
        {
          while(l<r &&!Character.isLetterOrDigit(s.charAt(l)))
          {l++; }
          while(r>0&&l<r&&!Character.isLetterOrDigit(s.charAt(r)))
          {r--; }
          if(s.charAt(l)!=s.charAt(r))
          return false;
          l++;
          r--;

        }
        return true;
    }
}
