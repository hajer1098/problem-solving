
import java.util.Scanner;

class FourCalcutate {
    
    public static void main(String[] args) {
          // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a number 1: ");
        
        // Read an integer input from the user
        int number1 = scanner.nextInt();
          // Prompt the user to enter a number
        System.out.print("Enter a number 2: ");
        int number2 = scanner.nextInt();
      System.out.print("addition result " +(number1+number2) +" \n");
        System.out.print("multiply result " +(number1 * number2)+" \n");
    System.out.print("subtract result " +(number1 - number2)+" \n");
         System.out.print("divide  result "+ (number1 /number2)+" \n");
     
    }
    
    
}
