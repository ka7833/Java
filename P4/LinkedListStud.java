/**
 * class LinkedListStud 	
 * @author (Kaleab Admassu) 
 * @version (April 3, 2015)
 */

public class LinkedListStud
{  
    private Node list;

    public LinkedListStud()
    {
        list = null;
    }

    public class Node
    {
        public Student data;
        public Node next;

        public Node(Student s)
        {
            data = s;
            next = null;

        }
    }

    public boolean isEmpty()
    {
        if(list==null)
            return true;
        else
            return false;

    }

    public void addAtFront(Student s)
    {
        Node node= new Node(s);
        node.next = list;
        list = node;
    }

    public void addAtTail(Student s)
    {
        Node node = new Node(s);
        Node current = list;
        if(isEmpty())
        {
            list = node;
        }
        else
        {
            while(current.next!= null)
                current= current.next;
            current.next= node;
        }
    }

    public Student bestStudent()
    {
        Node current = list;
        Student best = current.data;
        while(current.next!= null)
        {
            current = current.next;
            if(current.data.compareTo(best) == 1)
                best= current.data;

        }
        return best;
    }

    public void printLinkedList()
    {
        Node current = list;
        System.out.println("Here is a list of the students: ");
        System.out.println(current.data.toString());

        while(current.next!= null)
        {
            current = current.next;
            System.out.println(current.data.toString());
        }
    }

    public void addInOrder(Student s)
    {
        Node node = new Node(s);
        if(list==null)
            list= node;
        else
        {
            if(list.next == null)
            {
                if(list.data.compareTo(node.data)== -1)
                {
                    list.next = node;  
                }
                else
                {
                    node.next = list;
                    list = node;
                }            
            }
            else
            {
                Node after;
                Node before= node;
                Node current = list;
                while(current.next!= null)
                {
                    if(current.data.compareTo(node.data)< 1)
                    {
                        before= current; 
                    }
                    current= current.next;
                }

                if(current.data.compareTo(node.data)< 1)
                {
                    before= current; 
                }
                after = before.next;
                node.next= after;
                before.next= node;

            }
        }
    }
}
