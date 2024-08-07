public class Lec95_LinkedList_Part2_Cycle
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

    public int removeFirst()
    {
        if (size == 0)
        {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast()
    {
        if (size == 0)
        {
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for (int i = 0; i < size-2; i++)
        {
            prev = prev.next;
        }
        int val = prev.next.data;  //tail data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int itrSearch(int key)
    {
        Node temp = head;
        int i = 0;

        while (temp != null)
        {
            if (temp.data == key)
            {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public int helper(Node head, int key)
    {
        if (head == null)
        {
            return -1;
        }

        if (head.data == key)
        {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1)
        {
            return -1;
        }
        return idx + 1;
    }

    public int recSearch(int key)
    {
        return helper(head, key);
    }

    public static boolean isCycle()
    {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
            {
                return true;
            }
        }

        return false;
    }

    public static void removeCycle()
    {
        //Detect Cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow)
            {
                cycle = true;
                break;
            }
        }

        if (cycle == false)
        {
            return;
        }

        //Find meeting point

        slow = head;
        Node prev = slow;   //Last Node
        while (slow != fast)
        {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        //Remove Cycle --> last.next = null
        prev.next = null;
    }

    public static void main(String[] args)
    {
//        Lec95_LinkedList_Part2_Cycle ll = new Lec95_LinkedList_Part2_Cycle();

        head = new Node(1);
        Node temp = new Node (2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;

        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());
    }
}
