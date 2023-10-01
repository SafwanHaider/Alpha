import java.util.*;

public class Largest{
    public static void largestnum(int arr[])
    {
        int max = Integer.MIN_VALUE;
        int pos = -1;;

        for(int i = 0; i < arr.length; ++i)
        {
            if(arr[i] > max)
            {
                max = arr[i];
                pos = i;
            }

        }

        System.out.println("The largest among the array is" + max);
        System.out.println("It's index is " + pos);

    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of elements you want to insert in an array");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i < arr.length; ++i){
            System.out.print("arr[" + i + "] ");
            arr[i] = sc.nextInt();
            System.out.println();
        }

        largestnum(arr);
        
    }
}