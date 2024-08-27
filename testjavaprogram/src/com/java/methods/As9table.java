package com.java.methods;


class Tablesres {
	void Tables(int num) {
		for (int i = 1; i <= 10; i++) {

			System.out.println(num + " * " + i + " = " + (num * i));     
		}
	}
}


public class As9table {

	public static void main(String[] args) {
		Tablesres ob = new Tablesres();
		ob.Tables(15);
		// TODO Auto-generated method stub

	}

}
