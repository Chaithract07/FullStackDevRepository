package com.gentech.Return;
class Diagonal
{
	short[][] Diaelem(short[][]  x)
	{
		
		        int size = Math.min(x.length, x[0].length);
		       
		        for (int i = 0; i < size; i++) {
		           System.out.println(x[i][i]+" ");  
		          
		        }

		        return  x;
		    
		
	}
}

public class As10diagonal {

	public static void main(String[] args) {
		Diagonal o=new Diagonal();
		short c[][]= {{1,2,3},{2,6,8},{4,7,5}};
		o.Diaelem(c);
		System.out.println();
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{

			System.out.print(c[i][j]+" "); 
			}
			System.out.println();
		}

	}

}
