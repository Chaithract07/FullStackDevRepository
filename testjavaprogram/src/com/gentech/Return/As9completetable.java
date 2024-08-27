package com.gentech.Return;
class tables
{
	int mathstable(int x)
	{
	 int res=0;
	 for(int i=1;i<=10;i++)
	 {
		 res=x*i;
		 System.out.println(x+"*"+i+"="+res);
	 }
	 return x;
	}
}

public class As9completetable {

	public static void main(String[] args) {
		tables o=new tables();
		int a=Integer.parseInt(args[0]);
		o.mathstable(a);

	}

}
