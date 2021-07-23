import java.util.*;
public class PrimeRange {

	public static void main(String[] args) 
	{
		int l,u;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the lower limit: ");
		l=sc.nextInt();
		System.out.print("Enter the upper limit: ");
		u=sc.nextInt();
		System.out.print("Prime numbers between "+l+" and "+u+" are : ");
	//	System.out.println("Total count is :"+c);
		range(l,u);
		
	}
	
	public static void range(int l, int u)

	{
		int i,j;
		int c=0; int flag=0;
	/*	if(l==2)
		{
			System.out.print(l);
		}*/
		for(i=l;i<=u;i++)
		{
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=0;
					break;
				}
				
				else
				{
					flag=1;
				
				}
			}
			
			if(flag==1)
			{
				System.out.print(i+" ");
				c++;
			}
			
		}
		System.out.print("\nTotal count is: "+c);
	}
}
