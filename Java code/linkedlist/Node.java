package linkedlist;

public class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		next = null;
	}

	public static void insertAtEnd(Node head, int data) {
		Node newNode = new Node(data);
		Node curr = head;
		while (curr.next != null) {
			curr = curr.next;
		}
		curr.next = newNode;
	}
	
	public static Node deleteNodeAtPos(Node head, int pos)
	{
		if(pos==1)
		{
			return head.next;
		}
		
		Node curr=head;
		for(int i=1;i<pos-1;i++)
		{
			curr=curr.next;
		}
		curr.next=curr.next.next;
		return head;
	}

	public static void printLinkedList(Node head)
	{
		Node curr=head;
		while(curr!=null)
		{
			System.out.print(curr.data+" --> ");
			curr=curr.next;
		}
		System.out.println();
	}

}
