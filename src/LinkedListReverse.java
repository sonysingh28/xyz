import java.util.Stack;

public class LinkedListReverse 
{

	public static void main(String[] args)
	{
		
		push(5);
		push(4);
		push(3);
		push(2);
		push(1);
		
		head = ReverseList(head);
		display(head);

	}
	
	
	static class Node
	{
		int data;
		Node next;
	}
   
	static Node head = null;
	
	
	static void push(int d)
	{
		Node nd = new Node();
		nd.data=d;
		nd.next=(head);
		(head)=nd;
		
		
	}
	
	static void display(Node head)
	{
		while(head!=null)
		{
			System.out.println(head.data+"");
			head=head.next;
		}		
		
	}
	
	
	static Node ReverseList(Node head)
	{
		Stack<Node> s = new Stack<Node>();
		Node ptr=head;
		while(ptr.next!=null)
		{
			s.push(ptr);
			ptr=ptr.next;
			
		}
		head = ptr;
		while(! s.isEmpty())
		{
			ptr.next = s.peek();
			ptr= ptr.next;
			s.pop();
		}
		ptr.next = null;
		return head;

		
	}
}
