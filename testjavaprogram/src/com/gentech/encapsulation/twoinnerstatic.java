package com.gentech.encapsulation;

//two static inner class 
class Outer2
{
  String name;
  void showMarks1()
  {
      Inner1a inner1a=new Inner1a();
      inner1a.marks1=45;
      System.out.println("Marks1 = "+inner1a.marks1);
  }
  void showMarks2()
  {
      Inner1b inner1b=new Inner1b();
      inner1b.marks2=48;
      System.out.println("Marks2 = "+inner1b.marks2);
  }

  static class Inner1a
  {
      int marks1;
  }
  static class Inner1b
  {
      int marks2;
  }
  void showName()
  {
      name="Aishwarya";
      System.out.println("name:"+name);
  }
}
public class twoinnerstatic {
  public static void main(String[] args) {
      Outer2 o=new Outer2();
      o.showName();
      o.showMarks1();
      o.showMarks2();
  }

}



