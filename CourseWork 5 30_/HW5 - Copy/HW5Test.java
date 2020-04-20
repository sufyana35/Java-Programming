/**
 * Class to test Homework 5
 * 
 * Revised 8th December
 * 
 * @version 02
 *
 */
public class HW5Test
{    
    private int mark;
    private String name, id;
    private AccountCollection accounts;
    private int numberOfCreatedAccounts;

    /**
     * Constructor for objects of class HW5Test
     * 
     * @param name the student's name
     * @param id the student's id
     */
    public HW5Test(String name, String id)
    {
        this.name = name;
        this.id = id;
        mark = 0;
        numberOfCreatedAccounts =0;
        runTests();
    }
    
    /*
     * reset variables to allow run tests to be run twice.
     */
    private void reset()
    {
        mark = 0;
        numberOfCreatedAccounts = 0;
    }
    
    /**
     * Run the various tests
     */
    public void runTests()
    {
        // print header
        System.out.println("Name: " + name + "\tID: " + id + "\t\tFinal Mark:        \n");
        
        reset();
        testCreateArray();
        testAddAccount();
        testCapacity();
        testNumberOfElements();
        testValidSearch();
        testInvalidSearch();
        testRemoveValidAccount();
        testRemoveInvalidAccount();
        testValidPrintAccount();
        testInvalidPrintAccount();
        testPrintAllAccounts();
        
        System.out.println("Name: " + name + "\tID: " + id + "\tCalculated Mark: " + mark 
                           +" + up to 3 additional marks.\n");
        System.out.println("\nMaximum of 12 marks possible. "                   
                    + "Student should now print out the contents of the terminal window.");        
    }
      
    /**
     * Instantiate a simple array of size 3
     */
    public void testCreateArray()
    {
        accounts = new AccountCollection(3);    
    }
    
    /**
     * Create 3 borrowers
     * One mark for each
     */
    public void testAddAccount()
    {
        try
        {
            accounts.addAccount(new Account ("Ann", "Archer","1000", 1,
                                          "1 Amble Way", "Amble", "AA1 1AA"));
            System.out.println("Archer added. Mark so far: " + (++mark));
            numberOfCreatedAccounts++;
        
            accounts.addAccount(new Account ("Barbara", "Bach","1001", 1,
                                          "2 Blyth Boulevard", "Blyth", "BB2 2BB"));
            System.out.println("Bach added. Mark so far: " + (++mark));
            numberOfCreatedAccounts++;
        
            accounts.addAccount(new Account ("Colin", "Cowdry","1002",
                                          "3 Carlisle Crecent", "Carlisle", "CC3 3CC"));
            System.out.println("Cowdry added. Mark so far: " + (++mark));
            numberOfCreatedAccounts++;
        }
        catch (Exception e)
        {
            System.out.println("An exception was raised in testAddAccount. Current mark ="+mark);
        }
    }
    
    /**
     * Test capacity - one mark
     */
    public void testCapacity()
    {
        try
        {
            if(accounts.getCapacity() == numberOfCreatedAccounts)
            { 
                System.out.println("Capacity correct(" + (accounts.getCapacity()) 
                                   + "). Mark so far: " + (++mark));
            }
            else
            {
            System.out.println("Capacity incorrect(" + (accounts.getCapacity()) + "). No Mark!");
            }
        }
        catch(Exception e)
        {
            System.out.println("An exception was raised in testCapacity. Current mark ="+mark);
        }
    }
    
    /**
     * Test number of elements populated
     */    
    public void testNumberOfElements()
    {
        // Test for correct number of borrowers
        try
        {
            if(accounts.getNumberOfAccounts() == numberOfCreatedAccounts)
            { 
                System.out.println("Number of elements correct(" 
                          + (accounts.getNumberOfAccounts()) + "). Mark so far: " + (++mark));
            }
            else
            {
                System.out.println("Number of elements incorrect(" 
                          + (accounts.getNumberOfAccounts()) + "). No Mark!");
            }
        }
        catch(Exception e)
        {
            System.out.println("An exception was raised in testNumberOfElements. "
                                 + "Current mark = "+mark);
        }
    }
    
    /**
     * Test valid search
     */
    public void testValidSearch()
    {
        try
        {
            int searchValue = accounts.search("1002");
            if(searchValue == 2)
            { 
                System.out.println("testValidSearch returned correct value: " 
                              + searchValue + ".  Mark so far: " + (++mark));
            }
            else
            {
                System.out.println("testValidSearch returned incorrect value:"
                              + searchValue + ".  No Mark!");
            }
        }
        catch(Exception e)
        {
            System.out.println("An exception was raised in testValidSearch. Current mark = "+mark);
        }        
    }
    
