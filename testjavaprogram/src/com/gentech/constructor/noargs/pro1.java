package com.gentech.constructor.noargs;


class Employee
{
	int Empid;
	String Name;
	Employee()
	{
		Empid=22;
		Name ="suma";
		System.out.println(" "+Empid);
		System.out.println(" "+Name);
		System.out.println("++++++++++");
	}
}
class department
{
	int Did;
	String name;
	department()
	{
	Did=28;
	name ="Development";
	System.out.println(" "+Did);
	System.out.println(" "+name);
	System.out.println("++++++++++++++++");
	}
}
class isurance
{
	String type;
	int id;
	isurance()
	{
	id=34;
	type ="Life insurance";
	System.out.println(" "+id);
	System.out.println(" "+type);
	System.out.println("+++++++++");
	}
}

public class pro1 {
	

	public static void main(String[] args) {
		Employee E1=new Employee();
		department Dept=new department();
		isurance i1=new  isurance();
		
		
		
	}

}
