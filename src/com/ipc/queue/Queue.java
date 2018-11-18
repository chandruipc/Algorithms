package com.ipc.queue;

import com.ipc.linkedlist.Node;

public class Queue {

	
	Node head;
	Node tail;
	
	
	public static void main(String args[]) {
		
		Queue que = new Queue();
		que.add(1);
		que.add(2);
		que.add(3);
		que.add(4);
		que.add(5);
		
		que.print();
		
		System.out.println("Remove element");
		
		que.remove();
		que.remove();
		que.print();
	}
	
	public void print() {
		
		//printing elements
		Node current = head;
		if(current!=null) {
			while(current.next!=null) {
				System.out.println(current.getData());
				current = current.next;
			}
			System.out.println(current.getData());
		}
				
	}
	// add
	// remove
	// peek
	// empty
	public void add(int data) {
		
		Node d = new Node(data);
		
		if(tail!=null) {
			tail.next = d;
		}
		
		tail = d;
		
		if(head==null) {
			head = d;			
		}
		
		
	}
	
	public int remove() {
		
		if(head==null) return -1;
		
		int result = head.getData();
		
		head = head.next;
		if(head==null) {
			tail = null;
		}
		return result;
		
		
	}
	
}
