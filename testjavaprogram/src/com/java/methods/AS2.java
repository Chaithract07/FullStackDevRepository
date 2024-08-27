package com.java.methods;

class ArrayBool1D
{
	void Boolreverse(boolean b[])
	{
				
			for(int i=b.length-1;i>=0;i--)
			{
				System.out.println(b[i]);
			}
			
		}

}

		
		

	

public class AS2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayBool1D a1=new ArrayBool1D();
		boolean c[]={true,false,false,true,false};
		a1.Boolreverse(c);

	}

}
