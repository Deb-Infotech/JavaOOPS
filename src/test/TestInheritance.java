package test;

import learnInheritance.child.Child;
import learnInheritance.parent.Parent;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TestInheritance extends Parent
{
	@Test
	public void testInheritance1()
	{
		Child child=new Child();
		Assert.assertEquals(child.getPrivateString(), "Variable: private access specifier in Parent Class");	
		
		Parent parent=new Parent();
		/*
		 * Polymorphism does not work for instance variables
		 */
		
		
	}
}

