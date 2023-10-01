import java.util.*;

public class Subarrays {

    public static void Subsetsofarray(int arr[])
    {
        for(int i = 0; i < arr.length; ++i){
            int start = i;
            for(int j = i; j < arr.length; ++j)
            {
                int end = j;

                for(int k = start; k <= end; ++k){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Subsetsofarray(arr);
    }
}
