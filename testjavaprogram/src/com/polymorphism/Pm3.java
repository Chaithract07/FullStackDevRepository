package com.polymorphism;

abstract class arithmetic
{
	 abstract void arthematicOperations();
}
class addtion extends arithmetic
{
	void arthematicOperations()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("addtion of two number:"+c);
		
	}
}
class substraction extends arithmetic
{
	void arthematicOperations()

{ 
		int a=55;
		int b=20;
		int c=a-b;
		System.out.println("substraction of two number:"+c);
		
}
}
class multiplication extends arithmetic
{
	void arthematicOperations()

{ 
		int a=10;
		int b=20;
		int c=a*b;
		System.out.println("multiplication of two number:"+c);
		
}
}
class division extends arithmetic
{
	void arthematicOperations()

{ 
		int a=220;
		int b=20;
		int c=a/b;
		System.out.println("division of two number:"+c);
		
}
}
public class Pm3 {
	public static void main(String arg[])
	{
		arithmetic  ar=null;
		addtion  add=new addtion();
		substraction sub=new substraction();
		multiplication mul=new multiplication();
		division div=new division();
		ar=add;
		ar.arthematicOperations();
		
		ar=sub;
		ar.arthematicOperations();
		
		ar=mul;
		ar.arthematicOperations();
		
		ar=div;
		ar.arthematicOperations();
		
	}
}

