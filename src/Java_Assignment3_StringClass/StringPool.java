package Java_Assignment3_StringClass;

public class StringPool 
{
	public static void main(String[] args) 
	{
		String str1 = "Java String pool refers to collection of Strings which are stored in heap memory";
		String str2 = "java string pool refers to collection of strings which are stored in heap memory";
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		System.out.println(str1.replace('a', '$'));
		System.out.println(str1.equals(str2));
		System.out.println(str1.compareTo(str2));
	}
}
