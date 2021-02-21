//Valid Parentheses
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>(); 
        int par = 0, cur = 0, sq = 0;
        char[] str = s.toCharArray();
        for(char i: str){
            if(i == '('){
                st.push('(');
            }
            else if(i == ')'){
                if(st.empty()){return false;}
                if(st.peek() != ('(')){return false;}
                else{st.pop();}
            }
            else if(i == '['){
                st.push('[');
            }
            else if(i == ']'){
                if(st.empty()){return false;}
                if(st.peek() != '['){return false;}
                else{st.pop();}
            }
            else if(i == '{'){
                st.push('{');
            }
            else if(i == '}'){
                if(st.empty()){return false;}
                if(st.peek() != '{'){return false;}
                else{st.pop();}
            }
        }
        if(st.empty()){
            return true;
        }
        else{
            return false;
        }
    }
}
