/**
 * The BasicAccount class holding basic functionality for CG0048, HW4.
 * @author Alan Maughan
 * @version 02
 */
public class BasicAccount
{
    private Name name;
    private String accountNumber;
    
    /**
     * Constructor for objects of class Account.
     * The number of pointsHeld should should be set to
     * the supplied value.
     * 
     * @param fName The Account Holder's first name 
     * @param lName The Account Holder's last name
     * @param acctNumber The account number
     */
    public BasicAccount(String fName, String lName, String acctNumber)
    {
  
        name = new Name (fName, lName);
        accountNumber = acctNumber; 
    }
    
    // accessors
    
    /**
     * Get the Account Holder's first name
     * 
     * @return the Account Holder's first name
     */
    public String getFirstName()
    {
        return name.getFirst();
    }
    
    /**
     * Get the Account Holder's last name
     * 
     * @return the Account Holder's last name
     */
    public String getLastName()
    {
        return name.getLast();
    }
    
    /**
     * Get the Account Holder's account Number
     * 
     * @return the Account Holder's account number
     */
    public String getAccountNumber()
    {
        return accountNumber;
    }
    
 
    public void printAccountDetails()
    {
        System.out.println( toString());
    }     
       
    /**
     * Return details of an account as a formated string
     * 
     * @return the account details of a particular account
     */
    
    public String toString()    
    {
        String output = accountNumber + " ";
        output = output + name.toString() + "\n";      
        return output;
    }
    
    // mutators         
    /**
     * Change the first name
     * 
     * @param fName the new first name
     * 
     */
    public void setFirstName(String fName)
    {
        name.setFirst (fName);
    }
    
    /**
     * Change the last name
     * 
     * @param lName the new last name
     * 
     */
    public void setLastName(String lName)
    {
        name.setLast(lName);
    }
    
   
} // end Account class
