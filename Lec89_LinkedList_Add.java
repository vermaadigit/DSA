import java.util.LinkedList;

public class Lec89_LinkedList_Add
{
    public static class Node
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

    public void addFirst(int data)
    {
        //Step 1 - Create new Node
        Node newNode = new Node(data);

        if (head == null)
        {
            head = tail = newNode;
            return;
        }

        //Step 2 - newNode next = head
        newNode.next = head; //linking

        //Step 3 - head = newNode
        head = newNode;
    }

    public static void main(String[] args)
    {
        LinkedList ll = new LinkedList();

        ll.addFirst(1);
        ll.addFirst(2);
    }
}
