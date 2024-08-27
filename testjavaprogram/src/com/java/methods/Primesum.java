package com.java.methods;
class PrimeASum2{
    void Sum(int a, int b) {
    	int sum=0,i=0;
    	int flag=0;
        for ( i = a; i <= b; i++) 
        {
            
            for (int j = 2; j <= i / 2; j++)
            {
                if (i % j == 0) {//2%2=0,10%2=0,10%5=0
                    flag=flag+1;
                    break;
                }
                
            }
            
            sum=sum+i;
        }
        
        
             
        
        System.out.println(sum);
    }
}


public class Primesum {

	public static void main(String[] args) {
		PrimeASum2 obj=new PrimeASum2();
		obj.Sum(1, 100);

	}

}
