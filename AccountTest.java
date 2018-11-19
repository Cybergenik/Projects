package account.java;
import java.util.Scanner;
public class AccountTest {
        public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        AccountJava a = new AccountJava(5000);
        AccountJava b = new AccountJava(10000);
        AccountJava c = new AccountJava(90000);
        
        int password = 1, tries = 0, account1 = 5678, account2 = 1234, account3 = 4321; 
        
        while (password != account1 || password != account2 || password != account3 ){
        boolean checker1 = false, checker2 = false, checker3 = false;
        if(tries <= 5){
         System.out.print("Enter 4 digit PIN:");
         password = in.nextInt();
        }
        else{
            System.out.println("Your account has been locked out.");
            break;
        }
         if (password == account1){
             checker1 = true;
             checker2 = false;
             checker3 = false;
         }
         else if (password == account2){
             checker1 = false;
             checker2 = true;
             checker3 = false;
         }
         else if (password == account3){
             checker1 = false;
             checker2 = false;
             checker3 = true;
         }
         if (checker1 == true){
            while (checker1  == true){
             int user = 0;
             System.out.print("What would you like to do next:");
             System.out.println("\n 1: Check Balance \n 2: Deposit \n 3: Withdraw \n 4: Sign Out");
             user = in.nextInt();
             
             if(user == 1){
                System.out.println(a.getBalance());
             }
             else if(user == 2){
             System.out.println("How much would you like to deposit:");
             int d = in.nextInt();
             a.credit(d);
             System.out.println("This is your new account balance "+ a.getBalance());
            }
             else if(user == 3){
             System.out.println("How much would you like to withdraw:");
             int w = in.nextInt();
             a.debit(w);
             System.out.println("This is your new account balance "+ a.getBalance());
            }
             else if(user == 4){
                 break;
             }
            }
         }
         else if (checker2 == true){
            while (checker2  == true){
             int user = 0;
             System.out.print("What would you like to do next:");
             System.out.println("\n 1: Check Balance \n 2: Deposit \n 3: Withdraw \n 4: Sign Out");
             user = in.nextInt();
             
             if(user == 1){
                System.out.println(b.getBalance());
             }
             else if(user == 2){
             System.out.println("How much would you like to deposit:");
             int d = in.nextInt();
             b.credit(d);
             System.out.println("This is your new account balance "+ b.getBalance());
            }
             else if(user == 3){
             System.out.println("How much would you like to withdraw:");
             int w = in.nextInt();
             b.debit(w);
             System.out.println("This is your new account balance "+ b.getBalance());
            }
             else if(user == 4){
                 break;
             }
            }
         }
         else if (checker3 == true){
            while (checker3  == true){
             int user = 0;
             System.out.print("What would you like to do next:");
             System.out.println("\n 1: Check Balance \n 2: Deposit \n 3: Withdraw \n 4: Sign Out");
             user = in.nextInt();
             
             if(user == 1){
                System.out.println(c.getBalance());
             }
             else if(user == 2){
             System.out.println("How much would you like to deposit:");
             int d = in.nextInt();
             c.credit(d);
             System.out.println("This is your new account balance "+ c.getBalance());
            }
             else if(user == 3){
             System.out.println("How much would you like to withdraw:");
             int w = in.nextInt();
             c.debit(w);
             System.out.println("This is your new account balance "+ c.getBalance());
            }
             else if(user == 4){
                 break;
             }
            }
         }
         else{
             System.out.println("Incorrect password try again");
             tries += 1;
         }
        }
    }   
}
