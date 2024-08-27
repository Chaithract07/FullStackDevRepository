package com.gentech.program;
class Product
{
	int Pid;
	String Pname;

	
}
class Sales
{
	int Sid;
	
	
}
class Order
{
	int Oid;
	String Odate;
	
}

public class poroject4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1=new Product();
		Sales s1=new Sales();
		Order o1=new Order();
		p1.Pid=10;
		p1.Pname="Phone";
		System.out.println(p1.Pid);
		System.out.println(p1.Pname);
		s1.Sid=11;
		//s1.Pname="Phone";
		System.out.println(s1.Sid);
		o1.Oid=10;
		o1.Odate="12-05-2024";
		System.out.println(o1.Oid);
		System.out.println(o1.Odate);
		

	}

}
