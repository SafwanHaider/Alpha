import java.util.*;

public class Trappedwater2{

    public static int trappedrainwater(int arr[], int width)
    {
        int n = arr.length;
        int leftmax[] = new int[n];
        int rightmax[] = new int[n];


        leftmax[0] = arr[0];
        for(int i = 1; i < n; ++i)
        {
            leftmax[i] = Math.max(leftmax[i - 1] , arr[i]);
        }

        rightmax[n - 1] = arr[n - 1];
        for(int i = n - 2; i >= 0; --i){
            rightmax[i] = Math.max(arr[i], rightmax[i + 1]);
        }

        int trappedrainwater = 0;

        for(int i = 0; i < n; ++i)
        {
            int wl = Math.min(leftmax[i], rightmax[i]);

            trappedrainwater += (wl - arr[i] * width); 
        }

        return trappedrainwater;
    }
    public static void main(String args[])
    {
        Scanner sc  = new Scanner(System.in);

        int n = sc.nextInt();

        int height[] = new int[n];

        for(int i = 0; i < height.length; ++i)
        {
            height[i] = sc.nextInt();
        }

        System.out.println(trappedrainwater(height, 1));
    }
}