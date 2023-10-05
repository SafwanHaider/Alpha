import java.util.Scanner;

public class Binarysearch {
    public static int findindex(int arr[], int key){

        int start = 0, end = arr.length - 1;
        int mid;
        while(start <= end)
        {
            mid = (start + end) / 2;
            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] > key){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }

        return -1;

    }
    public static void main(String args[]){
        int arr[] = {2, 4, 6, 8, 10};
        int key = 8;
        // 
        

        System.out.println("The index is : " + findindex(arr, key));


    }
}
