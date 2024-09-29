import java.util.Scanner;


public class SomeSums {
		 
		public static void main(String []args){
			Scanner scanner = new Scanner(System.in);
				
	              	int numinf =scanner.nextInt();
			     	int numsup =scanner.nextInt();
			 
			    	long digitnumber =scanner.nextInt();
			    	
			    	//numberdigits
			    	   
			    	int sum=0;
			    	
			    	for(int i=0;i<=digitnumber;i++){
			    		if(i/10 ==0){ //if digit is one
			    			 if(i>= numinf && i<=numsup){
			    				 sum+=1;
						    		
						    	  }
			    		}
			    		else{
			    			int mynum=i;//15
		                     int somedigits=0;
			    			while(mynum !=0){//15
			    			int  rest=mynum %10;//1
			    			somedigits +=rest;//5+1
			    			mynum/=10; //15 / 10
			    			
			    			if(somedigits>= numinf && somedigits<=numsup){
			    				 sum+=i;
						   
						    		
						    	  }
			    			}
			    			
			    		}
			    		System.out.println(sum);
		              
		                
			    	 
			    	}
			     	}
				  
		
		
	





}
