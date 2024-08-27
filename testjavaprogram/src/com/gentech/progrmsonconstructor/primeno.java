package com.gentech.progrmsonconstructor;
class IsPrime
{
	IsPrime(int num)
	{
		int flag=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag+=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println(num+"is prime");
		}
		else
		{
			System.out.println(num+"is not prime");
		}
	}
}
public class primeno {

	public static void main(String[] args) {
		IsPrime o1=new IsPrime(22);
		IsPrime o2=new IsPrime(23);
	

	}

}
