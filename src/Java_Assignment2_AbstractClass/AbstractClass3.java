package Java_Assignment2_AbstractClass;

/***Abstract Class Can Be Overridden using Inheritance***/
abstract class AbstractTest3
{
	abstract public void abstractDemoTest3();
}
class AbstractClass extends AbstractTest3
{

	@Override
	public void abstractDemoTest3() {
		// TODO Auto-generated method stub
		System.out.println("Method Overridden");		
	}
	
}
public class AbstractClass3
{
	public static void main(String[] args) 
	{
		AbstractTest3 as = new AbstractClass();
		as.abstractDemoTest3();
	}

}
