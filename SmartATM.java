import java.util.Scanner;
public class SmartATM {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 10000;
        String history = "";
        int pin = 1210;
        int attempts = 3;
    while (attempts > 0){
        System.out.println("Enter your pin: ");
        int enteredPin = sc.nextInt();
        if (enteredPin == pin){
        System.out.println("Login Succesful!!");
        int choice;
    do{
        System.out.println("1.Check Balance");
        System.out.println("2.Deposit");
        System.out.println("3.Withdraw");
        System.out.println("4.Transaction History");
        System.out.println("5.Exit");
        System.out.println("Enter your choice: ");
        choice = sc.nextInt();
        if(choice == 1){
        System.out.println("Your balance is: " +balance);
        }
        else if (choice == 2) { 
            System.out.println("Enter your deposit amount: ");
            double deposit = sc.nextDouble();
            balance = balance + deposit;
            history = history + "Deposited: " + deposit + "\n";
            System.out.println("Deposit Succesful!");
            System.out.println("Your new balance is: " +balance);
        }
        else if (choice == 3) {
            System.out.println("Enter withdrawal amount: ");
            double withdraw = sc.nextDouble();
        
            if (withdraw <= balance){
                balance = balance - withdraw;
                history = history + "Withdrawn: " + withdraw + "\n";
                System.out.println("Withdrawal Succesful!");
                System.out.println("Your new balance is: " + balance);
            }else{
                System.out.println("Insufficient Balance!");
                }
            }
            else if (choice == 4) {
                System.out.println("Transaction History: ");
                System.out.println(history);
            }
            else if (choice == 5) {
            System.out.println("THANK YOU FOR USING THE ATM!!");
        }
            else {
                System.out.println("Invalid choice!");
            }
            } while (choice != 5);
            break;
        }
            else{
                attempts--;
                System.out.println("Incorrect Pin!");
                System.out.println("Attemts remaining: " +attempts);
            }
            
        }
    }
}
        

        
        
        
        
    
        


    




        

