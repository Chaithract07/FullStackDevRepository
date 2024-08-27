package com.gentech.Return;
class Fact
{
	int factor(int x)
	{
		int c=1;
	for(int i=1;i<=x;i++)
	{
		 c=c*i;
		
	}
	return c;
}
}

public class A5f {

	public static void main(String[] args) {
		Fact o=new Fact();
		int ab=Integer.parseInt(args[0]);
		
		int b=o.factor(ab);
		System.out.println(b);
		
	
		
	}

}
