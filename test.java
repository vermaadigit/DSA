import java.util.LinkedList;

public class test
{
    public class Node
    {
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //Methods

    public void addFirst(int data)
    {
        Node newNode = new Node(data);
        size++;
        if (head == null)
        {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data)
    {
        Node newNode = new Node(data);
        size++;
        if (head == null)
        {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print()
    {
        if (head == null)
        {
            System.out.println("LL is Empty");
            return;
        }
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx, int data)
    {
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < idx-1)
        {
            temp = temp.next;
            i++;
        }

        //i = idx - 1   temp --> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public static void main(String[] args)
    {
        test ll = new test();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(2, 9);
        ll.print();
        System.out.println("Size of LinkedList is " + size);

    }
}