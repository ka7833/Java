/**
 * This is a description of class BookCollection here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
 import java.util.Scanner;
 import java.io.*;
 import java.util.*;

public class BookCollection
{
    ArrayList<Book> bookList= new ArrayList<Book>();
    private int counter=0;

    public BookCollection() throws IOException
    {
        Scanner s = new Scanner(new File ("books.txt"));

        Book oneBook;
        while(s.hasNext())
        {            
          bookList.add (counter, new Book (s.next(), s.next(),       s.next(), s.nextInt()));
            counter++;
        }
    }

    public String toString()
    {
        String r = "";
        for(int i=0; i< bookList.size(); i++)
        {
            r+= (bookList.get(i).toString() + "\n");
        }
        return r;
    }

    public void displayLongBooks()
    {

        System.out.println( "\n LONG BOOKS");
        for(int i=0; i< bookList.size(); i++)
        {
            if(bookList.get(i).isLong())
                System.out.println(bookList.get(i).toString());
        }

    }

    public void displayBooksFromAuthor(String author)
    {
        boolean hasAuthor = false;
        for(int i=0; i< bookList.size(); i++)
        {
            if(bookList.get(i).getAuthor().equalsIgnoreCase(author))
            {
                System.out.println(bookList.get(i).toString());
                hasAuthor = true;
            }            
        }
        if (hasAuthor == false)
            System.out.println(" There are no books authored by " + author );
    }

    public void displayBooksFromArea(String area)
    {
        boolean hasArea=false;
        for(int i=0; i< bookList.size(); i++)
        {
            if(bookList.get(i).getArea().equalsIgnoreCase(area))
            {  
                System.out.println(bookList.get(i).toString());
                hasArea= true;
            } 
        }
        if (hasArea == false)
            System.out.println(" There are no " + area + " books ");            
    }

    public Book longestBook()
    {    
        Book longest= bookList.get(0);
        for(int i=0; i< bookList.size(); i++)
        {
            if(bookList.get(i).getLength()> longest.getLength())
                longest=bookList.get(i); 
        }
        return longest;
    }

    public void displayMathCSBooks()
    {
        System.out.println();
        System.out.println("MATH and COMPUTER SCIENCE BOOKS");
        for(int i=0; i< bookList.size(); i++)
        {
            if(bookList.get(i).mathCS().equalsIgnoreCase("MATH")|| bookList.get(i).mathCS().equalsIgnoreCase("CS"))
                System.out.println(bookList.get(i).toString());

        }
    }

    public void displayOtherBooks()
    {
        for(int i=0; i< bookList.size(); i++)
        {
            if(bookList.get(i).mathCS().equals("Other"))
                System.out.println(bookList.get(i).toString());
        }
    }
}
