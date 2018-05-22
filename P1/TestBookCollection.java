/**
 * Write a description of class TestBookCollection here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
  import java.io.*;
  import java.util.Scanner;
public class TestBookCollection
{
    public static void main(String[] args) throws IOException
    {
        String a;
        String b;
        String c;

        BookCollection classCS152_71 = new BookCollection();
        System.out.println(classCS152_71.toString());

        classCS152_71.displayLongBooks();

        Scanner scan= new Scanner(System.in);
        System.out.println(" Please enter the author :");
        a= scan.nextLine();
        classCS152_71.displayBooksFromAuthor(a);
        System.out.println(" Do you want to enter another author: " );
        b= scan.nextLine();

        while(b.equalsIgnoreCase("Yes"))
        {
            System.out.println(" Please enter the author :");
            a= scan.nextLine();
            classCS152_71.displayBooksFromAuthor(a);
            System.out.println(" Do you want to enter another author: " );
            b= scan.nextLine();
        }

        System.out.println(" Please enter the area of the book");
        c= scan.nextLine();
        classCS152_71.displayBooksFromArea(c);

        System.out.println(); 
        System.out.println("The longest books is : " + classCS152_71.longestBook().toString());

        classCS152_71.displayMathCSBooks();

        System.out.println();
        System.out.println(" The Other books are : ");

        classCS152_71.displayOtherBooks();
    }
}
