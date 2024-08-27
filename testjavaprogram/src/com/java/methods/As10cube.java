package com.java.methods;
class Cube{
	void Cubeelem(int a[]) {
		for(int i=0;i<a.length;i++) {
			int res=a[i];
			int cube1=res*res*res;
			
			System.out.println(cube1);
			
		}
		
	}
}


public class As10cube {

	public static void main(String[] args) {
		Cube ob =new Cube();
		int a[]= {1,2,3,4};
		ob.Cubeelem(a);

	}

}
