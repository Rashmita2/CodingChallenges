import java.util.*;
//Converting the Numbers to Binary format
public class Binary {
    
    public static void printBinary(int n){
        if(n <=0){
            System.out.println("Nothing to print");
            return;
        }
        for(int i=0; i<=n; i++){
            System.out.println(Integer.toBinaryString(i));
        }
    }
   public static void main(String[] args){
       printBinary(8);
   } 
}
