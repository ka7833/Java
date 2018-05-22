/**
 * class CS152
 * @author (Kaleab Admassu) 
 * @version (March 19, 2015)
 */
import java.util.*;
import java.io.*;
public class CS152
{
    public static final int MAXSIZE = 22;
    private static int size=0;

    public static Student[] createList(Scanner scan)
    {
        Student[] list = new Student[MAXSIZE];
        return populateList(list, scan);
    }

    private static Student[] populateList( Student[] list, Scanner scan )   
    {
        Student s;
        if ( size < MAXSIZE && scan.hasNext() )
        {
            s = new Student(scan.next(), scan.next(),scan.next(),
                scan.nextDouble(), scan.nextInt());
            list[size] = s;
            size++;
            return populateList(list, scan);
        }
        else
            return list;
    }

    public static int getSize()
    {
        return size;
    } 

    public static String toString(Student[] list, int n)
    {
        if(n==1)
            return list[n-1].toString() + "\n" ;
        else
            return list[n-1].toString() + "\n" + toString(list, n-1);

    }

    public static Student findBestStudent(Student[] list, int n)
    {
        if(n==1)
            return list[n-1];
        else
        {
            Student temp = findBestStudent(list, n-1);
            if(temp.isBetter(list[n-1]))
                return temp;
            else
                return list[n-1];
        }

    }

    public static int countHonors(Student[] list, int n)
    {
        if(n==1)
        {
            if(list[n-1].isHonors())
                return 1;
            else
                return 0;
        }
        else
        {
            if(list[n-1].isHonors())
                return 1 + countHonors(list, n-1);
            else
                return countHonors(list, n-1);
        }

    }

    public static ArrayList<Student> honorsStuds(Student[] list, int n)
    {

        if(n==1)
        {
            if(list[n-1].isHonors())
            {
                ArrayList<Student> arrayStuds= new ArrayList<Student>();
                arrayStuds.add(list[n-1]);
                return arrayStuds;
            }
            else
            {
                ArrayList<Student> arrayStuds= new ArrayList<Student>();
                return arrayStuds;
            }
        }
        else
        {
            if(list[n-1].isHonors()) 
            {
                ArrayList<Student> arrayStuds = honorsStuds(list, n-1);
                arrayStuds.add(list[n-1]);
                return arrayStuds;
            }
            else

                return honorsStuds(list, n-1);
        }

    }
}
