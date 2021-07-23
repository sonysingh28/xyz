
public class test3 
{
    public static int balance =200;
    
    public void newBalance(int balance)
    {
    	System.out.println(balance);
    	System.out.println(this.balance);
    	this.balance=balance;
    	System.out.println(this.balance);

    }
    
    
    public void printBalance()
    {
    	System.out.println(this.balance);
    }
	public static void main(String[] args) 
	{
		new test3().newBalance(600);
		new test3().printBalance();
		

	}

}
