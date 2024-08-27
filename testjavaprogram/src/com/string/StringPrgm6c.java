package com.string;


public class StringPrgm6c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s="programing";
       
       for(int i=0;i<s.length();i++)
       {
    	   for(int j=0;j<=i;j++)
    	   {
    	  
    	   System.out.print(s.charAt(j)+" ");
    	   }
    	   System.out.println();
       }
       for(int i=s.length()-2;i>=0;i--)
       {
    	   for(int j=0;j<=i;j++)
    	   {
    	  
    	   System.out.print(s.charAt(j)+" ");
    	   }
    	   System.out.println();
       }
	}

}

