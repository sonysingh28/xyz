import java.util.*;

public class StringBuffer {

	public static void main(String[] args) 
	{
	   String s;
	   System.out.println("Enter the String: ");
	   Scanner sc= new Scanner(System.in);
	   s= sc.nextLine();
	   sc.close();
	  
	}
	  
	
	public static void stringcheck(String s)
	{
		if(s==null||s.length()<=0)
		{
			System.out.println(s);
		}
		
		else
		{
			System.out.print(s.charAt(s.length()-1));
			stringcheck(s.substring(s.charAt(s.length()-1)));
		}
	}
}
