
public class SecondLarg {

	public static void main(String[] args)
	{
		int a[] = {12,17,8,19,2,7,9,10,12};
		
		int m1 = a[0];
		int m2 = a[1];
		
		int i;
		
		for(i=2;i<a.length;i++)
		{
			if(a[i]>m2)
			{
				m2=a[i];
			}
			
			
			if(m2>m1)
			{
				int tmp= m1;
				m1=m2;
				m2=tmp;
			}
		}
		
		
		System.out.print("Second largest element is : "+m2);
		

	}

}
