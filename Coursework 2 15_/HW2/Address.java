
/**
 * A simple Address class that is integrated with the Account class
 * 
 * @author (Sufyan Ahmed ID: W14025337) 
 * @version (1.0 02/10/14)
 */

public class Address
{

    public String postcode;
    //String postcode stores postcode of account held
    public String street;
    // String street stores steet address of account held
    public String town;
    // String town stores town address of account held

    /**
     *  Create an address with user details to record the address of the user account
     *
     *  @param street the address of where the account user lives
     *  @param town the address town of accoount user
     *  @param postcode the address postcode of the account user
     */   
    public Address (String street, String town, String postcode)
    {
        this.street = street;
        this.town = town;
        this.postcode = postcode;
    }

    /**
     *  Gets the full address of the account held
     *
     *  @return street, town, postcode - the full address of the account held
     */   
    
    public String getFullAddress ()
    {
        return street + "\n" + town + "\n" + postcode;
    }

    /**
     *  Gets the postcode of the account user
     *
     *  @return postcode the address postcode of the account user
     */   
    public String getPostcode ()
    {
        return postcode;  
    }

    /**
     *  Gets the street address of the account user
     *
     *  @return street the street address of the account user
     */   
    public String getStreet ()
    {
        return street;  
    }

    /**
     *  Gets the town address of the account user
     *
     *  @return town the town address of the account user
     */   
    public String getTown ()
    {
        return town;  
    }

    /**
     * Simulate print address
     * Print address details.
     * Print street of the user account held
     * Print town of the user account held
     * Print postcode of the user account held
     */
    public void printAddress()
    {
        System.out.println(street);
        System.out.println(town);
        System.out.println(postcode);
    }

    /**
     * Sets the address of the user account held
     * 
     * @param street set the street address of the user account held
     * @param town set the town address of the user account held
     * @param postcode set the postcode address of the user account held
     */
    public void setFullAddress(String street, String town, String postcode)
    {
        this.street = street;
        this.town = town;
        this.postcode = postcode;
    }

    /**
     * Sets the postcode of the user account held
     * 
     * @param postcode set the postcode address of the user account held
     */
    public void setPostcode(String postcode)
    {
        this.postcode = postcode;
    }

    /**
     * Sets the street of the user account held
     * 
     * @param street set the street address of the user account held
     */
    public void setStreet(String street)
    {
        this.street = street;
    }

    /**
     * Sets the town of the user account held
     * 
     * @param town set the town address of the user account held
     */
    public void setTown(String town)
    {
        this.town = town;
    }
}
