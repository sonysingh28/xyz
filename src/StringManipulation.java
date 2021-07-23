
public class StringManipulation {

	public static void main(String[] args) 
	{
		String s= "MADAM";
		String rev= "";
		 int l = s.length()-1;
		 
		 for(int i=l;i>=0;i--)
		 {
			 rev= rev+s.charAt(i);
		 }
		 
		 if(rev.equals(s))
		 {
		 System.out.println("String is Palindrome!");}
		 
		 else
			 System.out.println("Not Palindrome!!");

	}

}
