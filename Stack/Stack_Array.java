import java.util.*;
class solution 
{
    public static int   push(int sta[],int key,int top)
    {
        if(top == sta.length - 1)
        {
            System.out.println("Stack is full");
            return top;
        }
        else 
        {
            top=top+1;
            sta[top]=key;
        } 
        System.out.println("Push is successfull..!!");
        return top;
    }

    public void display(int top,int sta[])
    {
        if(top == -1)
        {
            System.out.println("Stack is empty");
        }
        else 
        {
            for(int i=0;i<=top;i++)
            {
                System.out.println(sta[i]);
            }
        }
    }
    
    public static int pop(int sta[],int key,int top)
    {
        if(top == -1)
        {
            System.out.println("Stack is empty");
            return top;
        }
        for(int i=0;i<=top;i++)
        {
            if(sta[i] == key)
            {
                top=top-1;
                System.out.println(key+"  deleted successfullyy");
                return top;
            }
        }
        System.out.println("Element not found");
        return top;
    }
    public boolean isEmty(int[] sta,int top)
    {
            return(top<0);
    }
    public boolean isFull(int[] sta,int top,int cap)
    {
            int res=cap-1;
            return top==res;
    }
}

class Stack
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int n=sc.nextInt(); 
        int sta[]=new int[n];
        solution obj1=new solution();
        int choice,top=-1;
        while(true)
        {
            System.out.println("1.push  "+"2.Display   "+"3.pop"+"4.isEmty"+"5.isFull");
            System.out.println("Enter Your choice");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1: System.out.println("Enter the element");
                        int key=sc.nextInt();
                        top=obj1.push(sta,key,top);
                        break;
                case 2:obj1.display(top,sta);break;
                case 3: System.out.println("Enter the element you want to delete..!!");
                        int key1=sc.nextInt();
                        top=obj1.pop(sta,key1,top);
                        break;
                case 4: boolean res=obj1.isEmty(sta,top);
                        if(res)
                            System.out.println("Stack is Empty");
                        else 
                            System.out.println("Stack is not Empty");
                        break;
                case 5: boolean res1=obj1.isFull(sta,top,n);
                        if(res1)
                            System.out.println("Stack is Full");
                        else 
                            System.out.println("Stack is not Full");
                        break;
                default:
                    System.out.println("Invalid choice.");

            }
        }
        
    }
}

//Dynamic Satck Implementation using 