package com.gentech.Return;
class array1d
{
	int[] Firsthalf(int a[])
	{
		int arr[]=new int[a.length/2];
		for(int i=0;i<a.length/2;i++)
		{
			arr[i]=a[i];
			
		}
		return arr;
	}
}

public class As1array1dfirsthalf {

	public static void main(String[] args) {
		array1d obj=new array1d();
		int c[]= {1,2,3,4,5,6,7,8};
		int d[]=obj.Firsthalf(c);
		for(int kk:d)
		 {
			 System.out.println(kk);
		 }

	}

}
