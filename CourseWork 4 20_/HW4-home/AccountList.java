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
    
   public int getNumberOfAccounts()
   {
       return accounts.size();
   }
    
      /**
    * add comment code new
    */
   public boolean getAccount(String accountNumber)
   {
       int index = 0;
        for (Account account: accounts)
        {
            if (accountNumber.equals(account.getAccountNumber()))
            {
                account.printAccountDetails();
                return true;
            }
            index++;
        }
        return false;
   }
   
   public void getAccount(int accountEntry)
   {
       if (accountEntry < 0)
       {
           System.out.println("Negative entry: " + accountEntry);
       }
       else if (accountEntry < getNumberOfAccounts())
       { 
           Account account = accounts.get(accountEntry);
           account.printAccountDetails();
       }
       else
       {
           System.out.println("No such entry: " + accountEntry);
       }
   }
    
   public void getAllAccounts()
   {
        for(Account account : accounts)
        {
            account.printAccountDetails();
            System.out.println();
        }
   }
    
   public void removeAccount(int accountEntry)
   {
        if(accountEntry < 0)
        {
            System.out.println("Negative entry :" + accountEntry);
        }
        else if(accountEntry < getNumberOfAccounts())
        {
            accounts.remove(accountEntry);
        }
        else
        {
            System.out.println("No such entry :" + accountEntry);
        }
   }
    
   public boolean removeAccount(String accountNumber)
   {
        int index = 0;
        for (Account account: accounts)
        {
            if (accountNumber.equals(account.getAccountNumber()))
            {
                accounts.remove(index);
                return true;
            }
            index++;
        }
        return false;
   }
    
  
   public int search(String accountNumber)
   {
       int index = 0;
       for (Account account : accounts)
       {
           if (accountNumber.equals(account.getAccountNumber()))
           {
               return index;
           }
           else
           {
               index++;
           }
       }
       return -1;
   }    
}
