//Check if the given String is Palindrome
import java.util.stream.IntStream;
import java.util.*;
public class Palindrome {

    public static boolean checkPalindrome(String text){
        String newText = text.toLowerCase();
        StringBuilder result = new StringBuilder();
        
        for(int i = newText.length() - 1; i>=0; i--){
            result.append(newText.charAt(i));
        }
        return newText.equals(result.toString());
        
    }
    public static void main(String[] args) {
        String input = "racecar";
        String input2 = "Hello";
        String input3 = "aBba";
        System.out.println(checkPalindrome(input));
        System.out.println(checkPalindrome(input2));
        System.out.println(checkPalindrome(input3));
    }
}
    
