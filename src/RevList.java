
public class RevList 
{
	static Node head;
	
	static class Node
	{
		int data;
		Node next;
		
		Node(int d)
		{
			data =d;
			next=null;
		}
	}

	
   Node  reverse (Node node)
	{
		Node prev=null;
		Node  current =node;
		Node next=null;
		
		while(current!=null)
		{
			next=current.next;
			current.next= prev;
			prev=current;
			current=next;
		}
		
		node=prev;
		return node;
	}
   
   void Display(Node node)
   {
	   while(node!=null)
	   {
		   System.out.print(node.data+" ");
		   node=node.next;
	   }
   }
    public static void main (String args[])
    {
       RevList r = new RevList();
       r.head = new Node(10);
       r.head.next= new Node(90);
       r.head.next.next= new Node(85);
       System.out.print("Linked List:"+" ");
       r.Display(head);
       System.out.println("");
       
       System.out.print("Reversed list:"+" ");
       head = r.reverse(head);
       r.Display(head);
    	
    }
	
}