    /**
     * Test invalid search
     */
    public void testInvalidSearch()
    {
        try
        {
            int searchValue = accounts.search("1234");
            if(searchValue == -1)
            { 
                System.out.println("testInvalidSearch returned correct value:" 
                              + searchValue + ".  Mark so far: " + (++mark));
            }
            else
            {
                System.out.println("testInvalidSearch returned incorrect value:" + searchValue + ".  No Mark!");
            }
        }
        catch(Exception e)
        {
            System.out.println("An exception was raised in testInvalidSearch. Current mark ="+mark);
        }        
    }
       
    /**
     * Test removal of a valid borrower
     */
    public void testRemoveValidAccount()
    {
        try
        {
            accounts.removeAccount("1002");
            System.out.println("TestRemoveValidAccount - Number of borrowers now:" 
                                   + accounts.getNumberOfAccounts());
        
            if(accounts.getNumberOfAccounts() == numberOfCreatedAccounts -1)
            { 
                System.out.println("Removal suceeded. Mark so far: " + (++mark));
                numberOfCreatedAccounts--;
            }
            else
            {
                System.out.println("removal incorrect. No Mark!");
            }
        }
        catch(Exception e)
        {
            System.out.println("An exception was raised in testRemoveValidAccount. "
                                + "Current mark ="+mark);
        }
    }
    
    /**
     * Test removal of a invalid borrower
     */
    public void testRemoveInvalidAccount()
    {
        try
        {
            System.out.println("\ntestRemoveInvalidAccount:");
            accounts.removeAccount("999");
        
            if(accounts.getNumberOfAccounts() == numberOfCreatedAccounts)
            { 
            
                System.out.println("Number of borrowers still:" 
                                + accounts.getNumberOfAccounts()+". Mark so far: " + (++mark));
            }
            else
            {
                System.out.println("removal incorrect. No Mark!");
            }
        }
        catch(Exception e)
        {
            System.out.println("An exception was raised in testRemoveInvalidAccount. "
                                + "Current mark ="+mark);
        }
    }
    
    /**
     * Test printing of valid borrower
     */
    public void testValidPrintAccount()
    {
        try
        {
             System.out.println("\ntestValidPrintAccount:");        
             System.out.println("Output should be:\nBarbara Bach\n2 Blyth Boulevard\n"
                                + "Blyth\nBB2 2BB\nAccount Number: 1001\nNumber of points: 1\n\n"
                                + "ACTUAL OUTPUT:");
             accounts.printAccount("1001");
             System.out.println("ADD ONE MARK IF CORRECT.");       
        }
        catch(Exception e)
        {
            System.out.println("An exception was raised in testValidPrintAccount. "
                                + "Current mark ="+mark);
        }     
    }
    
    public void testInvalidPrintAccount()
    {
        try
        {
            System.out.println("\ntestInvalidPrintAccount");
            System.out.println("Output should be: Account with acount number: 1003 not found.\n"
                                + "ACTUAL OUTPUT:");
            accounts.printAccount("1003");
            System.out.println("ADD ONE MARK IF CORRECT.");
        }
        catch(Exception e)
        {
            System.out.println("An exception was raised in testInvalidPrintAccount. "
                               + "Current mark ="+mark);
        }
    }
    
    /**
     * Test printing of valid borrower
     */
    public void testPrintAllAccounts()
    {
        try
        {
            System.out.println("\n************* Name: " + name + "\tID: " + id + " ****************");
            System.out.println("\ntestPrintAllAccounts\nOutput should be:\n");
            System.out.println("Ann Archer\n1 Amble Way\nAmble\nAA1 1AA\nAccount Number: "
                              + "1000\nNumber of points: 1\n\n"
                              + "Barbara Bach\n2 Blyth Boulevard\nBlyth\nBB2 2BB\nAccount Number: "
                              + "1001\nNumber of points: 1\n\nACTUAL OUTPUT:");
            accounts.printAllAccounts();
            System.out.println("ADD ONE MARK IF CORRECT.");
        }
        catch(Exception e)
        {
            System.out.println("An exception was raised in testPrintAllAccounts. "
                                + "Current mark ="+mark);
        }
    } 
} // end class