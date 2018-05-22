
/**
 * Class TestList
 * @author (Kaleab Admassu) 
 * @version (April 3, 2015)
 */

public class TestList
{
    public static void main(String[] args)
    {
        Student s1= new Student("Adams", 3.6, 26);
        Student s2= new Student("Jones", 2.1, 29);
        Student s3= new Student("Marcus", 4.0, 53);
        Student s4= new Student("Smith", 3.2, 20);
        Student s5= new Student("Zee", 3.6, 36);

        // list 1

        LinkedListStud ll1 = new LinkedListStud();
        if(ll1.isEmpty())
        {
            System.out.println("The first list is empty."); 
        }
        else
        {
            System.out.println("The first list is not empty."); 
        }

        ll1.addAtFront(s1);
        ll1.addAtFront(s2);
        ll1.addAtFront(s3);
        ll1.addAtFront(s4);
        ll1.addAtFront(s5);

        if(ll1.isEmpty())
        {
            System.out.println("The first list is empty."); 
        }
        else
        {
            System.out.println("The first list is not empty."); 
        }

        ll1.printLinkedList();
        System.out.println("The best student in the first list is: " + ll1.bestStudent().toString());

        // list 2

        LinkedListStud ll2 = new LinkedListStud();
        if(ll2.isEmpty())
        {
            System.out.println("The second list is empty."); 
        }
        else
        {
            System.out.println("The second list is not empty."); 
        }

        ll2.addAtTail(s1);
        ll2.addAtTail(s2);
        ll2.addAtTail(s3);
        ll2.addAtTail(s4);
        ll2.addAtTail(s5);

        if(ll2.isEmpty())
        {
            System.out.println("The second list is empty."); 
        }
        else
        {
            System.out.println("The second list is not empty."); 
        }

        ll2.printLinkedList();
        System.out.println("The best student in the second list is: " + ll2.bestStudent().toString());

        // list 3

        LinkedListStud ll3 = new LinkedListStud();
        if(ll3.isEmpty())
        {
            System.out.println("The third list is empty."); 
        }
        else
        {
            System.out.println("The third list is not empty."); 
        }

        ll3.addInOrder(s1);
        ll3.addInOrder(s2);
        ll3.addInOrder(s3);
        ll3.addInOrder(s4);
        ll3.addInOrder(s5);

        if(ll3.isEmpty())
        {
            System.out.println("The third list is empty."); 
        }
        else
        {
            System.out.println("The third list is not empty."); 
        }

        ll3.printLinkedList();
        System.out.println("The best student in the third list is: " + ll3.bestStudent().toString());

    }
}
