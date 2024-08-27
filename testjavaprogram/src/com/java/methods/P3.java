package com.java.methods;
class Array
{
	void revers(String s[])
	{
	
		for(int i=s.length-1;i>=0;i++)
		{
			System.out.println(s[i]);
		}
		
	}
}

public class P3 {

	public static void main(String[] args) {
		Array a1=new Array();
		String a[]={"mango","banana","apple"};
		a1.revers(a);

	}

}
