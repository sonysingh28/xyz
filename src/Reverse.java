import java.util.*;

public class Reverse {

	public static void main(String[] args) 
	{
		String str;
		System.out.print("Enter the data:");
		Scanner sc = new Scanner(System.in);
		str= sc.nextLine();
		sc.close();
		stringrevcheck(str);
		
		

	}
	
	
	public static void stringrevcheck(String s)
	{
		  
      if((s==null)||(s.length()<=0))
      {
    	  System.out.println(s);
      }
      else
      {
    	  System.out.print(s.charAt(s.length()-1));
    	  stringrevcheck(s.substring(0,s.length()-1));
      }
		
	}
	

}
