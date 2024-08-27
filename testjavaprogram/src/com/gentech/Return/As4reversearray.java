package com.gentech.Return;
class doublearray
{
	double[] reverse(double z[])
	{
		double cc[]=new double[z.length];
		int k=0;
		for(int i=z.length-1;i>=0;i--)
		{
			cc[k]=z[i];
			k=k+1;
		}
		return cc;
	}
}
public class As4reversearray {

	public static void main(String[] args) {
		doublearray obj=new doublearray();
		double a[]= {2.2,3.3,5.5,6.6,7.7,8.8};
		double c[]=obj.reverse(a);
		for(double kk:c)
		 {
			 System.out.println(kk);
		 }
	}

}
