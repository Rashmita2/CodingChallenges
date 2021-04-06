import java.util.*;
import java.util.Stack;
public class Parenthesis {
   
    public static boolean matchingParenthesis(String input){
        Stack stack = new Stack<>();
        for(int i=0; i<input.length(); i++){
            if(input.charAt(i) == '{' || input.charAt(i) == '<' || input.charAt(i) == '[' || input.charAt(i)== '(')
            {
                stack.push(input.charAt(i));
            }
            else if(input.charAt(i) == '}' || input.charAt(i) == '>' || input.charAt(i) == ']' || input.charAt(i)== ')'){
                try {
                    stack.pop();
                }catch (EmptyStackException e){
        
                }
            }
                }
        return stack.isEmpty();
    }
 public static void main(String[] args){
     String s1 = "(<[]>)";
     String s2 = "{apple<}";
     String s3 = "()increm){}]";
     
     System.out.println(matchingParenthesis(s1));
     System.out.println(matchingParenthesis(s2));
     System.out.println(matchingParenthesis(s3));
 }   
}
