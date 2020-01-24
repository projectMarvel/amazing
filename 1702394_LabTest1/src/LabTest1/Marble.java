//Sohlain Diah	1702394		October 16, 2019
package LabTest1;

public class Marble extends Node {
	private int ID;
	private String type;
	private float size;
	
	public Marble() {
		ID = 0;
		type = null;
		size = 0.0f;
	}
	
	public Marble(int iD, String type, float size) {
		super();
		ID = iD;
		this.type = type;
		this.size = size;
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float getSize() {
		return size;
	}
	public void setSize(float size) {
		this.size = size;
	}
	
	public void display() {
		System.out.println("Size:"+size);
		System.out.println("ID:"+ID);
		System.out.println("type:"+type);
	}
	
}
