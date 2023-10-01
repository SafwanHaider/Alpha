
import java.util.*;

public class Prefix_sum {

    public static void Maxsubarray(int arr[])
    {
        int max = Integer.MIN_VALUE;
        int current_sum = 0;
        int pre_sum[] = new int[arr.length];

        pre_sum[0] = arr[0];

        for(int i = 1; i < arr.length; ++i){
            pre_sum[i] = pre_sum[i - 1] + arr[i];
        }


        for(int i = 0; i < arr.length; ++i){
            int start = i;
            
            for(int j = i; j < arr.length; ++j)
            {
                int end = j;
                current_sum = start == 0 ? pre_sum[end] : pre_sum[end] - pre_sum[start -1];
                if(current_sum > max){
                    max = current_sum;
                }
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

        Maxsubarray(arr);
    }
}
