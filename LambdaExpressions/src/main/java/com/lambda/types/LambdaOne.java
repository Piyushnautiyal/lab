package com.lambda.types;


public class LambdaOne {

	public static void main(String[] args) {
		NumberPrime even = (n) -> (n%2)==0;
		NumberPrime odd = (n) -> (n%2)!=0;
		System.out.println(even.isPrime(11));
	}
}

interface NumberPrime
{
	public boolean isPrime(int n);
}