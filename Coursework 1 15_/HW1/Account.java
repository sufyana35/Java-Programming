
/**
 * A rewards account scheme designed to give customers
 * points that are redeemable at a set of local chain of stores
 * 
 * @author (Sufyan Ahmed W14025337) 
 * @version (1.0 02/10/14)
 */
public class Account
{
    private String accountNumber;
    //String accountNumber stores information on account number of the user
    private String firstName;
    // String firstName stores information on first name of the user
    private String lastName;
    // String lastName stores information on last name of the user
    private int pointsHeld;
    // int pointsHeld stores information on number of points by user
    /**
     *  Create an account with user details to record the amount of points he holds 
     *
     *  @param fName the users first name
     *  @param lName the users last name
     *  @param accNumber the users account number
     */   
    public Account (String fName, String lName, String accNumber)
    {
        firstName = fName;
        lastName = lName;
        accountNumber = accNumber;
    }

    /**
     *  Create an account with user details to record the amount of points he holds 
     *
     *  @param fName the users first name
     *  @param lName the users last name
     *  @param accNumber the users account number
     *  @param pointsHeld points the user holds
     */   
    public Account (String fName, String lName, String accNumber, int points)
    {   
        firstName = fName;
        lastName = lName;
        accountNumber = accNumber;
        pointsHeld = points;
    }

    /**
     *  Adds the number of points
     *
     *  @param points adds the number of points to existing points heldd by user
     *  Print amount of points held by user
     */  
    public void addPoints (int points)
    {
        pointsHeld = pointsHeld + points;

        //System prints message in console window displaying points
        System.out.println("Points now held:" + pointsHeld);
    }

    /**
     *  Gets the account number of the user
     *
     *  @return getAccountNumber the account number of the user
     */   
    public String getAccountNumber ()
    {
        return accountNumber;
    }

    /**
     *  Gets the first name of the account user
     *
     *  @return getFirstName the first name of user account
     */   
    public String getFirstName ()
    {
        return firstName;
    }

    /**
     *  Gets the last name of the account user
     *
     *  @return getLastName the last name of the user account
     */   
    public String getLastName ()
    {
        return lastName;
    }

    /**
     *  Gets the amount of points held by the account user
     *
     *  @returns getNoOfPoints the points held by the user
     */   
    public int getNoOfPoints ()
    {
        return pointsHeld;
    }

    /**
     * Print account details.
     * First name and last name of account user
     * Points held by the account user
     */
    public void printAccountDetails()
    {
        System.out.println(firstName + " " + lastName);
        System.out.println("Account Number:" + accountNumber);
        System.out.println("Number of Points:" + pointsHeld);

    }

    /**
     *  Removes the number of points
     *
     *  @param removePoints removes the number of points
     *  System Print displays the nmber of points held by account user
     */  
    public void removePoints (int points)
    {
        pointsHeld = pointsHeld - points;

        //System prints message in console window displaying points
        System.out.println("Points now held:" + pointsHeld);
    }

    /**
     * Set the first name of the user
     * 
     * @param fName set the first name of the user
     */
    public void setFirstName(String fName)
    {
        firstName = fName;
    }

    /**
     * Set the last name of the user
     * 
     * @param lName set the last name of the user
     * Print amount of points held by user
     */
    public void setlastName(String lName)
    {
        lastName = lName;
    }
}
