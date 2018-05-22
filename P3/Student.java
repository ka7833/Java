/**
 * class Student
 * @author (Kaleab Admassu) 
 * @version (March 19, 2015)
 */
public class Student
{
    private String lastName;
    private String firstName;
    private String id;
    private double gpa;
    private int year;

    public Student(String lastName, String firstName, String id, double gpa, int year)
    {
        this.lastName= lastName;
        this.firstName= firstName;
        this.id= id;
        this.gpa= gpa;
        this.year= year;
    }

    public String toString()
    {
        String s;
        s= firstName + " " + lastName + "\t" + " id: " + id  + "\t" + " gpa: " + gpa + "\t" + " year: " + year;
        return s;
    }

    public boolean isBetter(Student s)
    {      
        if(gpa > s.getgpa())
            return true;
        else 
            return false;
    }

    public boolean isHonors()
    {
        if(gpa > 3.5)
            return true;
        else 
            return false;
    }

    public double getgpa()
    {
        return gpa;
    }
}
