package Java_Assignment5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HoldRandomValues {

	public static void main(String[] args) {
		Map<Integer,Double> hm=new HashMap<>();
		hm.put(1,1.00);
		hm.put(2,12.11);
		hm.put(3,454.22);
		hm.put(43,343.33);
		hm.put(54,654.44);
		hm.put(55,322.55);
		hm.put(66,244.66);
		hm.put(54,453.77);
		hm.put(23,133.88);
		hm.put(12,334.99);
	
		Set<Integer> keys=hm.keySet();
		for(int i:keys)
		{
			System.out.println("Key:"+i+":: Values:"+hm.get(i));
		}
	}

}
