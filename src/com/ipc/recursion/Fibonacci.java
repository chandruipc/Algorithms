package com.ipc.recursion;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author cibbidup
 * fib(n) = fib(n-1) + fib(n-2)
 * base condition fib(0) = 0 , fib(1) = 1
 * 
 */
public class Fibonacci {

	public static void main(String[] args) {

		Fibonacci fib = new Fibonacci();
		
		Map<Integer,Integer> result = new HashMap<>();
		
		
		System.out.println("calculate Fib");
		System.out.println("Fib of 0 "+fib.calculateFib(0));
		System.out.println("Fib of 1 "+fib.calculateFib(1));
		System.out.println("Fib of 3 "+fib.calculateFib(3));
		System.out.println("Fib of 5 "+fib.calculateFib(5));
		System.out.println("Fib of 7 "+fib.calculateFib(7));
		
		System.out.println("calculate Fib with memoization");
		System.out.println("Fib of 0 "+fib.calculateFibWithMemoization(0,result));
		System.out.println("Fib of 1 "+fib.calculateFibWithMemoization(1,result));
		System.out.println("Fib of 3 "+fib.calculateFibWithMemoization(3,result));
		System.out.println("Fib of 5 "+fib.calculateFibWithMemoization(5,result));
		System.out.println("Fib of 7 "+fib.calculateFibWithMemoization(7,result));
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
			return result.get(n);
		}
		
		int output = calculateFib(n-1) + calculateFib(n-2);
		result.put(n, output);
		return output;
	}

}
