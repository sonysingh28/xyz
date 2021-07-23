import java.util.*;
public class Fact {

	public static void main(String[] args) 
	{
	   int num;
	   System.out.print("Enter the number :");
	   Scanner sc = new Scanner(System.in);
	   num = sc.nextInt();
	   sc.close();
		System.out.print("Factorial is : "+fact(num));
		System.out.println("");
	    System.out.println("Rescursive factorial calcualtion is: "+recursivefact(num));

	}
   
	public static int fact(int num)
	{
		int i,f;
		f=1;
		
		for(i=1;i<=num;i++)
		{
			f=f*i;
		}
		
		return f;
	}
	
	
	public static int recursivefact(int num)
	{
		if(num==0)
			return 1;
		
		else
			return (num*recursivefact(num-1));
		
		
			
	}
	
	
}
