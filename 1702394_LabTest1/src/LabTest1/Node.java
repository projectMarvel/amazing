//Sohlain Diah	1702394		October 16, 2019
package LabTest1;

public class Node {
	Marble data;
	Node next;
	
	public Node() {
		data = null;
		next = null;
	}
	
	public Node(Marble data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}

	public Marble getData() {
		return data;
	}

	public void setData(Marble data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	public void display() {
		System.out.println(data+" "+next);
	}
}
