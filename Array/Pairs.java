import java.util.*;

public class Pairs {


    public static void Printpairs(int arr[])
    {
        for(int i = 0; i < arr.length; ++i){

            for(int j = i + 1; j < arr.length; ++j)
            {
                System.out.print("( " + arr[i] + ", " + arr[j] + ") ");
            }
            System.out.println();

        }

        int size  = arr.length;
        int pairs = (size * (size - 1)) / 2;
        System.out.println("Total no of pairs = " + pairs );
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of elements you want to insert");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i < arr.length; ++i){
            arr[i] = sc.nextInt();
        }

        Printpairs(arr);



    }
}
