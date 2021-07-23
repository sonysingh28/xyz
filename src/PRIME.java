import java.util.Scanner;

public class PRIME {

	public static void main(String[] args) 
	{
		int l,u;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the lower limit: ");
		l=sc.nextInt();

		System.out.print("Enter the upper limit: ");
		u=sc.nextInt();
		
		sc.close();
		range(l,u);

	}
	
	public static void range(int l, int u)
	{
		
		int i,j;
		
		for( i=l;i<u;i++)
		{   int c=0;
			boolean isPrime=true;
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
					isPrime=false;
					break;
				}
			}
			
			if(isPrime)
				System.out.print(i+ " ");
			    
			    
			
			
		}             

		
		
		
	}

}
