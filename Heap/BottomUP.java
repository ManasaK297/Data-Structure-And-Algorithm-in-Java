import java.util.*;

class Heap1
{
    public static void heapify(int heap[],int n)
    {
        System.out.println("Heaping Process");
        int i,j,key;
        for(int k=(n-1)/2;k>=0;k--)
        {
            j=k;
            key=heap[k];
            i=2*k+1;
            while(i<n)
            {
                if((i+1)<=n)
                {
                    if(heap[i+1]>heap[i])
                    {
                        i++;
                    }
                }
                if(key<heap[i])
                {
                    heap[j]=heap[i];
                    j=i;
                    i=2*j+1;
                }
                else
                    break;
            }
            heap[j]=key;
        }
    }
    public static int deleteHeap(int heap[],int n)
    {
        int max=heap[0];
        heap[0]=heap[n-1];
        --n;
        heapify(heap,n-1);
        return(max);
    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=sc.nextInt();
        int heap[]=new int[n];
        System.out.println("Enter the "+n+" elements");
        for(int i=0;i<n;i++)
        {
            heap[i]=sc.nextInt();
        }
        System.out.println("Before Heapify..");
        for(int i=0;i<n;i++)
        {
            System.out.print(heap[i]+" ");
        }
        heapify(heap,n-1);
        System.out.println();
        System.out.println("After  Heapify..");
        for(int i=0;i<n;i++)
        {
            System.out.print(heap[i]+" ");
        }
        System.out.println("Deleting Max element Root ");
        int res=deleteHeap(heap,n);
        System.out.println(res+" Deleted");

    }
}
