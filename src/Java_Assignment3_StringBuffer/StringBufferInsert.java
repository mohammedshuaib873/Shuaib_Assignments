package Java_Assignment3_StringBuffer;

public class StringBufferInsert
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer("it is used to at the specified index position");
		int index = 13;
	    sb.insert(index, " insert text ");
		System.out.println(sb);
	}	
	
}