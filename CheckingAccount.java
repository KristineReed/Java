
/**
 * subclass CheckingAccount extends superclass Account
 */
 

public class CheckingAccount extends Account
{
    public CheckingAccount(){
        super(); // call parent class' no argument constructor

   }
   public CheckingAccount(int id, double balance){
    super(id,balance); // call parent class; two argument constructor
   }

   public void withdraw(double amount){
    if(amount <= 0 || amount > getBalance()) return; // nothing 
    //balance = balance-amount;
    setBalance(getBalance()-amount);
   }
}
