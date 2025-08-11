import java.util.*;

class Node{
    Node prev;
    int data;
    Node next;

    Node()
    {
        prev=null;
        next=null;
    }
}
class LinkedList {
    Node head;

    public LinkedList() {
        head = null;
    }

    public void InsertFront(int key) {
        Node newNode = new Node();
        newNode.data = key;
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void InsertRear(int key) {
        Node newNode = new Node();
        newNode.data = key;
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    public void InsertPos(int key, int pos) {
        Node newNode = new Node();
        newNode.data = key;
        if (pos <= 1 || head == null) { // insert at front
            InsertFront(key);
            return;
        }

        Node temp = head;
        for (int i = 1; i < pos - 1 && temp.next != null; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        newNode.prev = temp;
        if (temp.next != null) {
            temp.next.prev = newNode;
        }
        temp.next = newNode;
    }

    public int DeleteFront() {
        if (head == null) {
            return -1;
        }
        int val = head.data;
        head = head.next;
        if (head != null) {
            head.prev = null;
        }
        return val;
    }

    public int DeleteRear() {
        if (head == null) {
            return -1;
        }
        if (head.next == null) { // only one element
            int val = head.data;
            head = null;
            return val;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        int val = temp.data;
        temp.prev.next = null;
        return val;
    }

    public int DeletePos(int pos) {
        if (head == null) {
            return -1;
        }
        if (pos <= 1) {
            return DeleteFront();
        }

        Node temp = head;
        for (int i = 1; i < pos && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            return -1; // position out of range
        }

        int val = temp.data;
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }
        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }
        return val;
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public int Search(int key) {
        Node temp = head;
        int pos = 1;
        while (temp != null) {
            if (temp.data == key) {
                return pos;
            }
            temp = temp.next;
            pos++;
        }
        return -1;
    }
}

class Main
{
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("1.Insert-front");
            System.out.println("2.Insert-Rear");
            System.out.println("3.Insert-pos");
            System.out.println("4.Delete-front");
            System.out.println("5.Delete-Rear");
            System.out.println("6.Delete-Pos");
            System.out.println("7.Display");
            System.out.println("8.Search");
            int choice=sc.nextInt();
            switch(choice)
            {
                case 1:System.out.println("Enter the value to be insterted at front");
                        int key=sc.nextInt();
                        list.InsertFront(key);break;
                case 2:System.out.println("Enter the value to be insterted at rear");
                        int key1=sc.nextInt();
                        list.InsertRear(key1);break;
                case 3:System.out.println("Enter the value and position");
                        int key2=sc.nextInt();
                        int pos=sc.nextInt();
                        list.InsertPos(key2,pos);break;
                case 4: int res=list.DeleteFront();
                        if(res == -1)
                        {
                            System.out.println("List is empty");
                        }
                        else
                        {
                            System.out.println("Deleted element at front is : "+res);
                        }
                        break;
                case 5: int res1=list.DeleteRear();
                        if(res1 == -1)
                        {
                            System.out.println("List is empty");
                        }
                        else
                        {
                            System.out.println("Deleted element at Rear is : "+res1);
                        }
                        break;
                case 6: System.err.println("Enter the position to be deleted ");
                        int pos1 =sc.nextInt();
                        int res2=list.DeletePos(pos1);
                        if(res2 == -1)
                        {
                            System.out.println("List is empty");
                        }
                        else
                        {
                            System.out.println("Deleted element at pos is : "+res2);
                        }
                        break;
                case 7:list.display();break;
                case 8:System.out.println("Enter the element to be searched");
                        int key3=sc.nextInt();
                        int res3=list.Search(key3);
                        if(res3 == -1)
                        {
                            System.out.println("Element not found");
                        }
                        else
                        {
                            System.out.println("Element found at position : "+res3);
                        }
                        break;
                default:System.out.println("Invalid Choice");
            }
        }

    }
}


