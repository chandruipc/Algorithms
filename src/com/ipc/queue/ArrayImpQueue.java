package com.ipc.queue;

/**
 * Circular array queue implementation
 * @author cibbidup
 *
 */
public class ArrayImpQueue {

	
	
	// Array 
	int num = 10;
	int[] a = new int[num];
	public int front=-1;
	public int end=-1;
	
	public static void main(String[] args) {
	
		ArrayImpQueue queue = new ArrayImpQueue();
		
		queue.enQueue(1);
		queue.enQueue(2);
		queue.enQueue(3);
		queue.enQueue(4);
		queue.enQueue(5);
		
		queue.deQueue();// remove 1
		
		queue.enQueue(6);
		queue.enQueue(7);
		queue.enQueue(8);
		queue.enQueue(9);
		queue.enQueue(10);
		queue.enQueue(11);	
		
		queue.deQueue(); // remove 2
		queue.enQueue(12);
		
		queue.deQueue(); // remove 3
		queue.enQueue(13);
		queue.deQueue(); // remove 4
		queue.deQueue(); // remove 4
		queue.deQueue(); // remove 4
		queue.deQueue(); // remove 4
		queue.deQueue(); // remove 4
		queue.deQueue(); // remove 4
		queue.deQueue(); // remove 4
		queue.deQueue(); // remove 4
		queue.deQueue(); // remove 4
		queue.deQueue(); // remove 4
		queue.deQueue(); // remove 4
		
		System.out.println("Front : "+queue.front+" end : "+queue.end);
		
		queue.print();
		
		

	}
	
	public void print() {
		
		for(int e : a) {
			System.out.println(e);
		}
	}
	
	// Enqueue . Adding an element to end
	public void enQueue(int data) {
		
		if(isEmpty()) {
			front = front +1;
			a[front] = data;
			end = front;
		}else {
			int temp = (end+1)%num; 
			
			if(temp!=front) {
				a[temp] = data;
			}else {
				System.err.println("Array is full . no place for "+data);
				return;
			}
			
			end = temp;
			
		}		
	}
	
	// Dequeue. Removing element from front
	public int deQueue() {
		
		if(isEmpty()) {
			System.err.println(" No more data for deQueue");
			return -1;
		}
		
		if(front == end) {
			a[front] = 0;
			front = -1;
			end = -1;
			
			return -1;
		}
		
		int result = a[front];
		a[front] = 0;//Setting to empty;
		
		front = (front+1)%num;
		return result;
		
	}
	
	public boolean isEmpty() {
		if(front==-1 && end==-1) return true;
		
		//if(front == end) return true;
		
		return false;
	}

}
