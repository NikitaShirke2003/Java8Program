package com.csi.jdkfeatures;

interface Product
{
	void get();
}

public class MethodReferenceEx {
	
	static void set()
	{
	 System.out.println("Hello !!! ");	
	}
	
	public static void main(String[] args) {
		
		Product product = MethodReferenceEx :: set;
		product.get();
		
	}

}
