using System;
					
public class Program
{
	public static string ReverseString(string text){
	char[] charArr = text.ToCharArray();
		string reversed = String.Empty;
		for(int i = charArr.Length -1; i > -1; i--)
		{
			reversed += charArr[i];
		}
		return reversed;
	}
	public static void Main()
	{
		Console.WriteLine("Enter a word: ");
		string text = Console.ReadLine();
		string revText = ReverseString(text);
		if(text == revText) {
			Console.WriteLine("Palindrome");
		}
		else {
			Console.WriteLine("Not Palindrome");
		}
		
	}
}
