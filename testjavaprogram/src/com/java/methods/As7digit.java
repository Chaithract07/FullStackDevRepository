package com.java.methods;

class Count1{
	void Countdig(int num) 
	{
		String cnt=Integer.toString(num);
		int a=cnt.length();
		System.out.println(a);	
	}
}

public class As7digit {

	public static void main(String[] args) {
		Count1 ob = new Count1();
		ob.Countdig(5624452);

		// TODO Auto-generated method stub

	}

}



