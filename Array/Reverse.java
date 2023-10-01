import java.util.*;

public class Reverse {

    public static void Reversearray(int arr[])
    {
        int start = 0; 
        int end = arr.length -1;
        while(start < end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            ++start;
            --end;
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENter no of elements you want to inser");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i < arr.length; ++i){
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }

        Reversearray(arr);
        System.out.println("Array after reverse");

        for(int i = 0; i < arr.length; ++i){
            System.out.println("arr[" + i + "] = " + arr[i]);
        
        }

    }
}
