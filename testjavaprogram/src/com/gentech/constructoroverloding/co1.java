package com.gentech.constructoroverloding;
class userprofile
{
   userprofile(String username)
   {
	   System.out.println(""+username);
   }
   userprofile(int password)
   {
	   System.out.println(""+password);
	   
   }
   userprofile(double sal )
   {
	   System.out.println(""+sal);
	   
   }
}

public class co1 {

	public static void main(String[] args) {
		userprofile o1=new userprofile("chaithra07");
		userprofile o2=new userprofile("87654");
	}

}
