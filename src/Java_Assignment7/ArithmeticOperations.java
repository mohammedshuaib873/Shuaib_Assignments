package Java_Assignment7;

@FunctionalInterface
interface Addition
{
	int add(int a,int b);
}
interface Subtract
{
	int sub(int a,int b);
}
interface Multiply
{
	int mul(int a,int b);
}
interface Divide
{
	int div(int a,int b);
}
public class ArithmeticOperations 
{
	public static void main(String[] args)
	{
		System.out.println("Addition:");
		Addition Add=(a,b)->(a+b);
		System.out.println(Add.add(100,50));
		System.out.println("-----------------");
		System.out.println("Subtraction:");
		Subtract Sub=(a,b)->(a-b);
		System.out.println(Sub.sub(100,50));
		System.out.println("-----------------");
		System.out.println("Multiplication:");
		Multiply Mul=(a,b)->(a*b);
		System.out.println(Mul.mul(100, 50));
		System.out.println("-----------------");
		System.out.println("Division:");
		Divide Div=(a,b)->(a/b);
		System.out.println(Div.div(100,50));
	}
	
}