import java.util.Scanner;
/**
 * Write a description of class AccountTUI here.
 * 
 * @author (Sufyan Ahmed) 
 * @version (1.0 20/11/2014)
 */
public class AccountTUI
{
    // instance variables - replace the example below with your own
    Scanner myScanner;
    private AccountList accountList;

    /**
     * Constructor for objects of class AccountTUI
     */
    public AccountTUI()
    {
        // initialise instance variables
        accountList = new AccountList();
        myScanner = new Scanner(System.in);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void menu()
    {
        int command = -1;
        
        while (command != 0)
        {
            displayMenu();
            command = getCommand();
            execute(command);
        }
    }
    
    private void addAccount()
    {
        System.out.print("Enter account users first name : ");
        String firstName = myScanner.nextLine();
        System.out.print("Enter account users last name: ");
        String lastName = myScanner.nextLine();
        System.out.print("Enter account users account number: ");
        String accountNumber = myScanner.nextLine();
        System.out.print("Enter account users street: ");
        String street = myScanner.nextLine();
        System.out.print("Enter account users town: ");
        String town = myScanner.nextLine();
        System.out.print("Enter account users postcode: ");
        String postcode = myScanner.nextLine();
        int points = myScanner.nextInt();
        accountList.addAccount(new Account(firstName, lastName, accountNumber, points, street, town, postcode));
    }
    
    /**
     * displays the menu string on the terminal display
     */
    private void displayMenu()
    {
        String menuString = "Please select option:\n";
        menuString += "     Add Account                      1\n";
        menuString += "     Get number of Accounts           2\n";
        menuString += "     Remove Account                   3\n";
        menuString += "     Show Account                     4\n";
        menuString += "     Show all Accounts                5\n";
        menuString += "     Quit                             0\n";
        menuString += "Enter option number : ";
        System.out.print(menuString);

    }
    
    /**
     * processes the legal commands
     * @param command the command entered by the user
     */
    private void execute(int command)
    {
        if (command == 1)
           addAccount(); 
        else if (command == 2)
           getNumberOfAccounts();
        else if (command == 3)
           removeAccount();
        else if (command == 4)
           showAccount();           
        else if (command == 5)
           showAllAccounts();      
        else if (command == 0)
           quitCommand();
        else
           unknownCommand(command);
    }
    
        /**
     *  obtains the user's command
     *  one command per line
     *  @return the user command
     */
    private int getCommand()
    {
        int command = myScanner.nextInt();
        myScanner.nextLine();
        return command;
    }
    
    private void getNumberOfAccounts()
    {
        System.out.println("Class size: " + accountList.getNumberOfAccounts());
    }
    
    private void quitCommand()
    {
        System.out.println("Bye");
    }
    
    private void removeAccount()
    {     
        System.out.print("Enter Account number : ");
        String accountNumber = myScanner.nextLine();
        if (accountList.removeAccount(accountNumber))
           System.out.println("Account with  " + accountNumber + " removed from class list");
        else
           System.out.println("Account with account number " + accountNumber + " not  found");
    }
    
    private void showAccount()
    {
        System.out.print("Enter Account number: ");
        String accountNumber = myScanner.nextLine();
        accountList.getAccount(accountNumber);
        if (accountList == null)
            System.out.println("Account Number " + accountNumber + " not found");
        else
            System.out.println("Account Number : "+ accountNumber + " found");
    }
    
    private void showAllAccounts()
    {
        accountList.getAllAccounts();
        System.out.println();
    }
    
    private void unknownCommand(int command)
    {
        System.out.println("Invalid Command : " + command);
    }
}
