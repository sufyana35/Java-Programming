
/**
 * Write a description of class Account here.
 * 
 * @author (Sufyan Ahmed W14025337) 
 * @version (1.0 19/02/2015)
 */
public class Account
{
    private String accountNumber;
    private Address address;
    private Name name;
    private int pointsHeld;

    /**
     * @param firstName the account holders first name
     * @param lastName the account holders last name
     * @param acctNumber the users account number
     * @param street account holders street
     * @param town account holders town
     * @param postcode account holders postcode
     * @param points account holders points
     */
    public Account(String fName, String lName, String acctNumber, int points, String street, String town, String postcode) 
    {
        name = new Name (fName, lName);
        accountNumber = acctNumber;
        pointsHeld = points;     
        address = new Address(street, town, postcode);
    }

    /**
     * @param firstName the account holders first name
     * @param lastName the account holders last name
     * @param acctNumber the users account number
     * @param street account holders street
     * @param town account holders town
     * @param postcode account holders postcode
     */
    public Account(String fName, String lName, String acctNumber, String street, String town, String postcode) 
    {
        name = new Name (fName, lName);
        accountNumber = acctNumber;
        pointsHeld = 0;       
        address = new Address(street, town, postcode);
    }

    public void addPoints(int points)
    {
        pointsHeld = pointsHeld + points;
        System.out.println("Points now held: " + pointsHeld);
    }

    public boolean equals(Object o)
    {
        if ( o == null)  
        {
            return false;      
        }

        if ( this == o)
        {
            return true;   
        }

        Name other = (Name) o;        

        if (other.toString().equals( toString()))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * get account number
     * @return accountNumber account number
     */
    public String getAccountNumber()
    {
        return accountNumber;
    }

    /**
     * get address
     * @return address of user address
     */
    public String getAddress()
    {
        return address.toString();
    }

    /**
     * get firstname
     * @return getFirst gets the users first name
     */
    public String getFirstName()
    {
        return name.getFirst();
    }

    /**
     * get last name
     * @return getLast gets the users last anme
     */
    public String getLastName()
    {
        return name.getLast();
    }

    /**
     * get amonunt of points
     * @return pointsHeld the amount of points held
     */
    public int getNoOfPoints()
    {
        return pointsHeld;
    }

    public void printAccountDetails()
    {
        System.out.println(name.getFirst() + " " + name.getLast()
            + "\nAccount Number: " + accountNumber
            + "\nAddress: " + address.toString()
            + "\nNumber of points: " + pointsHeld);
    }

    /**
     * remove pointsheld by a given number and output a 
     * message to the window.
     * @param removePoints removes the amount of points from the account
     */
    public void removePoints(int points)
    {
        if ((pointsHeld - points) >=0)
        {
            pointsHeld = pointsHeld - points;
            System.out.println("Points now held: " + pointsHeld);        
        }
        else
        {
            System.out.println("Transaction refused: "
                + "Insufficient points available.");}
    }

    /**
     * set address
     * @param setFullAddress of user account
     */
    public void setAddress(String street, String town, String postcode)
    {
        address.setFullAddress(street, town, postcode);
    }

    /**
     * set first name of user
     * @param setFirstName of user account
     */
    public void setFirstName(String fName)
    {
        name.setFirst(fName);
    }

    /**
     * set last name of user
     * @param setLastName of user account
     */
    public void setLastName(String lName)
    {
        name.setLast(lName);
    }

    /**
     * string toString
     */
    public String toString()
    {
        String output = "";
        System.out.println("Personal Account: " + accountNumber + "\n" + name + "\n" + address + "\n" + pointsHeld + "\n");
        return output;
    }
}
