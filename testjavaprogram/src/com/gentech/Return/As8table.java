package com.gentech.Return;
class Table7
{
	int[] reversetable()
	{
		int res[] = new int[10];
		for (int i = 10; i>=1; i--) {
			res[10-i] = 7 * i;
		}
		return res;
	}
}

public class As8table {

	public static void main(String[] args) {
		Table7 o=new Table7();
		int a[]=o.reversetable();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
	}

}
