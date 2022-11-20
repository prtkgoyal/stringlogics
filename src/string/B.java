package string;

public class B {

	public static void main(String[] args) {
		//reverse the string
		String x= "  This is computer  ";
		for(int i=x.length()-1;i>=0;i--) {
			System.out.print(x.charAt(i));
		}
		//reverse the string by words
		String[] y = x.split(" ");
	for(int i=y.length-1;i>=0;i--) {
		System.out.print(y[i] +" ");
	}
	
	//removing white spaces from left and right of string
	String trim = x.trim();
	System.out.println(trim);
}
}