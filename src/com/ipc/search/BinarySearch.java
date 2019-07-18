package com.ipc.search;

public class BinarySearch {

	public static int[] values = {1,2,3,4,5,6,7,8};
	
	public static void main(String args[]) {
		
		//BinarySearch search = new BinarySearch(); test
		int key1 = 9;
		//boolean result = search.recursive(search.values, key1, 0, search.values.length-1);
		
		System.out.println("Solution1 : Is the key1 "+key1 + " found "+recursive(values, key1, 0, values.length-1));
		System.out.println("Solution2 : Is the key1 "+key1 + " found "+arrayImpl(values,key1));
	}
	
	public static boolean recursive(int[] array,int search,int left, int right) {
		
		if(left>right) return false;
		
		//To avoid overflow
		int mid = left+ ((right-left)/2);//(left+right)/2;
		
		
		if(array[mid] == search)
			return true;
		
		if(array[mid] < search)
			return recursive(array,search, mid+1,right);
		
		if(array[mid] > search)
			return recursive(array,search,left,mid-1);
		
		return false;
		
	}
	
	public static boolean arrayImpl(int[] array, int search) {
		
		int start =0,end= array.length-1;
		
		
		while(start<=end) {
			
			int mid = start+(end-start)/2;
			
			//found
			if(array[mid] == search)  return true;
			
			//
			if(array[mid]<search) {
				start = mid+1;
			}else {
				end = mid-1;
			}
				
		}
		
		
		
		return false;
		
	}
	
	
	
}
