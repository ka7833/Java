/**
 * class TestStudents 
 * @author (Kaleab Admassu) 
 * @version (March 19, 2015)
 */

import java.util.*;
import java.io.*;
public class TestStudents
{
    public static void main(String[] args) throws IOException
    {
        Scanner scan= new Scanner(new File ("input.txt"));
        Student[] studentList = CS152.createList(scan);
        String temp= "List of all Students \n" + CS152.toString(studentList, CS152.getSize());
        temp += "\nStudent with highest GPA: \n" + CS152.findBestStudent(studentList, CS152.getSize()).toString();
        temp += "\n \nNumber of honor students: " + CS152.countHonors(studentList, CS152.getSize());
        temp+= "\n List of honor students: \n ";

        for(int i=0; i <  CS152.honorsStuds(studentList, CS152.getSize()).size(); i++)
        {
            temp += "\n" + CS152.honorsStuds(studentList, CS152.getSize()).get(i).toString();
        }

        FileWriter fw= new FileWriter(new File ("output.txt"));
        fw.write(temp);
        fw.close();
    }
}
