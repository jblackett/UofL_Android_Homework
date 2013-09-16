package com.jblackett;

public class DoublyNode {
	private String value = "";
	private DoublyNode pointerNextNode = null;
	private DoublyNode pointerPrevNode = null;

	public DoublyNode(String input) {
		// TODO Auto-generated constructor stub
		this.value  = input;
	}
	
	public void setValue(String value){
		this.value = value;
	}

	public void setNextNode(DoublyNode nextNode) {
		// TODO Auto-generated method stub
		this.pointerNextNode = nextNode;		
	}

	public void setPrevNode(DoublyNode prevNode) {
		// TODO Auto-generated method stub
		this.pointerPrevNode = prevNode;
	}
	
	public String getValue(){
		return value;
	}
	
	public DoublyNode getPrevNode(){
		return pointerPrevNode;
	}
	
	public DoublyNode getNextNode(){
		return pointerNextNode;
	}
	
	

}
