package com.gentech.Return;
class ArraySum
{
	
	int SumElem(int[] x)
	{
		
		int sum=0;
		for(int i=0;i<x.length;i++)
		{
			sum+=x[i];
		}
		return sum;
	}
}
public class As2arraySum {

	public static void main(String[] args) 
	{
		ArraySum obj=new ArraySum();
		int a[]= {1,2,3,4,5,6};
		int c=obj.SumElem(a);
		System.out.println(c);
		
	}

}
