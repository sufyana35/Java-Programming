import java.util.*;
/**
 * Array List Account entry
 * 
 * @author (Sufyan Ahmed ID:W14025337) 
 * @version (1.0 04/12/2014)
 */

public class AccountList
{
    private ArrayList<Account> accounts;

    /**
     * Constructor for objects of class AccountList
     * @param accounts creates a new account array list
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
     * Print out details of an account
     * @param accountEntry current entry specified
     */
    public void getAccount(int accountEntry)
    {
        if(accountEntry < 0)
        {
            System.out.println("Negative entry :" + accountEntry);
        }
        else if(accountEntry < getNumberOfAccounts())
        {
            Account account = accounts.get(accountEntry);
            account.printAccountDetails();
        }
        else
        {
            System.out.println("No such entry :" + accountEntry);
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
        }

        System.out.println("Number of accounts: " + getNumberOfAccounts());
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
        Account account = accounts.get(index);
        boolean found = false;

        while (index < accounts.size() && !found)
        {
        if (account.getAccountNumber().equals(accountNumber))
        {

            accounts.remove(account);
            return true;
        }
        else
        {
            return false;
        }
    }
    return false;
    }

    /**
     * Find an account by the account number specifed by the user
     */
    public int search (String accountNumber)
    {
        int index = 0;
        boolean found = false;

        while (index < accounts.size() && !found)
        {
            Account account = accounts.get(index);
            if (account.getAccountNumber().equals(accountNumber))
            {
                // We don't need to keep looking
                found = true; 
            }
            else
            {
                index++;
            }
        }
        if (index < accounts.size())
        {
            return index;
        }
        else
        {
            return -1;

        }
    }
}