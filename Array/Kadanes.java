import java.util.*;

public class Kadanes {

    public static void Kadanesalgo(int arr[])
    {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i = 0; i < arr.length; ++i)
        {
            cs = cs + arr[i];
            if(cs < 0){
                cs = 0;
            }

            ms = Math.max(ms, cs);
        }

        System.out.println(ms);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i < arr.length; ++i)
        {
            arr[i] = sc.nextInt();
        }

        Kadanesalgo(arr);

    }
}
