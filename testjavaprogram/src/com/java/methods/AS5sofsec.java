package com.java.methods;

class Array2d1 {
	void SumofSec(double a[][])
	{
		double sum=0;
		 for (int i = 1; i <a.length; i++) {
	            for (int j = 0; j <a[1].length; j++) {
	            	
	            	sum=sum+a[i][j];
	            }
	            System.out.println("Sum is :"+sum); 
	           
	        }
		
		
	}
}


public class AS5sofsec {

	public static void main(String[] args) {
		Array2d1 obj =new Array2d1();
		double a[][]= {{11,22,33},{21,31,41}};
		obj.SumofSec(a);


	}

}
