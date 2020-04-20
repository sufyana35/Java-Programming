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

    /**
     * Adds Account to array list accounts
     * 
     * @param accounts add account to list
     */
    public void addAccount(Account account)
    {
        accounts.add(account);
    }

    /**
     * Print out number of accounts in array list
     * @param accounts displays array size
     */
    public int getNumberOfAccounts()
    {
        return accounts.size();
    }

    /**
     * Print out details of a specified account
     * @param account return account number specified
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

    /**
     * Print out details of an account
     * @param accountEntry current entry specified
     */
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

    /**
     * Print out details of all accounts
     * @param accountEntry all entries in list
     */
    public void getAllAccounts()
    {
        for(Account account : accounts)
        {
            account.printAccountDetails();
            System.out.println();
        }
    }

    /**
     * removes an account from the list
     * @param accountEntry removes an Entry in the list
     */
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

    /**
     * Remove an account by the account number specified by the user
     */
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

    /**
     * Find an account by the account number specifed by the user
     */
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
