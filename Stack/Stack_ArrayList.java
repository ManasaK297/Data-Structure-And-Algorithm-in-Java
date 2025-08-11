import java.util.*;
class Stack
{
    static  void Display(ArrayList<Integer> Stack)
    {
        int i=Stack.size()-1;
        while(i >= 0)
        {
            System.out.println(Stack.get(i));
            i--;
        }
    }
    public static void main(String args[])
    {
        ArrayList<Integer> Stack = new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        
        while(true)
        {
            System.out.println("1.push  "+"2.Display   "+"3.pop   "+"4.isEmty   "+"5.Exit");
            System.out.println("Enter Your choice");
            int choice=sc.nextInt();
            switch(choice)
            {
                case 1: System.out.println("Enter the element");
                        int key=sc.nextInt();
                        Stack.add(key);
                        break;
                case 2: Display(Stack);
                        break;
                case 3: System.out.println(Stack.get(Stack.size()-1)+"  Popped");
                        Stack.remove(Stack.size()-1);
                        break;
                case 4: if(Stack.isEmpty())
                            System.out.println("Stack is Empty");
                        else 
                            System.out.println("Stack is not Empty");
                        break;
                case 5: System.exit(0);break;
                default:
                    System.out.println("Invalid choice.");

            }
        }

    }
    
}