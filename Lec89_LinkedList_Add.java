public class Lec89_LinkedList_Add {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        // Step 1 - Create new Node
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Step 2 - newNode next = head
        newNode.next = head; // linking

        // Step 3 - head = newNode
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx, int data)
    {
        if (idx == 0)
        {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < idx - 1)
        {
            temp = temp.next;
            i++;
        }

        //i = idx - 1   temp --> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void removeFirst()
    {
        if (size == 0)
        {
            System.out.println("LL is empty");
            return;
        }
        else if (size == 1)
        {
            int val = head.data;
            head = tail = null;
            size = 0;
            return;
        }
        int val = head.data;
        head = head.next;
        size--;
    }

    public int removeLast()
    {
        if (size == 0)
        {
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        }
        else if (size == 1)
        {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        //Prev  i = size - 2
        Node prev = head;
        for (int i = 0; i < size - 2; i++)
        {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public static void main(String[] args) {
        Lec89_LinkedList_Add ll = new Lec89_LinkedList_Add();

        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(2, 9);
        ll.print();
        System.out.println(size);
        ll.removeFirst();
        ll.print();
        System.out.println(size);
        ll.removeLast();
        ll.print();
        System.out.println(size);;
    }
}
