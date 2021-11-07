package Java_Assignment3_StringBuilder;

public class StringBuilderInsert
{
	public static void main(String[] args) 
	{
		StringBuilder sb = new StringBuilder("it is used to at the specified index position");
		int index = 13;
	    sb.insert(index, " insert text ");
		System.out.println(sb);
	}	
	
}
