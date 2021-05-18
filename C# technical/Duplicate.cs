//Removing Duplicate String 
using System;
					
public class Program
{
		public static void removeduplicate(string text)  
		 {  
			 string result = "";  
					for (int i = 0; i < text.Length-1; i++)  
			 {  
				 if(!result.Contains(text[i].ToString())){
					 result +=text[i];
				 }
			 }  
			Console.WriteLine(result);
		 }
	public static void Main()
	{
		Console.WriteLine("Enter a word: ");
		string text = Console.ReadLine();
		removeduplicate(text);
		
	}
}
