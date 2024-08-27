package com.gentech.encapsulation;
//WAP a nested class in which inner class is private ,and  execute outer and inner class members
class Outerclass
{
	String firstName;
	Inner inner=new Inner();
	void showAge()
	{
		inner.age=22;
		System.out.println("Age:"+inner.age);
	}

	private class Inner //private class

	{
		private int age;
		

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
	}
	void showFN()
	{
		firstName="Santosh";
		System.out.println("FirstName:"+firstName);
	}
}
public class InnerPrivate {
	public static void main(String[] args) {
		Outerclass outer=new Outerclass();
		outer.showFN();
		outer.showAge();
	}
}


