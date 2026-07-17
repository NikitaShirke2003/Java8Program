package com.csi.jdk8features;

public class LambdaExpressionEx {
	
interface Customer{
		
	void get( int n1,int n2);
	}
	
	public static void main(String[] args) {
		
		Customer customer = (n1,n2)->
		{
			System.out.println("\n Result:"+(n1+n2));
		};
		customer.get(10,20);
	}

}
