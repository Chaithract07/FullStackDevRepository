package com.java.methods;
class PrimeASum1{
    void checkPrime(int a, int b) {
    	int sum=0;
        for (int i = a; i <= b; i++) 
        {
            if (i <= 1) 
            continue;
            
            boolean isPrime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            if (isPrime) {
            
                sum=sum+i;
            }
            
        }
        System.out.println(sum);
    }
}


public class As13sumPrime {

	public static void main(String[] args) {
		PrimeASum1 ob = new PrimeASum1();
        ob.checkPrime(1,100);
		// TODO Auto-generated method stub

	}

}
