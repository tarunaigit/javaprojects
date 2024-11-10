import java.util.Scanner;

public class SortArr 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int count,i;
        System.out.println("Enter no of elements for array :");
        count=sc.nextInt();
        int Arr[]=new int[count];
        for(i=0;i<count;i++)
        {
            System.out.println("Enter element "+ (i+1) +" :");
            Arr[i]=sc.nextInt();

        }
        System.out.println("The elements entered are :");
        for(int j : Arr)
        {
            System.out.print(j+" ");
        }
        BubbleSort(Arr);
        System.out.println("\nThe sorted elements are :");
        for(int x : Arr)
        {
            System.out.print(x+" ");
        }



        
    }
    public static void BubbleSort(int Arr[]) 
    {
        for(int i=0;i<Arr.length-1;i++)
        {
            for(int j=0;j<Arr.length-1-i;j++)
            {
                if(Arr[j]>Arr[j+1])
                {
                    int temp=Arr[j];
                    Arr[j]=Arr[j+1];
                    Arr[j+1]=temp;
                }

            }
        }
    }

}
