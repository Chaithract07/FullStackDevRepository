package com.gentech.program;
class twoWheeler
{
    String Type;
    String colour;
}
class fourwheeler
{
	String Type;
	int cost;
}
class heavyWheeler
{
   String model;
   double weight;
    
}

public class project2 {

	public static void main(String[] args) {
		twoWheeler w1=new twoWheeler();
		fourwheeler w2=new fourwheeler();
		heavyWheeler w3=new heavyWheeler();
		w1.Type="bike";
		w1.colour="black";
		System.out.println(w1.Type);
		System.out.println(w1.colour);
		System.out.println("++++++++");
		w2.Type="Car";
		w2.cost=55;
		System.out.println(w2.Type);
		System.out.println(w2.cost);
		System.out.println("++++++++");
		w3.model="z2334";
		w3.weight=55455;
		System.out.println(w3.model);
		System.out.println(w3.weight);
		
	}

}
