package string;

import java.util.Scanner;
//prime no range b/w 1 to n 
public class G{
   public static void main(String arg[]){
      int n=10,counter;
//      Scanner scanner = new Scanner(System.in);
//      System.out.println("Required packages have been imported");
//      System.out.println("A reader object has been defined ");
//      System.out.print("Enter the n value : ");
//      n=scanner.nextInt();
//      System.out.print("Prime numbers between 1 to 10 are ");
      for(int j=2;j<=n;j++){
         counter=0;
         for(int i=1;i<=j;i++){
            if(j%i==0){
               counter++;
            }
         }
         if(counter==2)
         System.out.print(j+" ");
      }
   }
}
