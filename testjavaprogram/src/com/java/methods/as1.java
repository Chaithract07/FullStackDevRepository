package com.java.methods;


class Array1D
{
	void Sum(int elem[])
	{
	    int sum=0;
		for(int i=0;i<elem.length;i++)
		{
			sum=sum+elem[i];
		}
		System.out.println("sum:"+sum);
	}
}

public class as1 {

	public static void main(String[] args) {
		Array1D a1=new Array1D();
		int a[]={1,2,3,4,5,6};
		a1.Sum(a);

		

	}

}
