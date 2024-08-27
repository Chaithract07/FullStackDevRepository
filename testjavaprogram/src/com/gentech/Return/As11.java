package com.gentech.Return;
class StringConcat {

   String[] concatenateString(String s[])
   {
	   String res[]=new String[s.length];
       for(int i=0;i<s.length;i++)
       {
    	   res[i]+=s[i];
       }
      
       return res;
    }
}
    


public class As11 {

	public static void main(String[] args) {
		StringConcat o=new StringConcat();
		String a[]= {"welcome ","to ","java "};
		 o.concatenateString(a);
		 for(String kk:a)
		 {
			 System.out.print(kk);
		 }
		 

	}

}
