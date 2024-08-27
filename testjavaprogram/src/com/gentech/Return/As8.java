package com.gentech.Return;
class Tab7 {
	int[] ReverseTab() {
		int res[] = new int[10];
		for (int i = 10; i>=1; i--) {
			res[10-i] = 7 * i;
		}
		return res;
	}
}
public class As8 {
	public static void main(String[] args) {
		Tab7 t = new Tab7();
		int c[] = t.ReverseTab();
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i] + " ");
		}

	}

}


