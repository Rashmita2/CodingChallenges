import java.util.*;

public class checker {

    public static boolean palindromeCheckerString(String text) {
        String text1 = text.toLowerCase();
        StringBuilder reversedstr = new StringBuilder();
        for (int i = text1.length() - 1; i >= 0; i--) {
            reversedstr.append(text1.charAt(i));
        }
        return text1.equals(reversedstr.toString());
    }

    public static void main(String[] main) {
        String s1 = "Hello";
        String s2 = "racecar";
        boolean result = palindromeCheckerString(s1);
        boolean result2 = palindromeCheckerString(s2);
        System.out.println(result);
        System.out.println(result2);
    }
}
