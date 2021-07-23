import java.util.*;
public class ParanthesisBalance {

	public static void main(String[] args) 
	{
		String str;
		System.out.println("Expression to be checked: ");
		Scanner sc = new Scanner(System.in);
		str= sc.nextLine();
		sc.close();
		System.out.println(exp_check(str));
		
		
	}

	
	public static boolean exp_check(String s)
	{
		 Stack<Character> stack = new Stack<Character>();
		 int i, l;
		 l= s.length();
		 for(i=0;i<l;i++)
		 {
			 char ch= s.charAt(i);
			 if(ch=='('||ch=='{'||ch=='[')
			 {
				 stack.push(ch);
			 }
			 
			 else if(ch==']')
			 {
				 if(stack.isEmpty()||stack.pop()!='[')
				 {
					 return false;
				 }
				 
			 }
			 
			 else if(ch=='}')
			 {
				 if(stack.isEmpty()||stack.pop()!='{')
				 {
					 return false;
				 }
			 }
			 
			 else if(ch==')')
			 {
				 if(stack.isEmpty()||stack.pop()!='(')
				 {
					 return false;
				 }
			 }
			 
		 }
		   return stack.isEmpty();
		
		}
		
		}
	

