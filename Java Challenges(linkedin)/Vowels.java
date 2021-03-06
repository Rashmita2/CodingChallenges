
//Find the vowels and consonents from the given string
//vowels - a,e,i,o,u,y
import java.util.*;

public class Vowels{

    public static void findVowelsConsonents(String input) {
        int v_count = 0;
        int c_count = 0;
        String vowels = "aeiouy";
        // removes the white spaces
        String inputWords = (input.toLowerCase()).trim();
        //taking the string to the character array
        char[] inputArray = inputWords.toCharArray();

        for (char c : inputArray) {
            //Checking if hte character is in the index of the array
            if (vowels.indexOf(c) != -1) {
                v_count++;
            } else if (c != ' ') {
                c_count++;
            }
        }
        System.out.println("The number of vowels are " + v_count);
        System.out.println("The number of consonents are " + c_count);
    }

    public static void main(String[] args) {
        String text = "Hello World";
        findVowelsConsonents(text);
    }

}

//Another method
public class Consonents {
    public static void main(String[] args){
        String text = "Hello World";
        int vCount = 0;
        int cCount = 0;
        String finaltext = (text.toLowerCase()).trim();
        for(int i=0; i<finaltext.length(); i++){
            if(finaltext.charAt(i) == 'a' || finaltext.charAt(i)== 'e' || finaltext.charAt(i)== 'i' || finaltext.charAt(i)== 'o' || finaltext.charAt(i)== 'u'){
                vCount++;
            }
            else{
                cCount++;
            }
        
    }
        System.out.println("Vowels: "+ vCount);
        System.out.println("Consonents: " + cCount);
}
}
