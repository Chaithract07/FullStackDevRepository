package com.gentech.constructoroverloding;

class Software
{
	Software(String productname,int orderno){
		System.out.println("pname:" + productname );
		System.out.println("oderno:" +  orderno);
	}
	Software(double cost)
	{
		System.out.println("cost:" + cost);
	}
	Software(char version,int code){
		System.out.println("version:"+ version);
		System.out.println("code:" + code);
	}
}

public class co3 {
	public static void main(String[] args)
	{
	     Software s1=new Software("graphics",45);
	     Software s2= new Software(150);
	 	Software s3= new Software('a',4);
	} 

}
