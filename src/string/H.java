package string;

public class H {
//given no. is prime or not
public static void main(String[] args) {
	

    int count;
    int j=5;
     count=0;
     for(int i=1;i<=j;i++){
        if(j%i==0){
           count++;
        }
     }
     if(count==2) {
     System.out.print(j+" is prime ");
  }else {
	  System.out.println(j+" not prime ");
  }

}
}