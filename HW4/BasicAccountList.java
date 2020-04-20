import java.util.*;


public class BasicAccountList
{
    private ArrayList < BasicAccount> accounts;

    /**
     * Create a BasicAccount. 
     */
    public BasicAccountList()
    {
        accounts = new ArrayList < BasicAccount>();
    }

    /**
     * Add an account to this account list.
     * @param account the accountobject to be added
     */
    public void addAccount(BasicAccount account)
    {
        accounts.add(account);
    }

    /**
     * Return the number of accounts currently held.
     * 
     * @return the number of accounts
     */
    public int getNumberOfAccounts()
    {
        return accounts.size();
    }

    
    /**
     * Provides a list of accounts. 
     * @return a list of accounts
     */
    public String toString()
    {
        String myString = "Account List " ;
        myString = myString + "\nNumber of accounts: " 
                            + getNumberOfAccounts() +"\n";
        
        if (getNumberOfAccounts() > 0 )
        {
            for (BasicAccount account : accounts)
            {
                myString = myString + account.toString() + "\n";
            }
        }      
        return myString;
    }   

    /**
     * removes an account from the list.
     * @param accountNumber The name of the account to be deleted
     * @return true if account deleted otherwise false
     */
    public boolean removeAccount(String accountNumber)
    {
        int index = 0;
        for (BasicAccount account : accounts)
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
}
