package com.java.methods;


class Tables1to20 {
    void Tbl(int st, int stop) {
        for (int i = st; i <= stop; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}


       
public class As51t020 {

	public static void main(String[] args) {
		int st = 1;
        int stop = 20;
        Tables1to20 ob = new Tables1to20();
        ob.Tbl(st, stop);
		// TODO Auto-generated method stub

	}

}
