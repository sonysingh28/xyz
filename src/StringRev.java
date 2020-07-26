import java.util.Scanner;

public class StringRev 
{
	public static void main(String args[])
	{
		String str = "tyetyryyu";
	    String rev = "";
		int i, l;
		l= str.length()-1;
		for(i=l;i>=0;i--)
		{
			rev=rev+str.charAt(i);
			
		}
		
		System.out.println("Reversed String is::"+rev);
        
	    if (str.equals(rev)) 
	        System.out.println("Yes"); 
	    
	      else
	        System.out.println("No"); 

		
	}
	
}
