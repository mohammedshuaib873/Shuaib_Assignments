import java.lang.Math;
import java.io.*;

public class CountArmstrong {
	public static void main(String[] args) {
		int d=isArmStrong();
		System.out.println("the total armstong number  is " + d );
	}

	static int isArmStrong() {
		
		int z=0;
		for(int i=100;i<1000;i++) {
		int t = i, dc = countDig(i);
		double sum = 0;
		do {
			int r = i % 10;
			sum = sum + Math.pow(r, dc);
			i = i / 10;
		} while (i != 0);
		if (t == sum)
			z=z+1;
		}
		return z;
	}
	static int countDig(int c) {
		int count = 0;
		do {
			count++;
			c = c / 10;
		} while (c != 0);
		return count;
	}

}