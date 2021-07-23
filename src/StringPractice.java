import java.util.Scanner;
import java.util.*;

public class StringPractice {

	public static void main(String[] args) 
	{
		String str;
		System.out.print("Enter the String: ");
		Scanner sc= new Scanner(System.in);
		str=sc.nextLine();
		sc.close();
		stringcheck(str);

	}
	
	
	public static void stringcheck(String s)
	{
		int l=s.length()-1;
		int i;
		String rev="";
		for(i=l;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		
		System.out.print("Reverse of the string is: "+rev);
		System.out.println("");
		
		palindromecheck(s,rev);
	}
	
	
	public static void palindromecheck(String s,String rev)
	{
		if(s.contentEquals(rev))
		{
			System.out.print("String is palindrome!!!");
		}
		
		else
		{
			System.out.print("String is not palindrome!!");
		}
	}

}
