package com.java.methods;
class classmath
{
	void addition()
	{
		int x=10,y=2;
		int res=x+y;
		System.out.println("addition result:"+res);
				
	}
	void multiplication()
	{
		int x=9,y=6;
		int res=x*y;
		System.out.println("addition result:"+res);
	}
}

public class maindemo1 {

	public static void main(String[] args) {
		classmath m1=new classmath();
		m1.addition();

	}

}
