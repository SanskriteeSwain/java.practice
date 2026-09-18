import java.util.Scanner;

public class Calculator {

  public static void main(String[] args)  {

     Scanner input = new Scanner(System.in);
     
  System.out.print("Enter first number: ");
      double num1 = input.nextDouble();

  System.out.print("Enter second number: "); 
      double num2 = input.nextDouble();
      
  System.out.print("Choose operation ( + , - , * , / ): ");
    char operation = input.next().charAt(0);

      if(operation == '+'){
         System.out.println("Answer = "+(num1 + num2));
     }
      else if (operation =='-'){
         System.out.println("Answer = "+(num1 - num2));
     }
      else if (operation =='*'){
         System.out.println("Answer = "+(num1 * num2));
     }
      else if (operation =='/'){
         System.out.println("Answer = "+(num1 /num2));
     }
      else{
           System.out.println("Invalid operation!");
          }
       
        
        }
  }
