/**
 * Write a description of class TestSort here.
 * 
 * @author (Kaleab Admassu) 
 * @version (Feb 23,2015)
 */

import java.io.*;
import java.util.*;

public class TestSort
{
    public static void main(String[] args) throws IOException
    {
        String a="";
        Scanner s= new Scanner(new File ("Inputdata.txt"));
        Item[] itemList= new Item[8];
        int counter=0;

        while(s.hasNext())
        {
            for(int i=0; i< itemList.length; i++)
            {
                itemList[i]= new Item(s.next(),s.next(), s.nextInt(),s.nextDouble());
                counter++;
                System.out.println(itemList[i].toString());
            }

        }
        Scanner scan= new Scanner(System.in);
        Sorting sort= new Sorting();        
        System.out.println("\n Do you want to use Selection or Insertion sort");
        a= scan.nextLine();

        if(a.equalsIgnoreCase("S")) 
        {
            System.out.println(" Here is the list sorted with Selection sort " + "\n");
            sort.selectionSort(itemList);
            for(int i=0; i<itemList.length; i++)
            {    
                System.out.println(itemList[i].toString());
            }
        }
        else
        {
            System.out.println("\n Here is the list sorted with Insertion sort: " + "\n");
            sort.insertionSort(itemList);
            for(int j=0; j<itemList.length; j++)
            {   
                System.out.println(itemList[j].toString());
            }

        }
    }

}
