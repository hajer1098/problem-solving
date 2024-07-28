import java.util.Scanner;


public class Digits {
	private static Scanner scanner;
	public static void main(String []args){
		scanner = new Scanner(System.in);
			
		     	long size =scanner.nextInt();
		     	
		     	String result= reverseNumberWithSpaces(size);
		        System.out.println(result);
			
			
	 }
			  
	
	 public static String reverseNumberWithSpaces(long size){
	     String str = Long.toString(size);
	      StringBuilder reversedStr = new StringBuilder(str).reverse();
	
	      StringBuilder result = new StringBuilder();
	      // System.out.println(reversedStr);
	       int length = reversedStr.length();
	      for(int i=0; i< length; i++){
	     	 result.append(reversedStr.charAt(i)).append(" ");
	     }
	      return result.toString();
		
	
}
}



