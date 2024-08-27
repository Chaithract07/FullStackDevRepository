package com.string;

public class StringPrgm3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s="Good Morning";
		
	     StringBuffer s1=new StringBuffer("Good Morning");
	     System.out.println("Old String: "+s1);
	     s1.delete(5, 12);
	    
	    s1.insert(5, "Evening");
	    System.out.println("New String: "+s1);

	}

}
