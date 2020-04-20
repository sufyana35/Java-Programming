/**
 * Write a description of class Account here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Account
{
    private String station;
    private String date;
    private String time;
    private int type;
    private int quantity;
    private int cost;


    /**
     * Constructor for objects of class Account.
     * The number of pointsHeld should be set to zero.
     * 
     * @param firstName The Account Holder's first name 
     * @param lastName The Account Holder's last name
     * @param accNumber The Account Holder's account number
     * @param street the account holder's street
     * @param town the account holder's town
     * @param postcode the account holder's postcode
     */
    public Account(String nStation, String nDate,
                   int nType, int nQuantity, int nCost)
    {
        station = nStation;
        date = nDate;
        type = nType;
        quantity = nQuantity;
        cost = nCost;

    }
    
    /**
     * Constructor for objects of class Account.
     * The number of pointsHeld should should be set to
     * the supplied value.
     * 
     * @param fName The Account Holder's first name 
     * @param lName The Account Holder's last name
     * @param acctNumber The account number
     * @param thePoints the pointsHeld awarded when account is initialised
     * @param street the account holder's street
     * @param town the account holder's town
     * @param postcode the account holder's postcode
     */
    public Account(String nStation, String nDate, int nType,
                   int nQuantity, int nCost, String postcode)
    {
        station = nStation;
        date = nDate;
        type = nType;
        quantity = nQuantity;
        cost = nCost;
    }
    
    // accessors
    
    /**
     * Get the Account Holder's first name
     * 
     * @return the Account Holder's first name
     */
    public String getStation()
    {
        return station;
    }
    
    /**
     * Get the Account Holder's last name
     * 
     * @return the Account Holder's last name
     */
    public String getDate()
    {
        return date;
    }
    
    /**
     * Get the Account Holder's account Number
     * 
     * @return the Account Holder's account number
     */
    public String getTime()
    {
        return time;
    }
    
     /**
     * Get the number of points held
     * 
     * @return the number of points held
     */
    public int getType()
    {
        return type;
    }
    

    public void printAccountDetails()
    {
        System.out.println("Station" + station + "\nDate " + date 
                           + "\nType 1 = Petrol, 2 = Diesel: " + type
                           + "\nAmount of fuel: " + quantity + "\nCost £" + cost);
    }     
    
    // mutators     
    
    /**
     * Change the first name
     * 
     * @param fName the new first name
     * 
     */
    public void setStation(String nStation)
    {
        station = nStation;
    }
    
    /**
     * Change the last name
     * 
     * @param lName the new last name
     * 
     */
    public void setDate(String nDate)
    {
        date = nDate;
    }

} // end class
