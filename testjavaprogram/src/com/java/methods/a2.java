package com.java.methods;
class Count
{
	void divisible(int n )
	{
		int i,count=0;
		for(i=50;i<=150;i++)
		{
			if(i%n==0)
			{
				count=count+1;
			}
		}
		System.out.println("count is:"+count);
	}
	
}

public class a2 {

	public static void main(String[] args) {
		
		Count c=new Count();
		c.divisible(6);
	}

}
