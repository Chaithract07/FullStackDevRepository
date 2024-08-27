package com.polymorphism;
abstract class LgOp
{
	abstract void LogicalOperators();
	
}
class GreaterThan extends LgOp
{
	void LogicalOperators()
	{
      int x=4,y=2;
      if(x>y)
      {
    	  System.out.println(x+"is greater than"+y);
      }
	}
	
}
class LessThan extends LgOp
{
	void LogicalOperators()
	{
      int x=4,y=2;
      if(x<y)
      {
    	  System.out.println(x+"is Lesser than"+y);
      }
	}
	
}

public class Pm2 {

	public static void main(String[] args) {
		LgOp lg=null;
        
		GreaterThan gt=new GreaterThan();
		LessThan lt=new LessThan();
		
       lg=gt;
       lg.LogicalOperators();
       lg=lt;
       lg.LogicalOperators();
        
        
		
	}

}
