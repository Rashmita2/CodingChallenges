class Solution {
    public boolean isValid(String s) {
        if(s.length() %2 != 0){
            return false;
        }
        Stack<Character>Letters = new Stack<>();
        for(char c: s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                Letters.push(c);
            }
            else if (c == ')' && !Letters.isEmpty() && Letters.peek() =='('){
                Letters.pop();
            }
              else if (c == '}' && !Letters.isEmpty() && Letters.peek() == '{'){
                Letters.pop();
            }
              else if (c == ']' && !Letters.isEmpty() && Letters.peek() == '['){
                Letters.pop();
            }
            else {
                return false;
            }     
        }
        return Letters.isEmpty();
    }
}
