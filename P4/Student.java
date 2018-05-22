/**
 * class Student
 * @author (Kaleab Admassu) 
 * @version (April 3, 2015)
 */

public class Student
{
    private String lastName;
    private double gpa;
    private int age;

    public Student(String lastName, double gpa, int age)
    {
        this.lastName= lastName;
        this.gpa= gpa;
        this.age= age;

    }

    public int compareTo(Student s)
    {
        if(gpa< s.getGPA())
            return -1;
        else
        if(gpa== s.getGPA())
            return 0;
        else
            return 1;
    }

    public String toString()
    {
        String s;
        s= lastName + "\t" + gpa + "\t" + age;
        return s;
    }

    public double getGPA()
    {
        return gpa;
    }
}
