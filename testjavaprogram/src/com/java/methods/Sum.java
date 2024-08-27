package com.java.methods;
class Sum1
{
	void Sumofno()
	{
		int sum=0;
		for(int i=1;i<=50;i++)
		{
			sum=sum+i;
			System.out.println("sum is:"+sum);
			
		}
		System.out.println("sum is:"+sum);
	}
}

public class Sum {

	public static void main(String[] args) {
		Sum1 s1=new Sum1();
		s1.Sumofno();
		

	}

}
