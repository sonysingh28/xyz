import java.util.*;
public class test4 
{

	public static void main(String[] args) 
	{
		String str;
		System.out.print("Enter the String:");
		Scanner sc = new Scanner(System.in);
		str= sc.nextLine();
		
		int l= str.length();
		
		char ch[]= str.toCharArray();
		
		for(int i=0;i<l;i++)
		{
			for(int j=i;j<l;j++)
			{
				if(ch[i]!=ch[j])
				{
					System.out.println("");
				}
				
			}
			
			System.out.print("String is not unique");

		}
		
		

	}

}
