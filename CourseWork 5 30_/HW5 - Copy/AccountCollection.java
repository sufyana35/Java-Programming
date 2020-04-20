
/**
 * Write a description of class AccountCollection here.
 * 
 * @author (Sufyan Ahmed Id:w14025337) 
 * @version (1.0 11/12/14)
 */
public class AccountCollection
{
    private Account [] accounts;
    private int currentIndex;

    public AccountCollection(int maxNoOfAccounts)
    {
        accounts = new Account[maxNoOfAccounts];
        currentIndex = 0;
    }

    public void addAccount(Account account)
    {
        if ( currentIndex < accounts.length )
        {
            accounts[currentIndex] = account;
            currentIndex++;
        }
        else
        {
            System.out.println("AccountCollection full. Could not add account!");
        }
    }

    /**
     * 
     */
    public int getCapacity()
    {
        return accounts.length;
    }

    public int getNumberOfAccounts()
    {
        return currentIndex;
    }

    public int search(String accountNumber)
    {
        for(int i = 0; i < currentIndex; i++)
        {
            if(accounts[i].getAccountNumber().equals(accountNumber))
            {
                return i;
            }
        }
        return -1;
    }

    public void printAllAccounts()
    {
        for(Account account : accounts)
        {
            System.out.println();
            account.printAccountDetails();
        }
    }

    /**
     * Remove an account by the account number specified by the user
     * 
     */
     
    public boolean removeAccount(String accountNumber)
    {
        for(int i = 0; i < currentIndex; i++)
        {
            if(accounts[i].getAccountNumber().equals(accountNumber))
            {
                squash(i);
                return true;
            }
        }
        return false;
    }
    

    private void squash(int index) 
    {
        if ( index >= 0 )
        {
            for ( int i = index ; i < currentIndex - 1 ; i++)
            {
                accounts[i]= accounts[i+1];
            }
            accounts[ currentIndex - 1] = null;
            currentIndex--;
        }
    }

    /**
     * Print out details of a specified account
     * @param account return account number specified
     */
    public boolean printAccount(String accountNumber)
    {
        int index = 0;
        for (Account account: accounts)
        {
            if (accountNumber.equals(account.getAccountNumber()))
            {
                account.printAccountDetails();
                return true;
            }
            else 
            {
                System.out.println("Account with account number: " +accountNumber+ " not found.");
            }
        }
       return false;
    }
}
