import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args)     //Print prime between 1 to 100
	                                           //Check given number is prime or not
	{                                          //Recursive method to check given number is prime or not
		int num;
		System.out.print("Enter the number/range to be checked: ");
		Scanner sc= new Scanner(System.in);
		num= sc.nextInt();
		sc.close();
		System.out.println(" ");
       // System.out.print(primecheck(num));
		System.out.print("Prime numbers are: " +" ,");
	    System.out.print(range(num));	

                                               
	}
	
	
	public static boolean primecheck(int n)
	{
		
			if(n<=1)
			{
				return false;
			}
			
			else
			{
				for(int i=2;i<n;i++)
				{
					if(n%i==0)
						return false;
				}
			}
			
			return true;
	}
	
	
	public  static int range(int num)
	{
		for(int i=2;i<=num;i++)
		{
			if(primecheck(num))
					System.out.println(i);
		}
		
		return num;
	}


}
