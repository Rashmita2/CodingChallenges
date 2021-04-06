import java.util.*;
public class Product {
 //Print the maximum product from the given array   
  public static int maxProduct(int[] a1){
  int product = 0;
  for(int i=0; i < a1.length; i++){
      for(int j=i+1; j < a1.length; j++){
          if(a1[i]*a1[j] > product){
              product = a1[i]*a1[j];
          }
      }
  }
  return product;
  }
    
  public static void main(String[] args){
      int [] numarray = {5,3,2,5,7,0};
      int [] numarray2 = {-2,-1,-3,4,-8,0};
      System.out.println(maxProduct(numarray));
      System.out.println(maxProduct(numarray2));
  }  
}
