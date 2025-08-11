import java.util.*;

class Operation 
{
        void Insert(int arr[],int key,int n,int pos)
        {
            for (int i = n - 1; i >=pos; i--)
                    arr[i+1] = arr[i];
            arr[pos]=key;   
        }

        int Search(int arr[],int key,int n) 
        {
            for(int i=0;i<n;i++)
            {
                if(arr[i]==key)
                {
                    return i;
                }
            }
            return -1;
        }

        void Delete(int arr[],int key,int pos,int n)
        {
            for(int i=pos;i<n;i++)
            {
                arr[i]=arr[i+1];
            }
        }
}
class Array 
{
    public static void main(String[] args)
    {
        
        System.out.println("Enter the size of the array");
    
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=n+1;
        int arr[]=new int[m];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=0;
        }
        Operation op = new Operation();
        while(true)
        {
            System.out.println("1.Insert");
            System.out.println("2.Delete");
            System.out.println("3.Search");
            System.out.println("4.display");
            int choice=s.nextInt();

            switch(choice)
            {
                case 1:System.out.println("Enter the value to be inserted and the position");
                        int key=s.nextInt();
                        int pos=s.nextInt();
                        if(pos>=n)
                        {
                            System.out.println("Invalid position");
                        }
                        else
                            op.Insert(arr,key,n,pos);
                        break;
                case 2:System.out.println("Enter the value to be Deleted");
                        int key2=s.nextInt();
                        int pos2=op.Search(arr,key2,n);
                        if(pos2==-1)
                        {
                            System.out.println("such element doesn't exist");
                        }
                        else
                            op.Delete(arr,key2,pos2,n);
                        break;
                case 3:System.out.println("Enter the value to be Searched");
                        int key1=s.nextInt();
                        int pos1=op.Search(arr,key1,n);
                        if(pos1 == -1)
                        {
                            System.out.println("Not found..");
                        }
                        else
                            System.out.println("Elemet found at position - "+pos1);
                        break;
                case 4:for(int i:arr)
                        {
                            System.out.println(i);
                        }
                        break;
                default:System.out.println("Invalid Choice");
            }
        }
        
    }
}
