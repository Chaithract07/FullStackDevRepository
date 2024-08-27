package com.gentech.program;
class Employee
{
	int Empid;
	String Name;
}
class department
{
	int Did;
	String name;
}
class isurance
{
	String type;
	int id;
}

public class Project1 {
	

	public static void main(String[] args) {
		Employee E1=new Employee();
		E1.Empid=22;
		E1.Name ="suma";
		System.out.println(" "+E1.Empid);
		System.out.println(" "+E1.Name);
		department Dept=new department();
		Dept.Did=28;
		Dept.name ="Development";
		System.out.println(" "+Dept.Did);
		System.out.println(" "+Dept.name);
		 isurance i1=new  isurance();
		i1.id=34;
		i1.type ="Life insurance";
		System.out.println(" "+i1.id);
		System.out.println(" "+i1.type);
		
		
		
	}

}
