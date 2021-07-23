import java.util.*;
public class armstrong {

	public static void main(String[] args) 
	{
		int num;
		System.out.print("Enter the number :");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		sc.close();
		System.out.println(arms(num));

	}
	
	
	public static int arms(int n)
	{
		int t=0;
		int c=0;
		while(n>0)
		{
			t=t*10+n%10;
			c=c+(t*t*t);
			
		}
		
		if(t==c)
		{
			System.out.println("Armstrong Number");
		}
		
		else
		{
			System.out.println("Not an armstrong number");
		}
		
		return c;

	}

}
