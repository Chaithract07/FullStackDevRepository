package com.gentech.constructor.noargs;


class Country
{
	String name;
	int stateno;
	
}
class state
{
	String name;
	int noofdist;
	
	
}
class district
{
	String name;
	int code;
	
	
}

public class pro3 {

	public static void main(String[] args) {
		Country p1=new Country();
		 state s1=new  state();
		district o1=new district();
		p1.name="india";
		p1.stateno=29;
		System.out.println(p1.name);
		System.out.println(p1.stateno);
		s1.name="karnataka";
		s1.noofdist=31;
		System.out.println(s1.name);
		System.out.println(s1.noofdist);
		System.out.println("+++++++++++");
		o1.name="mandya";
		o1.code=23453;
		System.out.println(o1.name);
		System.out.println(o1.code);
		
	}

}

