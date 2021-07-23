import java.util.*;
public class parbalance {

	public static void main(String[] args) 
	{
	   String str;
	   System.out.println("Enter the string to be checked:");
	   Scanner s = new Scanner(System.in);
	   str= s.nextLine();
	   System.out.println(expresscheck(str));
	   
	   

	}
	
	public static boolean expresscheck(String str)
	{
		Stack<Character> stack = new Stack<Character>();
		int i, l;
		l=str.length();
		for (i=0;i<l;i++)
		{
			char ch= str.charAt(i);
			if(ch=='('||ch=='{'||ch=='[')
			{
				stack.push(ch);
			}
			
			else if (ch==']')
			{
				if(stack.isEmpty()||stack.pop()!='[')
					return false;
			
			}
			
			else if(ch=='}')
			{
				if(stack.isEmpty()||stack.pop()!='{')
					return false;
			}
			
			
			else if(ch==')')
			{
				if(stack.isEmpty()||stack.pop()!='(')
					return false;
			}
			
		}
		
		
		return stack.isEmpty();
	}

}
