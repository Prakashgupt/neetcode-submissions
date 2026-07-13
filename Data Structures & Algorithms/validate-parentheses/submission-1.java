class Solution {
    public boolean isValid(String s) {

        Stack<Character> st=new Stack<>();
        st.add('.');
        for(char ch : s.toCharArray())
        {
          if(ch =='(' || ch =='{' || ch =='[')
          st.push(ch);
          else if(ch == ')' && st.peek()=='(') st.pop();
          else if(ch == '}' && st.peek()=='{') st.pop(); 
          else if(ch== ']' && st.peek()=='[')st.pop();
          else return false;

        }
        st.pop();
        return st.isEmpty();

        
    }
}
