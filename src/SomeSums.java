import java.util.Scanner;


public class SomeSums {

	
		 
		public static void main(String []args){
			Scanner scanner = new Scanner(System.in);
				
	              	long numinf =scanner.nextInt();
			     	long numsup =scanner.nextInt();
			 
			    	long digitnumber =scanner.nextInt();
			    	
			    	//numberdigits
			    	
			   
			    	long value;
			    	
			    	for(int i=0;i<=digitnumber;i++){
		                value = digitnumber % 10;
		                
			    	  if(value<= numinf || digitnumber>numsup){
			    		System.out.println(i);
			    		
			    	  }
			    	}
			     	}
				  
		
		
	





}
