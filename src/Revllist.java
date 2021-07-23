
public class Revllist 
{

	public static void main(String[] args) 
	{
		Revllist l = new Revllist();
		l.head = new Node(85);
		l.head.next=new Node(18);
		l.head.next.next=new Node(20);
		l.head.next.next.next=new Node(98);
		
		System.out.print("The Given Linked List is :");
		l.Display(head);
		head= l.reverse(head);
		System.out.print("The Reversed Linked List is :");
		l.Display(head);

		

	}
	
	
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
    
    
    Node reverse(Node node)
    {
    	Node prev= null;
    	Node current = node;
    	Node next =null;
    	
    	while(current!=null)
    	{
    		next=current.next;
    		current.next=prev;
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
    		System.out.println(node.data+" ");
    		node=node.next;
    	}
    }
    

}
