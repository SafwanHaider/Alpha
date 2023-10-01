import java.util.*;

public class Duplicate {

    public static boolean repeated(int arr[])
    {
        int n = arr.length;
        boolean bool = true;

        for(int i = 0; i < n; ++i)
        {
            for(int j = i + 1; j < n; ++j)
            {
                if(arr[i] == arr[j]){
                    return bool;
                }
            }
        }
        return bool = false;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no of elements you want to insert");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; ++i)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println(repeated(arr));

        


    }
}
