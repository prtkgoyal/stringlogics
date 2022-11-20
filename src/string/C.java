package string;

import java.sql.Driver;
import java.util.Scanner;

public class C {
public static void main(String[] args) {
	System.out.println("enter a and b");
	Scanner scan=new Scanner(System.in);
	String value = scan.next();
	
	
	
	int count=0;
	int sount =0;
	
	for(int i=0;i<value.length();i++) {
		if(value.charAt(i)=='a') {
			count++;	
		}else {
			sount++;
		
	}
	
}
	if(count==sount) {
		System.out.println(true);
		
	}else {
		System.out.println(false);
	}
}
}