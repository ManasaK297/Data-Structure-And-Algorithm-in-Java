class Queue
{
    private int arr[];
    int capacity;
    int size,front;
    Queue(int c)
    {
        arr=new int[c];
        front=0;size=0;
        capacity=c;
    }
    public void insertFront(int x)
    {
        if(size==capacity)
        {
            return;
        }
        front=(front-1+capacity)%capacity;
        arr[front]=x;
        size++;
    }
    public void deleteFront()
    {
        if(size==0)
        {
            return;
        }
        front=(front+1)%capacity;
        size--;
    }
    public void insertRear(int x)
    {
        if(size==capacity)
        {
            return;
        }
        front=(front+size)%capacity;
        arr[front]=x;
        size++;
    }
    public void deleteRear()
    {
        if(size==0)
        {
            return;
        }
        front=(front+size-1)%capacity;
        size--;
    }
    public void display()
    {
        int rear = (front + size - 1) % capacity;
        int i=front;
        while(i!=rear)
        {
            System.out.print(arr[i]+" ");
            i=(i+1)%capacity;
        }
        System.out.print(arr[rear]+" ");
    }
}
class Dequeue
{
    public static void main(String [] args)
    {
        Queue q=new Queue(4);
        q.insertFront(10);
        q.insertFront(20);
        q.insertRear(30);
        q.deleteFront();
        q.insertRear(40);
        q.deleteRear();
        q.display();

    }
}