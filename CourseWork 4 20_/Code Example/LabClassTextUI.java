import java.util.Scanner;

/**
 * Provides a text based user interface for the LabClass project.
 * Amended to allow integer choices.
 * 
 * @author Ian Bradley / Alan Maughan
 * @version 21-10-2011
 */
public class LabClassTextUI 
{
    private LabClass labClass;
    Scanner myScanner;

    /**
     * Constructor for objects of class TextUI
     */
    public LabClassTextUI()
    {
        labClass = new LabClass();
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
     * displays the menu string on the terminal display
     */
    private void displayMenu()
    {
        String menuString = "Please select option:\n";
        menuString += "     Display full class details       1\n";
        menuString += "     Find student by name             2\n";
        menuString += "     Add student                      3\n";
        menuString += "     Set Instructor                   4\n";
        menuString += "     Set Room Number                  5\n";
        menuString += "     Set Time and Day                 6\n";
        menuString += "     Remove student                   7\n";
        menuString += "     Get class size                   8\n";
        menuString += "     Get average credits              9\n";
        menuString += "     Quit                             0\n";
        menuString += "Enter option number : ";
        System.out.print(menuString);

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

    /**
     * processes the legal commands
     * @param command the command entered by the user
     */
    private void execute(int command)
    {
        if (command == 1)
            fullCommand(); 
        else if (command == 2)
           findCommand();
        else if (command == 3)
           addCommand(); 
        else if (command == 4)
           instructorCommand();           
        else if (command == 5)
           roomCommand();
        else if (command == 6)
           timeCommand();
        else if (command == 7)
           removeCommand(); 
        else if (command ==8)
           sizeCommand();           
        else if (command ==9)
           averageCommand();          
        else if (command == 0)
           quitCommand();
        else
           unknownCommand(command);
    }
    
    private void quitCommand()
    {
        System.out.println("Bye");
    }
    
    private void fullCommand()
    {
        System.out.println(labClass.getLabClass());
    }
    
    private void findCommand()
    {    
        System.out.print("Enter student name : ");
        String studentName = myScanner.nextLine();
        Student myStudent = labClass.showStudent(studentName);
        if (myStudent == null)
            System.out.println("Student with name " + studentName + " not  found");
        else
            System.out.println(myStudent.getStudentData());
    }
    
    private void removeCommand()
    {     
        System.out.print("Enter student name : ");
        String studentName = myScanner.nextLine();
        if (labClass.removeStudent(studentName))
           System.out.println("Student with name " + studentName + " removed from class list");
        else
           System.out.println("Student with name " + studentName + " not  found");
    }
    
    private void addCommand()
    {   
        System.out.print("Enter student name : ");
        String studentName = myScanner.nextLine();
        System.out.print("Enter student id : ");
        String studentID = myScanner.nextLine();
        labClass.enrollStudent(new Student(studentName, studentID));
    }
        
    private void instructorCommand()    
    {
        System.out.print("Enter name of Instructor : ");
        String instructorName = myScanner.nextLine();
        labClass.setInstructor(instructorName);
    }
    
    private void roomCommand()
    {
        System.out.print("Enter Room : ");
        String room = myScanner.nextLine();
        labClass.setRoom(room);
    }
    
    private void timeCommand()
    {
        System.out.print("Enter lab time : ");
        String time = myScanner.nextLine();
        labClass.setTime(time);
    }
    
    private void sizeCommand()
    {
        System.out.println("Class size: " + labClass.getNumberOfStudents());
    }
    
    private void averageCommand()
    {
        if (labClass.getNumberOfStudents() >0)
        {
            System.out.println("Average credits: " + labClass.averageCredits());
        }
        else
        {
            System.out.println("No students in class.");
        }
    }
    
    private void unknownCommand(int command)
    {
        System.out.println("Invalid Command : "+ command);
    }
                
}
