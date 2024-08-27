package com.gentech.encapsulation;
//outer contain 2 inner private class ,execute members of all class
class outer1

{
	int age;
	Inner1 i1=new Inner1();
	Inner2 i2=new Inner2();
	void showFname()
	{
		i1.fn="Chaithra";
		System.out.println("First Name:"+i1.fn);
		
	}
	void showLn()
	{
		i2.ln="C.T";
		System.out.println("Last Name:"+i2.ln);
		
	}
	private class Inner1
	{
		String fn;

		public String getFn() {
			return fn;
		}

		public void setFn(String fn) {
			this.fn = fn;
		}

		
		
		
	}
	private class Inner2
	{
		String ln;

		public String getLn() {
			return ln;
		}

		public void setLn(String ln) {
			this.ln = ln;
		}
		
		
	}
	void showAge()
	{
		age=22;
		System.out.println("age:"+age);
	}
	
}
public class Twoinner {

	public static void main(String[] args) {
		outer1 o=new outer1();
		o.showAge();
        o.showFname();
        o.showLn();
        
	}

}

