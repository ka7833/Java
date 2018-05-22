/**
 * Write a description of class Book here.
 * 
 * @author (Kaleab Admassu) 
 * @version (a version number or a date)
 */
public class Book
{
    private int length;
    private String isbn;
    private String author;
    private String area;

    public Book(String ibn, String authname, String a, int l)
    {
        length=l;
        isbn=ibn;
        area=a;
        author=authname;   
    }

    public boolean isLong()
    {
        if(length>=600)
            return true;
        else
            return false;
    }

    public String toString()
    {
        String s="";
        s= "BOOK ISBN :" + isbn + " AUTHOR " + author + " Area " + area + " PAGES " + length;
        return s;
    }

    public String getAuthor()
    {
        return author; 
    }

    public String getArea()
    {
        return area;
    }

    public int getLength()
    {
        return length;    
    }

    public String mathCS()
    {
        if(area.equalsIgnoreCase ("MATH"))
        {
            return "MATH";
        }
        else if(area.equalsIgnoreCase ("CS"))
        {
            return "CS";
        }
        else {
            return "Other";
        }    
    }
}
