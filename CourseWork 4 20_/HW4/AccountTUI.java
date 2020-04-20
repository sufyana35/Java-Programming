import java.util.Scanner;
/**
 * Write a description of class AccountTUI here.
 * 
 * @author (Sufyan Ahmed ID:w14025337) 
 * @version (1.0 20/11/2014)
 */
public class AccountTUI
{
    // instance variables
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
     * provides the main user interface with the program
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

    /**
     * Adds the variables to the Account class
     */
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
        System.out.print("Enter number of points: ");
        int points = myScanner.nextInt();
        accountList.addAccount(new Account(firstName, lastName, accountNumber, points, street, town, postcode));
    }

    /**
     * Displays the menu string on the terminal display
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
        {    
            quitCommand();
            System.exit(0);
        }
        else
            unknownCommand(command);
    }

    /**
     *  obtains the user's command
     *  one command per line
     *  @return comand the user command
     */
    private int getCommand()
    {
        int command = myScanner.nextInt();
        myScanner.nextLine();
        return command;
    }

    /**
     * Print out number of accounts in array list
     * @return getNumberOfAccounts displays array size
     */
    private void getNumberOfAccounts()
    {
        System.out.println("Number Of Accounts: " + accountList.getNumberOfAccounts());
    }

     /**
     * Quits the program
     * Displays goodbye to the user
     */
    private void quitCommand()
    {
        System.out.println("Bye");
    }

    /**
     * removes an account from the list
     */
    private void removeAccount()
    {     
        System.out.print("Enter Account number : ");
        String accountNumber = myScanner.nextLine();
        if (accountList.removeAccount(accountNumber))
            System.out.println("Account with  " + accountNumber + " removed from class list");
        else
            System.out.println("Account with account number " + accountNumber + " not  found");
    }

    
    /**
     * Shows recently added account
     */
    private void showAccount()
    {
        System.out.print("Enter Account number: ");
        String accountNumber = myScanner.nextLine();
        if (accountList.getAccount(accountNumber))
            System.out.println("Account Number " + accountNumber + " found");
        else
            System.out.println("Account Number : "+ accountNumber + " not found");
    }

    /**
     * Shows all accounts
     * @return getAllAccounts get all of the details of the accounts entered
     */
    private void showAllAccounts()
    {
        accountList.getAllAccounts();
        System.out.println();
    }

    /**
     * Prints out a invalid message to the user
     */
    private void unknownCommand(int command)
    {
        System.out.println("Invalid Command : " + command);
    }
}
