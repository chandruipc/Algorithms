package com.ipc.search;

public class BinarySearch {

	int[] values = {1,2,3,4,5,6,7,8};
	
	public static void main(String args[]) {
		
		BinarySearch search = new BinarySearch();
		int key1 = 8;
		boolean result = search.recursive(search.values, key1, 0, search.values.length-1);
		
		System.out.println("Is the key1 "+key1 + " found "+result);
	}
	
	public boolean recursive(int[] array,int search,int left, int right) {
		
		if(left>right) return false;
		
		int mid = left+ ((right-left)/2);//(left+right)/2;
		
		
		if(array[mid] == search)
			return true;
		
		if(array[mid] < search)
			return recursive(array,search, mid+1,right);
		
		if(array[mid] > search)
			return recursive(array,search,left,mid-1);
		
		return false;
		
	}
}
