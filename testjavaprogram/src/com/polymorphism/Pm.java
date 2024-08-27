package com.polymorphism;
abstract class Paymentmethod
{
	abstract void payment();
	
}
class Checque extends Paymentmethod
{
	void payment()
	{
		System.out.println("the payment method by checque");
	}
}
class Banktobank extends Paymentmethod
{
	void payment()
	{
		System.out.println("the payment method is Banktobank");
	}
}
class Qrcode extends Paymentmethod
{
	void payment()
	{
		System.out.println("the payment method is Qrcode");
	}
}

public class Pm {

	public static void main(String[] args) {
		Paymentmethod mode=null;
		Checque c1=new Checque();
		Banktobank b1=new Banktobank();
		Qrcode q1=new Qrcode();
		
		mode=c1;
		mode.payment();
		
		mode=b1;
		mode.payment();
		
		mode=q1;
		mode.payment();	
	}

}

