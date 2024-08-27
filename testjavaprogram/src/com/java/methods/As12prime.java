package com.java.methods;
class Primeno{
    void Prime(int st, int stp) {
        for (int i = st; i <= stp; i++) {
            if (i <= 1) continue;
            
            boolean isPrime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            if (isPrime) {
                System.out.println(i );
            }
        }
    }
}



public class As12prime {

	public static void main(String[] args) {
		 Primeno ob = new Primeno();
	        ob.Prime(50, 150);

	}

}


