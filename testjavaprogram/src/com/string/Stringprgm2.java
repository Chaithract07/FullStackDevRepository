package com.string;

public class Stringprgm2 {

	public static void main(String[] args) {
		StringReverse();
     
	}
	static void StringReverse()
	{
	   String s="welcome";
	   char c[]=s.toCharArray();
	   for(int i=c.length-1;i>=0;i--)
	   {
		   System.out.println(c[i]);
	   }
	   
			   
	}

}
