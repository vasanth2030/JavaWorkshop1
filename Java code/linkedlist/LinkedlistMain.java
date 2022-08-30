package linkedlist;

public class LinkedlistMain {
	public static void main(String[] args) {
		Node head=new Node(10);
		Node.insertAtEnd(head, 20);
		Node.insertAtEnd(head, 30);
		Node.insertAtEnd(head, 40);
		Node.insertAtEnd(head, 50);
		
		Node.printLinkedList(head);
		
		head= Node.deleteNodeAtPos(head, 3);
		Node.printLinkedList(head);
		
		head=Node.deleteNodeAtPos(head, 1);
		Node.printLinkedList(head);
	}

}
