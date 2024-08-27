package com.gentech.constructoroverloding;

class Invoice
{
	Invoice(String cname)
	{
		System.out.println("customer name:"+ cname);
	}
	Invoice(int invoicenumber,double amount)
	{
		System.out.println("invoiceno:" + invoicenumber );
		System.out.println("amount:" + amount);
	}
	Invoice(double quantity)
	{
		System.out.println("quantity: "+ quantity );
	}

}

public class co2 {
	public static void main(String[] args) {
		Invoice o1=new Invoice("rohan");
		Invoice o2=new Invoice(75,260.75);
		Invoice o3=new Invoice(5);
	}
}