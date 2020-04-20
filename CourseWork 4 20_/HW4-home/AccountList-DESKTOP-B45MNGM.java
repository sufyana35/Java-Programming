import java.util.*;
/**
 * This is the AccountList class provide for students
 * in Blackboard at the start of the homework
 * 
 * @author (Sufyan Ahmed ID:W14025337) 
 * @version (2.0)
 */
public class AccountList
{
   private ArrayList<Account> accounts;    
   private ArrayList<Account> accounts2;    
   
   /**
    * Constructor for objects of class AccountList
    */
   public AccountList()
   {
       accounts = new ArrayList<Account>();
   }
    
   public void addAccount(Account account)
   {
       accounts.add(account);
   }
   
      public void addAccount2(Account account2)
   {
       accounts2.add(account2);
   }
    

    
   public void getAllAccounts()
   {
        for(Account account : accounts)
        {
            account.printAccountDetails();
            System.out.println();
        }
   }
   
      public void getAllAccounts2()
   {
        for(Account account2 : accounts2)
        {
            account2.printAccountDetails();
            System.out.println();
        }
   }
    
  
}
