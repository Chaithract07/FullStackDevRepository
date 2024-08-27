package com.string;

public class StringPrgm6 {

	public static void main(String[] args) {
		String s="madam";
		StringBuffer s1=new StringBuffer(s);
		
		String s2=s1.reverse().toString();
		System.out.println(s2);
		if(s.equals(s2))//System.out.println(myStr1.equals(myStr2));
		{
			System.out.println(s+" is Palindrome");
			
		}
		else
		{
			System.out.println(s+" is not Palindrome");

		}

	}

}
