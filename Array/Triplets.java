import java.util.*;


public class Triplets {

    public static void findtriplets(int arr[])
    {
        for(int i = 0; i < arr.length - 1; ++i)
        {
            for(int j = i + 1; j < arr.length; ++j)
            {
                for(int k = j + 1; k < arr.length; ++k){
                    if(arr[i] + arr[j] + arr[k] == 0){
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                    }
                }
            }
        }
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

        findtriplets(arr);

    }    
}
