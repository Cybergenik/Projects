
package account.java;   
public class AccountJava {

    private int balance;
      
    AccountJava(int initialBalance)
    {
       balance = initialBalance;
    }
    
    void credit(int amount)
    {
       balance += amount;
    }
    void debit(int amount)
    {
       balance -= amount;
    }
    int getBalance()
    {
       return balance;
    }
}
