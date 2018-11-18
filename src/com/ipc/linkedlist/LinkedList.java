package com.ipc.linkedlist;

public class LinkedList {

	public Node head;
	
	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		
		list.append(3);
		list.append(4);
		list.append(5);
		
		list.prePend(2);
		list.prePend(1);
		
		list.append(6);
		
		list.print();
		
		list.delete(1);
		System.out.println("After deletion 1st node");
		list.print();
		
		list.delete(6);
		System.out.println("After deletion last node");
		list.print();
		
		list.delete(4);
		list.delete(3);
		list.delete(50);// Data does not exist
	
		System.out.println("After deletion b/w node");
		list.print();
		
		
		
	}
	
	public void print() {
		
		//printing elements
		Node current = head;
		if(current!=null) {
			while(current.next!=null) {
				System.out.println(current.data);
				current = current.next;
			}
			System.out.println(current.data);
		}
				
	}
	
	
	public void append(int data) {
		
		// Create head
		if(head==null) {
			head = new Node(data);
		}else {
			
			Node current = head;
			
			//To find the last element
			while(current.next!=null) {
				current = current.next;
			}
			
			current.next = new Node(data);
		}		
	}
	
	public void prePend(int data) {
		
		// Create head
		if(head==null) {
			head = new Node(data);
		}else {
			
			Node current = new Node(data);
			
			current.next = head;
			
			head = current;
			
		}
	}
	
	public void delete(int data) {
		
		if(head==null) return;
		
		//if head node to be deleted
		if(head.data == data) {
			
			head = head.next;
			return;
		}
		
		Node current = head;
		
		while(current.next != null ) {
			
			if(current.next.data==data) {
				if(current.next.next !=null) {
					// between first and last
					current.next = current.next.next;
					return;
					
				}else {
					//If the node to be deleted is the last node 
					current.next = null;
					return;
					
				}
			}
			current = current.next;						
		}
		
		
	}

}
