import java.util.Scanner;


public class Factorial {
	private static Scanner scanner;

	public static void main(String []args){
	scanner = new Scanner(System.in);
		
		long num =scanner.nextLong();
		
		long res =factorial(num);
		if(res %2 ==0){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		
		
	}
	
	public static long factorial( long num){
		
		if(num==0) return 1;
		return num*factorial(num-1);

		}
		//5*4*3*2*1*1

}
