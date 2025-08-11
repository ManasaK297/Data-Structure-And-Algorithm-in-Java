//Queue -> Enqueue-add or offer , Dequeue-poll

import java.util.*;
import java.util.LinkedList;
class MyQueue
{
    //private Queue<Integer> q= new LinkedList<>();
    private Queue<Integer> q = new LinkedList<>();
    public void Enqueue(int x)
    {
        q.add(x);
    }
    public void Dequeue()
    {
        if(!q.isEmpty())
        {
            q.poll();
        }
    }
    public int getFront()
    {
        return(!q.isEmpty ? q.peek() : -1);
    }
    public boolean isEmpty()
    {
        return(q.isEmpty());
    }
    public void display()
    {
        for(int i:q)
        {
            System.out.print(i+" ");
        }
    }

}
class Queue
{
    public static void main(String [] args)
    {
        MyQueue queue = new MyQueue();
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter your choice..!!");
            System.out.println("1.Enqueue");
            System.out.println("2.Dequeue");
            System.out.println("3.getFront");
            System.out.println("4.isEmpty");
            System.out.println("5.Display");
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1: System.out.println("Enter the Elememnt ");
                        int x=sc.nextInt();
                        queue.Enqueue(x);
                        break;
                case 2: queue.Dequeue();
                        break;
                case 3: int v= queue.getFront();
                        System.out.println("Front is :"+v);
                        break;
                case 4: boolean var = queue.isEmpty();
                        if(var)
                        {
                            System.out.println("Queue is Empty..!!");
                        }
                        else
                        {
                            System.out.println("Queue is not Empty..!!");
                        }break;
                case 5: queue.display();break;

            }
        }
        
        
    }
}