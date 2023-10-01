import java.util.*;

public class BinarySearch {


    public static int Search(int arr[], int key)
    {
        int length = arr.length;
        int start = 0;
        int end = length - 1;
        
        while(start <= end){
            int mid = (start + end) / 2;
            
            if(key == arr[mid]){
                return mid;
            }
            else if(key < arr[mid]){
                end  = mid - 1;
            }
            else
                start = mid + 1;

        }

        return -1;
        
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no of elements you want to insert");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i < arr.length; ++i){
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }

        System.out.println("ENter the element you want to search");
        int key = sc.nextInt();
        
        System.out.println(Search(arr, key));



    }
}
