package com.jblackett;

public class DoublyLinkedList {	
	private DoublyNode backTraceNode = null;
	private DoublyNode firstNode = null;
	private DoublyNode lastNode = null;
	
	public void add(String input){
		DoublyNode tmpNode = new DoublyNode(input);		
		if (backTraceNode != null){			
			backTraceNode.setNextNode(tmpNode);			
			tmpNode.setPrevNode(backTraceNode);
			tmpNode.setNextNode(null);
			setLastNode(tmpNode);			
		}else{			
			firstNode = tmpNode;			
			firstNode.setPrevNode(null);			
		}
		backTraceNode = tmpNode;
	}

	public DoublyNode getLastNode() {
		return lastNode;
	}

	public void setLastNode(DoublyNode lastNode) {
		this.lastNode = lastNode;
	}
	
	public String print(){
		StringBuffer result = new StringBuffer();
		DoublyNode tmpNode = lastNode;		
		do{
			result.append(tmpNode.getValue() + " ");
			tmpNode = tmpNode.getPrevNode();
		}while(tmpNode != null);		
		System.out.println(result);
		return result.toString();
	}
	
	

}
