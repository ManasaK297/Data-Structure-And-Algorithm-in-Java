import java.util.*;
class Node 
{
    int data;
    Node next;
}
class LinkedList
{
    Node head;
    public void Push(int key)
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
     
    public int Pop()
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
class Stack
{
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        Scanner s=new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter your Choice");
            System.out.println("1.Push");
            
            System.out.println("2.Pop");
            System.out.println("3.Display");
            int choice=s.nextInt();
            switch(choice)
            {
                case 1:System.out.println("Enter the value to be pushed");
                        int key=s.nextInt();
                        list.Push(key);break;
                case 2:int res=list.Pop();
                        if(res == -1)
                        {
                            System.out.println("List is empty");
                        }
                        else
                        {
                            System.out.println("Poppped Element is : "+res);
                        }
                        break;
                
                case 3 : list.display();break;
                default:System.out.println("Invalid Choice");
            }
        }
        sc.close();
    }
}
