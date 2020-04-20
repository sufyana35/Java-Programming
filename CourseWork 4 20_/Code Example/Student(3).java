public class Student
{
	// the student's full name
	private String name;
	// the student ID
	private String id;
	// the amount of credits for study taken so far
	private int credits;

	/**
	 * Create a new student with a given name and ID number.
	 * @param fullName the student's name
	 * @param studentID the student's id
	 */
	public Student(String fullName, String studentID)
	{
		name = fullName;
		id = studentID;
		credits = 0;
	}

	/**
	 * Return the full name of this student.
	 * @return the student name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Set a new name for this student.
	 * @param replacementName new name for student
	 */
	public void changeName(String replacementName)
	{
		name = replacementName;
	}

	/**
	 * Return the student ID of this student.
	 * @return student id
	 */
	public String getStudentID()
	{
		return id;
	}

	/**
	 * Add some credit points to the student's accumulated credits.
	 * @param additionalPoints extra credit points
	 */
	public void addCredits(int additionalPoints)
	{
		credits += additionalPoints;
	}

	/**
	 * Return the number of credit points this student has accumulated.
	 * @return accumulated credits
	 */
	public int getCredits()
	{
		return credits;
	}

	/**
	 * Return the login name of this student. The login name is a combination
	 * of the first four characters of the student's name and the first three
	 * characters of the student's ID number.
	 * @ the student login id
	 */
	public String getLoginName()
	{
		return name.substring(0, 4) + id.substring(0, 3);
	}

	/**
	 * return the student's name and ID number to the output terminal.
	 * @ the student name and id
	 */
	public String getStudentData()
	{
		return name + " " + id;
	}
	
	 /**
     * Print the student's name and ID number to the output terminal.
     */
    public void print()
    {
        System.out.println(name + " (" + id + ")");
    }

}