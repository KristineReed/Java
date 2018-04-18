
/**
 * is-a relationship.
 * Child class is parent class 
 * reference object
 */
public class Application
{
   public static void main(String [] args){
       //declare an array of Account with 4 elements
       Account[] accts = new Account[4];
       // intialize  account[1] and [0]  to be CheckingAccount
       // intialize account [2] and [3] to be SavingsAccount
       accts[0] = new CheckingAccount();
       accts[1] = new CheckingAccount(4001,8125.00);
       accts[2] = new SavingsAccount(4001,750000,0.01);
       accts[3] = new SavingsAccount(4002, 34000, 0.05);
       //print all four accounts
       for(int i =0; i < accts.length; i++)
          System.out.println("Account # " + (i+1) + " information : /n" + accts[i]);
       // deposit and withdraw from each account
       //refers to object -- polymorphism 
       accts[0].withdraw(3500);
       accts[1].deposit(30000);
       ((SavingsAccount) accts[2]).addInterest();
       accts[3].withdraw(60000);
       // reprint all four accounts
       for(int i =0; i < accts.length; i++)
          System.out.println("Now Account #  " + (i+1) + " information : /n" + accts[i]);
    }
}
