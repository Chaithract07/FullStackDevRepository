package com.gentech.constructor.parameterized;

class twowheels
{
String TName;
int Tid;
twowheels(String tname,int tid)
{
	TName=tname;
	Tid=tid;
	
	
	System.out.println("twowheel:"+TName);
}
}
class Fourwheels
{
	String Fname;
	int Fid;
	Fourwheels(String fname,int fid)
	{
		Fname=fname;
		Fid=fid;
	
		System.out.println("fourwheel:"+Fname);
		
	}
}


public class p2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		twowheels t1=new twowheels( "biycel",11);
		twowheels t2=new twowheels( "car",12);
		
		Fourwheels f1=new Fourwheels("van",20);
		Fourwheels f2=new Fourwheels("bus",21);
		
		

	}

}