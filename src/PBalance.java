import java.util.*;
public class PBalance {

	public static void main(String[] args) 
	{
		String str;
		System.out.print("Enter the string : ");
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		System.out.println(expcheck(str));
		

	}
	
	public static boolean expcheck(String s)
	{
		Stack<Character> stack = new Stack<Character>();
		int i,l;
		l=s.length();
		
		for(i=0;i<l;i++)
		{
			char ch=s.charAt(i);
			if(ch=='('||ch=='{'||ch=='[')
			{
				stack.push(ch);
			}
			
			else if(ch==']')
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
