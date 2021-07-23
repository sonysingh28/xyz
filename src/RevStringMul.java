import java.util.*;
public class RevStringMul {

	public static void main(String[] args) 
	{
		String s= "SONY";
		String r = "";
		
		int l= s.length()-1;
		
		for (int i=l;i>=0;i--)
		{
			r= r+s.charAt(i);
		}
		
		System.out.print("First method :"+r);
		System.out.println("");
		
		
	   /* StringBuffer sf = new StringBuffer();
	    System.out.println("**************");
	    System.out.println(((Object) sf).reverse());
	    */
	    
	    System.out.println("**************");
		
		String st= "My Name is Sony Singh";
		char[] ch = st.toCharArray();
		
		ArrayList<Character> li = new ArrayList<Character>();
		for(char c : ch)

		li.add(c);
		
		Collections.reverse(li);
		
			
	   Iterator t = li.iterator();
		
		while(t.hasNext())
		{
			System.out.print(t.next());
		}
		

	}

}
