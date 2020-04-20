
/**
 * Write a description of class PersonalAccount here.
 * 
 * @author (Sufyan Ahmed W14025337) 
 * @version (1.0 19/02/2015)
 */
public class PersonalAccount extends Account
{
    private String cardNumber;
    private char cardType;

    /**
     * @param firstName the account holders first name
     * @param lastName the account holders last name
     * @param accountNumber the users account number
     * @param street account holders street
     * @param town account holders town
     * @param postcode account holders postcode
     * @param cardNumber the users card number
     * @param cardType the card type used
     */

    public PersonalAccount(String firstName, String lastName, String accountNumber, String street, String town, String postcode, String cardNumber, char cardType)
    {
        super (firstName, lastName, accountNumber, street, town, postcode);
        this.cardNumber = cardNumber;
        this.cardType = cardType;
    }

    /**
     * @param firstName the account holders first name
     * @param lastName the account holders last name
     * @param accountNumber the users account number
     * @param street account holders street
     * @param town account holders town
     * @param postcode account holders postcode
     * @param cardNumber the users card number
     * @param cardType the card type used
     * @param points amount of points held
     */
    public PersonalAccount(String firstName, String lastName, String accountNumber, String street, String town, String postcode, String cardNumber, char cardType, int points)
    {
        super (firstName, lastName, accountNumber, street, town, postcode);
        this.cardNumber = cardNumber;
        this.cardType = cardType;
        points = super.getNoOfPoints();
    }

    /**
     * get card number
     * @return cardNumber of account
     */
    public String getCardNumber()
    {
        return cardNumber;
    }

    /**
     * get account card type
     * @return cardType of account
     */
    public String getCardType()
    {
        String str = String.valueOf(cardType);
        return str;
    }

    /**
     * print
     */
    public void print()
    {
        System.out.println(super.toString() + "Card number: " + this.cardNumber + " " + "cardtype: " + this.cardType);
    }

    /**
     * print
     */
    public String toString()
    {
        return super.toString() + "Card number: " + this.cardNumber + " " + "cardType" + this.cardType;
    }

}
