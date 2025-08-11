import java.util.*;

class Heap2
{
    public static void heapify(int heap[], int n)
    {
        System.out.println("Heaping Process");
        int i, j, key;
        
        // Heap construction: Top-down approach
        for(int k = 1; k < n; k++)
        {
            i = k;
            key = heap[i];
            j = (i - 1) / 2;

            while(i > 0 && key > heap[j])
            {
                heap[i] = heap[j];  // Move parent down
                i = j;
                j = (i - 1) / 2;
            }
            heap[i] = key;  // Insert the key in the correct position
        }
    }

    public static int deleteHeap(int heap[], int n)
    {
        if(n == 0)
        {
            System.out.println("Heap is empty");
            return -1;
        }
        
        int max = heap[0];  // Root (max element)
        heap[0] = heap[n - 1];  // Move last element to root
        --n;
        
        heapify(heap,n);
	    return(max);
    }

    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        int heap[] = new int[n];

        System.out.println("Enter the " + n + " elements");
        for(int i = 0; i < n; i++)
        {
            heap[i] = sc.nextInt();
        }

        System.out.println("Before Heapify:");
        for(int i = 0; i < n; i++)
        {
            System.out.print(heap[i] + " ");
        }
        System.out.println();

        heapify(heap, n);

        System.out.println("After Heapify:");
        for(int i = 0; i < n; i++)
        {
            System.out.print(heap[i] + " ");
        }
        System.out.println();

        System.out.println("Deleting Max Element (Root): ");
        int res = deleteHeap(heap, n);
        if(res != -1)
            System.out.println(res + " Deleted");
        
        sc.close();
    }
}
