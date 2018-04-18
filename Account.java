
/**
 * Abstract class Account that correlates with Checking and Savings Accounts. 
 * 
 * @author Kristine Reed
 * @version 11/30/2016
 */
public abstract class Account
{
    private int id;
    private double balance;
    
   /**
    * Constructor with no argument
    */
    public Account(){
        id = 1000;
        balance = 0.0;
        
}
public Account(int id, double balance){
    this.id = id;
    this.balance = balance;
    
}
public void setBalance(double balance){
    this.balance = balance;
}
public double getBalance(){
    return balance;
}
public void setId(int id){
    this.id = id;
}
public int getId(){
    return id;
}
//deposit method
public void deposit(double amount){
    if(amount <=0)
        return; 
    balance = balance + amount;
}
public abstract void withdraw(double amount);
//String method
public String toString(){
    return "ID: " + id + "/nBalance: $ " + balance;
   }
}

