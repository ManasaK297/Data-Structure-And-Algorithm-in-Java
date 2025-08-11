import java.util.*;
class Node
{
    public int data;
    public Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
class MyQueue
{
    Node front,rear;
    MyQueue(){front=rear=null;}

    public void Enqueue(int data)
    {
        Node new_node = new Node(data);
        if(isEmpty())
        {
            front=rear=new_node;
        }
        rear.next=new_node;
        rear=new_node;
    }

    public int Dequeue()
    {
        if(isEmpty())
        {
            return(-1);
        }
        Node temp=front;
        if(front == rear)
        {
            front=rear=null;
        }
        else
        {
            front=front.next;
        }
        return(temp.data);
    }

    public int getFront()
    {
        if(isEmpty())
        {
            return Integer.MIN_VALUE;
        }
        return front.data;
    }

    public void display()
    {
        if(!isEmpty())
        {
            Node temp=front;
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    }

    boolean isEmpty()
    {
        if(front == null && rear == null)
        {
            System.out.println("Queue Underflow..!!");
            return true;
        }
        else return false;
    }
}
class Queue
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        MyQueue q= new MyQueue();
        int choice;
        while(true)
        {
            System.out.println("Enter your choice ..??");
            System.out.println("1.Enqueue");
            System.out.println("2.Dequeue");
            System.out.println("3.getFront");
            System.out.println("4.Display");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1 : System.out.println("Enter the element ");
                         int x=sc.nextInt();
                         q.Enqueue(x);break;
                case 2 : int y=q.Dequeue();
                         if(y==-1)
                         {
                            System.out.println("Queue Underflow");
                         }
                         else
                            System.out.println(y+" removed");
                         break;
                case 3 : System.out.println("queue Front : "+q.getFront());break;
                case 4 : q.display();break;
            }
        }
    }
}