import java.util.*;
//convert a 2-D array into an 1-D array
public class oneDArray {

	public static void main(String[] args) 
	{
		int a[][]= {{1,1,8},{1,1}};
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				list.add(a[i][j]);
			}
		}
		
		
		/*Iterator t= list.iterator();
		
		while(t.hasNext())
		{
			System.out.print(t.next()+" ");
		}*/
		
		
	    int[] vector = new int[list.size()];
	    for (int i = 0; i < vector.length; i++) {
	        vector[i] = list.get(i);
	        System.out.print(vector[i]+" ");
	    }


	}

}
