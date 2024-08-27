package com.polymorphism;
abstract class opration
{
	abstract void plus();
}
class addtion1 extends opration
{
	void plus()
	{
		int a=10;
		int b=10;
		int c=a+b;
		System.out.println("addtion of two member:"+c);
	}
}
class concatinate  extends opration
{
	void plus()
	{
		String fname="Chaithra";
		String lname="C T";
		System.out.println( "full name is:"+fname+lname);
	}
}


public class Pm4 {
	public static void main(String arg[])
	{
		opration opt=null;
		addtion1 add=new addtion1();
		concatinate concat=new concatinate();
		opt=add;
		opt.plus();
		opt=concat;
		opt.plus();
		
	}
}

