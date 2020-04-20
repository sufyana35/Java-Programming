import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * Gui interface to display and add accounts
 * @author (Sufyann ahmedn w14025337) 
 * @version (20/04/2015)
 */
public class HW4GUI extends JFrame implements ActionListener
{
    private BasicAccountList accounts;
    private BasicAccount account;
    private JPanel buttonPanel;
    private JButton jbtAdd;
    private JButton jbtNumber;
    private JButton jbtQuit;
    private JPanel labelPanel;
    private JLabel jlbAcctNo;
    private JLabel jlbFName;
    private JLabel jlbLName;
    private JTextField jtfAcctNo;
    private JTextField jtfFName;
    private JTextField jtfLName;
    private int nextAcctNo;
    private JPanel textPanel;
    /**
     * GUI constructor
     */
    public HW4GUI(){
        super("HW4GUI");
        accounts = new BasicAccountList();
        makeFrame();
        showFrame();
    }
    
    /**
     * creates a JFrame
     */
    public void showFrame()
    {
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    /**
     * contents for the JFrame
     */
    public void makeFrame()
    { 
        //LABEL
        createLabelPanel();
        add(labelPanel,BorderLayout.WEST);
        
        //TEXT
        createTextPanel();
        add(textPanel, BorderLayout.CENTER);
        
        //BUTTONS
        createButtonPanel();
        add(buttonPanel, BorderLayout.SOUTH);
    }
    
    /**
     * labels
     */
    public void createLabelPanel()
    {
        jlbFName = new JLabel("First Name: ");
        jlbLName = new JLabel("Last Name: ");
        jlbAcctNo = new JLabel("Account Number: ");
        labelPanel = new JPanel();
        labelPanel.setLayout(new GridLayout(3,1));
        labelPanel.add(jlbFName);
        labelPanel.add(jlbLName);
        labelPanel.add(jlbAcctNo);
        jlbFName.setHorizontalAlignment(JLabel.RIGHT);
        jlbLName.setHorizontalAlignment(JLabel.RIGHT);
        jlbAcctNo.setHorizontalAlignment(JLabel.RIGHT);
    }
    
    /**
     * text panel for data to be entered
     */
    public void createTextPanel()
    {
        jtfFName = new JTextField("");
        jtfLName = new JTextField("");
        jtfAcctNo = new JTextField("");
        textPanel = new JPanel();
        textPanel.setLayout(new GridLayout(3,1));
        textPanel.add(jtfFName);
        textPanel.add(jtfLName);
        textPanel.add(jtfAcctNo);
        jtfAcctNo.setEditable(false);
    }
    
    /**
     * button panel for the user to interact with the system
     */
    public void createButtonPanel()
    {
        jbtAdd    = new JButton ("Add Account");
        jbtNumber = new JButton ("No. of Accounts");
        jbtQuit   = new JButton ("Quit"); 
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1,3));
        buttonPanel.add(jbtAdd);
        buttonPanel.add(jbtNumber);
        buttonPanel.add(jbtQuit);
        addActionListeners();
    }
    
    /**
     * action listeners for the buttons
     */
    private void addActionListeners()
    {
        jbtAdd.addActionListener(this);
        jbtNumber.addActionListener(this);
        jbtQuit.addActionListener(this);
    }
    
    /**
     * actions to be performed when a button is pressed
     * 
     * @param e the event to be followed depending on action listener
     */
    public void actionPerformed(ActionEvent e)
    {
        String item = e.getActionCommand(); 
        if (item.equals("Add Account"))        
        {
            jbtNumber.setText("No. of Accounts");
            String FName = jtfFName.getText();
            String LName = jtfLName.getText();
            
            //NO NAMES
            if(FName.equals("") && (LName.equals("")))
            {
                jtfAcctNo.setText("No names");
            }
            
            else if(FName.equals(""))
            {
                jtfAcctNo.setText("No first name");
            }
            
            else if(LName.equals(""))
            {
                jtfAcctNo.setText("No last name");
            }
            
            else{
                nextAcctNo = nextAcctNo + 0;
                nextAcctNo++; 
                jtfAcctNo.setText("100"+nextAcctNo);
                jbtAdd.setText("Confirm");
                jbtNumber.setEnabled(false);
            }
        }
        else if ( item.equals("Confirm"))         
        {   
            accounts.addAccount(account);
            jbtAdd.setText("Add Account");
            jbtNumber.setEnabled(true);
            jtfFName.setText("");
            jtfLName.setText("");
            jtfAcctNo.setText("");
        }
        
        else if (item.equals("No. of Accounts"))        
        {
            jbtNumber.setText("Clear");
            jlbAcctNo.setText("No. of Accounts");
            jtfAcctNo.setHorizontalAlignment(JLabel.CENTER);
            if(accounts.getNumberOfAccounts() == 0){
                jtfAcctNo.setText("0");
            }
            else
            {
                jbtAdd.setEnabled(false);
                jtfAcctNo.setText("" + accounts.getNumberOfAccounts());
            }
        }
        
        else if (item.equals("Clear"))        
        {
            jbtAdd.setEnabled(true);
            jbtNumber.setEnabled(false);
            jbtNumber.setText("No. of Accounts");
            jlbAcctNo.setText("AccountNumber: ");
            jtfAcctNo.setText("");
        }
        
        else if (item.equals("Quit"))        
        {
            System.exit(0);
        } 
    }
}
