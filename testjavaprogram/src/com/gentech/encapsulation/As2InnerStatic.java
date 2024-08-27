package com.gentech.encapsulation;
class Outer
{
	int age;
	Inner obj=new Inner();
	
	void showName()
	{
		obj.name="santhosh";
		System.out.println("Name:"+obj.name);
		
	}
	static class Inner
	{
		String name;
		
		
	}
	void showAge()
	{
		age=17;
		System.out.println("age:"+age);
	}
}

public class As2InnerStatic {

	public static void main(String[] args) {
		Outer o=new Outer();
	o.showAge();
	o.showName();
		

	}

}
