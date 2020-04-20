import java.util.Scanner;
import java.util.Date;
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
    private AccountList accountList2;
    private AccountList accountList3;
    private AccountList accountList4;
    private AccountList accountList5;

    public int petrolCost = 1, dieselCost = 1;

    public String Station1_State = "Available", Station2_State  = "Available", Station3_State  = "Available", Station4_State  = "Available", Station5_State  = "Available";
    public String s1;
    public int quantity1, cost1, total1, type1, petrol1, diesel1, totalpumpP1, totalpumpD1;

    public String s2;
    public int quantity2, cost2, total2, type2, petrol2, diesel2;

    public String s3;
    public int quantity3, cost3, total3, type3, petrol3, diesel3;

    public String s4;
    public int quantity4, cost4, total4, type4, petrol4, diesel4;

    public String s5;
    public int quantity5, cost5, total5, type5, petrol5, diesel5;

    public int totalOverall;

    Date date = new Date();

    /**
     * Constructor for objects of class AccountTUI
     */
    public AccountTUI()
    {
        // initialise instance variables

        //5 Array lists for different Station
        accountList = new AccountList();
        accountList2 = new AccountList();
        accountList3 = new AccountList();
        accountList4 = new AccountList();
        accountList5 = new AccountList();

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
        //available
        String customermenuString = "Please select option:\n";
        customermenuString += "     Station 1                      1\n";
        customermenuString += "     Station 2                      2\n";
        customermenuString += "     Station 3                      3\n";
        customermenuString += "     Station 4                      4\n";
        customermenuString += "     Station 5                      5\n";
        customermenuString += "     Quit                             0\n";
        customermenuString += "Enter option number : ";
        System.out.print(customermenuString);

        int customerCommand = myScanner.nextInt();
        myScanner.nextLine();

        if (customerCommand == 1) {

            s1 = "Station 1";

            System.out.print("Enter type: (1) - Petrol (2) Diesel \n");
            type1 = myScanner.nextInt();

            if (type1 == 1){
                cost1 = petrolCost;
            } else if (type1 == 2) {
                cost1 = dieselCost;
            } else {
                System.out.print("Error type: (1) - Petrol (2) Diesel \n");
                type1 = myScanner.nextInt();
            }

            //send request
            Station1_State = "Standbye (Fill)";

            displayKiosk();

            //request accepted
            System.out.println("State Ready");
            Station1_State = "Ready";

            System.out.print("Enter Quantity: ");
            quantity1 = myScanner.nextInt();

            total1 = cost1 * quantity1;
            Station1_State = "Standbye (Payment)";
        } else if (customerCommand == 2) {
            s2 = "Station 2";

            System.out.print("Enter type: (1) - Petrol (2) Diesel \n");
            type2 = myScanner.nextInt();

            if (type2 == 1){
                cost2 = petrolCost;
            } else if (type2 == 2) {
                cost2 = dieselCost;
            } else {
                System.out.print("Error type: (1) - Petrol (2) Diesel \n");
                type2 = myScanner.nextInt();
            }

            //send request
            Station2_State = "Standbye (Fill)";

            displayKiosk();

            //request accepted
            System.out.println("State Ready");
            Station2_State = "Ready";

            System.out.print("Enter Quantity: ");
            quantity2 = myScanner.nextInt();

            total2 = cost2 * quantity2;
            Station2_State = "Standbye (Payment)";
        } else if (customerCommand == 3) {
            s3 = "Station 3";

            System.out.print("Enter type: (1) - Petrol (2) Diesel \n");
            type3 = myScanner.nextInt();

            if (type3 == 1){
                cost3 = petrolCost;
            } else if (type3 == 2) {
                cost3 = dieselCost;
            } else {
                System.out.print("Error type: (1) - Petrol (2) Diesel \n");
                type3 = myScanner.nextInt();
            }

            //send request
            Station3_State = "Standbye (Fill)";

            displayKiosk();

            //request accepted
            System.out.println("State Ready");
            Station3_State = "Ready";

            System.out.print("Enter Quantity: ");
            quantity3 = myScanner.nextInt();

            total3 = cost3 * quantity3;
            Station3_State = "Standbye (Payment)";
        } else if (customerCommand == 4) {
            s4 = "Station 4";

            System.out.print("Enter type: (1) - Petrol (2) Diesel \n");
            type4 = myScanner.nextInt();

            if (type4 == 1){
                cost4 = petrolCost;
            } else if (type4 == 2) {
                cost4 = dieselCost;
            } else {
                System.out.print("Error type: (1) - Petrol (2) Diesel \n");
                type4 = myScanner.nextInt();
            }

            //send request
            Station4_State = "Standbye (Fill)";

            displayKiosk();

            //request accepted
            System.out.println("State Ready");
            Station4_State = "Ready";

            System.out.print("Enter Quantity: ");
            quantity4 = myScanner.nextInt();

            total4 = cost4 * quantity4;
            Station4_State = "Standbye (Payment)";
        } else if (customerCommand == 5) {
            s5 = "Station 5";

            System.out.print("Enter type: (p) - Petrol (d) Diesel \n");
            type5 = myScanner.nextInt();

            if (type5 == 1){
                cost5 = petrolCost;
            } else if (type5 == 2) {
                cost5 = dieselCost;
            } else {
                System.out.print("Error type: (1) - Petrol (2) Diesel \n");
                type5 = myScanner.nextInt();
            }

            //send request
            Station1_State = "Standbye (Fill)";

            displayKiosk();

            //request accepted
            System.out.println("State Ready");
            Station5_State = "Ready";

            System.out.print("Enter Quantity: ");
            quantity5 = myScanner.nextInt();

            total5 = cost5 * quantity5;
            Station5_State = "Standbye (Payment)";
        } else if (customerCommand == 0) {
            quitCommand();
        } else {
            unknownCommand(customerCommand);
        }

    }

    private void prices()
    {
        System.out.print("\n " +
            "------------------------------------------ \n" +
            "--------     Prices     ------------ \n" +
            "------------------------------------------ \n");
        String pricesString = "Please select option:\n";
        pricesString += "     Petrol: Price £" + petrolCost + "                     1\n";
        pricesString += "     Diesel: Price £ " + dieselCost + "                     2\n";
        pricesString += "     Quit                             0\n";
        pricesString += "Enter option number : ";
        System.out.print(pricesString);

        int pricesCommand = myScanner.nextInt();
        myScanner.nextLine();

        if (pricesCommand == 1) {
            System.out.print("Enter Cost: ");
            int cost = myScanner.nextInt();

            petrolCost = cost;
        } else if (pricesCommand == 2) {
            System.out.print("Enter Cost: ");
            int cost = myScanner.nextInt();

            dieselCost = cost;
        } else if (pricesCommand == 0) {
            quitCommand();
        } else {
            unknownCommand(pricesCommand);
        }

    }

    private void dailyReport()
    {
        System.out.print("\n " +
            "------------------------------------------ \n" +
            "--------     Daily Report     ------------ \n" +
            "------------------------------------------ \n");

        int petrolTotal = petrol1 + petrol2 + petrol3 + petrol4 + petrol5;
        int dieselTotal = diesel1 + diesel2 + diesel3 + diesel4 + diesel5;

        System.out.print("Total Amount Of Petrol Dispensed Today: " + petrolTotal + "L\n" +
            "Total Amount Of Diesel Dispensed Today: " + dieselTotal + "L\n" +
            "Money Made Today: " + "£" + totalOverall + "\n \n");

    }

    /**
     * displays the menu string on the terminal display
     */
    public void displayKiosk()
    {
        String KioskDisplay= "\n";
        KioskDisplay += "------------------------------------------ \n";
        KioskDisplay += "---------------     Kiosk     ------------ \n";
        KioskDisplay += "------------------------------------------ \n";
        System.out.print(KioskDisplay);

        String KioskMenuString = "Please select choice:\n";
        KioskMenuString += "     Show pumps              1\n";
        KioskMenuString += "     Payment                     2\n";
        KioskMenuString += "     Quit                             0\n";
        KioskMenuString += "Enter kiosk selection : ";
        System.out.print(KioskMenuString);

        int kioskCommand = myScanner.nextInt();
        myScanner.nextLine();

        if (kioskCommand == 1) {           
            System.out.println("Station 1 +" + Station1_State);
            System.out.println("Station 2 +" + Station2_State);
            System.out.println("Station 3 +" + Station3_State);
            System.out.println("Station 4 +" + Station4_State);
            System.out.println("Station 5 +" + Station5_State);

            System.out.println("change pump status");
            int statePump = myScanner.nextInt();
            myScanner.nextLine();

            String stateMenuString = "Please select choice:\n";
            stateMenuString += "     Ready                       1\n";
            stateMenuString += "     Standbye (Fill)             2\n";
            stateMenuString += "     Standbye (Payment)          3\n";
            stateMenuString += "     Quit                        0\n";
            stateMenuString += "Enter pump status selection : ";
            System.out.print(stateMenuString);

            int pumpChangeStatus = myScanner.nextInt();
            myScanner.nextLine();

            if (pumpChangeStatus == 1) {

                switch (statePump) {
                    case 1:  
                    System.out.println("Changed state to ready ");
                    Station1_State = "Ready";
                    break;
                    case 2:
                    System.out.println("Changed state to ready ");
                    Station2_State = "Ready";
                    break;
                    case 3:
                    System.out.println("Changed state to ready ");
                    Station3_State = "Ready";
                    break;
                    case 4:
                    System.out.println("Changed state to ready ");
                    Station4_State = "Ready";
                    break;
                    case 5:
                    System.out.println("Changed state to ready ");
                    Station5_State = "Ready";;
                    break;
                }

            } else if (pumpChangeStatus == 2) {
                switch (statePump) {
                    case 1:  
                    System.out.println("Changed state to Standbye (Fill) ");
                    Station1_State = "Standbye (Fill)";
                    break;
                    case 2:
                    System.out.println("Changed state to Standbye (Fill) ");
                    Station2_State = "Standbye (Fill)";
                    break;
                    case 3:
                    System.out.println("Changed state to Standbye (Fill) ");
                    Station3_State = "Standbye (Fill)";
                    break;
                    case 4:
                    System.out.println("Changed state to Standbye (Fill) ");
                    Station4_State = "Standbye (Fill)";
                    break;
                    case 5:
                    System.out.println("Changed state to Standbye (Fill) ");
                    Station5_State = "Standbye (Fill)";
                    break;
                }

            } else if (pumpChangeStatus == 3) {
                switch (statePump) {
                    case 1:  
                    System.out.println("Changed state to Standbye (Payment) ");
                    Station1_State = "Standbye (Payment)";
                    break;
                    case 2:
                    System.out.println("Changed state to Standbye (Payment) ");
                    Station2_State = "Standbye (Payment)";
                    break;
                    case 3:
                    System.out.println("Changed state to Standbye (Payment) ");
                    Station3_State = "Standbye (Payment)";
                    break;
                    case 4:
                    System.out.println("Changed state to Standbye (Payment) ");
                    Station4_State = "Standbye (Payment)";
                    break;
                    case 5:
                    System.out.println("Changed state to Standbye (Payment) ");
                    Station5_State = "Standbye (Payment)";
                    break;
                }

            } else if (pumpChangeStatus == 0) {
                quitCommand();
            } else {
                unknownCommand(pumpChangeStatus);
            }

        } else if (kioskCommand == 2) {
            String kiosk2 = "Please select choice: \n";

            if (Station1_State == "Standbye (Payment)") {
                kiosk2 += "     Station 1 : Payment              1\n";
            }

            if (Station2_State == "Standbye (Payment)") {
                kiosk2 += "     Station 2 : Payment               2\n";
            }

            if (Station3_State == "Standbye (Payment)") {
                kiosk2 += "     Station 3 : Payment               3\n";
            }

            if (Station4_State == "Standbye (Payment)") {
                kiosk2 += "     Station 4 : Payment              4\n";
            }

            if (Station5_State == "Standbye (Payment)") {
                kiosk2 += "     Station 5 : Payment              5\n";
            }
            kiosk2 += "Enter selection : ";
            System.out.print(kiosk2);

            int selection = myScanner.nextInt();
            myScanner.nextLine();

            if (selection == 0) {
            } else if (selection == 1) {
                System.out.print("Recipet: \n " + "Station 1" + " Cost £ " + total1 + " Type" + type1 + " Amount in L: " + quantity1 + date.toString());
                accountList.addAccount(new Account(s1, date.toString(), type1, quantity1, total1, "empty"));
                Station1_State = "Available";

                if (type1 == 1){
                    petrol1 = petrol1 + quantity1;
                    totalOverall = totalOverall + cost1 * quantity1;
                    totalpumpP1 = totalpumpP1 + cost1 * quantity1;
                } else if (type1 == 2) {
                    diesel1 = diesel1 + quantity1;
                    totalOverall = totalOverall + cost1 * quantity1;
                    totalpumpD1 = totalpumpD1 + cost1 * quantity1;
                }
            } else if (selection == 2) {
                System.out.print("Recipet: \n " + "Station 2" + " Cost £ " + total2 + " Type" + type2 + " Amount in L: " + quantity2 + date.toString());
                accountList2.addAccount(new Account(s2, date.toString(), type2, quantity2, total2, "empty"));
                Station2_State = "Available";
                if (type2 == 1){
                    petrol2 = petrol2 + quantity2;
                    totalOverall = totalOverall + cost2 * quantity2;
                } else if (type2 == 2) {
                    diesel2 = diesel2 + quantity2;
                    totalOverall = totalOverall + cost2 * quantity2;
                }
            } else if (selection == 3) {
                System.out.print("Recipet: \n " + "Station 3" + " Cost £ " + total3 + " Type" + type3 + " Amount in L: " + quantity3 + date.toString());
                accountList3.addAccount(new Account(s3, date.toString(), type3, quantity3, total3, "empty"));
                Station3_State = "Available";
                if (type3 == 1){
                    petrol3 = petrol3 + quantity3;
                    totalOverall = totalOverall + cost3 * quantity3;
                } else if (type3 == 2) {
                    diesel3 = diesel3 + quantity3;
                    totalOverall = totalOverall + cost3 * quantity3;
                }

            } else if (selection == 4) {
                System.out.print("Recipet: \n " + "Station 4" + " Cost £ " + total4 + " Type" + type4 + " Amount in L: " + quantity4 + date.toString());
                accountList4.addAccount(new Account(s4, date.toString(), type4, quantity4, total4, "empty"));
                Station4_State = "Available";
                if (type4 == 1){
                    petrol4 = petrol4 + quantity4;
                    totalOverall = totalOverall + cost4 * quantity4;
                } else if (type4 == 2) {
                    diesel4 = diesel4 + quantity4;
                    totalOverall = totalOverall + cost4 * quantity4;
                }
            } else if (selection == 5) {
                System.out.print("Recipet: \n " + "Station 5" + " Cost £ " + total5 + " Type" + type5 + " Amount in L: " + quantity5 + date.toString());
                accountList5.addAccount(new Account(s5, date.toString(), type5, quantity5, total5, "empty"));
                Station5_State = "Available";
                if (type5 == 1){
                    petrol5 = petrol5 + quantity5;
                    totalOverall = totalOverall + cost5 * quantity5;
                } else if (type5 == 2) {
                    diesel5 = diesel5 + quantity5;
                    totalOverall = totalOverall + cost5 * quantity5;
                }
            }

        } else if (kioskCommand == 0) {
            quitCommand();
        } else {
            unknownCommand(kioskCommand);}

    }

    /**
     * displays the menu string on the terminal display
     */
    private void displayMenu()
    {
        String menuString = "\n Please select option:\n";
        menuString += "     Customer                                 1\n";
        menuString += "     Get Daily Report                         2\n";
        menuString += "     Prices                                   3\n";
        menuString += "     Kiosk                                    4\n";
        menuString += "     Show individual reports                  5\n";
        menuString += "     Quit                                     0\n";
        menuString += "Enter option number : ";
        System.out.print(menuString);

    }

    /**
     * processes the legal commands
     * @param command the command entered by the user
     */
    private void execute(int command)
    {
        if (command == 1) {
            addAccount(); 
        } else if (command == 2)
            dailyReport();
        else if (command == 3)
            prices();
        else if (command == 4)
            displayKiosk();           
        else if (command == 5)
            showAllPumps();      
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

    private void quitCommand()
    {
        System.out.println("Bye");
    }

    private void showAllPumps()
    {
        System.out.println("-----------Station 1 ------------");
        accountList.getAllAccounts();
        System.out.println();

        System.out.println("-----------Station 2 ------------");

        accountList2.getAllAccounts();
        System.out.println();

        System.out.println("-----------Station 3 ------------");

        accountList3.getAllAccounts();
        System.out.println();

        System.out.println("-----------Station 4 ------------");

        accountList4.getAllAccounts();
        System.out.println();

        System.out.println("-----------Station 5 ------------");

        accountList5.getAllAccounts();
        System.out.println();
    }

    private void unknownCommand(int command)
    {
        System.out.println("Invalid Command : " + command);
    }
}
