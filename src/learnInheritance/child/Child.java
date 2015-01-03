package learnInheritance.child;

import learnInheritance.parent.Parent;

public class Child extends Parent
{
	
	private String privateString = "Variable: private access specifier in Child Class";
		
	/*
	@Override
	public String getPrivateString()
	{
		return this.privateString;
	}
	*/
	@Override
	public String toString()	
	{
		return this.getClass().getName();
	}
	
	
	public static void main(String [] str)
	{
		Parent parent=new Parent();	
		Child child=new Child();
	
		System.out.println("parent.getPrivateString() = " + parent.getPrivateString());
		System.out.println("child.getPrivateString() = " + child.getPrivateString());
				
		
	}

}