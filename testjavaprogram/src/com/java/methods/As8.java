package com.java.methods;
class Sumofdig
{
	int sum=0;
	void Sum(int s)
	{
		int sum=0;
		String ab=Integer.toString(s);
		for(int i = 0;i<ab.length();i++) {
			int a=ab.charAt(i);
			sum=sum+a;
		}
			System.out.println("Sum of Digits"+sum);
			
	}

}

public class As8 {

	public static void main(String[] args) {
		Sumofdig ob =new Sumofdig();
		ob.Sum(23345);
	}


}
