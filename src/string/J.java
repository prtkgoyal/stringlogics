package string;

import java.util.Arrays;
// check anagram 
public class J {
	public static void main(String[] args) {
	    String str1 = "race";
	    String str2 = "care";
	    

	    // check if length is same
	    if(str1.length() == str2.length()) {

	      // convert strings to char array
	      char[] charArray1 = str1.toCharArray();
	      char[] charArray2 = str2.toCharArray();

	      // sort the char array
	      Arrays.sort(charArray1);//acer
	      Arrays.sort(charArray2);//acer
	      
	      // if sorted char arrays are same
	      // then the string is anagram
	      boolean result = Arrays.equals(charArray1, charArray2);
//	      System.out.println(result);
	      
	      if(result==true) {
	        System.out.println(str1 + " and " + str2 + " are anagram.");
	      }
	      else {
	        System.out.println(str1 + " and " + str2 + " are not anagram.");
	      }
	    }
	    else {
	      System.out.println(str1 + " and " + str2 + " are not anagram.");
	    }
	  }
}
