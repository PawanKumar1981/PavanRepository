package JavaExample;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      String original="kr", reverse = ""; // Objects of String class
	      Scanner in = new Scanner(System.in);
	      System.out.println("Enter a string to check if it is a palindrome");

	      original =in.nextLine();
	      int lenth =original.length();
	      for(int i=lenth-1 ;i>=0; i--) {	    	  
	    	  reverse = reverse + original.charAt(i);	       		    	  
	      }
	      if (original.equals(reverse)) 
    	  System.out.println("palindrame");
    		  else
    		 System.out.println("not palindrame");
	}

}


