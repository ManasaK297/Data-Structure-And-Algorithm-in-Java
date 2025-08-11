// Priority Queue Implementation using LinkedList
class Node
{
    int data;
    int priority;
    Node next;
    Node(int data,int priority)
    {
        this.data=data;
        this.priority=priority;
        this.next=null;
    }
}
class PQueue
{
    Node head=null;
    public void Insert(int data, int priority) 
    {
        Node new_node = new Node(data, priority);

        if (head == null || priority < head.priority) {
             new_node.next = head;
                head = new_node;
        }
        else
        {
            Node cur = head;
            Node prev = null;

            while (cur != null && priority >= cur.priority) { 
                prev = cur;
                cur = cur.next;
            }  

            if (prev == null) {
                new_node.next = head;
                head = new_node;
            } 
            else 
            {
            prev.next = new_node;
            new_node.next = cur;
            }
        }
    }

    public void display()
    {
        if(head==null)
        {
            System.out.println("Emptyy");
        }
        else
        {
            Node cur=head;
            while(cur!=null)
            {
                System.out.println(cur.data+" ");
                cur=cur.next;
            }
        }
    }
    public void delete()
    {
        if(head==null)
        {
            System.out.println("Emptyy");
        }
        else
        {
            head=head.next;
        }
    }
}
class PriorityQueue
{
    public static void main(String [] args)
    {
        PQueue q=new PQueue();
        q.Insert(1,1);
        q.Insert(2,2);
        q.Insert(3,3);
        q.display();
        q.delete();
        q.display();
    }
}