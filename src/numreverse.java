import java.util.*;
public class numreverse {

	public static void main(String[] args) 
	{
		int num;
		System.out.println("Enter the number to be reversed : ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		int rev=0;
		
		while(num!=0)
		{
			rev= rev*10;
			rev= rev+num%10;
			num=num/10;
		}
		
		System.out.println("Reverse is:"+rev);

	}

}
