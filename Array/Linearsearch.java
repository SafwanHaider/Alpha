import java.util.Scanner;

public class Linearsearch {
    public static int search(int arr[], int key)
    {
        for (int  i = 0; i < arr.length; i++) {

            if(arr[i] == key)
                return i; 

        }
        return -1;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element you want to search");
        int key = sc.nextInt();

        int position = search(arr, key);
        System.out.println(position);

    }
}
