//Sohlain Diah	1702394		October 16, 2019
package LabTest1;

public class MarbleLinkedList extends Marble {
	Node head;
	Node temp;
	
	public MarbleLinkedList() {
		head = null;
	}

	public MarbleLinkedList(Node head) {
		super();
		this.head = head;
	}
	
	public boolean isFull() {
		return false;
	}
	
	public boolean isEmpty() {
		return false;
	}
	
	public void insert(Marble roll) {
		if (data != null) {
			next = head;
			temp = head;
			temp = data;
		}
	}
	
	public int retrieve() {
		int ID = 0;
		if (ID != 0) {
			return data;
		}
		return 0;
	}
	
	public Node remove() {
		if( head != null) {
			temp = head;
		}
		return head;
	}

	public void show() {
		if(head != null)
			System.out.println(head);
			while (next != null);
				System.out.println(next);
	}
	
	public void destroy() {
		if(head != null)
			head = null;
			while (next != null);
				next = null;
	}
	
	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
	
	
}
