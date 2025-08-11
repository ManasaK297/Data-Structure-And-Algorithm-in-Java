import java.util.*;
class Node 
{
    int data;
    Node next;
}
class LinkedList
{
    Node head;
    public void InsertFront(int key)
    {
        Node node=new Node();
        node.data=key;
        node.next=null;
        if(head == null)
        {
            head=node;
        }
        else
        {
            node.next=head;
            head=node;
        }
    }
    public void InsertRear(int key)
    {
        Node node=new Node();
        node.data=key;
        node.next=null;
        if(head == null)
        {
            head=node;
        }
        else
        {
            Node temp=head;
            while(temp.next != null)
            {
                temp=temp.next;
            }
            temp.next=node;
        }
    }

    public void InsertPos(int key, int pos)
    {
        Node node=new Node();
        node.data=key;
        node.next=null;
        if(head == null)
        {
            head=node;
        }
        if(pos == 0)
        {
            InsertFront(key);
        }
        else
        {
            Node temp=head;
           for(int i=0;i<pos-1;i++)
           {
            temp=temp.next;
           }
            node.next=temp.next;
            temp.next=node;
        }
    }
    public int DeleteFront()
    {
        int x;
        if(head == null)
        {
            return -1;
        }
        if(head.next == null)
        {
            x=head.data;
            head=null;
        }
        else
        {
            x=head.data;
            head=head.next;
        }
        return x;
    }
    public int DeleteRear()
    {
        int x;
        if(head == null)
        {
            return -1;
        }
        if(head.next == null)
        {
            x=head.data;
            head=null;
        }
        else
        {
            Node temp=head;
            Node prev=null;
            while(temp.next!=null)
            {
                prev=temp;
                temp=temp.next;
            }
            x=temp.data;
            prev.next=null;
        }
        return x;
    }
    public void display()
    {
        Node temp=head;

        if(temp == null)
        {
            System.out.println("List is empty");
        } 
        else
        {
            while(temp.next != null)
            {
                System.out.println(temp.data); 
                temp=temp.next;
            }
            System.out.println(temp.data);
        }
    }
}
class Main
{
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        Scanner s=new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter your Choice");
            System.out.println("1.Insert-front");
            System.out.println("2.Insert-Rear");
            System.out.println("3.Insert-pos");
            System.out.println("4.Delete-front");
            System.out.println("5.Delete-Rear");
            System.out.println("6.Display");
            int choice=s.nextInt();
            switch(choice)
            {
                case 1:System.out.println("Enter the value to be insterted at front");
                        int key=s.nextInt();
                        list.InsertFront(key);break;
                case 2:System.out.println("Enter the value to be insterted at rear");
                        int key1=s.nextInt();
                        list.InsertRear(key1);break;
                case 3:System.out.println("Enter the value and position");
                        int key2=s.nextInt();
                        int pos=s.nextInt();
                        list.InsertPos(key2,pos);break;
                case 4:int res=list.DeleteFront();
                        if(res == -1)
                        {
                            System.out.println("List is empty");
                        }
                        else
                        {
                            System.out.println("Deleted element at front is : "+res);
                        }
                        break;
                case 5:int res1=list.DeleteRear();
                        if(res1 == -1)
                        {
                            System.out.println("List is empty");
                        }
                        else
                        {
                            System.out.println("Deleted element at Rear is : "+res1);
                        }
                        break;
                case 6:list.display();break;
                default:System.out.println("Invalid Choice");
            }
        }
    }
}
