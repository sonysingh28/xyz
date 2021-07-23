
public class LinkRev 
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
	
	
	Node reverse(Node node)
	{
		Node prev= null;
		Node current = node;
		Node next = null;
		
		while(current!=null)
		{
			next = current.next;
			current.next= prev;
			prev =current;
			current = next;
		}
		
		node=prev;
		return node;
	}

	
	void Display(Node node)
	{
		while(node!=null)
		{
			System.out.println(node.data+ " ");
			node=node.next;
		}
	}
	public static void main(String[] args) 
	{
		LinkRev l = new LinkRev();
		l.head = new Node(82);
		l.head.next = new Node(35);
		l.head.next.next = new Node(55);

		System.out.print("Elements in list are:" +" ");
		l.Display(head);
		
		//System.out.println('j'+'a'+'v'+'a');
		System.out.println("Reversed elements are :"+ " ");
		head = l.reverse(head);
		l.Display(head);
		
		
		}

}
