package com.ipc.recursion;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author cibbidup
 * fib(n) = fib(n-1) + fib(n-2)
 * base condition fib(0) = 0 , fib(1) = 1
 * 
 * a series of numbers in which each number ( Fibonacci number ) is the sum of the two preceding numbers. The simplest is the series 1, 1, 2, 3, 5, 8, etc.
 * 
 */
public class Fibonacci {

	public static void main(String[] args) {

		Fibonacci fib = new Fibonacci();
		
		Map<Integer,Integer> result = new HashMap<>();
		
		
		System.out.println("calculate Fib recursive");		
		System.out.println("Fib of 5 is :"+fib.calculateFib(5));
		System.out.println("Fib of 7 is : "+fib.calculateFib(7));
		
		System.out.println("##################################");
		System.out.println("calculate Fib with memoization");
		System.out.println("Fib of 5 is "+fib.calculateFibWithMemoization(5,result));
		System.out.println("Fib of 7 is : "+fib.calculateFibWithMemoization(7,result));
		
		System.out.println("##################################");
		System.out.println("calculate Fib with iteration");
		System.out.println("Fib of 5 is : "+fib.calculatFibIteratively(5));
		System.out.println("Fib of 7 is : "+fib.calculatFibIteratively(7));
	}
	
	
	public int calculateFib(int n) {
		
		if(n==0) return 0;
		
		if(n==1) return 1;
		
		return calculateFib(n-1) + calculateFib(n-2);
	}
	
	public int calculateFibWithMemoization(int n,Map<Integer,Integer> result) {
		
		if(n==0) return 0;
		
		if(n==1) return 1;
		
		if(result!=null && result.containsKey(n)) {
			System.out.println("Value from memoization for "+n);
			return result.get(n);
		}
		
		//int output = calculateFib(n-1) + calculateFib(n-2);
		int output = calculateFibWithMemoization(n-1,result) + calculateFibWithMemoization(n-2,result);
		result.put(n, output);
		return output;
	}
	
	public int calculatFibIteratively(int n) {
		
		if(n==0 || n==1) return n;
		
		int fib0= 0;
		int fib1= 1;
		int temp;
		for(int i=2;i<=n;i++) {
			
			temp = fib0+fib1;
			fib0 = fib1;
			fib1=temp;
		}
		
		return fib1;
	}
	
	

}
