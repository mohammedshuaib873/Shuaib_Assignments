package Java_Assignment6;

import java.util.HashSet;

public class Collection2 {
	   public static void main(String args[]) {
	      /**HashSet declaration**/
	      HashSet<String> hset = 
	               new HashSet<String>();

	      /**Adding elements to the HashSet**/
	      hset.add("Apple");
	      hset.add("Mango");
	      hset.add("Grapes");
	      hset.add("Orange");
	      hset.add("Fig");
	      hset.add("DragonFruit");
	      hset.add("JackFruit");
	      hset.add("Banana");
	      hset.add("PineApple");
	      hset.add("Guava");
	      /**Addition of duplicate elements**/
	      hset.add("Apple");
	      hset.add("Mango");
	      /**Displaying HashSet elements**/
	      System.out.println(hset);
	    }
	}
