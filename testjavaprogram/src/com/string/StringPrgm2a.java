package com.string;

public class StringPrgm2a {

	public static void main(String[] args) {
		reverseString();

	}
	static void reverseString()
	{
		String s="Good Evening";
		String reverse="";
		for(int i=s.length()-1;i>=0;i--)
		{
			reverse+=s.charAt(i);
		}
		System.out.println(reverse);
	}

}
