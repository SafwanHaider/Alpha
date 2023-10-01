import java.util.*;

public class Trappedwater {

    public static int trappedraiwater(int arr[], int width)
    {
        int n = arr.length;
        int leftmax[] = new int[n];
        int rightmax[] = new int[n];

        leftmax[0] = arr[0];

        for(int i = 1; i < n; ++i)
        {
            leftmax[i] = Math.max(arr[i], leftmax[i - 1]);
        }

        rightmax[n -1] = arr[n - 1];
        
        for(int i = n - 2; i >= 0; --i)
        {
            rightmax[i] = Math.max(arr[i], rightmax[i + 1]);
        }

        int tp = 0;

        for(int i = 0; i < n; ++i)
        {
            int wl = Math.min(leftmax[i], rightmax[i]);
            tp += (wl - arr[i]) * width;

        }
        return tp;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i < n; ++i)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter width");
        int width = sc.nextInt();
        System.out.println(trappedraiwater(arr, width));
    }
}
