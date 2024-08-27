package com.java.methods;
class math2
{
	void addition(int x,int y)
	{
		int res=x+y;
		System.out.println(+res);
	}
	void multiplication(int x,int y)
	{
		int res=x*y;
		System.out.println(+res);
	}
}

public class maindemo2 {

	public static void main(String[] args) {
		math2 m2=new math2();
		m2.addition(12, 12);
		m2.multiplication(2, 65);
		m2.addition(2, 220);
		
	}

}
