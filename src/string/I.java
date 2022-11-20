package string;

public class I {
//fibonacci series
	 public static void main(String[] args) {

		    int firstTerm = 0, secondTerm = 1, n = 10;
		    System.out.println("Fibonacci Series till " + n + " terms:");

		    for (int i = 1; i <= n; ++i) {			//1
		      System.out.print(firstTerm + ", "); /// 1

		      // compute the next term
		      int nextTerm = firstTerm + secondTerm;//0+1=1
		      firstTerm = secondTerm;
		      secondTerm = nextTerm;
		    }
		  }
	 
}
