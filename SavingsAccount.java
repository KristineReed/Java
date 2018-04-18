
/**
 * subclass SavingsAccount extends superclass Account
 *
 */
public class SavingsAccount extends Account
{
    private double interestRate;// Interest rate
    /** 
     * Constructor with id, balance and interestRate
     * @param id The account is as int
     * @param balace The account balance as double
     * @param interestRate The savings interest rate as double
     */
    public SavingsAccount(int id, double balance, double interestRate){
        super(id,balance);
        this.interestRate = interestRate;
    
    }
    //
    public void addInterest(){
        setBalance(getBalance()*(1+interestRate));
    }
public void withdraw(double amount){
    if(amount > 0 && amount <= getBalance() - 500.00)
        setBalance(getBalance() - amount);
        
    
   }
   /**
    * return string of savings Account
    * @return The string Savings Account
    */
   public String toString(){
       return super.toString() + "/n Interest Rate: " + interestRate;
   }
}