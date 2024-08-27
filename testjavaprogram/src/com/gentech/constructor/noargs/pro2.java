package com.gentech.constructor.noargs;


class twoWheeler
{
    String Type;
    String colour;
    twoWheeler()
    {
    Type="bike";
	colour="black";
	System.out.println(Type);
	System.out.println(colour);
	System.out.println("++++++++");
    }
}
class fourwheeler
{
	String Type;
	int cost;
	fourwheeler()
	{
	Type="Car";
	cost=55;
	System.out.println(Type);
	System.out.println(cost);
	System.out.println("++++++++");
	}
}
class heavyWheeler
{
   String model;
   double weight;
   heavyWheeler()
   {
   model="z2334";
	weight=55455;
	System.out.println(model);
	System.out.println(weight);
   }
    
}

public class pro2 {

	public static void main(String[] args) {
		twoWheeler w1=new twoWheeler();
		fourwheeler w2=new fourwheeler();
		heavyWheeler w3=new heavyWheeler();
		
	
		
		
	}

}
