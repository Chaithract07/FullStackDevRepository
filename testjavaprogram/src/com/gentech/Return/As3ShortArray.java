package com.gentech.Return;
class ShortArray
{
    short[] S1dArray(short[] a)
	{
    	short cc[]=new short[a.length];
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			cc[k]=a[i];
			k=k+1;
			
		}
		return cc;
	}
}

public class As3ShortArray {

	public static void main(String[] args) {
		ShortArray obj=new ShortArray();
		short c[]= {1,2,3,4,5,6,7,8};
		short d[]=obj.S1dArray(c);
		System.out.println();
		
	//2nd half
		for(int i=d.length/2;i<d.length;i++)
		{
			System.out.println(+d[i]);
		}

	}

}
