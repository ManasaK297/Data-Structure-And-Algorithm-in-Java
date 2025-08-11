import java.util.*;
class Node
{
    public Node left;
    public int data;
    public Node right;
    Node(int data)
    {
        this.left=null;
        this.data=data;
        this.right=null;
    }
}
class MyQueue
{
    Node front,rear;
    MyQueue(){front=rear=null;}

    public void InsertFront(int data)
    {
        Node new_node = new Node(data);
        if(front==null & rear==null)
        {
            front=new_node;rear=new_node;
        }
        else
        {
            new_node.right=front;
            front.left=new_node;
            front=new_node;
        }
    }
    public void InsertRear(int data)
    {
        Node new_node = new Node(data);
        if(front==null & rear==null)
        {
            front=new_node;rear=new_node;
        }
        else
        {
            Node temp=front;
            while(temp.right!=null)
            {
                temp=temp.right;
            }
            temp.right=new_node;
            new_node.left=temp;
            rear=new_node;
        }
    }

    public void DeleteFront()
    {
        if(front==null & rear==null)
        {
            System.out.println("Queue is Empty..!!");
        }
        else if(front==rear)
        {
            front=null;rear=null;
        }
        else
        {
            front.right.left=null;
            front=front.right;
        }
    }
    public void DeleteRear()
    {
        if(front==null & rear==null)
        {
            System.out.println("Queue is Empty..!!");
        }
        else if(front==rear)
        {
            front=null;rear=null;
        }
        else
        {
            Node temp=front;
            //Node prev=null;
            while(temp.right!=null)
            {
                temp=temp.right;
            }
            temp.left.right=null;
            rear=temp.left;
        }
    }

    public void display()
    {
        Node temp=front;
        if(front==null & rear==null)
        {
            System.out.println("Queue is Empty..!!");
        }
        else
        {
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.right;
            }
        }
    }

    
}
class Dequeue
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        MyQueue q= new MyQueue();
        int choice;
        while(true)
        {
            System.out.println("Enter your choice ..??");
            System.out.println("1.InsertFront");
            System.out.println("2.DeleteFront");
            System.out.println("3.InsertRear");
            System.out.println("4.DeleteRear");
            System.out.println("5.Display");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1 : System.out.println("Enter the element ");
                         int x=sc.nextInt();
                         q.InsertFront(x);break;
                case 2 : q.DeleteFront();break;
                case 3 : System.out.println("Enter the element ");
                         int x1=sc.nextInt();
                         q.InsertRear(x1);break;
                case 4 : q.DeleteRear();break;
                case 5 : q.display();break;
            }
        }
    }
}