package com.java.methods;
class TransposeMatrix1
{
    void transpose(int d[][])
    {
        
        

        // Transpose the matrix 
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 3; j++) {
                int temp = d[i][j];
                d[i][j] =d[j][i];
                d[j][i] = temp;
            }
        }

        
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(d[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class AS4transpose {

	public static void main(String[] args) {
		TransposeMatrix1 dd=new TransposeMatrix1();
		int m[][] = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };
		dd.transpose(m);
	

	}

}
