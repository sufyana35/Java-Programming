
/**
 * Write a description of class TradeAccount here.
 * 
 * @author (Sufyan Ahmed W14025337) 
 * @version (1.0 19/02/2015)
 */
public class TradeAccount extends Account
{
    private String accountName;
    private Address companyAddress;
    private String vatNumber;

    /**
     * constructor for objects of class account.
     * the number of pointsheld should be set to the supplied value
     * 
     * @param firstName the account holders first name
     * @param lastName the account holders last name
     * @param accountNumber the users account number
     * @param street account holders street
     * @param town account holders town
     * @param postcode account holders postcode
     * @param accountName the accounts name
     * @param cStreet the companies street
     * @param cTown the companies street
     * @param cPostcode the companies postcode
     * @param vatNumber the companies Vat Number
     */

    public TradeAccount(String firstName, String lastName, String accountNumber, String street, String town, String PostCode, String accountName, String cStreet, String cTown, String cPostCode, String vatNumber)
    {
        super(firstName, lastName, accountNumber, street, town, PostCode);
        companyAddress = new Address(cStreet, cTown, cPostCode);
        this.vatNumber = vatNumber;
    }

    /**
     * constructor for objects of class account.
     * the number of pointsheld should be set to the supplied value
     * 
     * @param firstName the account holders first name
     * @param lastName the account holders last name
     * @param accountNumber the users account number
     * @param street account holders street
     * @param town account holders town
     * @param postcode account holders postcode
     * @param accountName the accounts name
     * @param cStreet the companies street
     * @param cTown the companies street
     * @param cPostcode the companies postcode
     * @param vatNumber the companies Vat Number
     * @param points the amount of points held
     */
    public TradeAccount(String firstName, String lastName, String accountNumber, String street, String town, String PostCode, String accountName, String cStreet, String cTown, String cPostCode, String vatNumber, int points)
    {
        super(firstName, lastName, accountNumber, street, town, PostCode);
        points = super.getNoOfPoints();
        companyAddress = new Address(cStreet, cTown, cPostCode);
        this.vatNumber = vatNumber;
        this.accountName = accountName;
    }

    /**
     * get the account name
     * @return the accountName
     */
    public String getAccountName()
    {
        return accountName;
    }

    /**
     * get the company address
     * @return companyAddress returns company address
     */ 
    public String getCompanyAddress()
    {
        return companyAddress.toString();
    }

    /**
     * get vat number
     * @return VatNumber of company
     */ 
    public String getVatNumber()
    {
        return vatNumber;
    }

    /**
     * Print
     */ 
    public void print()
    {
        System.out.println("Trade Account: " + super.toString() + "\nAddress" + companyAddress.toString() + "/nVat Number: " + this.vatNumber + "/n");
    }

    /**
     * string to String
     */ 
    public String toString()
    {
        return("trade account:" + super.toString() + accountName + "," + companyAddress.toString() + "\nVat Number Is: " + this.vatNumber +"/n");
    }
}
