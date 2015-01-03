package learnInheritance.parent;

public class Parent 
{
	
	private String privateString = "Variable: private access specifier in Parent Class";
		
	public String getPrivateString()
	{
		return this.privateString;
	}
	@Override
	public String toString()	
	{
		return this.getClass().getName();
	}

}
