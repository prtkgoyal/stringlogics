package Array;

import java.util.Arrays;

public class B {

	public static void main(String[] args) {
		int[]a= {97,100,96,98,100,98,96};
	
		Arrays.sort(a);
		int count=0;
		for(int aa:a) {
			System.out.println(aa);
			count++;
		}
			System.out.println(count);
	}
}
