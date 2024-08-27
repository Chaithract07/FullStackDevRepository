package com.gentech.Return;
class Square
{
	int[] Sq1to10()
	{
		int[] sq = new int[10];
		for (int i=1; i<=10; i++)
		{
			sq[i-1] = i * i;
		}
		return sq;
	}
}

public class As6Square {

	public static void main(String[] args) {
		Square o=new Square();
		int sq1[]=o.Sq1to10();
		for (int i = 0; i < sq1.length; i++) {
			System.out.print(sq1[i]+" ");
		}
	}
	}


