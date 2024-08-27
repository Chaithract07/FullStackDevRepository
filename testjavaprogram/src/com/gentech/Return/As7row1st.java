package com.gentech.Return;
class FirstRow
{
	int[] getFirst(int a[][])
	{
		int res[]=new int[a[0].length];
		for (int j=0; j<a[0].length; j++) {
			res[j] = a[0][j];
		}
		return res;
	}
}

public class As7row1st {
	public static void main(String[] args) {

		FirstRow f = new FirstRow();
		int a[][] = {{1, 2}, {3, 4}};
		int c[] = f.getFirst(a);
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
	}

}

