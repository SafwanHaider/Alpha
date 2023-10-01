
import java.util.*;

public class Maxsubarray {

    public static void Subsetsofarray(int arr[])
    {
        int max = Integer.MIN_VALUE;
        int current_sum = 0;
        for(int i = 0; i < arr.length; ++i){
            int start = i;
            
            for(int j = i; j < arr.length; ++j)
            {
                current_sum = 0;
                int end = j;

                for(int k = start; k <= end; ++k){
                    current_sum = current_sum + arr[k];
                }

            }
            if(current_sum > max){
                max = current_sum;
            }
        }
        System.out.println(max);
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
